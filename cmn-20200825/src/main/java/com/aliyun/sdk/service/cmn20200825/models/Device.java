// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Device} extends {@link TeaModel}
 *
 * <p>Device</p>
 */
public class Device extends TeaModel {
    @NameInMap("AccountType")
    private String accountType;

    @NameInMap("AccountVersion")
    private String accountVersion;

    @NameInMap("AuthPassPhrase")
    private String authPassPhrase;

    @NameInMap("AuthProtocol")
    private String authProtocol;

    @NameInMap("Community")
    private String community;

    @NameInMap("DeviceForm")
    private String deviceForm;

    @NameInMap("DeviceId")
    private String deviceId;

    @NameInMap("DeviceIp")
    private String deviceIp;

    @NameInMap("DeviceMac")
    private String deviceMac;

    @NameInMap("DeviceSn")
    private String deviceSn;

    @NameInMap("Hostname")
    private String hostname;

    @NameInMap("Model")
    private String model;

    @NameInMap("PrivacyPassPhrase")
    private String privacyPassPhrase;

    @NameInMap("PrivacyProtocol")
    private String privacyProtocol;

    @NameInMap("SecurityDomain")
    private String securityDomain;

    @NameInMap("SecurityLevel")
    private String securityLevel;

    @NameInMap("Space")
    private String space;

    @NameInMap("SshAccount")
    private String sshAccount;

    @NameInMap("SshPassword")
    private String sshPassword;

    @NameInMap("Status")
    private String status;

    @NameInMap("TelnetAccount")
    private String telnetAccount;

    @NameInMap("TelnetPassword")
    private String telnetPassword;

    @NameInMap("UserName")
    private String userName;

    @NameInMap("Vendor")
    private String vendor;

    private Device(Builder builder) {
        this.accountType = builder.accountType;
        this.accountVersion = builder.accountVersion;
        this.authPassPhrase = builder.authPassPhrase;
        this.authProtocol = builder.authProtocol;
        this.community = builder.community;
        this.deviceForm = builder.deviceForm;
        this.deviceId = builder.deviceId;
        this.deviceIp = builder.deviceIp;
        this.deviceMac = builder.deviceMac;
        this.deviceSn = builder.deviceSn;
        this.hostname = builder.hostname;
        this.model = builder.model;
        this.privacyPassPhrase = builder.privacyPassPhrase;
        this.privacyProtocol = builder.privacyProtocol;
        this.securityDomain = builder.securityDomain;
        this.securityLevel = builder.securityLevel;
        this.space = builder.space;
        this.sshAccount = builder.sshAccount;
        this.sshPassword = builder.sshPassword;
        this.status = builder.status;
        this.telnetAccount = builder.telnetAccount;
        this.telnetPassword = builder.telnetPassword;
        this.userName = builder.userName;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Device create() {
        return builder().build();
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return accountVersion
     */
    public String getAccountVersion() {
        return this.accountVersion;
    }

    /**
     * @return authPassPhrase
     */
    public String getAuthPassPhrase() {
        return this.authPassPhrase;
    }

    /**
     * @return authProtocol
     */
    public String getAuthProtocol() {
        return this.authProtocol;
    }

    /**
     * @return community
     */
    public String getCommunity() {
        return this.community;
    }

    /**
     * @return deviceForm
     */
    public String getDeviceForm() {
        return this.deviceForm;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceIp
     */
    public String getDeviceIp() {
        return this.deviceIp;
    }

    /**
     * @return deviceMac
     */
    public String getDeviceMac() {
        return this.deviceMac;
    }

    /**
     * @return deviceSn
     */
    public String getDeviceSn() {
        return this.deviceSn;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return privacyPassPhrase
     */
    public String getPrivacyPassPhrase() {
        return this.privacyPassPhrase;
    }

    /**
     * @return privacyProtocol
     */
    public String getPrivacyProtocol() {
        return this.privacyProtocol;
    }

    /**
     * @return securityDomain
     */
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    /**
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    /**
     * @return space
     */
    public String getSpace() {
        return this.space;
    }

    /**
     * @return sshAccount
     */
    public String getSshAccount() {
        return this.sshAccount;
    }

    /**
     * @return sshPassword
     */
    public String getSshPassword() {
        return this.sshPassword;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return telnetAccount
     */
    public String getTelnetAccount() {
        return this.telnetAccount;
    }

    /**
     * @return telnetPassword
     */
    public String getTelnetPassword() {
        return this.telnetPassword;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String accountType; 
        private String accountVersion; 
        private String authPassPhrase; 
        private String authProtocol; 
        private String community; 
        private String deviceForm; 
        private String deviceId; 
        private String deviceIp; 
        private String deviceMac; 
        private String deviceSn; 
        private String hostname; 
        private String model; 
        private String privacyPassPhrase; 
        private String privacyProtocol; 
        private String securityDomain; 
        private String securityLevel; 
        private String space; 
        private String sshAccount; 
        private String sshPassword; 
        private String status; 
        private String telnetAccount; 
        private String telnetPassword; 
        private String userName; 
        private String vendor; 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * AccountVersion.
         */
        public Builder accountVersion(String accountVersion) {
            this.accountVersion = accountVersion;
            return this;
        }

        /**
         * AuthPassPhrase.
         */
        public Builder authPassPhrase(String authPassPhrase) {
            this.authPassPhrase = authPassPhrase;
            return this;
        }

        /**
         * AuthProtocol.
         */
        public Builder authProtocol(String authProtocol) {
            this.authProtocol = authProtocol;
            return this;
        }

        /**
         * Community.
         */
        public Builder community(String community) {
            this.community = community;
            return this;
        }

        /**
         * DeviceForm.
         */
        public Builder deviceForm(String deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * DeviceIp.
         */
        public Builder deviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }

        /**
         * DeviceMac.
         */
        public Builder deviceMac(String deviceMac) {
            this.deviceMac = deviceMac;
            return this;
        }

        /**
         * DeviceSn.
         */
        public Builder deviceSn(String deviceSn) {
            this.deviceSn = deviceSn;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * PrivacyPassPhrase.
         */
        public Builder privacyPassPhrase(String privacyPassPhrase) {
            this.privacyPassPhrase = privacyPassPhrase;
            return this;
        }

        /**
         * PrivacyProtocol.
         */
        public Builder privacyProtocol(String privacyProtocol) {
            this.privacyProtocol = privacyProtocol;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }

        /**
         * SecurityLevel.
         */
        public Builder securityLevel(String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        /**
         * Space.
         */
        public Builder space(String space) {
            this.space = space;
            return this;
        }

        /**
         * SshAccount.
         */
        public Builder sshAccount(String sshAccount) {
            this.sshAccount = sshAccount;
            return this;
        }

        /**
         * SshPassword.
         */
        public Builder sshPassword(String sshPassword) {
            this.sshPassword = sshPassword;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TelnetAccount.
         */
        public Builder telnetAccount(String telnetAccount) {
            this.telnetAccount = telnetAccount;
            return this;
        }

        /**
         * TelnetPassword.
         */
        public Builder telnetPassword(String telnetPassword) {
            this.telnetPassword = telnetPassword;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public Device build() {
            return new Device(this);
        } 

    } 

}
