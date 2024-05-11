// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySimilarImageClustersResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySimilarImageClustersResponseBody</p>
 */
public class QuerySimilarImageClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SimilarImageClusters")
    private java.util.List < SimilarImageCluster > similarImageClusters;

    private QuerySimilarImageClustersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.similarImageClusters = builder.similarImageClusters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySimilarImageClustersResponseBody create() {
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
     * @return similarImageClusters
     */
    public java.util.List < SimilarImageCluster > getSimilarImageClusters() {
        return this.similarImageClusters;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < SimilarImageCluster > similarImageClusters; 

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
         * SimilarImageClusters.
         */
        public Builder similarImageClusters(java.util.List < SimilarImageCluster > similarImageClusters) {
            this.similarImageClusters = similarImageClusters;
            return this;
        }

        public QuerySimilarImageClustersResponseBody build() {
            return new QuerySimilarImageClustersResponseBody(this);
        } 

    } 

}
