// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeUserTagValuesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserTagValuesResponseBody</p>
 */
public class DescribeUserTagValuesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TagValues")
    private java.util.List<String> tagValues;

    private DescribeUserTagValuesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserTagValuesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
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
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<String> tagValues; 

        /**
         * <p>Number of items per page in a paginated query. The maximum value is 100.</p>
         * <p>Default value:</p>
         * <ul>
         * <li><p>If no value is set or the set value is less than 10, the default value is 10.</p>
         * </li>
         * <li><p>If the set value is greater than 100, the default value is 100.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Query token (Token). The value should be the NextToken parameter value from the previous call to this interface. This parameter is not required for the initial call. If NextToken is set, the PageSize and PageNumber request parameters become invalid, and the TotalCount in the response data is also invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>NextToken</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID. We return the request ID regardless of whether the API call was successful or not.</p>
         * 
         * <strong>example:</strong>
         * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Tag values corresponding to the tag key.</p>
         */
        public Builder tagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        public DescribeUserTagValuesResponseBody build() {
            return new DescribeUserTagValuesResponseBody(this);
        } 

    } 

}
