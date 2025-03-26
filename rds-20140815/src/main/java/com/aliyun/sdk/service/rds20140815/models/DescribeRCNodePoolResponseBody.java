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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeRCNodePoolResponseBody model) {
            this.nodePoolList = model.nodePoolList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The node pool information.</p>
         */
        public Builder nodePoolList(java.util.List<NodePoolList> nodePoolList) {
            this.nodePoolList = nodePoolList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
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

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.category = model.category;
                this.deleteWithInstance = model.deleteWithInstance;
                this.encrypted = model.encrypted;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The type of the data disk. Set the value to <strong>cloud_essd</strong>, which indicates Enterprise SSDs (ESSDs).</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder deleteWithInstance(Boolean deleteWithInstance) {
                this.deleteWithInstance = deleteWithInstance;
                return this;
            }

            /**
             * <p>Indicates whether to encrypt the cloud disk. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypted(String encrypted) {
                this.encrypted = encrypted;
                return this;
            }

            /**
             * <p>The performance level of the ESSD. Valid values:</p>
             * <ul>
             * <li><strong>PL0</strong>: A single ESSD delivers up to 10,000 random read/write IOPS.</li>
             * <li><strong>PL1</strong>: A single ESSD delivers up to 50,000 random read/write IOPS.</li>
             * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
             * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The data disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
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
            private String performanceLevel; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The type of the system disk. Set the value to <strong>cloud_essd</strong>, which indicates ESSDs.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The performance level of the ESSD. Valid values:</p>
             * <ul>
             * <li><strong>PL0</strong>: A single ESSD delivers up to 10,000 random read/write IOPS.</li>
             * <li><strong>PL1</strong>: A single ESSD delivers up to 50,000 random read/write IOPS.</li>
             * <li><strong>PL2</strong>: A single ESSD delivers up to 100,000 random read/write IOPS.</li>
             * <li><strong>PL3</strong>: A single ESSD delivers up to 1,000,000 random read/write IOPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL1</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the system disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag keys.</p>
             * 
             * <strong>example:</strong>
             * <p>Testkey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>Testvalue1</p>
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

            private Builder() {
            } 

            private Builder(NodePoolList model) {
                this.autoPay = model.autoPay;
                this.autoRenew = model.autoRenew;
                this.clusterId = model.clusterId;
                this.createMode = model.createMode;
                this.dataDisk = model.dataDisk;
                this.deploymentSetId = model.deploymentSetId;
                this.description = model.description;
                this.hostName = model.hostName;
                this.imageId = model.imageId;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceName = model.instanceName;
                this.instanceType = model.instanceType;
                this.internetChargeType = model.internetChargeType;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.ioOptimized = model.ioOptimized;
                this.keyPairName = model.keyPairName;
                this.nodePoolId = model.nodePoolId;
                this.nodePoolName = model.nodePoolName;
                this.password = model.password;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.securityEnhancementStrategy = model.securityEnhancementStrategy;
                this.securityGroupId = model.securityGroupId;
                this.spotStrategy = model.spotStrategy;
                this.systemDisk = model.systemDisk;
                this.tag = model.tag;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Indicates whether to enable automatic payment. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default): enables the feature. You must make sure that your account balance is sufficient.</li>
             * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * <p>Indicates whether to enable auto-renewal for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong> (default)</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The ID of the container cluster in which the RDS Custom instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>c463aaa89e2b84cacacfbf23c4867****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Indicates whether to add the instance to the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createMode(String createMode) {
                this.createMode = createMode;
                return this;
            }

            /**
             * <p>The data disks.</p>
             */
            public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
                this.dataDisk = dataDisk;
                return this;
            }

            /**
             * <p>The ID of the deployment set.</p>
             * 
             * <strong>example:</strong>
             * <p>ds-bp18ukv66rlyuffv****</p>
             */
            public Builder deploymentSetId(String deploymentSetId) {
                this.deploymentSetId = deploymentSetId;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>testHost1</p>
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * <p>The ID of the image used by the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>image-dsvjzw2ii8n4fvr****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The billing method. Valid value:</p>
             * <ul>
             * <li><strong>Prepaid</strong>: subscription</li>
             * <li><strong>Postpaid</strong>: pay-as-you-go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.i8.large.2cm</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder internetChargeType(String internetChargeType) {
                this.internetChargeType = internetChargeType;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder ioOptimized(String ioOptimized) {
                this.ioOptimized = ioOptimized;
                return this;
            }

            /**
             * <p>The key pair name.</p>
             * 
             * <strong>example:</strong>
             * <p>dell5502</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The node pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np31da1b38983f4511b490fc62108a****</p>
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            /**
             * <p>The name of the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>np31da1b38983f4511b490fc62108a****</p>
             */
            public Builder nodePoolName(String nodePoolName) {
                this.nodePoolName = nodePoolName;
                return this;
            }

            /**
             * <p>The password of the root user of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>testPassword</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The subscription duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription period. Valid values:</p>
             * <ul>
             * <li><strong>Year</strong></li>
             * <li><strong>Month</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Year</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmy****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder securityEnhancementStrategy(String securityEnhancementStrategy) {
                this.securityEnhancementStrategy = securityEnhancementStrategy;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-uf6av412xaxixuez****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The reserved parameter. This parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder spotStrategy(String spotStrategy) {
                this.spotStrategy = spotStrategy;
                return this;
            }

            /**
             * <p>The specification of the system disk.</p>
             */
            public Builder systemDisk(SystemDisk systemDisk) {
                this.systemDisk = systemDisk;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-zm0qvgv3sm3sjzbkr****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-h</p>
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
