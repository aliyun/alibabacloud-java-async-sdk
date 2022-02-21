// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagValuesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagValuesResponseBody</p>
 */
public class ListTagValuesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TagValues")
    private java.util.List < String > tagValues;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTagValuesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tagValues = builder.tagValues;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagValuesResponseBody create() {
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
    public java.util.List < String > getTagValues() {
        return this.tagValues;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < String > tagValues; 
        private Integer totalCount; 

        /**
         * 本次查询返回记录数量
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 标签值列表
         */
        public Builder tagValues(java.util.List < String > tagValues) {
            this.tagValues = tagValues;
            return this;
        }

        /**
         * 总记录数
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTagValuesResponseBody build() {
            return new ListTagValuesResponseBody(this);
        } 

    } 

}
