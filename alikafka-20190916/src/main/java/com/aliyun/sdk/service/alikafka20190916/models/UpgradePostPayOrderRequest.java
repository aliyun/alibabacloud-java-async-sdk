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
 * {@link UpgradePostPayOrderRequest} extends {@link RequestModel}
 *
 * <p>UpgradePostPayOrderRequest</p>
 */
public class UpgradePostPayOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipMax")
    private Integer eipMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipModel")
    private Boolean eipModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoMax")
    private Integer ioMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoMaxSpec")
    private String ioMaxSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionNum")
    private Integer partitionNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicQuota")
    private Integer topicQuota;

    private UpgradePostPayOrderRequest(Builder builder) {
        super(builder);
        this.diskSize = builder.diskSize;
        this.eipMax = builder.eipMax;
        this.eipModel = builder.eipModel;
        this.instanceId = builder.instanceId;
        this.ioMax = builder.ioMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.serverlessConfig = builder.serverlessConfig;
        this.specType = builder.specType;
        this.topicQuota = builder.topicQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePostPayOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return eipMax
     */
    public Integer getEipMax() {
        return this.eipMax;
    }

    /**
     * @return eipModel
     */
    public Boolean getEipModel() {
        return this.eipModel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return topicQuota
     */
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static final class Builder extends Request.Builder<UpgradePostPayOrderRequest, Builder> {
        private Integer diskSize; 
        private Integer eipMax; 
        private Boolean eipModel; 
        private String instanceId; 
        private Integer ioMax; 
        private String ioMaxSpec; 
        private Integer partitionNum; 
        private String regionId; 
        private ServerlessConfig serverlessConfig; 
        private String specType; 
        private Integer topicQuota; 

        private Builder() {
            super();
        } 

        private Builder(UpgradePostPayOrderRequest request) {
            super(request);
            this.diskSize = request.diskSize;
            this.eipMax = request.eipMax;
            this.eipModel = request.eipModel;
            this.instanceId = request.instanceId;
            this.ioMax = request.ioMax;
            this.ioMaxSpec = request.ioMaxSpec;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.serverlessConfig = request.serverlessConfig;
            this.specType = request.specType;
            this.topicQuota = request.topicQuota;
        } 

        /**
         * <p>The disk size. Unit: GB.</p>
         * <ul>
         * <li>The disk size that you specify must be greater than or equal to the current disk size of the instance.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If the instance is a serverless ApsaraMQ for Kafka instance, you do not need to configure this parameter.</p>
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
         * <p>The maximum Internet traffic of the instance.</p>
         * <ul>
         * <li>The Internet traffic that you specify must be greater than or equal to the current Internet traffic of the instance.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set <strong>EipModel</strong> to <strong>true</strong>, set <strong>EipMax</strong> to a value that is greater than 0.</p>
         * </li>
         * <li><p>If you set <strong>EipModel</strong> to <strong>false</strong>, set <strong>EipMax</strong> to <strong>0</strong>.</p>
         * </li>
         * <li><p>If the instance is a serverless ApsaraMQ for Kafka instance, you do not need to configure this parameter.</p>
         * </li>
         * </ul>
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
         * <p>Specifies whether to enable Internet access for the instance. Valid values:</p>
         * <ul>
         * <li>true: enables Internet access.</li>
         * <li>false: disables Internet access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder eipModel(Boolean eipModel) {
            this.putQueryParameter("EipModel", eipModel);
            this.eipModel = eipModel;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-mp919o4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The maximum traffic of the instance. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>The maximum traffic that you specify must be greater than or equal to the current maximum traffic of the instance.</li>
         * <li>You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If the instance is a serverless ApsaraMQ for Kafka instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ioMax(Integer ioMax) {
            this.putQueryParameter("IoMax", ioMax);
            this.ioMax = ioMax;
            return this;
        }

        /**
         * <p>The traffic specification of the instance. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.</li>
         * <li>You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If the instance is a serverless ApsaraMQ for Kafka instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alikafka.hw.6xlarge</p>
         */
        public Builder ioMaxSpec(String ioMaxSpec) {
            this.putQueryParameter("IoMaxSpec", ioMaxSpec);
            this.ioMaxSpec = ioMaxSpec;
            return this;
        }

        /**
         * <p>The number of partitions. We recommend that you configure this parameter.</p>
         * <ul>
         * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only PartitionNum.</li>
         * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If the instance is a serverless ApsaraMQ for Kafka instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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
         * <p>The parameters that are configured for the serverless instance. These parameters are required only when you create a serverless instance.</p>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>The instance edition.</p>
         * <p>Valid values for this parameter if you set PaidType to 1:</p>
         * <ul>
         * <li>normal: Standard Edition (High Write)</li>
         * <li>professional: Professional Edition (High Write)</li>
         * <li>professionalForHighRead: Professional Edition (High Read)</li>
         * </ul>
         * <p>Valid values for this parameter if you set PaidType to 3:</p>
         * <ul>
         * <li>normal: Serverless Standard Edition</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>professional</p>
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * <p>The number of topics. We recommend that you do not configure this parameter.</p>
         * <ul>
         * <li>You must configure one of PartitionNum and TopicQuota. We recommend that you configure only PartitionNum.</li>
         * <li>If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.</li>
         * <li>The default value of TopicQuota varies based on the value of IoMaxSpec. If the number of topics that you use exceeds the default value, you are charged additional fees.</li>
         * <li>For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <p> If the instance is a serverless ApsaraMQ for Kafka instance, you do not need to configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder topicQuota(Integer topicQuota) {
            this.putQueryParameter("TopicQuota", topicQuota);
            this.topicQuota = topicQuota;
            return this;
        }

        @Override
        public UpgradePostPayOrderRequest build() {
            return new UpgradePostPayOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpgradePostPayOrderRequest} extends {@link TeaModel}
     *
     * <p>UpgradePostPayOrderRequest</p>
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
             * <p>The reserved capacity for publishing messages. You can specify only an integer for this parameter. Minimum value: 60.</p>
             * <blockquote>
             * <p> The maximum capacity that you can reserve for an instance varies based on available resources in a region. The reserved capacity range displayed on the buy page shall prevail.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder reservedPublishCapacity(Long reservedPublishCapacity) {
                this.reservedPublishCapacity = reservedPublishCapacity;
                return this;
            }

            /**
             * <p>The reserved capacity for subscribing to messages. You can specify only an integer for this parameter. Minimum value: 50.</p>
             * <blockquote>
             * <p> The maximum capacity that you can reserve for an instance varies based on available resources in a region. The reserved capacity range displayed on the buy page shall prevail.</p>
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
}
