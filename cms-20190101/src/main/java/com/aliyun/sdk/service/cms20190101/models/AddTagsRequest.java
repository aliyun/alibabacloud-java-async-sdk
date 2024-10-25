// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddTagsRequest} extends {@link RequestModel}
 *
 * <p>AddTagsRequest</p>
 */
public class AddTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the application group.</p>
         * <p>Valid values of N: 1 to 20.</p>
         * <p>For more information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7301****</p>
         */
        public Builder groupIds(java.util.List < String > groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>The tags.</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link AddTagsRequest} extends {@link TeaModel}
     *
     * <p>AddTagsRequest</p>
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
             * <p>The tag key.</p>
             * <p>Valid values of N: 1 to 3. A tag key can be 1 to 64 characters in length.</p>
             * <p>You can create a tag key or specify an existing tag key. For more information about how to obtain a tag key, see <a href="https://help.aliyun.com/document_detail/145558.html">DescribeTagKeyList</a>.</p>
             * <blockquote>
             * <p> The tag key cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key (<code>Tag.N.Key</code>) and tag value (<code>Tag.N.Value</code>) must be specified at the same time.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>Valid values of N: 1 to 3. A tag value can be 1 to 64 characters in length.</p>
             * <p>You can create a tag value or specify an existing tag value. For more information about how to obtain a tag value, see <a href="https://help.aliyun.com/document_detail/145557.html">DescribeTagValueList</a>.</p>
             * <blockquote>
             * <p> The tag value cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key (<code>Tag.N.Key</code>) and tag value (<code>Tag.N.Value</code>) must be specified at the same time.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
