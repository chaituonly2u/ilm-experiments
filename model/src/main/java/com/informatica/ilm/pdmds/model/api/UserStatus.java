package com.informatica.ilm.pdmds.model.api;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;

import com.informatica.i18n.InfaResourceBundle;
import com.informatica.messages.InfaMessage;
import com.informatica.messages.InfaMessageEnum;

public enum UserStatus implements InfaMessageEnum {

    ACTIVE("UGS_001", "ACTIVE"),

    PASSIVE("UGS_002", "PASSIVE");

    private UserStatus(String messageCode, String messageKey) {
        this.messageCode = messageCode;
        this.messageKey = messageKey;
    }

    private String messageCode;

    private String messageKey;

    private String[] reqParamsNames;

    private static final String resourceBaseName = "com.chaitanya.ilm.pdmds.model.api.UserGroupStatus";

    private static ConcurrentHashMap<Locale, ResourceBundle> bundleMap = new ConcurrentHashMap<Locale, ResourceBundle>();

    @Override
    public String getMsgCode() {
        return this.messageCode;
    }

    @Override
    public String getMsgKey() {
        return this.messageKey;
    }

    public static ResourceBundle getResourceBundle() {
        return getResourceBundle(Locale.getDefault());
    }

    private static ResourceBundle getResourceBundle(Locale locale) {
        ResourceBundle bundle = bundleMap.get(locale);
        if (bundle == null) {
            bundle = InfaResourceBundle.getBundle(resourceBaseName, locale,
                UserGroupStatus.class.getClassLoader());
            bundleMap.put(locale, bundle);
        }
        return bundle;
    }

    @Override
    public InfaMessage getInfaMessage() {
        return getInfaMessage(this);
    }

    @Override
    public InfaMessage getInfaMessage(Object... args) {
        return getInfaMessage(this, args);
    }

    public static InfaMessage getInfaMessage(UserStatus description) {
        return new InfaMessage(description, null);
    }

    public static InfaMessage getInfaMessage(UserStatus description, Object... args) {
        return new InfaMessage(description, args);
    }

    @Override
    public String getText(Locale locale, Object... args) {
        return getText(this, locale, args);
    }

    public static String getText(UserStatus description) {
        return getText(description, Locale.getDefault(), (Object[]) null);
    }

    public static String getText(UserStatus description, Object... args) {
        return getText(description, Locale.getDefault(), args);
    }

    public static String getText(UserStatus description, Locale locale, Object... args) {
        try {
            String unformattedMsg = getResourceBundle(locale).getString(description.getMsgCode());
            if (args == null) {
                return unformattedMsg;
            }
            MessageFormat formatter = new MessageFormat(unformattedMsg, locale);
            return formatter.format(args);
        } catch (MissingResourceException e) {
            if (args == null) {
                return description.getMsgKey();
            }
            return description.getMsgKey() + " " + Arrays.deepToString(args);
        }
    }

    public static boolean isAvailable(UserStatus description) {
        try {
            String msg = getResourceBundle().getString(description.getMsgCode());
            return (msg != null);
        } catch (MissingResourceException e) {
            return false;
        }
    }

    public String[] getReqParamsNames() {
        return reqParamsNames;
    }

    public void setReqParamsNames(String[] reqParamsNames) {
        this.reqParamsNames = reqParamsNames;
    }
}
