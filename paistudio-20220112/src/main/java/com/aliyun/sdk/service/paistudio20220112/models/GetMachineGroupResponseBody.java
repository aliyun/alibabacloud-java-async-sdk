// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMachineGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetMachineGroupResponseBody</p>
 */
public class GetMachineGroupResponseBody extends TeaModel {
    @NameInMap("Count")
    private Long count;

    @NameInMap("Duration")
    private String duration;

    @NameInMap("EcsType")
    private String ecsType;

    @NameInMap("GmtCreated")
    private String gmtCreated;

    @NameInMap("GmtExpired")
    private String gmtExpired;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("GmtStarted")
    private String gmtStarted;

    @NameInMap("MachineGroupID")
    private String machineGroupID;

    @NameInMap("OrderID")
    private String orderID;

    @NameInMap("PAIResourceID")
    private String PAIResourceID;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("PricingCycle")
    private String pricingCycle;

    @NameInMap("RegionID")
    private String regionID;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private GetMachineGroupResponseBody(Builder builder) {
        this.count = builder.count;
        this.duration = builder.duration;
        this.ecsType = builder.ecsType;
        this.gmtCreated = builder.gmtCreated;
        this.gmtExpired = builder.gmtExpired;
        this.gmtModified = builder.gmtModified;
        this.gmtStarted = builder.gmtStarted;
        this.machineGroupID = builder.machineGroupID;
        this.orderID = builder.orderID;
        this.PAIResourceID = builder.PAIResourceID;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.regionID = builder.regionID;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMachineGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
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

    public static final class Builder {
        private Long count; 
        private String duration; 
        private String ecsType; 
        private String gmtCreated; 
        private String gmtExpired; 
        private String gmtModified; 
        private String gmtStarted; 
        private String machineGroupID; 
        private String orderID; 
        private String PAIResourceID; 
        private String payType; 
        private String pricingCycle; 
        private String regionID; 
        private String requestId; 
        private String status; 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
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

        public GetMachineGroupResponseBody build() {
            return new GetMachineGroupResponseBody(this);
        } 

    } 

}
