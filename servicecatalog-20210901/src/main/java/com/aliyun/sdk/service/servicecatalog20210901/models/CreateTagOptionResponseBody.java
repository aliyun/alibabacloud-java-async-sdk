// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link CreateTagOptionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTagOptionResponseBody</p>
 */
public class CreateTagOptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagOptionDetail")
    private TagOptionDetail tagOptionDetail;

    private CreateTagOptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagOptionDetail = builder.tagOptionDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTagOptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagOptionDetail
     */
    public TagOptionDetail getTagOptionDetail() {
        return this.tagOptionDetail;
    }

    public static final class Builder {
        private String requestId; 
        private TagOptionDetail tagOptionDetail; 

        private Builder() {
        } 

        private Builder(CreateTagOptionResponseBody model) {
            this.requestId = model.requestId;
            this.tagOptionDetail = model.tagOptionDetail;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A48A5F12-6098-54A1-A389-6834AF27****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the details of the tag option.</p>
         */
        public Builder tagOptionDetail(TagOptionDetail tagOptionDetail) {
            this.tagOptionDetail = tagOptionDetail;
            return this;
        }

        public CreateTagOptionResponseBody build() {
            return new CreateTagOptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTagOptionResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTagOptionResponseBody</p>
     */
    public static class TagOptionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("TagOptionId")
        private String tagOptionId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagOptionDetail(Builder builder) {
            this.active = builder.active;
            this.key = builder.key;
            this.owner = builder.owner;
            this.tagOptionId = builder.tagOptionId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagOptionDetail create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return tagOptionId
         */
        public String getTagOptionId() {
            return this.tagOptionId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean active; 
            private String key; 
            private String owner; 
            private String tagOptionId; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagOptionDetail model) {
                this.active = model.active;
                this.key = model.key;
                this.owner = model.owner;
                this.tagOptionId = model.tagOptionId;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the tag option is enabled. Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The key of the tag option.</p>
             * <p>The key must be 1 to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the tag option belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>133413081827****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the tag option.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-bp1r3mxq3t****</p>
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * <p>The value of the tag option.</p>
             * <p>The value must be 1 to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagOptionDetail build() {
                return new TagOptionDetail(this);
            } 

        } 

    }
}
