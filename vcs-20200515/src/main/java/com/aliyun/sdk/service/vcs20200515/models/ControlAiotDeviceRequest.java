// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlAiotDeviceRequest} extends {@link RequestModel}
 *
 * <p>ControlAiotDeviceRequest</p>
 */
public class ControlAiotDeviceRequest extends Request {
    @Body
    @NameInMap("AssociatedDeviceId")
    private String associatedDeviceId;

    @Body
    @NameInMap("AssociatedIPAddr")
    private String associatedIPAddr;

    @Body
    @NameInMap("AssociatedPort")
    private Long associatedPort;

    @Body
    @NameInMap("AssociatedVerificationEnable")
    private String associatedVerificationEnable;

    @Body
    @NameInMap("BarrierCommand")
    private Long barrierCommand;

    @Body
    @NameInMap("CheckEnabled")
    private String checkEnabled;

    @Body
    @NameInMap("CommandType")
    @Validation(required = true)
    private Long commandType;

    @Body
    @NameInMap("DoubleVerificationGroupEnabled")
    private String doubleVerificationGroupEnabled;

    @Body
    @NameInMap("GateCtlStatus")
    private Long gateCtlStatus;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("IdentityNumber")
    private String identityNumber;

    @Body
    @NameInMap("MiFareCard")
    private MiFareCard miFareCard;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("RebootDevice")
    private String rebootDevice;

    @Body
    @NameInMap("SingleInterval")
    private Long singleInterval;

    @Body
    @NameInMap("SuperPassword")
    private String superPassword;

    @Body
    @NameInMap("UpgradeFileURL")
    private String upgradeFileURL;

    private ControlAiotDeviceRequest(Builder builder) {
        super(builder);
        this.associatedDeviceId = builder.associatedDeviceId;
        this.associatedIPAddr = builder.associatedIPAddr;
        this.associatedPort = builder.associatedPort;
        this.associatedVerificationEnable = builder.associatedVerificationEnable;
        this.barrierCommand = builder.barrierCommand;
        this.checkEnabled = builder.checkEnabled;
        this.commandType = builder.commandType;
        this.doubleVerificationGroupEnabled = builder.doubleVerificationGroupEnabled;
        this.gateCtlStatus = builder.gateCtlStatus;
        this.id = builder.id;
        this.identityNumber = builder.identityNumber;
        this.miFareCard = builder.miFareCard;
        this.name = builder.name;
        this.rebootDevice = builder.rebootDevice;
        this.singleInterval = builder.singleInterval;
        this.superPassword = builder.superPassword;
        this.upgradeFileURL = builder.upgradeFileURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ControlAiotDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associatedDeviceId
     */
    public String getAssociatedDeviceId() {
        return this.associatedDeviceId;
    }

    /**
     * @return associatedIPAddr
     */
    public String getAssociatedIPAddr() {
        return this.associatedIPAddr;
    }

    /**
     * @return associatedPort
     */
    public Long getAssociatedPort() {
        return this.associatedPort;
    }

    /**
     * @return associatedVerificationEnable
     */
    public String getAssociatedVerificationEnable() {
        return this.associatedVerificationEnable;
    }

    /**
     * @return barrierCommand
     */
    public Long getBarrierCommand() {
        return this.barrierCommand;
    }

    /**
     * @return checkEnabled
     */
    public String getCheckEnabled() {
        return this.checkEnabled;
    }

    /**
     * @return commandType
     */
    public Long getCommandType() {
        return this.commandType;
    }

    /**
     * @return doubleVerificationGroupEnabled
     */
    public String getDoubleVerificationGroupEnabled() {
        return this.doubleVerificationGroupEnabled;
    }

    /**
     * @return gateCtlStatus
     */
    public Long getGateCtlStatus() {
        return this.gateCtlStatus;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return identityNumber
     */
    public String getIdentityNumber() {
        return this.identityNumber;
    }

    /**
     * @return miFareCard
     */
    public MiFareCard getMiFareCard() {
        return this.miFareCard;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return rebootDevice
     */
    public String getRebootDevice() {
        return this.rebootDevice;
    }

    /**
     * @return singleInterval
     */
    public Long getSingleInterval() {
        return this.singleInterval;
    }

    /**
     * @return superPassword
     */
    public String getSuperPassword() {
        return this.superPassword;
    }

    /**
     * @return upgradeFileURL
     */
    public String getUpgradeFileURL() {
        return this.upgradeFileURL;
    }

    public static final class Builder extends Request.Builder<ControlAiotDeviceRequest, Builder> {
        private String associatedDeviceId; 
        private String associatedIPAddr; 
        private Long associatedPort; 
        private String associatedVerificationEnable; 
        private Long barrierCommand; 
        private String checkEnabled; 
        private Long commandType; 
        private String doubleVerificationGroupEnabled; 
        private Long gateCtlStatus; 
        private String id; 
        private String identityNumber; 
        private MiFareCard miFareCard; 
        private String name; 
        private String rebootDevice; 
        private Long singleInterval; 
        private String superPassword; 
        private String upgradeFileURL; 

        private Builder() {
            super();
        } 

        private Builder(ControlAiotDeviceRequest response) {
            super(response);
            this.associatedDeviceId = response.associatedDeviceId;
            this.associatedIPAddr = response.associatedIPAddr;
            this.associatedPort = response.associatedPort;
            this.associatedVerificationEnable = response.associatedVerificationEnable;
            this.barrierCommand = response.barrierCommand;
            this.checkEnabled = response.checkEnabled;
            this.commandType = response.commandType;
            this.doubleVerificationGroupEnabled = response.doubleVerificationGroupEnabled;
            this.gateCtlStatus = response.gateCtlStatus;
            this.id = response.id;
            this.identityNumber = response.identityNumber;
            this.miFareCard = response.miFareCard;
            this.name = response.name;
            this.rebootDevice = response.rebootDevice;
            this.singleInterval = response.singleInterval;
            this.superPassword = response.superPassword;
            this.upgradeFileURL = response.upgradeFileURL;
        } 

        /**
         * AssociatedDeviceId.
         */
        public Builder associatedDeviceId(String associatedDeviceId) {
            this.putBodyParameter("AssociatedDeviceId", associatedDeviceId);
            this.associatedDeviceId = associatedDeviceId;
            return this;
        }

        /**
         * AssociatedIPAddr.
         */
        public Builder associatedIPAddr(String associatedIPAddr) {
            this.putBodyParameter("AssociatedIPAddr", associatedIPAddr);
            this.associatedIPAddr = associatedIPAddr;
            return this;
        }

        /**
         * AssociatedPort.
         */
        public Builder associatedPort(Long associatedPort) {
            this.putBodyParameter("AssociatedPort", associatedPort);
            this.associatedPort = associatedPort;
            return this;
        }

        /**
         * AssociatedVerificationEnable.
         */
        public Builder associatedVerificationEnable(String associatedVerificationEnable) {
            this.putBodyParameter("AssociatedVerificationEnable", associatedVerificationEnable);
            this.associatedVerificationEnable = associatedVerificationEnable;
            return this;
        }

        /**
         * BarrierCommand.
         */
        public Builder barrierCommand(Long barrierCommand) {
            this.putBodyParameter("BarrierCommand", barrierCommand);
            this.barrierCommand = barrierCommand;
            return this;
        }

        /**
         * CheckEnabled.
         */
        public Builder checkEnabled(String checkEnabled) {
            this.putBodyParameter("CheckEnabled", checkEnabled);
            this.checkEnabled = checkEnabled;
            return this;
        }

        /**
         * CommandType.
         */
        public Builder commandType(Long commandType) {
            this.putBodyParameter("CommandType", commandType);
            this.commandType = commandType;
            return this;
        }

        /**
         * DoubleVerificationGroupEnabled.
         */
        public Builder doubleVerificationGroupEnabled(String doubleVerificationGroupEnabled) {
            this.putBodyParameter("DoubleVerificationGroupEnabled", doubleVerificationGroupEnabled);
            this.doubleVerificationGroupEnabled = doubleVerificationGroupEnabled;
            return this;
        }

        /**
         * GateCtlStatus.
         */
        public Builder gateCtlStatus(Long gateCtlStatus) {
            this.putBodyParameter("GateCtlStatus", gateCtlStatus);
            this.gateCtlStatus = gateCtlStatus;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IdentityNumber.
         */
        public Builder identityNumber(String identityNumber) {
            this.putBodyParameter("IdentityNumber", identityNumber);
            this.identityNumber = identityNumber;
            return this;
        }

        /**
         * MiFareCard.
         */
        public Builder miFareCard(MiFareCard miFareCard) {
            this.putBodyParameter("MiFareCard", miFareCard);
            this.miFareCard = miFareCard;
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
         * RebootDevice.
         */
        public Builder rebootDevice(String rebootDevice) {
            this.putBodyParameter("RebootDevice", rebootDevice);
            this.rebootDevice = rebootDevice;
            return this;
        }

        /**
         * SingleInterval.
         */
        public Builder singleInterval(Long singleInterval) {
            this.putBodyParameter("SingleInterval", singleInterval);
            this.singleInterval = singleInterval;
            return this;
        }

        /**
         * SuperPassword.
         */
        public Builder superPassword(String superPassword) {
            this.putBodyParameter("SuperPassword", superPassword);
            this.superPassword = superPassword;
            return this;
        }

        /**
         * UpgradeFileURL.
         */
        public Builder upgradeFileURL(String upgradeFileURL) {
            this.putBodyParameter("UpgradeFileURL", upgradeFileURL);
            this.upgradeFileURL = upgradeFileURL;
            return this;
        }

        @Override
        public ControlAiotDeviceRequest build() {
            return new ControlAiotDeviceRequest(this);
        } 

    } 

    public static class MiFareCard extends TeaModel {
        @NameInMap("AreaCode")
        private Long areaCode;

        @NameInMap("AreaDeviate")
        private Long areaDeviate;

        @NameInMap("AreaLen")
        private Long areaLen;

        @NameInMap("Enabled")
        private String enabled;

        @NameInMap("KeyType")
        private Long keyType;

        @NameInMap("LastChange")
        private String lastChange;

        @NameInMap("SecretKey")
        private String secretKey;

        private MiFareCard(Builder builder) {
            this.areaCode = builder.areaCode;
            this.areaDeviate = builder.areaDeviate;
            this.areaLen = builder.areaLen;
            this.enabled = builder.enabled;
            this.keyType = builder.keyType;
            this.lastChange = builder.lastChange;
            this.secretKey = builder.secretKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiFareCard create() {
            return builder().build();
        }

        /**
         * @return areaCode
         */
        public Long getAreaCode() {
            return this.areaCode;
        }

        /**
         * @return areaDeviate
         */
        public Long getAreaDeviate() {
            return this.areaDeviate;
        }

        /**
         * @return areaLen
         */
        public Long getAreaLen() {
            return this.areaLen;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return keyType
         */
        public Long getKeyType() {
            return this.keyType;
        }

        /**
         * @return lastChange
         */
        public String getLastChange() {
            return this.lastChange;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        public static final class Builder {
            private Long areaCode; 
            private Long areaDeviate; 
            private Long areaLen; 
            private String enabled; 
            private Long keyType; 
            private String lastChange; 
            private String secretKey; 

            /**
             * AreaCode.
             */
            public Builder areaCode(Long areaCode) {
                this.areaCode = areaCode;
                return this;
            }

            /**
             * AreaDeviate.
             */
            public Builder areaDeviate(Long areaDeviate) {
                this.areaDeviate = areaDeviate;
                return this;
            }

            /**
             * AreaLen.
             */
            public Builder areaLen(Long areaLen) {
                this.areaLen = areaLen;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * KeyType.
             */
            public Builder keyType(Long keyType) {
                this.keyType = keyType;
                return this;
            }

            /**
             * LastChange.
             */
            public Builder lastChange(String lastChange) {
                this.lastChange = lastChange;
                return this;
            }

            /**
             * SecretKey.
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            public MiFareCard build() {
                return new MiFareCard(this);
            } 

        } 

    }
}
