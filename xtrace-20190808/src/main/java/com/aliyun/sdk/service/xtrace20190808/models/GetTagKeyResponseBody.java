// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTagKeyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTagKeyResponseBody</p>
 */
public class GetTagKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagKeys")
    private TagKeys tagKeys;

    private GetTagKeyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTagKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tagKeys
     */
    public TagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder {
        private String requestId; 
        private TagKeys tagKeys; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tag keys.
         */
        public Builder tagKeys(TagKeys tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        public GetTagKeyResponseBody build() {
            return new GetTagKeyResponseBody(this);
        } 

    } 

    public static class TagKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private java.util.List < String > tagKey;

        private TagKeys(Builder builder) {
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagKeys create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public java.util.List < String > getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private java.util.List < String > tagKey; 

            /**
             * TagKey.
             */
            public Builder tagKey(java.util.List < String > tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public TagKeys build() {
                return new TagKeys(this);
            } 

        } 

    }
}
