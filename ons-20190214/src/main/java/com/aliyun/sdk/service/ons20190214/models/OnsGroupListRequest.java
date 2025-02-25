// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OnsGroupListRequest} extends {@link RequestModel}
 *
 * <p>OnsGroupListRequest</p>
 */
public class OnsGroupListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private OnsGroupListRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.instanceId = builder.instanceId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsGroupListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
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

    public static final class Builder extends Request.Builder<OnsGroupListRequest, Builder> {
        private String groupId; 
        private String groupType; 
        private String instanceId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(OnsGroupListRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.instanceId = request.instanceId;
            this.tag = request.tag;
        } 

        /**
         * <p>This parameter is required only when you query specific consumer groups by using the fuzzy search method. If this parameter is not configured, the system queries all consumer groups that can be accessed by the current account.</p>
         * <p>If you set this parameter to GID_ABC, the information about the consumer groups whose IDs contain GID_ABC is returned. For example, the information about the GID_test_GID_ABC_123 and GID_ABC_356 consumer groups is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test_group_id</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The protocol over which the queried consumer group publishes and subscribes to messages. All clients in a consumer group communicate with the ApsaraMQ for RocketMQ broker over the same protocol. You must create different consumer groups for TCP clients and HTTP clients. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: specifies that the consumer group publishes or subscribes to messages over TCP. This value is the default value.</li>
         * <li><strong>http</strong>: specifies that the consumer group publishes or subscribes to messages over HTTP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The ID of the instance to which the consumer group you want to query belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MQ_INST_111111111111_DOxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of tags that are attached to the consumer group. A maximum of 20 tags can be included in the list.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public OnsGroupListRequest build() {
            return new OnsGroupListRequest(this);
        } 

    } 

    /**
     * 
     * {@link OnsGroupListRequest} extends {@link TeaModel}
     *
     * <p>OnsGroupListRequest</p>
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
             * <p>The key of the tag that is attached to the consumer group. This parameter is not required. If you configure this parameter, you must configure the <strong>Key</strong> parameter.**** If you configure both the Key and Value parameters, the consumer groups are filtered based on the specified tag. If you do not configure these parameters, all consumer groups are queried.</p>
             * <ul>
             * <li>The value of this parameter cannot be an empty string.</li>
             * <li>The tag value must be 1 to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</li>
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
             * <p>The value of the tag that is attached to the group. This parameter is not required. If you configure this parameter, you must configure the <strong>Key</strong> parameter.**** If you configure both the Key and Value parameters, the consumer groups are filtered based on the specified tag. If you do not configure these parameters, all consumer groups are queried.</p>
             * <ul>
             * <li>The value of this parameter can be an empty string.</li>
             * <li>The tag key must be 1 to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</li>
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
