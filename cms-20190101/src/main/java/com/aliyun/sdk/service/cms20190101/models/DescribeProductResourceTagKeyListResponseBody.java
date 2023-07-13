// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductResourceTagKeyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProductResourceTagKeyListResponseBody</p>
 */
public class DescribeProductResourceTagKeyListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TagKeys")
    private TagKeys tagKeys;

    private DescribeProductResourceTagKeyListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductResourceTagKeyListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tagKeys
     */
    public TagKeys getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private TagKeys tagKeys; 

        /**
         * The error message.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The pagination cursor. If more entries are to be returned on the next page, a pagination cursor is returned.
         * <p>
         * 
         * >  If the value of this parameter is not null, more entries are to be returned on the next page. You can use the returned pagination cursor as a request parameter to obtain entries on the next page. If the value of this parameter is null, all the entries have been returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Indicates whether the call was successful. The value true indicates a success. The value false indicates a failure.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The keys of tags.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * >  If a tag is attached to multiple cloud resources in the region, the key of the tag is returned only once.
         */
        public Builder tagKeys(TagKeys tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        public DescribeProductResourceTagKeyListResponseBody build() {
            return new DescribeProductResourceTagKeyListResponseBody(this);
        } 

    } 

    public static class TagKeys extends TeaModel {
        @NameInMap("TagKey")
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
