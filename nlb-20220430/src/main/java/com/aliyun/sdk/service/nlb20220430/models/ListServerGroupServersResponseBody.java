// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListServerGroupServersResponseBody</p>
 */
public class ListServerGroupServersResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Servers")
    private java.util.List < Servers> servers;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListServerGroupServersResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.servers = builder.servers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerGroupServersResponseBody create() {
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
     * @return servers
     */
    public java.util.List < Servers> getServers() {
        return this.servers;
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
        private java.util.List < Servers> servers; 
        private Integer totalCount; 

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If this is your first query or no next query is to be sent, ignore this parameter.
         * *   If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of backend servers.
         */
        public Builder servers(java.util.List < Servers> servers) {
            this.servers = servers;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServerGroupServersResponseBody build() {
            return new ListServerGroupServersResponseBody(this);
        } 

    } 

    public static class Servers extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("ServerGroupId")
        private String serverGroupId;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("ServerType")
        private String serverType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Weight")
        private Integer weight;

        @NameInMap("ZoneId")
        private String zoneId;

        private Servers(Builder builder) {
            this.description = builder.description;
            this.port = builder.port;
            this.serverGroupId = builder.serverGroupId;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverType = builder.serverType;
            this.status = builder.status;
            this.weight = builder.weight;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Servers create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String description; 
            private Integer port; 
            private String serverGroupId; 
            private String serverId; 
            private String serverIp; 
            private String serverType; 
            private String status; 
            private Integer weight; 
            private String zoneId; 

            /**
             * The description of the backend server.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The port used by the backend server. Valid values: **1** to **65535**.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The IP address of the backend server.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The type of the backend server. Valid values:
             * <p>
             * 
             * *   **Ecs**: an Elastic Compute Service (ECS) instance
             * *   **Eni**: an elastic network interface (ENI)
             * *   **Eci**: an elastic container instance
             * *   **Ip**: an IP address
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * Indicates the status of the backend server. Valid values:
             * <p>
             * 
             * *   **Adding**: The backend server is being added.
             * *   **Available**: The backend server is added.
             * *   **Configuring**: The backend server is being configured.
             * *   **Removing**: The backend server is being removed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The weight of the backend server.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * The zone ID of the server.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Servers build() {
                return new Servers(this);
            } 

        } 

    }
}
