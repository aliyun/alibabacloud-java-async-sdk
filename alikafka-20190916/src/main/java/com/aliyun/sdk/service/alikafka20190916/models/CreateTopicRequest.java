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
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompactTopic")
    private Boolean compactTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalTopic")
    private Boolean localTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinInsyncReplicas")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Long minInsyncReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionNum")
    private String partitionNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
    @com.aliyun.core.annotation.Validation(maximum = 3, minimum = 1)
    private Long replicationFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<Tag> tag; 
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
         * <p>The log cleanup policy that is used for the topic. This parameter is available only when LocalTopic is set to true. Valid values:</p>
         * <ul>
         * <li>false: The topic uses the default log cleanup policy.</li>
         * <li>true: The topic uses the log compaction policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder compactTopic(Boolean compactTopic) {
            this.putQueryParameter("CompactTopic", compactTopic);
            this.compactTopic = compactTopic;
            return this;
        }

        /**
         * <p>The additional configuration.</p>
         * <ul>
         * <li>The value must be in JSON format.</li>
         * <li>Set Key to <strong>replications</strong>. This value specifies the number of replicas of the topic. The value must be an integer that ranges from 1 to 3.</li>
         * <li>You can configure this parameter only if you set <strong>LocalTopic</strong> to <strong>true</strong> or specify <strong>Open Source Edition (Local Disk)</strong> as the instance edition.****</li>
         * </ul>
         * <blockquote>
         * <p> If you specify replications in this parameter, <strong>ReplicationFactor</strong> does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;replications&quot;: 3}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-mp919o4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of storage that the topic uses. Valid values:</p>
         * <ul>
         * <li>false: The topic uses cloud storage.</li>
         * <li>true: The topic uses local storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder localTopic(Boolean localTopic) {
            this.putQueryParameter("LocalTopic", localTopic);
            this.localTopic = localTopic;
            return this;
        }

        /**
         * <p>The minimum number of in-sync replicas (ISRs).</p>
         * <ul>
         * <li>This parameter is available only when <strong>LocalTopic</strong> is set to <strong>true</strong>, or the instance is of the <strong>Open Source Edition (Local Disk)</strong>.****</li>
         * <li>The value of this parameter must be smaller than the value of ReplicationFactor.</li>
         * <li>Valid values: 1 to 3.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minInsyncReplicas(Long minInsyncReplicas) {
            this.putQueryParameter("MinInsyncReplicas", minInsyncReplicas);
            this.minInsyncReplicas = minInsyncReplicas;
            return this;
        }

        /**
         * <p>The number of partitions in the topic.</p>
         * <ul>
         * <li>Valid values: 1 to 360.</li>
         * <li>In the ApsaraMQ for Kafka console, you can view the number of partitions that the system recommends based on the specifications of the instance. We recommend that you specify the number that is recommended by the system as the value of this parameter to reduce the risk of data skew.</li>
         * </ul>
         * <p>Default values:</p>
         * <ul>
         * <li>ApsaraMQ for Kafka V2 instance: 12</li>
         * <li>ApsaraMQ for Kafka V3 instance: 3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder partitionNum(String partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * <p>The region ID of the instance in which you want to create a topic.</p>
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
         * <p>The description of the topic.</p>
         * <ul>
         * <li>The description can contain only letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The description must be 3 to 64 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_topic_test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The number of replicas for the topic.</p>
         * <ul>
         * <li>This parameter is available only when <strong>LocalTopic</strong> is set to <strong>true</strong>, or the instance is of the <strong>Open Source Edition (Local Disk)</strong>.****</li>
         * <li>Valid values: 1 to 3.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>1</strong>, data loss may occur. Exercise caution when you configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replicationFactor(Long replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * <p>The tags that you want to add to the topic.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The topic name.</p>
         * <ul>
         * <li>The name can contain only letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must be 3 to 64 characters in length. If the name that you specify contains more than 64 characters, the system automatically truncates the name.</li>
         * <li>After a topic is created, you cannot change the name of the topic.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_topic_test</p>
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

    /**
     * 
     * {@link CreateTopicRequest} extends {@link TeaModel}
     *
     * <p>CreateTopicRequest</p>
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
             * <p>The tag key.</p>
             * <ul>
             * <li>If you do not specify this parameter, the keys of all tags are matched.</li>
             * <li>The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</li>
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
             * <p>The tag value.</p>
             * <ul>
             * <li>You can leave this parameter empty.</li>
             * <li>The tag value must be 1 to 128 characters in length and cannot contain http:// or https://. The tag value cannot start with aliyun or acs:.</li>
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
