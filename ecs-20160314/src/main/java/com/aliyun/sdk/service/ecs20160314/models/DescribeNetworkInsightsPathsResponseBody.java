// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInsightsPathsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInsightsPathsResponseBody</p>
 */
public class DescribeNetworkInsightsPathsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NetworkInsightsPathSets")
    private NetworkInsightsPathSets networkInsightsPathSets;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkInsightsPathsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.networkInsightsPathSets = builder.networkInsightsPathSets;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkInsightsPathsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return networkInsightsPathSets
     */
    public NetworkInsightsPathSets getNetworkInsightsPathSets() {
        return this.networkInsightsPathSets;
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
        private NetworkInsightsPathSets networkInsightsPathSets; 
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
         * NetworkInsightsPathSets.
         */
        public Builder networkInsightsPathSets(NetworkInsightsPathSets networkInsightsPathSets) {
            this.networkInsightsPathSets = networkInsightsPathSets;
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

        public DescribeNetworkInsightsPathsResponseBody build() {
            return new DescribeNetworkInsightsPathsResponseBody(this);
        } 

    } 

    public static class NetworkInsightsPathSet extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Destination")
        private String destination;

        @NameInMap("DestinationPort")
        private String destinationPort;

        @NameInMap("DestinationType")
        private String destinationType;

        @NameInMap("NetworkInsightsPathId")
        private String networkInsightsPathId;

        @NameInMap("NetworkInsightsPathName")
        private String networkInsightsPathName;

        @NameInMap("NetworkPathFound")
        private String networkPathFound;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Status")
        private String status;

        private NetworkInsightsPathSet(Builder builder) {
            this.creationTime = builder.creationTime;
            this.destination = builder.destination;
            this.destinationPort = builder.destinationPort;
            this.destinationType = builder.destinationType;
            this.networkInsightsPathId = builder.networkInsightsPathId;
            this.networkInsightsPathName = builder.networkInsightsPathName;
            this.networkPathFound = builder.networkPathFound;
            this.protocol = builder.protocol;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsPathSet create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return destination
         */
        public String getDestination() {
            return this.destination;
        }

        /**
         * @return destinationPort
         */
        public String getDestinationPort() {
            return this.destinationPort;
        }

        /**
         * @return destinationType
         */
        public String getDestinationType() {
            return this.destinationType;
        }

        /**
         * @return networkInsightsPathId
         */
        public String getNetworkInsightsPathId() {
            return this.networkInsightsPathId;
        }

        /**
         * @return networkInsightsPathName
         */
        public String getNetworkInsightsPathName() {
            return this.networkInsightsPathName;
        }

        /**
         * @return networkPathFound
         */
        public String getNetworkPathFound() {
            return this.networkPathFound;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String destination; 
            private String destinationPort; 
            private String destinationType; 
            private String networkInsightsPathId; 
            private String networkInsightsPathName; 
            private String networkPathFound; 
            private String protocol; 
            private String source; 
            private String sourceType; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Destination.
             */
            public Builder destination(String destination) {
                this.destination = destination;
                return this;
            }

            /**
             * DestinationPort.
             */
            public Builder destinationPort(String destinationPort) {
                this.destinationPort = destinationPort;
                return this;
            }

            /**
             * DestinationType.
             */
            public Builder destinationType(String destinationType) {
                this.destinationType = destinationType;
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
             * NetworkInsightsPathName.
             */
            public Builder networkInsightsPathName(String networkInsightsPathName) {
                this.networkInsightsPathName = networkInsightsPathName;
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
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public NetworkInsightsPathSet build() {
                return new NetworkInsightsPathSet(this);
            } 

        } 

    }
    public static class NetworkInsightsPathSets extends TeaModel {
        @NameInMap("NetworkInsightsPathSet")
        private java.util.List < NetworkInsightsPathSet> networkInsightsPathSet;

        private NetworkInsightsPathSets(Builder builder) {
            this.networkInsightsPathSet = builder.networkInsightsPathSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkInsightsPathSets create() {
            return builder().build();
        }

        /**
         * @return networkInsightsPathSet
         */
        public java.util.List < NetworkInsightsPathSet> getNetworkInsightsPathSet() {
            return this.networkInsightsPathSet;
        }

        public static final class Builder {
            private java.util.List < NetworkInsightsPathSet> networkInsightsPathSet; 

            /**
             * NetworkInsightsPathSet.
             */
            public Builder networkInsightsPathSet(java.util.List < NetworkInsightsPathSet> networkInsightsPathSet) {
                this.networkInsightsPathSet = networkInsightsPathSet;
                return this;
            }

            public NetworkInsightsPathSets build() {
                return new NetworkInsightsPathSets(this);
            } 

        } 

    }
}
