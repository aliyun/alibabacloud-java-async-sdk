// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsGroupListRequest} extends {@link RequestModel}
 *
 * <p>OnsGroupListRequest</p>
 */
public class OnsGroupListRequest extends Request {
    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("GroupType")
    private String groupType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Tag")
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
         * This parameter is required only when you query specific consumer groups by using the fuzzy query method. If this parameter is not configured, the system queries all consumer groups that can be accessed by the current account.
         * <p>
         * 
         * If you set this parameter to GID_ABC, the information about the consumer groups whose IDs contain GID_ABC is returned. For example, the information about the GID_test_GID_ABC\_123 and GID_ABC\_356 consumer groups is returned.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The protocol over which the queried consumer groups consume messages. All clients in a consumer group communicate with the Message Queue for Apache RocketMQ broker over the same protocol. A consumer group cannot contain TCP clients and HTTP clients at the same time. You must create different consumer groups for TCP clients and HTTP clients. Valid values:
         * <p>
         * 
         * *   **tcp**: specifies the consumer groups that consume messages over TCP. This is the default value.
         * *   **http**: indicates that the consumer group consumes messages over HTTP.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * The ID of the instance to which the consumer group you want to query belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The list of tags that are attached to the consumer group. A maximum of 20 tags can be included in the list.
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
             * The key of a tag that is attached to the consumer group. This parameter is not required. If you configure this parameter, you must configure the **Tag.N.Value** parameter.**** If you configure both the Tag.N.Key and Tag.N.Value parameters, the group IDs are filtered based on the specified tag. If you do not configure these parameters, all group IDs are queried.
             * <p>
             * 
             * *   The value of this parameter cannot be an empty string.
             * *   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag that is attached to the group. This parameter is not required. If you configure this parameter, you must configure the **Tag.N.Value** parameter.**** If you configure both the Tag.N.Key and Tag.N.Value parameters, the group IDs are filtered based on the specified tag. If you do not configure these parameters, all group IDs are queried.
             * <p>
             * 
             * *   The value of this parameter can be an empty string.
             * *   The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
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
