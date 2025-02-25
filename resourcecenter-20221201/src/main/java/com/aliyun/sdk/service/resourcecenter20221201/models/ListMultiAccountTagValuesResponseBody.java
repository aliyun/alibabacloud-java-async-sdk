// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListMultiAccountTagValuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiAccountTagValuesResponseBody</p>
 */
public class ListMultiAccountTagValuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List < String > tagValues;

    private ListMultiAccountTagValuesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiAccountTagValuesResponseBody create() {
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
     * @return tagValues
     */
    public java.util.List < String > getTagValues() {
        return this.tagValues;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < String > tagValues; 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36A3D9BE-B607-5993-B546-7E19EF65DC00</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tag values.</p>
         */
        public Builder tagValues(java.util.List < String > tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public ListMultiAccountTagValuesResponseBody build() {
            return new ListMultiAccountTagValuesResponseBody(this);
        } 

    } 

}
