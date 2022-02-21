// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @Query
    @NameInMap("CompactTopic")
    private Boolean compactTopic;

    @Query
    @NameInMap("Config")
    private java.util.Map < String, ? > config;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LocalTopic")
    private Boolean localTopic;

    @Query
    @NameInMap("MinInsyncReplicas")
    @Validation(maximum = 3, minimum = 1)
    private Long minInsyncReplicas;

    @Query
    @NameInMap("PartitionNum")
    private String partitionNum;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Remark")
    @Validation(required = true)
    private String remark;

    @Query
    @NameInMap("ReplicationFactor")
    @Validation(maximum = 3, minimum = 1)
    private Long replicationFactor;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private CreateTopicRequest(Builder builder) {
        super(builder);
        this.compactTopic = builder.compactTopic;
        this.config = builder.config;
        this.instanceId = builder.instanceId;
        this.localTopic = builder.localTopic;
        this.minInsyncReplicas = builder.minInsyncReplicas;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.replicationFactor = builder.replicationFactor;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compactTopic
     */
    public Boolean getCompactTopic() {
        return this.compactTopic;
    }

    /**
     * @return config
     */
    public java.util.Map < String, ? > getConfig() {
        return this.config;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return localTopic
     */
    public Boolean getLocalTopic() {
        return this.localTopic;
    }

    /**
     * @return minInsyncReplicas
     */
    public Long getMinInsyncReplicas() {
        return this.minInsyncReplicas;
    }

    /**
     * @return partitionNum
     */
    public String getPartitionNum() {
        return this.partitionNum;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return replicationFactor
     */
    public Long getReplicationFactor() {
        return this.replicationFactor;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<CreateTopicRequest, Builder> {
        private Boolean compactTopic; 
        private java.util.Map < String, ? > config; 
        private String instanceId; 
        private Boolean localTopic; 
        private Long minInsyncReplicas; 
        private String partitionNum; 
        private String regionId; 
        private String remark; 
        private Long replicationFactor; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicRequest response) {
            super(response);
            this.compactTopic = response.compactTopic;
            this.config = response.config;
            this.instanceId = response.instanceId;
            this.localTopic = response.localTopic;
            this.minInsyncReplicas = response.minInsyncReplicas;
            this.partitionNum = response.partitionNum;
            this.regionId = response.regionId;
            this.remark = response.remark;
            this.replicationFactor = response.replicationFactor;
            this.topic = response.topic;
        } 

        /**
         * CompactTopic.
         */
        public Builder compactTopic(Boolean compactTopic) {
            this.putQueryParameter("CompactTopic", compactTopic);
            this.compactTopic = compactTopic;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(java.util.Map < String, ? > config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LocalTopic.
         */
        public Builder localTopic(Boolean localTopic) {
            this.putQueryParameter("LocalTopic", localTopic);
            this.localTopic = localTopic;
            return this;
        }

        /**
         * MinInsyncReplicas.
         */
        public Builder minInsyncReplicas(Long minInsyncReplicas) {
            this.putQueryParameter("MinInsyncReplicas", minInsyncReplicas);
            this.minInsyncReplicas = minInsyncReplicas;
            return this;
        }

        /**
         * PartitionNum.
         */
        public Builder partitionNum(String partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ReplicationFactor.
         */
        public Builder replicationFactor(Long replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public CreateTopicRequest build() {
            return new CreateTopicRequest(this);
        } 

    } 

}
