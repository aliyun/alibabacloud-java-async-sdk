// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMultiAccountTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiAccountTagKeysResponseBody</p>
 */
public class ListMultiAccountTagKeysResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagKeys")
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TagKeys.
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
