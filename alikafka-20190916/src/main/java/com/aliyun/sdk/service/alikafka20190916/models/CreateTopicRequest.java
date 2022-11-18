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
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
        this.tag = builder.tag;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
        private java.util.List < Tag> tag; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicRequest request) {
            super(request);
            this.compactTopic = request.compactTopic;
            this.config = request.config;
            this.instanceId = request.instanceId;
            this.localTopic = request.localTopic;
            this.minInsyncReplicas = request.minInsyncReplicas;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.replicationFactor = request.replicationFactor;
            this.tag = request.tag;
            this.topic = request.topic;
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
            String configShrink = shrink(config, "Config", "json");
            this.putQueryParameter("Config", configShrink);
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
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
}
