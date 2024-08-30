// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MachineGroup} extends {@link TeaModel}
 *
 * <p>MachineGroup</p>
 */
public class MachineGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreatorID")
    private String creatorID;

    @com.aliyun.core.annotation.NameInMap("DefaultDriver")
    private String defaultDriver;

    @com.aliyun.core.annotation.NameInMap("EcsCount")
    private Long ecsCount;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("GmtCreatedTime")
    private String gmtCreatedTime;

    @com.aliyun.core.annotation.NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("GmtStartedTime")
    private String gmtStartedTime;

    @com.aliyun.core.annotation.NameInMap("MachineGroupID")
    private String machineGroupID;

    @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
    private String orderInstanceId;

    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private String paymentDuration;

    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    private String reasonCode;

    @com.aliyun.core.annotation.NameInMap("ReasonMessage")
    private String reasonMessage;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportedDrivers")
    private java.util.List < String > supportedDrivers;

    private MachineGroup(Builder builder) {
        this.creatorID = builder.creatorID;
        this.defaultDriver = builder.defaultDriver;
        this.ecsCount = builder.ecsCount;
        this.ecsSpec = builder.ecsSpec;
        this.gmtCreatedTime = builder.gmtCreatedTime;
        this.gmtExpiredTime = builder.gmtExpiredTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.gmtStartedTime = builder.gmtStartedTime;
        this.machineGroupID = builder.machineGroupID;
        this.orderInstanceId = builder.orderInstanceId;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.resourceGroupID = builder.resourceGroupID;
        this.status = builder.status;
        this.supportedDrivers = builder.supportedDrivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MachineGroup create() {
        return builder().build();
    }

    /**
     * @return creatorID
     */
    public String getCreatorID() {
        return this.creatorID;
    }

    /**
     * @return defaultDriver
     */
    public String getDefaultDriver() {
        return this.defaultDriver;
    }

    /**
     * @return ecsCount
     */
    public Long getEcsCount() {
        return this.ecsCount;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return gmtCreatedTime
     */
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    /**
     * @return gmtExpiredTime
     */
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return gmtStartedTime
     */
    public String getGmtStartedTime() {
        return this.gmtStartedTime;
    }

    /**
     * @return machineGroupID
     */
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    /**
     * @return orderInstanceId
     */
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    /**
     * @return paymentDuration
     */
    public String getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportedDrivers
     */
    public java.util.List < String > getSupportedDrivers() {
        return this.supportedDrivers;
    }

    public static final class Builder {
        private String creatorID; 
        private String defaultDriver; 
        private Long ecsCount; 
        private String ecsSpec; 
        private String gmtCreatedTime; 
        private String gmtExpiredTime; 
        private String gmtModifiedTime; 
        private String gmtStartedTime; 
        private String machineGroupID; 
        private String orderInstanceId; 
        private String paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private String reasonCode; 
        private String reasonMessage; 
        private String resourceGroupID; 
        private String status; 
        private java.util.List < String > supportedDrivers; 

        /**
         * CreatorID.
         */
        public Builder creatorID(String creatorID) {
            this.creatorID = creatorID;
            return this;
        }

        /**
         * DefaultDriver.
         */
        public Builder defaultDriver(String defaultDriver) {
            this.defaultDriver = defaultDriver;
            return this;
        }

        /**
         * EcsCount.
         */
        public Builder ecsCount(Long ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }

        /**
         * EcsSpec.
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * GmtCreatedTime.
         */
        public Builder gmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }

        /**
         * GmtExpiredTime.
         */
        public Builder gmtExpiredTime(String gmtExpiredTime) {
            this.gmtExpiredTime = gmtExpiredTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * GmtStartedTime.
         */
        public Builder gmtStartedTime(String gmtStartedTime) {
            this.gmtStartedTime = gmtStartedTime;
            return this;
        }

        /**
         * MachineGroupID.
         */
        public Builder machineGroupID(String machineGroupID) {
            this.machineGroupID = machineGroupID;
            return this;
        }

        /**
         * OrderInstanceId.
         */
        public Builder orderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }

        /**
         * PaymentDuration.
         */
        public Builder paymentDuration(String paymentDuration) {
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * PaymentDurationUnit.
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * PaymentType.
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
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
         * SupportedDrivers.
         */
        public Builder supportedDrivers(java.util.List < String > supportedDrivers) {
            this.supportedDrivers = supportedDrivers;
            return this;
        }

        public MachineGroup build() {
            return new MachineGroup(this);
        } 

    } 

}
