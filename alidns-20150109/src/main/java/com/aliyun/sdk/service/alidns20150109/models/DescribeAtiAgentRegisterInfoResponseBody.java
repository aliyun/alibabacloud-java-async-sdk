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
 * {@link DescribeAtiAgentRegisterInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAtiAgentRegisterInfoResponseBody</p>
 */
public class DescribeAtiAgentRegisterInfoResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("AtiName")
    private String atiName;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private Endpoints endpoints;

    @com.aliyun.core.annotation.NameInMap("IdentityCertSerialNumber")
    private String identityCertSerialNumber;

    @com.aliyun.core.annotation.NameInMap("RegistrantId")
    private String registrantId;

    @com.aliyun.core.annotation.NameInMap("RegistrantName")
    private String registrantName;

    @com.aliyun.core.annotation.NameInMap("RejectReason")
    private RejectReason rejectReason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerCertSerialNumber")
    private String serverCertSerialNumber;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TrustCard")
    private String trustCard;

    @com.aliyun.core.annotation.NameInMap("TrustCardUrl")
    private String trustCardUrl;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    private DescribeAtiAgentRegisterInfoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.agentDescription = builder.agentDescription;
        this.agentDisplayName = builder.agentDisplayName;
        this.agentHost = builder.agentHost;
        this.agentId = builder.agentId;
        this.agentRegisterInfoId = builder.agentRegisterInfoId;
        this.agentVersion = builder.agentVersion;
        this.atiName = builder.atiName;
        this.createTimestamp = builder.createTimestamp;
        this.endpoints = builder.endpoints;
        this.identityCertSerialNumber = builder.identityCertSerialNumber;
        this.registrantId = builder.registrantId;
        this.registrantName = builder.registrantName;
        this.rejectReason = builder.rejectReason;
        this.requestId = builder.requestId;
        this.serverCertSerialNumber = builder.serverCertSerialNumber;
        this.status = builder.status;
        this.trustCard = builder.trustCard;
        this.trustCardUrl = builder.trustCardUrl;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAtiAgentRegisterInfoResponseBody create() {
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
     * @return atiName
     */
    public String getAtiName() {
        return this.atiName;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return endpoints
     */
    public Endpoints getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return identityCertSerialNumber
     */
    public String getIdentityCertSerialNumber() {
        return this.identityCertSerialNumber;
    }

    /**
     * @return registrantId
     */
    public String getRegistrantId() {
        return this.registrantId;
    }

    /**
     * @return registrantName
     */
    public String getRegistrantName() {
        return this.registrantName;
    }

    /**
     * @return rejectReason
     */
    public RejectReason getRejectReason() {
        return this.rejectReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverCertSerialNumber
     */
    public String getServerCertSerialNumber() {
        return this.serverCertSerialNumber;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return trustCard
     */
    public String getTrustCard() {
        return this.trustCard;
    }

    /**
     * @return trustCardUrl
     */
    public String getTrustCardUrl() {
        return this.trustCardUrl;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private String agentDescription; 
        private String agentDisplayName; 
        private String agentHost; 
        private String agentId; 
        private String agentRegisterInfoId; 
        private String agentVersion; 
        private String atiName; 
        private Long createTimestamp; 
        private Endpoints endpoints; 
        private String identityCertSerialNumber; 
        private String registrantId; 
        private String registrantName; 
        private RejectReason rejectReason; 
        private String requestId; 
        private String serverCertSerialNumber; 
        private String status; 
        private String trustCard; 
        private String trustCardUrl; 
        private Long updateTimestamp; 

        private Builder() {
        } 

        private Builder(DescribeAtiAgentRegisterInfoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.agentDescription = model.agentDescription;
            this.agentDisplayName = model.agentDisplayName;
            this.agentHost = model.agentHost;
            this.agentId = model.agentId;
            this.agentRegisterInfoId = model.agentRegisterInfoId;
            this.agentVersion = model.agentVersion;
            this.atiName = model.atiName;
            this.createTimestamp = model.createTimestamp;
            this.endpoints = model.endpoints;
            this.identityCertSerialNumber = model.identityCertSerialNumber;
            this.registrantId = model.registrantId;
            this.registrantName = model.registrantName;
            this.rejectReason = model.rejectReason;
            this.requestId = model.requestId;
            this.serverCertSerialNumber = model.serverCertSerialNumber;
            this.status = model.status;
            this.trustCard = model.trustCard;
            this.trustCardUrl = model.trustCardUrl;
            this.updateTimestamp = model.updateTimestamp;
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
         * AtiName.
         */
        public Builder atiName(String atiName) {
            this.atiName = atiName;
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
         * Endpoints.
         */
        public Builder endpoints(Endpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * IdentityCertSerialNumber.
         */
        public Builder identityCertSerialNumber(String identityCertSerialNumber) {
            this.identityCertSerialNumber = identityCertSerialNumber;
            return this;
        }

        /**
         * RegistrantId.
         */
        public Builder registrantId(String registrantId) {
            this.registrantId = registrantId;
            return this;
        }

        /**
         * RegistrantName.
         */
        public Builder registrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }

        /**
         * RejectReason.
         */
        public Builder rejectReason(RejectReason rejectReason) {
            this.rejectReason = rejectReason;
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
         * ServerCertSerialNumber.
         */
        public Builder serverCertSerialNumber(String serverCertSerialNumber) {
            this.serverCertSerialNumber = serverCertSerialNumber;
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
         * TrustCard.
         */
        public Builder trustCard(String trustCard) {
            this.trustCard = trustCard;
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
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeAtiAgentRegisterInfoResponseBody build() {
            return new DescribeAtiAgentRegisterInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAtiAgentRegisterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoResponseBody</p>
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
     * {@link DescribeAtiAgentRegisterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoResponseBody</p>
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
     * {@link DescribeAtiAgentRegisterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoResponseBody</p>
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
     * {@link DescribeAtiAgentRegisterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoResponseBody</p>
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
     * {@link DescribeAtiAgentRegisterInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAtiAgentRegisterInfoResponseBody</p>
     */
    public static class RejectReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RejectReason(Builder builder) {
            this.message = builder.message;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RejectReason create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String message; 
            private String type; 

            private Builder() {
            } 

            private Builder(RejectReason model) {
                this.message = model.message;
                this.type = model.type;
            } 

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RejectReason build() {
                return new RejectReason(this);
            } 

        } 

    }
}
