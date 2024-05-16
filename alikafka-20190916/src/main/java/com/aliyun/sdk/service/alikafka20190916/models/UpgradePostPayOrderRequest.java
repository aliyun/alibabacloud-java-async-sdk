// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The disk size. Unit: GB.
         * <p>
         * 
         * *   The disk size that you specify must be greater than or equal to the current disk size of the instance.
         * *   For information about the valid values of this parameter, see [Billing](~~84737~~).
         * 
         * >  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * The Internet traffic for the instance.
         * <p>
         * 
         * *   The Internet traffic that you specify must be greater than or equal to the current Internet traffic of the instance.
         * *   For information about the valid values of this parameter, see [Billing](~~84737~~).
         * 
         * > 
         * 
         * *   If you set **EipModel** to **true**, set **EipMax** to a value that is greater than 0.
         * 
         * *   If you set **EipModel** to **false**, set **EipMax** to **0**.
         * 
         * *   When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * Specifies whether to enable Internet access for the instance. Valid values:
         * <p>
         * 
         * *   true: enables Internet access.
         * *   false: disables Internet access.
         */
        public Builder eipModel(Boolean eipModel) {
            this.putQueryParameter("EipModel", eipModel);
            this.eipModel = eipModel;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The maximum traffic for the instance. We recommend that you do not configure this parameter.
         * <p>
         * 
         * *   The maximum traffic that you specify must be greater than or equal to the current maximum traffic of the instance.
         * *   You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.
         * *   For information about the valid values of this parameter, see [Billing](~~84737~~).
         * 
         * >  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.
         */
        public Builder ioMax(Integer ioMax) {
            this.putQueryParameter("IoMax", ioMax);
            this.ioMax = ioMax;
            return this;
        }

        /**
         * The traffic specification of the instance. We recommend that you configure this parameter.
         * <p>
         * 
         * *   The traffic specification that you specify must be greater than or equal to the current traffic specification of the instance.
         * *   You must configure at least one of IoMax and IoMaxSpec. If you configure both parameters, the value of IoMaxSpec takes effect. We recommend that you configure only IoMaxSpec.
         * *   For information about the valid values of this parameter, see [Billing](~~84737~~).
         * 
         * >  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.
         */
        public Builder ioMaxSpec(String ioMaxSpec) {
            this.putQueryParameter("IoMaxSpec", ioMaxSpec);
            this.ioMaxSpec = ioMaxSpec;
            return this;
        }

        /**
         * The number of partitions. We recommend that you configure this parameter.
         * <p>
         * 
         * *   You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.
         * *   If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.
         * *   For information about the valid values of this parameter, see [Billing](~~84737~~).
         * 
         * >  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.
         */
        public Builder partitionNum(Integer partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The parameters that are configured for the ApsaraMQ for Kafka serverless instance. When you create a serverless ApsaraMQ for Kafka instance, you must configure these parameters.
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * The instance edition.
         * <p>
         * 
         * Valid values for this parameter if you set PaidType to 1:
         * 
         * *   normal: Standard Edition (High Write)
         * *   professional: Professional Edition (High Write)
         * *   professionalForHighRead: Professional Edition (High Read)
         * 
         * Valid values for this parameter if you set PaidType to 3:
         * 
         * *   normal: Serverless Standard Edition
         * *   professional: Serverless Professional Edition
         * 
         * For more information, see [Billing](~~84737~~).
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * The number of topics. We recommend that you do not configure this parameter.
         * <p>
         * 
         * *   You must configure one of PartitionNum and TopicQuota. We recommend that you configure only ParittionNum.
         * *   If you configure PartitionNum and TopicQuota at the same time, the system verifies whether the price of the partitions equals the price of the topics based on the previous topic-based selling mode. If the price of the partitions does not equal the price of the topics, an error is returned. If the price of the partitions equals the price of the topics, the instance is purchased based on the partition number.
         * *   The default value of TopicQuota varies based on the value of IoMaxSpec. If the number of topics that you consume exceeds the default value, you are charged additional fees.
         * *   For information about the valid values of this parameter, see [Billing](~~84737~~).
         * 
         * >  When you create an ApsaraMQ for Kafka V3 serverless instance, you do not need to configure this parameter.
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
             * The reserved capacity for publishing messages. You can specify only integers for this parameter. Minimum value: 60.
             * <p>
             * 
             * >  The maximum capacity that you can reserve for an instance varies based on available resources in a region. The reserved capacity range displayed on the buy page shall prevail.
             */
            public Builder reservedPublishCapacity(Long reservedPublishCapacity) {
                this.reservedPublishCapacity = reservedPublishCapacity;
                return this;
            }

            /**
             * The reserved capacity for subscribing to messages. You can specify only integers for this parameter. Minimum value: 50.
             * <p>
             * 
             * >  The maximum capacity that you can reserve for an instance varies based on available resources in a region. The reserved capacity range displayed on the buy page shall prevail.
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
