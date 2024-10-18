// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryFigureClustersResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFigureClustersResponseBody</p>
 */
public class QueryFigureClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FigureClusters")
    private java.util.List < FigureCluster > figureClusters;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryFigureClustersResponseBody(Builder builder) {
        this.figureClusters = builder.figureClusters;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFigureClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return figureClusters
     */
    public java.util.List < FigureCluster > getFigureClusters() {
        return this.figureClusters;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < FigureCluster > figureClusters; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The face groups.</p>
         */
        public Builder figureClusters(java.util.List < FigureCluster > figureClusters) {
            this.figureClusters = figureClusters;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The total number of face groups that matches the current query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryFigureClustersResponseBody build() {
            return new QueryFigureClustersResponseBody(this);
        } 

    } 

}
