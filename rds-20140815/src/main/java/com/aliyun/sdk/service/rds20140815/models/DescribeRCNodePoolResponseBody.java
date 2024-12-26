// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCNodePoolResponseBody</p>
 */
public class DescribeRCNodePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodePoolList")
    private java.util.List<NodePoolList> nodePoolList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCNodePoolResponseBody(Builder builder) {
        this.nodePoolList = builder.nodePoolList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCNodePoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodePoolList
     */
    public java.util.List<NodePoolList> getNodePoolList() {
        return this.nodePoolList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<NodePoolList> nodePoolList; 
        private String requestId; 

        /**
         * NodePoolList.
         */
        public Builder nodePoolList(java.util.List<NodePoolList> nodePoolList) {
            this.nodePoolList = nodePoolList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCNodePoolResponseBody build() {
            return new DescribeRCNodePoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNodePoolResponseBody</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DeleteWithInstance")
        private Boolean deleteWithInstance;

        @com.aliyun.core.annotation.NameInMap("Encrypted")
        private String encrypted;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.deleteWithInstance = builder.deleteWithInstance;
            this.encrypted = builder.encrypted;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return deleteWithInstance
         */
        public Boolean getDeleteWithInstance() {
            return this.deleteWithInstance;
        }

        /**
         * @return encrypted
         */
        public String getEncrypted() {
            return this.encrypted;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Boolean deleteWithInstance; 
            private String encrypted; 
            private String performanceLevel; 
            private Integer size; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DeleteWithInstance.
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * Encrypted.
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNodePoolResponseBody</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Integer size; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNodePoolResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCNodePoolResponseBody</p>
     */
    public static class NodePoolList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPay")
        private Boolean autoPay;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CreateMode")
        private String createMode;

        @com.aliyun.core.annotation.NameInMap("DataDisk")
        private java.util.List<DataDisk> dataDisk;

        @com.aliyun.core.annotation.NameInMap("DeploymentSetId")
        private String deploymentSetId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("InternetChargeType")
        private String internetChargeType;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("IoOptimized")
        private String ioOptimized;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("NodePoolId")
        private String nodePoolId;

        @com.aliyun.core.annotation.NameInMap("NodePoolName")
        private String nodePoolName;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityEnhancementStrategy")
        private String securityEnhancementStrategy;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("SpotStrategy")
        private String spotStrategy;

        @com.aliyun.core.annotation.NameInMap("SystemDisk")
        private SystemDisk systemDisk;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private NodePoolList(Builder builder) {
            this.autoPay = builder.autoPay;
            this.autoRenew = builder.autoRenew;
            this.clusterId = builder.clusterId;
            this.createMode = builder.createMode;
            this.dataDisk = builder.dataDisk;
            this.deploymentSetId = builder.deploymentSetId;
            this.description = builder.description;
            this.hostName = builder.hostName;
            this.imageId = builder.imageId;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceName = builder.instanceName;
            this.instanceType = builder.instanceType;
            this.internetChargeType = builder.internetChargeType;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.ioOptimized = builder.ioOptimized;
            this.keyPairName = builder.keyPairName;
            this.nodePoolId = builder.nodePoolId;
            this.nodePoolName = builder.nodePoolName;
            this.password = builder.password;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.securityEnhancementStrategy = builder.securityEnhancementStrategy;
            this.securityGroupId = builder.securityGroupId;
            this.spotStrategy = builder.spotStrategy;
            this.systemDisk = builder.systemDisk;
            this.tag = builder.tag;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePoolList create() {
            return builder().build();
        }

        /**
         * @return autoPay
         */
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return createMode
         */
        public String getCreateMode() {
            return this.createMode;
        }

        /**
         * @return dataDisk
         */
        public java.util.List<DataDisk> getDataDisk() {
            return this.dataDisk;
        }

        /**
         * @return deploymentSetId
         */
        public String getDeploymentSetId() {
            return this.deploymentSetId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetChargeType
         */
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return ioOptimized
         */
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return nodePoolId
         */
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        /**
         * @return nodePoolName
         */
        public String getNodePoolName() {
            return this.nodePoolName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return securityEnhancementStrategy
         */
        public String getSecurityEnhancementStrategy() {
            return this.securityEnhancementStrategy;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return spotStrategy
         */
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        /**
         * @return systemDisk
         */
        public SystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean autoPay; 
            private Boolean autoRenew; 
            private String clusterId; 
            private String createMode; 
            private java.util.List<DataDisk> dataDisk; 
            private String deploymentSetId; 
            private String description; 
            private String hostName; 
            private String imageId; 
            private String instanceChargeType; 
            private String instanceName; 
            private String instanceType; 
            private String internetChargeType; 
            private Integer internetMaxBandwidthOut; 
            private String ioOptimized; 
            private String keyPairName; 
            private String nodePoolId; 
            private String nodePoolName; 
            private String password; 
            private Integer period; 
            private String periodUnit; 
            private String regionId; 
            private String resourceGroupId; 
            private String securityEnhancementStrategy; 
            private String securityGroupId; 
            private String spotStrategy; 
            private SystemDisk systemDisk; 
            private java.util.List<Tag> tag; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * AutoPay.
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CreateMode.
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * DataDisk.
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * DeploymentSetId.
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
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
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetChargeType.
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * IoOptimized.
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * NodePoolId.
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            /**
             * NodePoolName.
             */
            public Builder nodePoolName(String nodePoolName) {
                this.nodePoolName = nodePoolName;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * SecurityEnhancementStrategy.
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * SpotStrategy.
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * SystemDisk.
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public NodePoolList build() {
                return new NodePoolList(this);
            } 

        } 

    }
}
