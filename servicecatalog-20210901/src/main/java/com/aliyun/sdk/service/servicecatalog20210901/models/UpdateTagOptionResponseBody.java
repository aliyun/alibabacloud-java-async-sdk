// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTagOptionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTagOptionResponseBody</p>
 */
public class UpdateTagOptionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagOptionDetail")
    private TagOptionDetail tagOptionDetail;

    private UpdateTagOptionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagOptionDetail = builder.tagOptionDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTagOptionResponseBody create() {
        return builder().build();
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the tag option.
         */
        public Builder tagOptionDetail(TagOptionDetail tagOptionDetail) {
            this.tagOptionDetail = tagOptionDetail;
            return this;
        }

        public UpdateTagOptionResponseBody build() {
            return new UpdateTagOptionResponseBody(this);
        } 

    } 

    public static class TagOptionDetail extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("Key")
        private String key;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("TagOptionId")
        private String tagOptionId;

        @NameInMap("Value")
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

            /**
             * Indicates whether the tag option is enabled. Valid values:
             * <p>
             * 
             * *   true (default)
             * *   false
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The key of the tag option.
             * <p>
             * 
             * The key must be 1 to 128 characters in length. It cannot contain `http://` or `https://` and cannot start with `acs:` or `aliyun`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the tag option belongs.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The ID of the tag option.
             */
            public Builder tagOptionId(String tagOptionId) {
                this.tagOptionId = tagOptionId;
                return this;
            }

            /**
             * The value of the tag option.
             * <p>
             * 
             * The value must be 1 to 128 characters in length. It cannot contain `http://` or `https://` and cannot start with `acs:` or `aliyun`.
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
