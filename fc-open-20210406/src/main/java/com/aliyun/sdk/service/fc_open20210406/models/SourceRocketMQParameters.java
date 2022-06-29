// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceRocketMQParameters} extends {@link TeaModel}
 *
 * <p>SourceRocketMQParameters</p>
 */
public class SourceRocketMQParameters extends TeaModel {
    @NameInMap("GroupID")
    @Validation(required = true)
    private String groupID;

    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @NameInMap("Offset")
    private String offset;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("Tag")
    private String tag;

    @NameInMap("Timestamp")
    private Long timestamp;

    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private SourceRocketMQParameters(Builder builder) {
        this.groupID = builder.groupID;
        this.instanceId = builder.instanceId;
        this.offset = builder.offset;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
        this.timestamp = builder.timestamp;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceRocketMQParameters create() {
        return builder().build();
    }

    /**
     * @return groupID
     */
    public String getGroupID() {
        return this.groupID;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return offset
     */
    public String getOffset() {
        return this.offset;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder {
        private String groupID; 
        private String instanceId; 
        private String offset; 
        private String regionId; 
        private String tag; 
        private Long timestamp; 
        private String topic; 

        /**
         * GroupID
         */
        public Builder groupID(String groupID) {
            this.groupID = groupID;
            return this;
        }

        /**
         * InstanceId
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Offset
         */
        public Builder offset(String offset) {
            this.offset = offset;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * Tag
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Timestamp
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Topic
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        public SourceRocketMQParameters build() {
            return new SourceRocketMQParameters(this);
        } 

    } 

}
