// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryLocationDateClustersResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLocationDateClustersResponseBody</p>
 */
public class QueryLocationDateClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LocationDateClusters")
    private java.util.List < LocationDateCluster > locationDateClusters;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryLocationDateClustersResponseBody(Builder builder) {
        this.locationDateClusters = builder.locationDateClusters;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLocationDateClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return locationDateClusters
     */
    public java.util.List < LocationDateCluster > getLocationDateClusters() {
        return this.locationDateClusters;
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
        private java.util.List < LocationDateCluster > locationDateClusters; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The list of spatiotemporal groups.</p>
         */
        public Builder locationDateClusters(java.util.List < LocationDateCluster > locationDateClusters) {
            this.locationDateClusters = locationDateClusters;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>MzQNjmY2MzYxNhNjk2ZNjEu****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7055FCF7-4D7B-098E-BD4D-DD2932B0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryLocationDateClustersResponseBody build() {
            return new QueryLocationDateClustersResponseBody(this);
        } 

    } 

}
