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
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The default driver version.</p>
         * 
         * <strong>example:</strong>
         * <p>535</p>
         */
        public Builder defaultDriver(String defaultDriver) {
            this.defaultDriver = defaultDriver;
            return this;
        }

        /**
         * <p>The purchase duration.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder ecsType(String ecsType) {
            this.ecsType = ecsType;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10T03:17:31Z</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-22T00:00:00Z</p>
         */
        public Builder gmtExpired(String gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-22T00:00:00Z</p>
         */
        public Builder gmtStarted(String gmtStarted) {
            this.gmtStarted = gmtStarted;
            return this;
        }

        /**
         * <p>The machine group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mg1</p>
         */
        public Builder machineGroupID(String machineGroupID) {
            this.machineGroupID = machineGroupID;
            return this;
        }

        /**
         * <p>The order ID.</p>
         */
        public Builder orderID(String orderID) {
            this.orderID = orderID;
            return this;
        }

        /**
         * <p>The order instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>236553689400333</p>
         */
        public Builder orderInstanceId(String orderInstanceId) {
            this.orderInstanceId = orderInstanceId;
            return this;
        }

        /**
         * <p>The PAI resource ID.</p>
         */
        public Builder PAIResourceID(String PAIResourceID) {
            this.PAIResourceID = PAIResourceID;
            return this;
        }

        /**
         * <p>The billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePay</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The pricing cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>Monthly</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionID(String regionID) {
            this.regionID = regionID;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2D0392B-D749-5C48-A98A-3FAE5C9444A6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The supported driver versions.</p>
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
