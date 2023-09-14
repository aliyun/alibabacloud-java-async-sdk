// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeGroupParam} extends {@link TeaModel}
 *
 * <p>NodeGroupParam</p>
 */
public class NodeGroupParam extends TeaModel {
    @NameInMap("AutoPayOrder")
    private Boolean autoPayOrder;

    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    private Integer autoRenewDuration;

    @NameInMap("AutoRenewDurationUnit")
    private String autoRenewDurationUnit;

    @NameInMap("DataDisks")
    private java.util.List < DiskInfo > dataDisks;

    @NameInMap("Description")
    private String description;

    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @NameInMap("NodeCount")
    private Integer nodeCount;

    @NameInMap("NodeGroupIndex")
    private Integer nodeGroupIndex;

    @NameInMap("NodeGroupName")
    private String nodeGroupName;

    @NameInMap("NodeGroupType")
    private String nodeGroupType;

    @NameInMap("PaymentDuration")
    private Integer paymentDuration;

    @NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("SystemDisk")
    private SystemDiskParam systemDisk;

    @NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    @NameInMap("ZoneId")
    private String zoneId;

    private NodeGroupParam(Builder builder) {
        this.autoPayOrder = builder.autoPayOrder;
        this.autoRenew = builder.autoRenew;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewDurationUnit = builder.autoRenewDurationUnit;
        this.dataDisks = builder.dataDisks;
        this.description = builder.description;
        this.instanceTypes = builder.instanceTypes;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupIndex = builder.nodeGroupIndex;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeGroupType = builder.nodeGroupType;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.paymentType = builder.paymentType;
        this.systemDisk = builder.systemDisk;
        this.vSwitchIds = builder.vSwitchIds;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeGroupParam create() {
        return builder().build();
    }

    /**
     * @return autoPayOrder
     */
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewDuration
     */
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return autoRenewDurationUnit
     */
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    /**
     * @return dataDisks
     */
    public java.util.List < DiskInfo > getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeGroupIndex
     */
    public Integer getNodeGroupIndex() {
        return this.nodeGroupIndex;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return nodeGroupType
     */
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
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
     * @return systemDisk
     */
    public SystemDiskParam getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Boolean autoPayOrder; 
        private Boolean autoRenew; 
        private Integer autoRenewDuration; 
        private String autoRenewDurationUnit; 
        private java.util.List < DiskInfo > dataDisks; 
        private String description; 
        private java.util.List < String > instanceTypes; 
        private Integer nodeCount; 
        private Integer nodeGroupIndex; 
        private String nodeGroupName; 
        private String nodeGroupType; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String paymentType; 
        private SystemDiskParam systemDisk; 
        private java.util.List < String > vSwitchIds; 
        private String zoneId; 

        /**
         * AutoPayOrder.
         */
        public Builder autoPayOrder(Boolean autoPayOrder) {
            this.autoPayOrder = autoPayOrder;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * AutoRenewDuration.
         */
        public Builder autoRenewDuration(Integer autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * AutoRenewDurationUnit.
         */
        public Builder autoRenewDurationUnit(String autoRenewDurationUnit) {
            this.autoRenewDurationUnit = autoRenewDurationUnit;
            return this;
        }

        /**
         * DataDisks.
         */
        public Builder dataDisks(java.util.List < DiskInfo > dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * NodeGroupIndex.
         */
        public Builder nodeGroupIndex(Integer nodeGroupIndex) {
            this.nodeGroupIndex = nodeGroupIndex;
            return this;
        }

        /**
         * NodeGroupName.
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * NodeGroupType.
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * PaymentDuration.
         */
        public Builder paymentDuration(Integer paymentDuration) {
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
         * SystemDisk.
         */
        public Builder systemDisk(SystemDiskParam systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public NodeGroupParam build() {
            return new NodeGroupParam(this);
        } 

    } 

}
