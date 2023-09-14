// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If **NextToken** is not empty, the value of NextToken can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
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
         * The total number of entries returned.
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

        @NameInMap("RemoteIpEnabled")
        private Boolean remoteIpEnabled;

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

        private Servers(Builder builder) {
            this.description = builder.description;
            this.port = builder.port;
            this.remoteIpEnabled = builder.remoteIpEnabled;
            this.serverGroupId = builder.serverGroupId;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverType = builder.serverType;
            this.status = builder.status;
            this.weight = builder.weight;
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
         * @return remoteIpEnabled
         */
        public Boolean getRemoteIpEnabled() {
            return this.remoteIpEnabled;
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

        public static final class Builder {
            private String description; 
            private Integer port; 
            private Boolean remoteIpEnabled; 
            private String serverGroupId; 
            private String serverId; 
            private String serverIp; 
            private String serverType; 
            private String status; 
            private Integer weight; 

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
             * Indicates whether the remote IP address feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder remoteIpEnabled(Boolean remoteIpEnabled) {
                this.remoteIpEnabled = remoteIpEnabled;
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
             * The ID of the backend server.
             * <p>
             * 
             * > If **ServerType** is set to **Fc**, **ServerId** is the ARN of a function.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * The IP address in inclusive ENI mode.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * The type of the backend server.
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * The status of the backend server. Valid values:
             * <p>
             * 
             * *   **Adding**
             * *   **Available**
             * *   **Configuring**
             * *   **Removing**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The weight of the backend server. An ECS instance with a higher weight receives more requests.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public Servers build() {
                return new Servers(this);
            } 

        } 

    }
}
