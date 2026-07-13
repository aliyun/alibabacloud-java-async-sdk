// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SearchAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
 *
 * <p>SearchAtiAgentRegisterInfoMarketResponseBody</p>
 */
public class SearchAtiAgentRegisterInfoMarketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Agents")
    private Agents agents;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private SearchAtiAgentRegisterInfoMarketResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.agents = builder.agents;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAtiAgentRegisterInfoMarketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return agents
     */
    public Agents getAgents() {
        return this.agents;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Agents agents; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(SearchAtiAgentRegisterInfoMarketResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.agents = model.agents;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Agent</p>
         */
        public Builder agents(Agents agents) {
            this.agents = agents;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public SearchAtiAgentRegisterInfoMarketResponseBody build() {
            return new SearchAtiAgentRegisterInfoMarketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAtiAgentRegisterInfoMarketResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAtiAgentRegisterInfoMarketResponseBody</p>
     */
    public static class Protocols extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Protocol")
        private java.util.List<String> protocol;

        private Protocols(Builder builder) {
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Protocols create() {
            return builder().build();
        }

        /**
         * @return protocol
         */
        public java.util.List<String> getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private java.util.List<String> protocol; 

            private Builder() {
            } 

            private Builder(Protocols model) {
                this.protocol = model.protocol;
            } 

            /**
             * Protocol.
             */
            public Builder protocol(java.util.List<String> protocol) {
                this.protocol = protocol;
                return this;
            }

            public Protocols build() {
                return new Protocols(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAtiAgentRegisterInfoMarketResponseBody</p>
     */
    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentDescription")
        private String agentDescription;

        @com.aliyun.core.annotation.NameInMap("AgentDisplayName")
        private String agentDisplayName;

        @com.aliyun.core.annotation.NameInMap("AgentHost")
        private String agentHost;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Protocols")
        private Protocols protocols;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TrustCardUrl")
        private String trustCardUrl;

        @com.aliyun.core.annotation.NameInMap("TrustLevel")
        private String trustLevel;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private Agent(Builder builder) {
            this.agentDescription = builder.agentDescription;
            this.agentDisplayName = builder.agentDisplayName;
            this.agentHost = builder.agentHost;
            this.agentId = builder.agentId;
            this.agentVersion = builder.agentVersion;
            this.createTimestamp = builder.createTimestamp;
            this.protocols = builder.protocols;
            this.status = builder.status;
            this.trustCardUrl = builder.trustCardUrl;
            this.trustLevel = builder.trustLevel;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return agentDescription
         */
        public String getAgentDescription() {
            return this.agentDescription;
        }

        /**
         * @return agentDisplayName
         */
        public String getAgentDisplayName() {
            return this.agentDisplayName;
        }

        /**
         * @return agentHost
         */
        public String getAgentHost() {
            return this.agentHost;
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return protocols
         */
        public Protocols getProtocols() {
            return this.protocols;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return trustCardUrl
         */
        public String getTrustCardUrl() {
            return this.trustCardUrl;
        }

        /**
         * @return trustLevel
         */
        public String getTrustLevel() {
            return this.trustLevel;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String agentDescription; 
            private String agentDisplayName; 
            private String agentHost; 
            private String agentId; 
            private String agentVersion; 
            private Long createTimestamp; 
            private Protocols protocols; 
            private String status; 
            private String trustCardUrl; 
            private String trustLevel; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(Agent model) {
                this.agentDescription = model.agentDescription;
                this.agentDisplayName = model.agentDisplayName;
                this.agentHost = model.agentHost;
                this.agentId = model.agentId;
                this.agentVersion = model.agentVersion;
                this.createTimestamp = model.createTimestamp;
                this.protocols = model.protocols;
                this.status = model.status;
                this.trustCardUrl = model.trustCardUrl;
                this.trustLevel = model.trustLevel;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * AgentDescription.
             */
            public Builder agentDescription(String agentDescription) {
                this.agentDescription = agentDescription;
                return this;
            }

            /**
             * AgentDisplayName.
             */
            public Builder agentDisplayName(String agentDisplayName) {
                this.agentDisplayName = agentDisplayName;
                return this;
            }

            /**
             * AgentHost.
             */
            public Builder agentHost(String agentHost) {
                this.agentHost = agentHost;
                return this;
            }

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentVersion.
             */
            public Builder agentVersion(String agentVersion) {
                this.agentVersion = agentVersion;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * Protocols.
             */
            public Builder protocols(Protocols protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TrustCardUrl.
             */
            public Builder trustCardUrl(String trustCardUrl) {
                this.trustCardUrl = trustCardUrl;
                return this;
            }

            /**
             * TrustLevel.
             */
            public Builder trustLevel(String trustLevel) {
                this.trustLevel = trustLevel;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>SearchAtiAgentRegisterInfoMarketResponseBody</p>
     */
    public static class Agents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private java.util.List<Agent> agent;

        private Agents(Builder builder) {
            this.agent = builder.agent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agents create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public java.util.List<Agent> getAgent() {
            return this.agent;
        }

        public static final class Builder {
            private java.util.List<Agent> agent; 

            private Builder() {
            } 

            private Builder(Agents model) {
                this.agent = model.agent;
            } 

            /**
             * Agent.
             */
            public Builder agent(java.util.List<Agent> agent) {
                this.agent = agent;
                return this;
            }

            public Agents build() {
                return new Agents(this);
            } 

        } 

    }
}
