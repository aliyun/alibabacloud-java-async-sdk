// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    private java.util.List<SimilarImageCluster> similarImageClusters;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<SimilarImageCluster> getSimilarImageClusters() {
        return this.similarImageClusters;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<SimilarImageCluster> similarImageClusters; 

        private Builder() {
        } 

        private Builder(QuerySimilarImageClustersResponseBody model) {
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.similarImageClusters = model.similarImageClusters;
        } 

        /**
         * <p>The pagination token. If the total number of clusters is greater than the value of MaxResults, this token can be used to retrieve the next page. This parameter has a value only if not all the clusters that meet the condition are returned.</p>
         * <p>Pass this value as the value of NextToken in the next query to return the subsequent clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESEgoQCg4KClVwZGF0ZVRpbWUQARgBIs8ECgkAAJLUwUCAQ****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of similar image clusters.</p>
         */
        public Builder similarImageClusters(java.util.List<SimilarImageCluster> similarImageClusters) {
            this.similarImageClusters = similarImageClusters;
            return this;
        }

        public QuerySimilarImageClustersResponseBody build() {
            return new QuerySimilarImageClustersResponseBody(this);
        } 

    } 

}
