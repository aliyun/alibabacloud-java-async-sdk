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
 * {@link DescribeAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAtiAgentRegisterInfoMarketResponseBody</p>
 */
public class DescribeAtiAgentRegisterInfoMarketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AgentDescription")
    private String agentDescription;

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

    @com.aliyun.core.annotation.NameInMap("Categories")
    private Categories categories;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private Endpoints endpoints;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TrustCardContent")
    private String trustCardContent;

    @com.aliyun.core.annotation.NameInMap("TrustLevel")
    private String trustLevel;

    private DescribeAtiAgentRegisterInfoMarketResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.agentDescription = builder.agentDescription;
        this.agentDisplayName = builder.agentDisplayName;
        this.agentHost = builder.agentHost;
        this.agentId = builder.agentId;
        this.agentRegisterInfoId = builder.agentRegisterInfoId;
        this.agentVersion = builder.agentVersion;
        this.categories = builder.categories;
        this.endpoints = builder.endpoints;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.trustCardContent = builder.trustCardContent;
        this.trustLevel = builder.trustLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAtiAgentRegisterInfoMarketResponseBody create() {
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
     * @return categories
     */
    public Categories getCategories() {
        return this.categories;
    }

    /**
     * @return endpoints
     */
    public Endpoints getEndpoints() {
        return this.endpoints;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return trustCardContent
     */
    public String getTrustCardContent() {
        return this.trustCardContent;
    }

    /**
     * @return trustLevel
     */
    public String getTrustLevel() {
        return this.trustLevel;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private String agentDescription; 
        private String agentDisplayName; 
        private String agentHost; 
        private String agentId; 
        private String agentRegisterInfoId; 
        private String agentVersion; 
        private Categories categories; 
        private Endpoints endpoints; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private String status; 
        private String trustCardContent; 
        private String trustLevel; 

        private Builder() {
        } 

        private Builder(DescribeAtiAgentRegisterInfoMarketResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.agentDescription = model.agentDescription;
            this.agentDisplayName = model.agentDisplayName;
            this.agentHost = model.agentHost;
            this.agentId = model.agentId;
            this.agentRegisterInfoId = model.agentRegisterInfoId;
            this.agentVersion = model.agentVersion;
            this.categories = model.categories;
            this.endpoints = model.endpoints;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.status = model.status;
            this.trustCardContent = model.trustCardContent;
            this.trustLevel = model.trustLevel;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
         * Categories.
         */
        public Builder categories(Categories categories) {
            this.categories = categories;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TrustCardContent.
         */
        public Builder trustCardContent(String trustCardContent) {
            this.trustCardContent = trustCardContent;
            return this;
        }

        /**
         * TrustLevel.
         */
        public Builder trustLevel(String trustLevel) {
            this.trustLevel = trustLevel;
            return this;
        }

        public DescribeAtiAgentRegisterInfoMarketResponseBody build() {
            return new DescribeAtiAgentRegisterInfoMarketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoMarketResponseBody</p>
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
     * {@link DescribeAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoMarketResponseBody</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("category")
        private java.util.List<String> category;

        private Categories(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public java.util.List<String> getCategory() {
            return this.category;
        }

        public static final class Builder {
            private java.util.List<String> category; 

            private Builder() {
            } 

            private Builder(Categories model) {
                this.category = model.category;
            } 

            /**
             * category.
             */
            public Builder category(java.util.List<String> category) {
                this.category = category;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoMarketResponseBody</p>
     */
    public static class Transports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Transport")
        private java.util.List<String> transport;

        private Transports(Builder builder) {
            this.transport = builder.transport;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transports create() {
            return builder().build();
        }

        /**
         * @return transport
         */
        public java.util.List<String> getTransport() {
            return this.transport;
        }

        public static final class Builder {
            private java.util.List<String> transport; 

            private Builder() {
            } 

            private Builder(Transports model) {
                this.transport = model.transport;
            } 

            /**
             * Transport.
             */
            public Builder transport(java.util.List<String> transport) {
                this.transport = transport;
                return this;
            }

            public Transports build() {
                return new Transports(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoMarketResponseBody</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentUrl")
        private String agentUrl;

        @com.aliyun.core.annotation.NameInMap("MetadataUrl")
        private String metadataUrl;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Transports")
        private Transports transports;

        private Endpoint(Builder builder) {
            this.agentUrl = builder.agentUrl;
            this.metadataUrl = builder.metadataUrl;
            this.protocol = builder.protocol;
            this.transports = builder.transports;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return agentUrl
         */
        public String getAgentUrl() {
            return this.agentUrl;
        }

        /**
         * @return metadataUrl
         */
        public String getMetadataUrl() {
            return this.metadataUrl;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return transports
         */
        public Transports getTransports() {
            return this.transports;
        }

        public static final class Builder {
            private String agentUrl; 
            private String metadataUrl; 
            private String protocol; 
            private Transports transports; 

            private Builder() {
            } 

            private Builder(Endpoint model) {
                this.agentUrl = model.agentUrl;
                this.metadataUrl = model.metadataUrl;
                this.protocol = model.protocol;
                this.transports = model.transports;
            } 

            /**
             * AgentUrl.
             */
            public Builder agentUrl(String agentUrl) {
                this.agentUrl = agentUrl;
                return this;
            }

            /**
             * MetadataUrl.
             */
            public Builder metadataUrl(String metadataUrl) {
                this.metadataUrl = metadataUrl;
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
             * Transports.
             */
            public Builder transports(Transports transports) {
                this.transports = transports;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAtiAgentRegisterInfoMarketResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoMarketResponseBody</p>
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
}
