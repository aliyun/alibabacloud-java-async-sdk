// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagsRequest} extends {@link RequestModel}
 *
 * <p>AddTagsRequest</p>
 */
public class AddTagsRequest extends Request {
    @Query
    @NameInMap("GroupIds")
    @Validation(required = true)
    private java.util.List < String > groupIds;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private java.util.List < Tag> tag;

    private AddTagsRequest(Builder builder) {
        super(builder);
        this.groupIds = builder.groupIds;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupIds
     */
    public java.util.List < String > getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<AddTagsRequest, Builder> {
        private java.util.List < String > groupIds; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(AddTagsRequest request) {
            super(request);
            this.groupIds = request.groupIds;
            this.tag = request.tag;
        } 

        /**
         * The ID of the application group.
         * <p>
         * 
         * Valid values of N: 1 to 20.
         * 
         * For more information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder groupIds(java.util.List < String > groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
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

        @Override
        public AddTagsRequest build() {
            return new AddTagsRequest(this);
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
             * The key of tag N.
             * <p>
             * 
             * Valid values of N: 1 to 3. A tag key can be 1 to 64 characters in length.
             * 
             * You can create a tag key or specify an existing tag key. For more information about how to obtain a tag key, see [DescribeTagKeyList](~~145558~~).
             * 
             * > The tag key cannot start with `aliyun` or `acs:`. The tag key (`Tag.N.Key`) and tag value (`Tag.N.Value`) must be specified at the same time.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N.
             * <p>
             * 
             * Valid values of N: 1 to 3. A tag value can be 1 to 64 characters in length.
             * 
             * You can create a tag value or specify an existing tag value. For more information about how to obtain a tag value, see [DescribeTagKeyList](~~145557~~).
             * 
             * > The tag value cannot start with `aliyun` or `acs:`. The tag key (`Tag.N.Key`) and tag value (`Tag.N.Value`) must be specified at the same time.
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
