// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
    private java.util.List<Tag> tag;

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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<Tag> tag; 
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
         * <p>The deployment type. Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong>: Internet- and VPC-connected instance</p>
         * </li>
         * <li><p><strong>5</strong>: VPC-connected instance</p>
         * </li>
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
         * <p>The disk capacity.</p>
         * <p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
         * <blockquote>
         * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
         * <li><p><strong>0</strong>: ultra disk</p>
         * </li>
         * <li><p><strong>1</strong>: standard SSD</p>
         * <blockquote>
         * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The Internet traffic.</p>
         * <ul>
         * <li><p>This parameter is required if <strong>DeployType</strong> is set to <strong>4</strong>.</p>
         * </li>
         * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
         * <p>The peak traffic (not recommended).</p>
         * <ul>
         * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
         * </li>
         * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
         * <p>The traffic specification (recommended).</p>
         * <ul>
         * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
         * </li>
         * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>1 (default): pay-as-you-go for reserved instances</li>
         * <li>3: pay-as-you-go for reserved specifications and elastic scaling of serverless instances</li>
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
         * <p>The number of partitions (recommended).</p>
         * <ul>
         * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
         * </li>
         * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the instance is purchased based on the number of partitions.</p>
         * </li>
         * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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
         * <p>The resource group ID.</p>
         * <p>If you do not specify this parameter, the instance is added to the default resource group. You can view the resource group ID in the Resource Management console.</p>
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
         * <p>The settings for the serverless instance. This parameter is required when you create a serverless instance.</p>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>The specification type.</p>
         * <p>Valid values when the PaidType parameter is set to 1 (pay-as-you-go for reserved instances):</p>
         * <ul>
         * <li>normal: Standard Edition (High Write)</li>
         * <li>professional: Professional Edition (High Write)</li>
         * <li>professionalForHighRead: Professional Edition (High Read)</li>
         * </ul>
         * <p>Valid values when the PaidType parameter is set to 3 (pay-as-you-go for reserved specifications and elastic scaling of serverless instances):</p>
         * <ul>
         * <li>basic: Serverless Basic Edition</li>
         * <li>normal: Serverless Standard Edition</li>
         * <li>professional: Serverless Professional Edition</li>
         * </ul>
         * <p>For more information about the preceding specification types, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
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
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The number of topics (not recommended).</p>
         * <ul>
         * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
         * </li>
         * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the instance is purchased based on the number of partitions.</p>
         * </li>
         * <li><p>The default value varies based on the traffic specification. If the number of topics exceeds the default value, you are charged extra fees.</p>
         * </li>
         * <li><p>For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing overview</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you create a serverless instance, you do not need to specify this parameter.</p>
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

            private Builder() {
            } 

            private Builder(ServerlessConfig model) {
                this.reservedPublishCapacity = model.reservedPublishCapacity;
                this.reservedSubscribeCapacity = model.reservedSubscribeCapacity;
            } 

            /**
             * <p>The reserved publish traffic specification. Only integers are supported, and the minimum value is 60. This parameter is required for serverless instances.</p>
             * <blockquote>
             * <p>The actual upper limit is subject to the inventory in the current region. Refer to the available options on the buy page.</p>
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
             * <p>The reserved subscribe traffic specification. Only integers are supported, and the minimum value is 20. This parameter is required for serverless instances.</p>
             * <blockquote>
             * <p>The actual upper limit is subject to the inventory in the current region. Refer to the available options on the buy page.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>60</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource.</p>
             * <ul>
             * <li>N ranges from 1 to 20.</li>
             * <li>If this parameter is left empty, all tag keys are matched.</li>
             * <li>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</li>
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
             * <p>The tag value of the resource.</p>
             * <ul>
             * <li>N ranges from 1 to 20.</li>
             * <li>If the tag key is empty, this parameter must be empty. If this parameter is left empty, all tag values are matched.</li>
             * <li>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</li>
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
