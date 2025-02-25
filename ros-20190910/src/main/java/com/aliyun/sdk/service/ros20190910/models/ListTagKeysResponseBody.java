// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTagKeysResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagKeysResponseBody</p>
 */
public class ListTagKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Keys")
    private java.util.List < String > keys;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTagKeysResponseBody(Builder builder) {
        this.keys = builder.keys;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagKeysResponseBody create() {
        return builder().build();
    }

    /**
     * @return keys
     */
    public java.util.List < String > getKeys() {
        return this.keys;
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

    public static final class Builder {
        private java.util.List < String > keys; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The tag keys.</p>
         */
        public Builder keys(java.util.List < String > keys) {
            this.keys = keys;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C429473A-5C66-4661-B5F8-4F900CD4330A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTagKeysResponseBody build() {
            return new ListTagKeysResponseBody(this);
        } 

    } 

}
