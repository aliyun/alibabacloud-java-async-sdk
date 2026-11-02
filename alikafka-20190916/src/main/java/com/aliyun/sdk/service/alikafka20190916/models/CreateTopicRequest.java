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
         * <p>The cleanup policy that is configured when the storage engine of the topic is set to local storage. Valid values:</p>
         * <ul>
         * <li>false: delete cleanup policy.</li>
         * <li>true: compact cleanup policy.</li>
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
         * <p>The supplementary configuration.</p>
         * <ul>
         * <li><p>The value must be in JSON format.</p>
         * </li>
         * <li><p>This parameter takes effect only when <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
         * </li>
         * <li><p>Supported configurations for reserved instances:</p>
         * <ul>
         * <li><strong>retention.ms</strong>: the message retention period. Valid values: 3600000 to 31536000000. Unit: milliseconds.</li>
         * <li><strong>max.message.bytes</strong>: the maximum message size. Valid values: 1048576 to 10485760. Unit: bytes.</li>
         * <li><strong>message.timestamp.type</strong>: the type of the message timestamp. CreateTime indicates the timestamp specified by the producer when sending a message. If not specified, the value is the creation time of the message on the client. LogAppendTime indicates the time when the message is written to disk on the server. Valid values: CreateTime or LogAppendTime. Default value: Createtime. We recommend that you use ApendTime.</li>
         * </ul>
         * </li>
         * <li><p>Supported configurations for Serverless instances:</p>
         * <ul>
         * <li><strong>retention.hours</strong>: the message retention period. The value type is String. Valid values: 24 to 8760.</li>
         * <li><strong>max.message.bytes</strong>: the maximum message size. The value type is String. Valid values: 1048576 to 10485760.</li>
         * <li><strong>message.timestamp.type</strong>: the type of the message timestamp. CreateTime indicates the timestamp specified by the producer when sending a message. If not specified, the value is the creation time of the message on the client. LogAppendTime indicates the time when the message is written to disk on the server. Valid values: CreateTime or LogAppendTime. Default value: Createtime. We recommend that you use ApendTime.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;retention.ms&quot;: &quot;3600000&quot;}</p>
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
         * <p>The storage engine of the topic. Valid values:</p>
         * <ul>
         * <li>false: cloud storage.</li>
         * <li>true: local storage.</li>
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
         * <p>The minimum number of in-sync replicas (ISR).</p>
         * <ul>
         * <li><p>This parameter takes effect only when <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
         * </li>
         * <li><p>The value must be less than the number of topic replicas.</p>
         * </li>
         * <li><p>Valid values: 1 to 3.</p>
         * </li>
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
         * <p>The number of partitions for the topic.</p>
         * <ul>
         * <li><p>Valid values: 1 to 360.</p>
         * </li>
         * <li><p>The console provides different configuration suggestions based on the instance edition. Configure the number of partitions based on the console suggestions to reduce data skew risks.</p>
         * </li>
         * </ul>
         * <p>Default value:</p>
         * <ul>
         * <li><p>Reserved instances: 12</p>
         * </li>
         * <li><p>Serverless instances: 3</p>
         * </li>
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
         * <p>The region ID of the instance to which the topic belongs.</p>
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
         * <li><p>The description can contain only letters, digits, underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>The description must be 3 to 64 characters in length.</p>
         * </li>
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
         * <li><p>This parameter takes effect only when <strong>LocalTopic</strong> is set to <strong>true</strong>.</p>
         * </li>
         * <li><p>Valid values: 1 to 3.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the number of replicas is set to <strong>1</strong>, data loss may occur. Proceed with caution.</p>
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
         * <p>The tag list.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The name of the topic.</p>
         * <ul>
         * <li>Reserved instances: The name can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must be 3 to 64 characters in length.</li>
         * <li>Serverless instances: The name can contain letters, digits, underscores (_), hyphens (-), and periods (.). The name must be 1 to 249 characters in length.</li>
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
             * <p>The tag key of the resource.</p>
             * <ul>
             * <li><p>N ranges from 1 to 20.</p>
             * </li>
             * <li><p>If this parameter is left empty, all tag keys are matched.</p>
             * </li>
             * <li><p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * </li>
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
             * <li><p>N ranges from 1 to 20.</p>
             * </li>
             * <li><p>This parameter can be left empty.</p>
             * </li>
             * <li><p>The tag value can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * </li>
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
