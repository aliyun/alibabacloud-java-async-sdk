// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicListRequest} extends {@link RequestModel}
 *
 * <p>OnsTopicListRequest</p>
 */
public class OnsTopicListRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Topic")
    private String topic;

    @Query
    @NameInMap("UserId")
    private String userId;

    private OnsTopicListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tag = builder.tag;
        this.topic = builder.topic;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTopicListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<OnsTopicListRequest, Builder> {
        private String instanceId; 
        private java.util.List < Tag> tag; 
        private String topic; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(OnsTopicListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tag = request.tag;
            this.topic = request.topic;
            this.userId = request.userId;
        } 

        /**
         * The ID of the instance that contains the topics you want to query.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The list of tags that are attached to the topic. A maximum of 20 tags can be included in the list.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The name of the topic that you want to query. This parameter is required when you want to query a specific topic. If you do not include this parameter in a request, all topics that you can access are queried.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public OnsTopicListRequest build() {
            return new OnsTopicListRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
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
             * The key of a tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Value** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tags. If you do not include these parameters in a request, this operation queries all topics that you can access.
             * <p>
             * 
             * *   The value of this parameter cannot be an empty string.
             * *   The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of a tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the **Tag.N.Key** parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tags. If you do not include these parameters in a request, this operation queries all topics that you can access.
             * <p>
             * 
             * *   The value of this parameter can be an empty string.
             * *   The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
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
