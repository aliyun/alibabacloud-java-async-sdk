// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePostPayOrderRequest} extends {@link RequestModel}
 *
 * <p>CreatePostPayOrderRequest</p>
 */
public class CreatePostPayOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipMax")
    private Integer eipMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoMax")
    private Integer ioMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoMaxSpec")
    private String ioMaxSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidType")
    private Integer paidType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionNum")
    private Integer partitionNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicQuota")
    private Integer topicQuota;

    private CreatePostPayOrderRequest(Builder builder) {
        super(builder);
        this.deployType = builder.deployType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.eipMax = builder.eipMax;
        this.ioMax = builder.ioMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.paidType = builder.paidType;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverlessConfig = builder.serverlessConfig;
        this.specType = builder.specType;
        this.tag = builder.tag;
        this.topicQuota = builder.topicQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePostPayOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployType
     */
    public Integer getDeployType() {
        return this.deployType;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return eipMax
     */
    public Integer getEipMax() {
        return this.eipMax;
    }

    /**
     * @return ioMax
     */
    public Integer getIoMax() {
        return this.ioMax;
    }

    /**
     * @return ioMaxSpec
     */
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    /**
     * @return paidType
     */
    public Integer getPaidType() {
        return this.paidType;
    }

    /**
     * @return partitionNum
     */
    public Integer getPartitionNum() {
        return this.partitionNum;
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
     * @return serverlessConfig
     */
    public ServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return topicQuota
     */
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static final class Builder extends Request.Builder<CreatePostPayOrderRequest, Builder> {
        private Integer deployType; 
        private Integer diskSize; 
        private String diskType; 
        private Integer eipMax; 
        private Integer ioMax; 
        private String ioMaxSpec; 
        private Integer paidType; 
        private Integer partitionNum; 
        private String regionId; 
        private String resourceGroupId; 
        private ServerlessConfig serverlessConfig; 
        private String specType; 
        private java.util.List < Tag> tag; 
        private Integer topicQuota; 

        private Builder() {
            super();
        } 

        private Builder(CreatePostPayOrderRequest request) {
            super(request);
            this.deployType = request.deployType;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.eipMax = request.eipMax;
            this.ioMax = request.ioMax;
            this.ioMaxSpec = request.ioMaxSpec;
            this.paidType = request.paidType;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.serverlessConfig = request.serverlessConfig;
            this.specType = request.specType;
            this.tag = request.tag;
            this.topicQuota = request.topicQuota;
        } 

        /**
         * <p>The deployment mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>4</strong>: deploys the instance that allows access from the Internet and a VPC.</li>
         * <li><strong>5</strong>: deploys the instance that allows access only from a VPC.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder deployType(Integer deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * <p>The disk size.</p>
         * <p>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p> If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: ultra disk</li>
         * <li><strong>1</strong>: standard SSD</li>
         * </ul>
         * <blockquote>
         * <p> If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The maximum Internet traffic in the instance.</p>
         * <ul>
         * <li>If you set <strong>DeployType</strong> to <strong>4</strong>, you must configure this parameter.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * <p>The maximum traffic in the instance. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder ioMax(Integer ioMax) {
            this.putQueryParameter("IoMax", ioMax);
            this.ioMax = ioMax;
            return this;
        }

        /**
         * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alikafka.hw.2xlarge</p>
         */
        public Builder ioMaxSpec(String ioMaxSpec) {
            this.putQueryParameter("IoMaxSpec", ioMaxSpec);
            this.ioMaxSpec = ioMaxSpec;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>1: the pay-as-you-go billing method for ApsaraMQ for Kafka V2 instances.</li>
         * <li>3: the pay-as-you-go billing method for serverless ApsaraMQ for Kafka V3 instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder paidType(Integer paidType) {
            this.putQueryParameter("PaidType", paidType);
            this.paidType = paidType;
            return this;
        }

        /**
         * <p>The number of partitions. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.</li>
         * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder partitionNum(Integer partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * <p>If this parameter is left empty, the default resource group is used. You can view the resource group ID on the Resource Group page in the Resource Management console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ac***********7q</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The parameters configured for the serverless ApsaraMQ for Kafka V3 instance. When you create a Serverless ApsaraMQ for Kafka V3 serverless instance, you must configure these parameters.</p>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>The instance edition.</p>
         * <p>Valid values if you set PaidType to 1:</p>
         * <ul>
         * <li>normal: Standard Edition (High Write)</li>
         * <li>professional: Professional Edition (High Write)</li>
         * <li>professionalForHighRead: Professional Edition (High Read)</li>
         * </ul>
         * <p>Valid values if you set PaidType to 3:</p>
         * <ul>
         * <li>normal: Serverless Standard Edition</li>
         * </ul>
         * <p>For more information about the instance editions, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The number of topics. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.</li>
         * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
         * <li>The default value of TopicQuota varies based on the value of IoMaxSpec. If the number of topics that you consume exceeds the default value, you are charged additional fees.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If you create a serverless ApsaraMQ for Kafka V3 instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder topicQuota(Integer topicQuota) {
            this.putQueryParameter("TopicQuota", topicQuota);
            this.topicQuota = topicQuota;
            return this;
        }

        @Override
        public CreatePostPayOrderRequest build() {
            return new CreatePostPayOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePostPayOrderRequest} extends {@link TeaModel}
     *
     * <p>CreatePostPayOrderRequest</p>
     */
    public static class ServerlessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReservedPublishCapacity")
        private Long reservedPublishCapacity;

        @com.aliyun.core.annotation.NameInMap("ReservedSubscribeCapacity")
        private Long reservedSubscribeCapacity;

        private ServerlessConfig(Builder builder) {
            this.reservedPublishCapacity = builder.reservedPublishCapacity;
            this.reservedSubscribeCapacity = builder.reservedSubscribeCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfig create() {
            return builder().build();
        }

        /**
         * @return reservedPublishCapacity
         */
        public Long getReservedPublishCapacity() {
            return this.reservedPublishCapacity;
        }

        /**
         * @return reservedSubscribeCapacity
         */
        public Long getReservedSubscribeCapacity() {
            return this.reservedSubscribeCapacity;
        }

        public static final class Builder {
            private Long reservedPublishCapacity; 
            private Long reservedSubscribeCapacity; 

            /**
             * <p>The reserved capacity for publishing messages. You can specify only an integer for this parameter. Minimum value: 60.</p>
             * <blockquote>
             * <p> The actual maximum reserved capacity for publishing messages varies based on available resources in the region. The actual range displayed on the buy page shall prevail.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder reservedPublishCapacity(Long reservedPublishCapacity) {
                this.reservedPublishCapacity = reservedPublishCapacity;
                return this;
            }

            /**
             * <p>The reserved capacity for subscribing to messages. You can specify only an integer for this parameter. Minimum value: 20.</p>
             * <blockquote>
             * <p> The actual maximum reserved capacity for subscribing to messages varies based on available resources in the region. The actual range displayed on the buy page shall prevail.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder reservedSubscribeCapacity(Long reservedSubscribeCapacity) {
                this.reservedSubscribeCapacity = reservedSubscribeCapacity;
                return this;
            }

            public ServerlessConfig build() {
                return new ServerlessConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePostPayOrderRequest} extends {@link TeaModel}
     *
     * <p>CreatePostPayOrderRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The key of tag N.</p>
             * <ul>
             * <li>Valid values of N: 1 to 20.</li>
             * <li>If this parameter is left empty, the keys of all tags are matched.</li>
             * <li>The tag key must be up to 128 characters in length. It cannot start with acs: or aliyun or contain <a href="http://https://%E3%80%82">http:// or https://.</a></li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * <ul>
             * <li>Valid values of N: 1 to 20.</li>
             * <li>If you do not specify a tag key, you cannot specify a tag value. If this parameter is not configured, all tag values are matched.</li>
             * <li>The tag value must be 1 to 128 characters in length. It cannot start with acs: or aliyun or contain <a href="http://https://%E3%80%82">http:// or https://.</a></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
}
