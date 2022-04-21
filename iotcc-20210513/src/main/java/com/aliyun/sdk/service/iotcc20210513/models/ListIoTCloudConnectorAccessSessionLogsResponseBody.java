// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCloudConnectorAccessSessionLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIoTCloudConnectorAccessSessionLogsResponseBody</p>
 */
public class ListIoTCloudConnectorAccessSessionLogsResponseBody extends TeaModel {
    @NameInMap("AccessSessionLogs")
    private java.util.List < AccessSessionLogs> accessSessionLogs;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIoTCloudConnectorAccessSessionLogsResponseBody(Builder builder) {
        this.accessSessionLogs = builder.accessSessionLogs;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIoTCloudConnectorAccessSessionLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessSessionLogs
     */
    public java.util.List < AccessSessionLogs> getAccessSessionLogs() {
        return this.accessSessionLogs;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AccessSessionLogs> accessSessionLogs; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AccessSessionLogs.
         */
        public Builder accessSessionLogs(java.util.List < AccessSessionLogs> accessSessionLogs) {
            this.accessSessionLogs = accessSessionLogs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIoTCloudConnectorAccessSessionLogsResponseBody build() {
            return new ListIoTCloudConnectorAccessSessionLogsResponseBody(this);
        } 

    } 

    public static class AccessSessionLogs extends TeaModel {
        @NameInMap("ClientToServiceFlow")
        private String clientToServiceFlow;

        @NameInMap("DestinationIp")
        private String destinationIp;

        @NameInMap("DestinationPort")
        private String destinationPort;

        @NameInMap("Destinations")
        private java.util.List < String > destinations;

        @NameInMap("ServiceToClientFlow")
        private String serviceToClientFlow;

        @NameInMap("SourceIp")
        private String sourceIp;

        @NameInMap("Time")
        private String time;

        @NameInMap("Type")
        private String type;

        private AccessSessionLogs(Builder builder) {
            this.clientToServiceFlow = builder.clientToServiceFlow;
            this.destinationIp = builder.destinationIp;
            this.destinationPort = builder.destinationPort;
            this.destinations = builder.destinations;
            this.serviceToClientFlow = builder.serviceToClientFlow;
            this.sourceIp = builder.sourceIp;
            this.time = builder.time;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessSessionLogs create() {
            return builder().build();
        }

        /**
         * @return clientToServiceFlow
         */
        public String getClientToServiceFlow() {
            return this.clientToServiceFlow;
        }

        /**
         * @return destinationIp
         */
        public String getDestinationIp() {
            return this.destinationIp;
        }

        /**
         * @return destinationPort
         */
        public String getDestinationPort() {
            return this.destinationPort;
        }

        /**
         * @return destinations
         */
        public java.util.List < String > getDestinations() {
            return this.destinations;
        }

        /**
         * @return serviceToClientFlow
         */
        public String getServiceToClientFlow() {
            return this.serviceToClientFlow;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String clientToServiceFlow; 
            private String destinationIp; 
            private String destinationPort; 
            private java.util.List < String > destinations; 
            private String serviceToClientFlow; 
            private String sourceIp; 
            private String time; 
            private String type; 

            /**
             * ClientToServiceFlow.
             */
            public Builder clientToServiceFlow(String clientToServiceFlow) {
                this.clientToServiceFlow = clientToServiceFlow;
                return this;
            }

            /**
             * DestinationIp.
             */
            public Builder destinationIp(String destinationIp) {
                this.destinationIp = destinationIp;
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
             * Destinations.
             */
            public Builder destinations(java.util.List < String > destinations) {
                this.destinations = destinations;
                return this;
            }

            /**
             * ServiceToClientFlow.
             */
            public Builder serviceToClientFlow(String serviceToClientFlow) {
                this.serviceToClientFlow = serviceToClientFlow;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AccessSessionLogs build() {
                return new AccessSessionLogs(this);
            } 

        } 

    }
}
