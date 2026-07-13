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
 * {@link ListAtiAgentRegisterInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListAtiAgentRegisterInfosResponseBody</p>
 */
public class ListAtiAgentRegisterInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AgentRegisterInfos")
    private AgentRegisterInfos agentRegisterInfos;

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

    private ListAtiAgentRegisterInfosResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.agentRegisterInfos = builder.agentRegisterInfos;
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

    public static ListAtiAgentRegisterInfosResponseBody create() {
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
     * @return agentRegisterInfos
     */
    public AgentRegisterInfos getAgentRegisterInfos() {
        return this.agentRegisterInfos;
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
        private AgentRegisterInfos agentRegisterInfos; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(ListAtiAgentRegisterInfosResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.agentRegisterInfos = model.agentRegisterInfos;
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
         * AgentRegisterInfos.
         */
        public Builder agentRegisterInfos(AgentRegisterInfos agentRegisterInfos) {
            this.agentRegisterInfos = agentRegisterInfos;
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

        public ListAtiAgentRegisterInfosResponseBody build() {
            return new ListAtiAgentRegisterInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAtiAgentRegisterInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiAgentRegisterInfosResponseBody</p>
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
     * {@link ListAtiAgentRegisterInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiAgentRegisterInfosResponseBody</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private Endpoint(Builder builder) {
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String protocol; 

            private Builder() {
            } 

            private Builder(Endpoint model) {
                this.protocol = model.protocol;
            } 

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAtiAgentRegisterInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiAgentRegisterInfosResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private java.util.List<Endpoint> endpoint;

        private Endpoints(Builder builder) {
            this.endpoint = builder.endpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public java.util.List<Endpoint> getEndpoint() {
            return this.endpoint;
        }

        public static final class Builder {
            private java.util.List<Endpoint> endpoint; 

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.endpoint = model.endpoint;
            } 

            /**
             * Endpoint.
             */
            public Builder endpoint(java.util.List<Endpoint> endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAtiAgentRegisterInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiAgentRegisterInfosResponseBody</p>
     */
    public static class AgentRegisterInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentDisplayName")
        private String agentDisplayName;

        @com.aliyun.core.annotation.NameInMap("AgentHost")
        private String agentHost;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentRegisterInfoId")
        private String agentRegisterInfoId;

        @com.aliyun.core.annotation.NameInMap("AgentVersion")
        private String agentVersion;

        @com.aliyun.core.annotation.NameInMap("AtiName")
        private String atiName;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private String createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private Endpoints endpoints;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private String updateTimestamp;

        private AgentRegisterInfo(Builder builder) {
            this.agentDisplayName = builder.agentDisplayName;
            this.agentHost = builder.agentHost;
            this.agentId = builder.agentId;
            this.agentRegisterInfoId = builder.agentRegisterInfoId;
            this.agentVersion = builder.agentVersion;
            this.atiName = builder.atiName;
            this.createTimestamp = builder.createTimestamp;
            this.endpoints = builder.endpoints;
            this.status = builder.status;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentRegisterInfo create() {
            return builder().build();
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
         * @return agentRegisterInfoId
         */
        public String getAgentRegisterInfoId() {
            return this.agentRegisterInfoId;
        }

        /**
         * @return agentVersion
         */
        public String getAgentVersion() {
            return this.agentVersion;
        }

        /**
         * @return atiName
         */
        public String getAtiName() {
            return this.atiName;
        }

        /**
         * @return createTimestamp
         */
        public String getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return endpoints
         */
        public Endpoints getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTimestamp
         */
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String agentDisplayName; 
            private String agentHost; 
            private String agentId; 
            private String agentRegisterInfoId; 
            private String agentVersion; 
            private String atiName; 
            private String createTimestamp; 
            private Endpoints endpoints; 
            private String status; 
            private String updateTimestamp; 

            private Builder() {
            } 

            private Builder(AgentRegisterInfo model) {
                this.agentDisplayName = model.agentDisplayName;
                this.agentHost = model.agentHost;
                this.agentId = model.agentId;
                this.agentRegisterInfoId = model.agentRegisterInfoId;
                this.agentVersion = model.agentVersion;
                this.atiName = model.atiName;
                this.createTimestamp = model.createTimestamp;
                this.endpoints = model.endpoints;
                this.status = model.status;
                this.updateTimestamp = model.updateTimestamp;
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
             * AgentRegisterInfoId.
             */
            public Builder agentRegisterInfoId(String agentRegisterInfoId) {
                this.agentRegisterInfoId = agentRegisterInfoId;
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
             * AtiName.
             */
            public Builder atiName(String atiName) {
                this.atiName = atiName;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(String createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * Endpoints.
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
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
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(String updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public AgentRegisterInfo build() {
                return new AgentRegisterInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAtiAgentRegisterInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiAgentRegisterInfosResponseBody</p>
     */
    public static class AgentRegisterInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentRegisterInfo")
        private java.util.List<AgentRegisterInfo> agentRegisterInfo;

        private AgentRegisterInfos(Builder builder) {
            this.agentRegisterInfo = builder.agentRegisterInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentRegisterInfos create() {
            return builder().build();
        }

        /**
         * @return agentRegisterInfo
         */
        public java.util.List<AgentRegisterInfo> getAgentRegisterInfo() {
            return this.agentRegisterInfo;
        }

        public static final class Builder {
            private java.util.List<AgentRegisterInfo> agentRegisterInfo; 

            private Builder() {
            } 

            private Builder(AgentRegisterInfos model) {
                this.agentRegisterInfo = model.agentRegisterInfo;
            } 

            /**
             * AgentRegisterInfo.
             */
            public Builder agentRegisterInfo(java.util.List<AgentRegisterInfo> agentRegisterInfo) {
                this.agentRegisterInfo = agentRegisterInfo;
                return this;
            }

            public AgentRegisterInfos build() {
                return new AgentRegisterInfos(this);
            } 

        } 

    }
}
