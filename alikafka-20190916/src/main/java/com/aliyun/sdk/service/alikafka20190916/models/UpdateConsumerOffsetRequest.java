// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateConsumerOffsetRequest} extends {@link RequestModel}
 *
 * <p>UpdateConsumerOffsetRequest</p>
 */
public class UpdateConsumerOffsetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offsets")
    private java.util.List < Offsets> offsets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetType")
    private String resetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    private String time;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topic;

    private UpdateConsumerOffsetRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.instanceId = builder.instanceId;
        this.offsets = builder.offsets;
        this.regionId = builder.regionId;
        this.resetType = builder.resetType;
        this.time = builder.time;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerOffsetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return offsets
     */
    public java.util.List < Offsets> getOffsets() {
        return this.offsets;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resetType
     */
    public String getResetType() {
        return this.resetType;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<UpdateConsumerOffsetRequest, Builder> {
        private String consumerId; 
        private String instanceId; 
        private java.util.List < Offsets> offsets; 
        private String regionId; 
        private String resetType; 
        private String time; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConsumerOffsetRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.instanceId = request.instanceId;
            this.offsets = request.offsets;
            this.regionId = request.regionId;
            this.resetType = request.resetType;
            this.time = request.time;
            this.topic = request.topic;
        } 

        /**
         * <p>The name of the consumer group.</p>
         * <ul>
         * <li>The name can contain letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must be <strong>3 to 64</strong> characters in length. If a name contains more than <strong>64</strong> characters, the name is automatically truncated.</li>
         * <li>The name of a consumer group cannot be changed after the consumer group is created.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-test</p>
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-mp91inkw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>If you set resetType to offset, you can use this parameter to reset the consumer offset of each partition of a specific topic in the consumer group.</p>
         */
        public Builder offsets(java.util.List < Offsets> offsets) {
            String offsetsShrink = shrink(offsets, "Offsets", "json");
            this.putQueryParameter("Offsets", offsetsShrink);
            this.offsets = offsets;
            return this;
        }

        /**
         * <p>The region ID of the instance to which the consumer group belongs.</p>
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
         * <p>The method that is used to reset the consumer offsets of the subscribed topics of a consumer group. Valid values:</p>
         * <ul>
         * <li><strong>timestamp</strong> (default)</li>
         * <li><strong>offset</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>timestamp</p>
         */
        public Builder resetType(String resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * <p>The point in time when message consumption starts. The value of this parameter is a UNIX timestamp in milliseconds. The value of this parameter must be <strong>less than 0</strong> or <strong>within the retention period of the consumer offset</strong>. This parameter takes effect only if you set resetType to timestamp.</p>
         * <ul>
         * <li>If you want to reset the consumer offset to the latest offset, set this parameter to -1.</li>
         * <li>If you want to reset the consumer offset to the earliest offset, set this parameter to -2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        /**
         * <p>The topic name.</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must be <strong>3 to 64</strong> characters in length. If a name contains more than <strong>64</strong> characters, the name is automatically truncated.</li>
         * <li>The name of a topic cannot be changed after the topic is created.</li>
         * </ul>
         * <p><strong>If you want to reset the consumer offsets of all topics to which the consumer subscribes, specify an empty string.</strong></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>topic_name</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public UpdateConsumerOffsetRequest build() {
            return new UpdateConsumerOffsetRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConsumerOffsetRequest} extends {@link TeaModel}
     *
     * <p>UpdateConsumerOffsetRequest</p>
     */
    public static class Offsets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private Integer partition;

        private Offsets(Builder builder) {
            this.offset = builder.offset;
            this.partition = builder.partition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Offsets create() {
            return builder().build();
        }

        /**
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        public static final class Builder {
            private Long offset; 
            private Integer partition; 

            /**
             * <p>The consumer offset of the partition.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The partition ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            public Offsets build() {
                return new Offsets(this);
            } 

        } 

    }
}
