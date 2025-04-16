// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetMachineGroupResponseBody</p>
 */
public class GetMachineGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("DefaultDriver")
    private String defaultDriver;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.NameInMap("EcsType")
    private String ecsType;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtExpired")
    private String gmtExpired;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("GmtStarted")
    private String gmtStarted;

    @com.aliyun.core.annotation.NameInMap("MachineGroupID")
    private String machineGroupID;

    @com.aliyun.core.annotation.NameInMap("OrderID")
    private String orderID;

    @com.aliyun.core.annotation.NameInMap("OrderInstanceId")
    private String orderInstanceId;

    @com.aliyun.core.annotation.NameInMap("PAIResourceID")
    private String PAIResourceID;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.NameInMap("RegionID")
    private String regionID;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportedDrivers")
    private java.util.List<String> supportedDrivers;

    private GetMachineGroupResponseBody(Builder builder) {
        this.count = builder.count;
        this.defaultDriver = builder.defaultDriver;
        this.duration = builder.duration;
        this.ecsType = builder.ecsType;
        this.gmtCreated = builder.gmtCreated;
        this.gmtExpired = builder.gmtExpired;
        this.gmtModified = builder.gmtModified;
        this.gmtStarted = builder.gmtStarted;
        this.machineGroupID = builder.machineGroupID;
        this.orderID = builder.orderID;
        this.orderInstanceId = builder.orderInstanceId;
        this.PAIResourceID = builder.PAIResourceID;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.regionID = builder.regionID;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.supportedDrivers = builder.supportedDrivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMachineGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return defaultDriver
     */
    public String getDefaultDriver() {
        return this.defaultDriver;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return ecsType
     */
    public String getEcsType() {
        return this.ecsType;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtExpired
     */
    public String getGmtExpired() {
        return this.gmtExpired;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return gmtStarted
     */
    public String getGmtStarted() {
        return this.gmtStarted;
    }

    /**
     * @return machineGroupID
     */
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    /**
     * @return orderID
     */
    public String getOrderID() {
        return this.orderID;
    }

    /**
     * @return orderInstanceId
     */
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    /**
     * @return PAIResourceID
     */
    public String getPAIResourceID() {
        return this.PAIResourceID;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return regionID
     */
    public String getRegionID() {
        return this.regionID;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
    public java.util.List<String> getSupportedDrivers() {
        return this.supportedDrivers;
    }

    public static final class Builder {
        private Long count; 
        private String defaultDriver; 
        private String duration; 
        private String ecsType; 
        private String gmtCreated; 
        private String gmtExpired; 
        private String gmtModified; 
        private String gmtStarted; 
        private String machineGroupID; 
        private String orderID; 
        private String orderInstanceId; 
        private String PAIResourceID; 
        private String payType; 
        private String pricingCycle; 
        private String regionID; 
        private String requestId; 
        private String status; 
        private java.util.List<String> supportedDrivers; 

        private Builder() {
        } 

        private Builder(GetMachineGroupResponseBody model) {
            this.count = model.count;
            this.defaultDriver = model.defaultDriver;
            this.duration = model.duration;
            this.ecsType = model.ecsType;
            this.gmtCreated = model.gmtCreated;
            this.gmtExpired = model.gmtExpired;
            this.gmtModified = model.gmtModified;
            this.gmtStarted = model.gmtStarted;
            this.machineGroupID = model.machineGroupID;
            this.orderID = model.orderID;
            this.orderInstanceId = model.orderInstanceId;
            this.PAIResourceID = model.PAIResourceID;
            this.payType = model.payType;
            this.pricingCycle = model.pricingCycle;
            this.regionID = model.regionID;
            this.requestId = model.requestId;
            this.status = model.status;
            this.supportedDrivers = model.supportedDrivers;
        } 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
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
         * Duration.
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * EcsType.
         */
        public Builder ecsType(String ecsType) {
            this.ecsType = ecsType;
            return this;
        }

        /**
         * GmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * GmtExpired.
         */
        public Builder gmtExpired(String gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * GmtStarted.
         */
        public Builder gmtStarted(String gmtStarted) {
            this.gmtStarted = gmtStarted;
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
         * OrderID.
         */
        public Builder orderID(String orderID) {
            this.orderID = orderID;
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
         * PAIResourceID.
         */
        public Builder PAIResourceID(String PAIResourceID) {
            this.PAIResourceID = PAIResourceID;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * RegionID.
         */
        public Builder regionID(String regionID) {
            this.regionID = regionID;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
        public Builder supportedDrivers(java.util.List<String> supportedDrivers) {
            this.supportedDrivers = supportedDrivers;
            return this;
        }

        public GetMachineGroupResponseBody build() {
            return new GetMachineGroupResponseBody(this);
        } 

    } 

}
