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
    private String config;

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
    public String getConfig() {
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
        private String config; 
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
         * The log cleanup policy that is used for the topic. This parameter is available only when LocalTopic is set to true. Valid values:
         * <p>
         * 
         * *   false: The topic uses the default log cleanup policy.
         * *   true: The topic uses the log compaction policy.
         */
        public Builder compactTopic(Boolean compactTopic) {
            this.putQueryParameter("CompactTopic", compactTopic);
            this.compactTopic = compactTopic;
            return this;
        }

        /**
         * The additional configurations.
         * <p>
         * 
         * *   The value of this parameter must be in JSON format.
         * *   The key must be **replications**. The value indicates the number of replicas for the topic. The value must be an integer that ranges from 1 to 3.
         * *   This parameter is available only when **LocalTopic** is set to **true**, or the instance is of the **Open Source Edition (Local Disk)**.****
         * 
         * > If you specify this parameter, **ReplicationFactor** does not take effect.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
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
         * The type of storage that the topic uses. Valid values:
         * <p>
         * 
         * *   false: The topic uses cloud storage.
         * *   true: The topic uses local storage.
         */
        public Builder localTopic(Boolean localTopic) {
            this.putQueryParameter("LocalTopic", localTopic);
            this.localTopic = localTopic;
            return this;
        }

        /**
         * The minimum number of in-sync replicas (ISRs).
         * <p>
         * 
         * *   This parameter is available only when **LocalTopic** is set to **true**, or the instance is of the **Open Source Edition (Local Disk)**.****
         * *   The value of this parameter must be smaller than the value of ReplicationFactor.
         * *   Valid values: 1 to 3.
         */
        public Builder minInsyncReplicas(Long minInsyncReplicas) {
            this.putQueryParameter("MinInsyncReplicas", minInsyncReplicas);
            this.minInsyncReplicas = minInsyncReplicas;
            return this;
        }

        /**
         * The number of partitions in the topic.
         * <p>
         * 
         * *   Valid values: 1 to 360.
         * *   The system recommends the number of partitions based on the specification of the instance. You can view the recommended number in the Message Queue for Apache Kafka console. We recommend that you specify the number that is recommended by the system as the value of this parameter to reduce the risk of data skew.
         */
        public Builder partitionNum(String partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * The region ID of the instance in which you want to create a topic.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the topic.
         * <p>
         * 
         * *   The description can contain only letters, digits, hyphens (-), and underscores (\_).
         * *   The description must be 3 to 64 characters in length.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The number of replicas for the topic.
         * <p>
         * 
         * *   This parameter is available only when **LocalTopic** is set to **true**, or the instance is of the **Open Source Edition (Local Disk)**.****
         * *   Valid values: 1 to 3.
         * 
         * > If you set this parameter to **1**, data loss may occur. Exercise caution when you configure this parameter.
         */
        public Builder replicationFactor(Long replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The topic name.
         * <p>
         * 
         * *   The name can contain only letters, digits, hyphens (-), and underscores (\_).
         * *   The name must be 3 to 64 characters in length. If the name that you specify contains more than 64 characters, the system automatically truncates the name.
         * *   After a topic is created, you cannot change the name of the topic.
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
             * The key of tag N.
             * <p>
             * 
             * *   Valid values of N: 1 to 20.
             * *   If this parameter is left empty, the keys of all tags are matched.
             * *   The tag key can be up to 128 characters in length. It cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N.
             * <p>
             * 
             * *   Valid values of N: 1 to 20.
             * *   This parameter can be left empty.
             * *   The tag value can be up to 128 characters in length. It cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)
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
