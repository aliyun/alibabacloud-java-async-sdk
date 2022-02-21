// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInsightsAnalysisesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInsightsAnalysisesResponseBody</p>
 */
public class DescribeNetworkInsightsAnalysisesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NetworkInsightsAnalysisSets")
    private NetworkInsightsAnalysisSets networkInsightsAnalysisSets;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkInsightsAnalysisesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.networkInsightsAnalysisSets = builder.networkInsightsAnalysisSets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInsightsAnalysisesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkInsightsAnalysisSets
     */
    public NetworkInsightsAnalysisSets getNetworkInsightsAnalysisSets() {
        return this.networkInsightsAnalysisSets;
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
        private Integer maxResults; 
        private NetworkInsightsAnalysisSets networkInsightsAnalysisSets; 
        private String nextToken; 
        private String requestId; 

        /**
         * MaxResults本次请求所返回的最大记录条数
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NetworkInsightsAnalysisSets.
         */
        public Builder networkInsightsAnalysisSets(NetworkInsightsAnalysisSets networkInsightsAnalysisSets) {
            this.networkInsightsAnalysisSets = networkInsightsAnalysisSets;
            return this;
        }

        /**
         * 表示当前调用返回读取到的位置，空代表数据已经读取完毕
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

        public DescribeNetworkInsightsAnalysisesResponseBody build() {
            return new DescribeNetworkInsightsAnalysisesResponseBody(this);
        } 

    } 

    public static class NetworkInsightsAnalysisSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("NetworkInsightsAnalysisId")
        private String networkInsightsAnalysisId;

        @NameInMap("NetworkInsightsPathId")
        private String networkInsightsPathId;

        @NameInMap("NetworkPathFound")
        private String networkPathFound;

        @NameInMap("Status")
        private String status;

        private NetworkInsightsAnalysisSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.networkInsightsAnalysisId = builder.networkInsightsAnalysisId;
            this.networkInsightsPathId = builder.networkInsightsPathId;
            this.networkPathFound = builder.networkPathFound;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsAnalysisSet create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return networkInsightsAnalysisId
         */
        public String getNetworkInsightsAnalysisId() {
            return this.networkInsightsAnalysisId;
        }

        /**
         * @return networkInsightsPathId
         */
        public String getNetworkInsightsPathId() {
            return this.networkInsightsPathId;
        }

        /**
         * @return networkPathFound
         */
        public String getNetworkPathFound() {
            return this.networkPathFound;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String networkInsightsAnalysisId; 
            private String networkInsightsPathId; 
            private String networkPathFound; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * NetworkInsightsAnalysisId.
             */
            public Builder networkInsightsAnalysisId(String networkInsightsAnalysisId) {
                this.networkInsightsAnalysisId = networkInsightsAnalysisId;
                return this;
            }

            /**
             * NetworkInsightsPathId.
             */
            public Builder networkInsightsPathId(String networkInsightsPathId) {
                this.networkInsightsPathId = networkInsightsPathId;
                return this;
            }

            /**
             * NetworkPathFound.
             */
            public Builder networkPathFound(String networkPathFound) {
                this.networkPathFound = networkPathFound;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NetworkInsightsAnalysisSet build() {
                return new NetworkInsightsAnalysisSet(this);
            } 

        } 

    }
    public static class NetworkInsightsAnalysisSets extends TeaModel {
        @NameInMap("NetworkInsightsAnalysisSet")
        private java.util.List < NetworkInsightsAnalysisSet> networkInsightsAnalysisSet;

        private NetworkInsightsAnalysisSets(Builder builder) {
            this.networkInsightsAnalysisSet = builder.networkInsightsAnalysisSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsAnalysisSets create() {
            return builder().build();
        }

        /**
         * @return networkInsightsAnalysisSet
         */
        public java.util.List < NetworkInsightsAnalysisSet> getNetworkInsightsAnalysisSet() {
            return this.networkInsightsAnalysisSet;
        }

        public static final class Builder {
            private java.util.List < NetworkInsightsAnalysisSet> networkInsightsAnalysisSet; 

            /**
             * NetworkInsightsAnalysisSet.
             */
            public Builder networkInsightsAnalysisSet(java.util.List < NetworkInsightsAnalysisSet> networkInsightsAnalysisSet) {
                this.networkInsightsAnalysisSet = networkInsightsAnalysisSet;
                return this;
            }

            public NetworkInsightsAnalysisSets build() {
                return new NetworkInsightsAnalysisSets(this);
            } 

        } 

    }
}
