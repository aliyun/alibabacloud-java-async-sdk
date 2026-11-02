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
         * <p>The disk capacity. Unit: GB.</p>
         * <ul>
         * <li><p>The specified disk capacity must be greater than or equal to the current disk capacity of the instance.</p>
         * </li>
         * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the instance is a serverless instance, you do not need to specify this parameter. You must specify this parameter for a pay-as-you-go instance.</p>
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
         * <p>The Internet traffic.</p>
         * <ul>
         * <li>The specified Internet traffic must be greater than or equal to the current Internet traffic of the instance.</li>
         * <li>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If <strong>EipModel</strong> is set to <strong>true</strong>, <strong>EipMax</strong> must be greater than 0.</li>
         * <li>If <strong>EipModel</strong> is set to <strong>false</strong>, <strong>EipMax</strong> must be set to <strong>0</strong>.</li>
         * <li>If the instance is a serverless instance, you do not need to specify this parameter.</li>
         * </ul>
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
         * <p>Specifies whether to enable Internet access. Valid values:</p>
         * <ul>
         * <li><p>true: enables Internet access.</p>
         * </li>
         * <li><p>false: disables Internet access.</p>
         * <blockquote>
         * <p>You can specify this parameter for a pay-as-you-go instance. You must specify this parameter for a serverless instance.</p>
         * </blockquote>
         * </li>
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
         * <p>The peak traffic. We do not recommend that you specify this parameter.</p>
         * <ul>
         * <li><p>The specified peak traffic must be greater than or equal to the current peak traffic of the instance.</p>
         * </li>
         * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
         * </li>
         * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p>If the instance is a serverless instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The traffic specification. We recommend that you specify this parameter.</p>
         * <ul>
         * <li><p>The specified traffic specification must be greater than or equal to the current traffic specification of the instance.</p>
         * </li>
         * <li><p>You must specify either the peak traffic or the traffic specification. If both are specified, the traffic specification takes precedence. We recommend that you specify only the traffic specification.</p>
         * </li>
         * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p>If the instance is a serverless instance, you do not need to specify this parameter. You must specify this parameter for a pay-as-you-go instance.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The number of partitions. We recommend that you specify this parameter.</p>
         * <ul>
         * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
         * </li>
         * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
         * </li>
         * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p>If the instance is a serverless instance, you do not need to specify this parameter. You must specify this parameter for a pay-as-you-go instance.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The settings for the serverless instance. This parameter is required when you change the specifications of a serverless instance.</p>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>The specification type.</p>
         * <p>Valid values when the PaidType parameter of the instance is set to 1 (pay-as-you-go):</p>
         * <ul>
         * <li>normal: Standard Edition (High Write)</li>
         * <li>professional: Professional Edition (High Write)</li>
         * <li>professionalForHighRead: Professional Edition (High Read)</li>
         * </ul>
         * <p>Valid values when the PaidType parameter of the instance is set to 3 (pay-as-you-go for reserved specifications + pay-as-you-go for serverless elastic scaling):</p>
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
         * <p>The number of topics. We do not recommend that you specify this parameter.</p>
         * <ul>
         * <li><p>You must specify either the number of partitions or the topic specification. We recommend that you specify only the number of partitions.</p>
         * </li>
         * <li><p>If both the number of partitions and the topic specification are specified, the system verifies whether they are equivalent based on the legacy topic sales model. If they are not equivalent, the request fails. If they are equivalent, the purchase is made based on the number of partitions.</p>
         * </li>
         * <li><p>The default value varies based on the traffic specification. If the number of topics exceeds the default value, you are charged extra fees.</p>
         * </li>
         * <li><p>For the valid values, see <a href="https://help.aliyun.com/document_detail/84737.html">Billing</a>.</p>
         * <blockquote>
         * <p>If the instance is a serverless instance, you do not need to specify this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
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
             * <p>The reserved traffic specification for message publishing. Only integers are supported, and the minimum value is 60. This parameter is required for a serverless instance.</p>
             * <blockquote>
             * <p>The actual upper limit is subject to the inventory in the current region. Refer to the available range on the buy page.</p>
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
             * <p>The reserved traffic specification for message consumption. Only integers are supported, and the minimum value is 20. This parameter is required for a serverless instance.</p>
             * <blockquote>
             * <p>The actual upper limit is subject to the inventory in the current region. Refer to the available range on the buy page.</p>
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
}
