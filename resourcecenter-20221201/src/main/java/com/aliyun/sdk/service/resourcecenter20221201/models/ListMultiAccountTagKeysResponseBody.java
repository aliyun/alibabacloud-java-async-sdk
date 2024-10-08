// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMultiAccountTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiAccountTagKeysResponseBody</p>
 */
public class ListMultiAccountTagKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagKeys")
    private java.util.List < String > tagKeys;

    private ListMultiAccountTagKeysResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagKeys = builder.tagKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountTagKeysResponseBody create() {
        return builder().build();
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
     * @return tagKeys
     */
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < String > tagKeys; 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAARfZmVDe9NvRXloR5+8CK9nNJufMdRA7W1miLC1P****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FA6086F9-6363-51A5-A507-88E3201EBCCB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag keys.</p>
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            this.tagKeys = tagKeys;
            return this;
        }

        public ListMultiAccountTagKeysResponseBody build() {
            return new ListMultiAccountTagKeysResponseBody(this);
        } 

    } 

}
