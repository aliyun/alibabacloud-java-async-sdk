// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateTerminalPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateTerminalPolicyRequest</p>
 */
public class UpdateTerminalPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BackgroundModeTitle")
    private String backgroundModeTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayLayout")
    private String displayLayout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayResolution")
    private String displayResolution;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayScaleRatio")
    private String displayScaleRatio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAutoLockScreen")
    private Integer enableAutoLockScreen;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAutoLogin")
    private Integer enableAutoLogin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableBackgroundMode")
    private Integer enableBackgroundMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableBluetooth")
    private Integer enableBluetooth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableModifyPassword")
    private Integer enableModifyPassword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableScheduledReboot")
    private Integer enableScheduledReboot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableScheduledShutdown")
    private Integer enableScheduledShutdown;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableSwitchPersonal")
    private Integer enableSwitchPersonal;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableWlan")
    private Integer enableWlan;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdleTimeoutAction")
    private Integer idleTimeoutAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PowerButtonDefine")
    private Integer powerButtonDefine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PowerButtonDefineForAs")
    private Integer powerButtonDefineForAs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PowerButtonDefineForNs")
    private Integer powerButtonDefineForNs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PowerOnBehavior")
    private Integer powerOnBehavior;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduledReboot")
    private String scheduledReboot;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduledShutdown")
    private String scheduledShutdown;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SettingLock")
    private Integer settingLock;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalPolicyId")
    private String terminalPolicyId;

    private UpdateTerminalPolicyRequest(Builder builder) {
        super(builder);
        this.backgroundModeTitle = builder.backgroundModeTitle;
        this.displayLayout = builder.displayLayout;
        this.displayResolution = builder.displayResolution;
        this.displayScaleRatio = builder.displayScaleRatio;
        this.enableAutoLockScreen = builder.enableAutoLockScreen;
        this.enableAutoLogin = builder.enableAutoLogin;
        this.enableBackgroundMode = builder.enableBackgroundMode;
        this.enableBluetooth = builder.enableBluetooth;
        this.enableModifyPassword = builder.enableModifyPassword;
        this.enableScheduledReboot = builder.enableScheduledReboot;
        this.enableScheduledShutdown = builder.enableScheduledShutdown;
        this.enableSwitchPersonal = builder.enableSwitchPersonal;
        this.enableWlan = builder.enableWlan;
        this.idleTimeout = builder.idleTimeout;
        this.idleTimeoutAction = builder.idleTimeoutAction;
        this.name = builder.name;
        this.powerButtonDefine = builder.powerButtonDefine;
        this.powerButtonDefineForAs = builder.powerButtonDefineForAs;
        this.powerButtonDefineForNs = builder.powerButtonDefineForNs;
        this.powerOnBehavior = builder.powerOnBehavior;
        this.scheduledReboot = builder.scheduledReboot;
        this.scheduledShutdown = builder.scheduledShutdown;
        this.settingLock = builder.settingLock;
        this.terminalPolicyId = builder.terminalPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTerminalPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backgroundModeTitle
     */
    public String getBackgroundModeTitle() {
        return this.backgroundModeTitle;
    }

    /**
     * @return displayLayout
     */
    public String getDisplayLayout() {
        return this.displayLayout;
    }

    /**
     * @return displayResolution
     */
    public String getDisplayResolution() {
        return this.displayResolution;
    }

    /**
     * @return displayScaleRatio
     */
    public String getDisplayScaleRatio() {
        return this.displayScaleRatio;
    }

    /**
     * @return enableAutoLockScreen
     */
    public Integer getEnableAutoLockScreen() {
        return this.enableAutoLockScreen;
    }

    /**
     * @return enableAutoLogin
     */
    public Integer getEnableAutoLogin() {
        return this.enableAutoLogin;
    }

    /**
     * @return enableBackgroundMode
     */
    public Integer getEnableBackgroundMode() {
        return this.enableBackgroundMode;
    }

    /**
     * @return enableBluetooth
     */
    public Integer getEnableBluetooth() {
        return this.enableBluetooth;
    }

    /**
     * @return enableModifyPassword
     */
    public Integer getEnableModifyPassword() {
        return this.enableModifyPassword;
    }

    /**
     * @return enableScheduledReboot
     */
    public Integer getEnableScheduledReboot() {
        return this.enableScheduledReboot;
    }

    /**
     * @return enableScheduledShutdown
     */
    public Integer getEnableScheduledShutdown() {
        return this.enableScheduledShutdown;
    }

    /**
     * @return enableSwitchPersonal
     */
    public Integer getEnableSwitchPersonal() {
        return this.enableSwitchPersonal;
    }

    /**
     * @return enableWlan
     */
    public Integer getEnableWlan() {
        return this.enableWlan;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return idleTimeoutAction
     */
    public Integer getIdleTimeoutAction() {
        return this.idleTimeoutAction;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return powerButtonDefine
     */
    public Integer getPowerButtonDefine() {
        return this.powerButtonDefine;
    }

    /**
     * @return powerButtonDefineForAs
     */
    public Integer getPowerButtonDefineForAs() {
        return this.powerButtonDefineForAs;
    }

    /**
     * @return powerButtonDefineForNs
     */
    public Integer getPowerButtonDefineForNs() {
        return this.powerButtonDefineForNs;
    }

    /**
     * @return powerOnBehavior
     */
    public Integer getPowerOnBehavior() {
        return this.powerOnBehavior;
    }

    /**
     * @return scheduledReboot
     */
    public String getScheduledReboot() {
        return this.scheduledReboot;
    }

    /**
     * @return scheduledShutdown
     */
    public String getScheduledShutdown() {
        return this.scheduledShutdown;
    }

    /**
     * @return settingLock
     */
    public Integer getSettingLock() {
        return this.settingLock;
    }

    /**
     * @return terminalPolicyId
     */
    public String getTerminalPolicyId() {
        return this.terminalPolicyId;
    }

    public static final class Builder extends Request.Builder<UpdateTerminalPolicyRequest, Builder> {
        private String backgroundModeTitle; 
        private String displayLayout; 
        private String displayResolution; 
        private String displayScaleRatio; 
        private Integer enableAutoLockScreen; 
        private Integer enableAutoLogin; 
        private Integer enableBackgroundMode; 
        private Integer enableBluetooth; 
        private Integer enableModifyPassword; 
        private Integer enableScheduledReboot; 
        private Integer enableScheduledShutdown; 
        private Integer enableSwitchPersonal; 
        private Integer enableWlan; 
        private Integer idleTimeout; 
        private Integer idleTimeoutAction; 
        private String name; 
        private Integer powerButtonDefine; 
        private Integer powerButtonDefineForAs; 
        private Integer powerButtonDefineForNs; 
        private Integer powerOnBehavior; 
        private String scheduledReboot; 
        private String scheduledShutdown; 
        private Integer settingLock; 
        private String terminalPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTerminalPolicyRequest request) {
            super(request);
            this.backgroundModeTitle = request.backgroundModeTitle;
            this.displayLayout = request.displayLayout;
            this.displayResolution = request.displayResolution;
            this.displayScaleRatio = request.displayScaleRatio;
            this.enableAutoLockScreen = request.enableAutoLockScreen;
            this.enableAutoLogin = request.enableAutoLogin;
            this.enableBackgroundMode = request.enableBackgroundMode;
            this.enableBluetooth = request.enableBluetooth;
            this.enableModifyPassword = request.enableModifyPassword;
            this.enableScheduledReboot = request.enableScheduledReboot;
            this.enableScheduledShutdown = request.enableScheduledShutdown;
            this.enableSwitchPersonal = request.enableSwitchPersonal;
            this.enableWlan = request.enableWlan;
            this.idleTimeout = request.idleTimeout;
            this.idleTimeoutAction = request.idleTimeoutAction;
            this.name = request.name;
            this.powerButtonDefine = request.powerButtonDefine;
            this.powerButtonDefineForAs = request.powerButtonDefineForAs;
            this.powerButtonDefineForNs = request.powerButtonDefineForNs;
            this.powerOnBehavior = request.powerOnBehavior;
            this.scheduledReboot = request.scheduledReboot;
            this.scheduledShutdown = request.scheduledShutdown;
            this.settingLock = request.settingLock;
            this.terminalPolicyId = request.terminalPolicyId;
        } 

        /**
         * BackgroundModeTitle.
         */
        public Builder backgroundModeTitle(String backgroundModeTitle) {
            this.putBodyParameter("BackgroundModeTitle", backgroundModeTitle);
            this.backgroundModeTitle = backgroundModeTitle;
            return this;
        }

        /**
         * DisplayLayout.
         */
        public Builder displayLayout(String displayLayout) {
            this.putBodyParameter("DisplayLayout", displayLayout);
            this.displayLayout = displayLayout;
            return this;
        }

        /**
         * DisplayResolution.
         */
        public Builder displayResolution(String displayResolution) {
            this.putBodyParameter("DisplayResolution", displayResolution);
            this.displayResolution = displayResolution;
            return this;
        }

        /**
         * DisplayScaleRatio.
         */
        public Builder displayScaleRatio(String displayScaleRatio) {
            this.putBodyParameter("DisplayScaleRatio", displayScaleRatio);
            this.displayScaleRatio = displayScaleRatio;
            return this;
        }

        /**
         * EnableAutoLockScreen.
         */
        public Builder enableAutoLockScreen(Integer enableAutoLockScreen) {
            this.putBodyParameter("EnableAutoLockScreen", enableAutoLockScreen);
            this.enableAutoLockScreen = enableAutoLockScreen;
            return this;
        }

        /**
         * EnableAutoLogin.
         */
        public Builder enableAutoLogin(Integer enableAutoLogin) {
            this.putBodyParameter("EnableAutoLogin", enableAutoLogin);
            this.enableAutoLogin = enableAutoLogin;
            return this;
        }

        /**
         * EnableBackgroundMode.
         */
        public Builder enableBackgroundMode(Integer enableBackgroundMode) {
            this.putBodyParameter("EnableBackgroundMode", enableBackgroundMode);
            this.enableBackgroundMode = enableBackgroundMode;
            return this;
        }

        /**
         * EnableBluetooth.
         */
        public Builder enableBluetooth(Integer enableBluetooth) {
            this.putBodyParameter("EnableBluetooth", enableBluetooth);
            this.enableBluetooth = enableBluetooth;
            return this;
        }

        /**
         * EnableModifyPassword.
         */
        public Builder enableModifyPassword(Integer enableModifyPassword) {
            this.putBodyParameter("EnableModifyPassword", enableModifyPassword);
            this.enableModifyPassword = enableModifyPassword;
            return this;
        }

        /**
         * EnableScheduledReboot.
         */
        public Builder enableScheduledReboot(Integer enableScheduledReboot) {
            this.putBodyParameter("EnableScheduledReboot", enableScheduledReboot);
            this.enableScheduledReboot = enableScheduledReboot;
            return this;
        }

        /**
         * EnableScheduledShutdown.
         */
        public Builder enableScheduledShutdown(Integer enableScheduledShutdown) {
            this.putBodyParameter("EnableScheduledShutdown", enableScheduledShutdown);
            this.enableScheduledShutdown = enableScheduledShutdown;
            return this;
        }

        /**
         * EnableSwitchPersonal.
         */
        public Builder enableSwitchPersonal(Integer enableSwitchPersonal) {
            this.putBodyParameter("EnableSwitchPersonal", enableSwitchPersonal);
            this.enableSwitchPersonal = enableSwitchPersonal;
            return this;
        }

        /**
         * EnableWlan.
         */
        public Builder enableWlan(Integer enableWlan) {
            this.putBodyParameter("EnableWlan", enableWlan);
            this.enableWlan = enableWlan;
            return this;
        }

        /**
         * IdleTimeout.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putBodyParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * IdleTimeoutAction.
         */
        public Builder idleTimeoutAction(Integer idleTimeoutAction) {
            this.putBodyParameter("IdleTimeoutAction", idleTimeoutAction);
            this.idleTimeoutAction = idleTimeoutAction;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PowerButtonDefine.
         */
        public Builder powerButtonDefine(Integer powerButtonDefine) {
            this.putBodyParameter("PowerButtonDefine", powerButtonDefine);
            this.powerButtonDefine = powerButtonDefine;
            return this;
        }

        /**
         * PowerButtonDefineForAs.
         */
        public Builder powerButtonDefineForAs(Integer powerButtonDefineForAs) {
            this.putBodyParameter("PowerButtonDefineForAs", powerButtonDefineForAs);
            this.powerButtonDefineForAs = powerButtonDefineForAs;
            return this;
        }

        /**
         * PowerButtonDefineForNs.
         */
        public Builder powerButtonDefineForNs(Integer powerButtonDefineForNs) {
            this.putBodyParameter("PowerButtonDefineForNs", powerButtonDefineForNs);
            this.powerButtonDefineForNs = powerButtonDefineForNs;
            return this;
        }

        /**
         * PowerOnBehavior.
         */
        public Builder powerOnBehavior(Integer powerOnBehavior) {
            this.putBodyParameter("PowerOnBehavior", powerOnBehavior);
            this.powerOnBehavior = powerOnBehavior;
            return this;
        }

        /**
         * ScheduledReboot.
         */
        public Builder scheduledReboot(String scheduledReboot) {
            this.putBodyParameter("ScheduledReboot", scheduledReboot);
            this.scheduledReboot = scheduledReboot;
            return this;
        }

        /**
         * ScheduledShutdown.
         */
        public Builder scheduledShutdown(String scheduledShutdown) {
            this.putBodyParameter("ScheduledShutdown", scheduledShutdown);
            this.scheduledShutdown = scheduledShutdown;
            return this;
        }

        /**
         * SettingLock.
         */
        public Builder settingLock(Integer settingLock) {
            this.putBodyParameter("SettingLock", settingLock);
            this.settingLock = settingLock;
            return this;
        }

        /**
         * TerminalPolicyId.
         */
        public Builder terminalPolicyId(String terminalPolicyId) {
            this.putBodyParameter("TerminalPolicyId", terminalPolicyId);
            this.terminalPolicyId = terminalPolicyId;
            return this;
        }

        @Override
        public UpdateTerminalPolicyRequest build() {
            return new UpdateTerminalPolicyRequest(this);
        } 

    } 

}
