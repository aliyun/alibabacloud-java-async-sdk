// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagValuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagValuesResponseBody</p>
 */
public class ListTagValuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List < String > values;

    private ListTagValuesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagValuesResponseBody create() {
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
     * @return values
     */
    public java.util.List < String > getValues() {
        return this.values;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < String > values; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the tag values.
         */
        public Builder values(java.util.List < String > values) {
            this.values = values;
            return this;
        }

        public ListTagValuesResponseBody build() {
            return new ListTagValuesResponseBody(this);
        } 

    } 

}
