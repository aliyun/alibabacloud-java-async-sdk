// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsTopicListRequest} extends {@link RequestModel}
 *
 * <p>OnsTopicListRequest</p>
 */
public class OnsTopicListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
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
         * <p>The ID of the instance that contains the topics you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_188077086902****_BXSuW61e</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of tags that are attached to the topic. A maximum of 20 tags can be included in the list.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The name of the topic that you want to query. This parameter is required if you want to query a specific topic. If you do not include this parameter in a request, all topics that you can access are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        /**
         * <p>The user ID of the topic owner. Set this parameter to an Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>138015630679****</p>
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

    /**
     * 
     * {@link OnsTopicListRequest} extends {@link TeaModel}
     *
     * <p>OnsTopicListRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The key of the tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the <strong>Value</strong> parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tag. If you do not include these parameters in a request, this operation queries all topics that you can access.</p>
             * <ul>
             * <li>The value of this parameter cannot be an empty string.</li>
             * <li>A tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>CartService</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag that is attached to the topics you want to query. This parameter is not required. If you configure this parameter, you must also configure the <strong>Key</strong> parameter.**** If you include the Key and Value parameters in a request, this operation queries only the topics that use the specified tag. If you do not include these parameters in a request, this operation queries all topics that you can access.</p>
             * <ul>
             * <li>The value of this parameter can be an empty string.</li>
             * <li>A tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ServiceA</p>
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
