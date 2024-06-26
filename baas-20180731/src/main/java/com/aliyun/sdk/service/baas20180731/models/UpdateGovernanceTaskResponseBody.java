// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGovernanceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGovernanceTaskResponseBody</p>
 */
public class UpdateGovernanceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateGovernanceTaskResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGovernanceTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateGovernanceTaskResponseBody build() {
            return new UpdateGovernanceTaskResponseBody(this);
        } 

    } 

    public static class AnchorPeers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private AnchorPeers(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnchorPeers create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private Integer port; 

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public AnchorPeers build() {
                return new AnchorPeers(this);
            } 

        } 

    }
    public static class OrdererNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Certificate")
        private String certificate;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Tlsroot")
        private String tlsroot;

        private OrdererNodes(Builder builder) {
            this.address = builder.address;
            this.certificate = builder.certificate;
            this.key = builder.key;
            this.tlsroot = builder.tlsroot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrdererNodes create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return tlsroot
         */
        public String getTlsroot() {
            return this.tlsroot;
        }

        public static final class Builder {
            private String address; 
            private String certificate; 
            private String key; 
            private String tlsroot; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Certificate.
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Tlsroot.
             */
            public Builder tlsroot(String tlsroot) {
                this.tlsroot = tlsroot;
                return this;
            }

            public OrdererNodes build() {
                return new OrdererNodes(this);
            } 

        } 

    }
    public static class AddedOrganizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnchorPeers")
        private java.util.List < AnchorPeers> anchorPeers;

        @com.aliyun.core.annotation.NameInMap("Crls")
        private String crls;

        @com.aliyun.core.annotation.NameInMap("MspId")
        private String mspId;

        @com.aliyun.core.annotation.NameInMap("MspType")
        private String mspType;

        @com.aliyun.core.annotation.NameInMap("Orderer")
        private Boolean orderer;

        @com.aliyun.core.annotation.NameInMap("OrdererNodes")
        private java.util.List < OrdererNodes> ordererNodes;

        @com.aliyun.core.annotation.NameInMap("RootCertificates")
        private String rootCertificates;

        @com.aliyun.core.annotation.NameInMap("TlsRootCertificates")
        private String tlsRootCertificates;

        private AddedOrganizations(Builder builder) {
            this.anchorPeers = builder.anchorPeers;
            this.crls = builder.crls;
            this.mspId = builder.mspId;
            this.mspType = builder.mspType;
            this.orderer = builder.orderer;
            this.ordererNodes = builder.ordererNodes;
            this.rootCertificates = builder.rootCertificates;
            this.tlsRootCertificates = builder.tlsRootCertificates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddedOrganizations create() {
            return builder().build();
        }

        /**
         * @return anchorPeers
         */
        public java.util.List < AnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        /**
         * @return crls
         */
        public String getCrls() {
            return this.crls;
        }

        /**
         * @return mspId
         */
        public String getMspId() {
            return this.mspId;
        }

        /**
         * @return mspType
         */
        public String getMspType() {
            return this.mspType;
        }

        /**
         * @return orderer
         */
        public Boolean getOrderer() {
            return this.orderer;
        }

        /**
         * @return ordererNodes
         */
        public java.util.List < OrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        /**
         * @return rootCertificates
         */
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        /**
         * @return tlsRootCertificates
         */
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

        public static final class Builder {
            private java.util.List < AnchorPeers> anchorPeers; 
            private String crls; 
            private String mspId; 
            private String mspType; 
            private Boolean orderer; 
            private java.util.List < OrdererNodes> ordererNodes; 
            private String rootCertificates; 
            private String tlsRootCertificates; 

            /**
             * AnchorPeers.
             */
            public Builder anchorPeers(java.util.List < AnchorPeers> anchorPeers) {
                this.anchorPeers = anchorPeers;
                return this;
            }

            /**
             * Crls.
             */
            public Builder crls(String crls) {
                this.crls = crls;
                return this;
            }

            /**
             * MspId.
             */
            public Builder mspId(String mspId) {
                this.mspId = mspId;
                return this;
            }

            /**
             * MspType.
             */
            public Builder mspType(String mspType) {
                this.mspType = mspType;
                return this;
            }

            /**
             * Orderer.
             */
            public Builder orderer(Boolean orderer) {
                this.orderer = orderer;
                return this;
            }

            /**
             * OrdererNodes.
             */
            public Builder ordererNodes(java.util.List < OrdererNodes> ordererNodes) {
                this.ordererNodes = ordererNodes;
                return this;
            }

            /**
             * RootCertificates.
             */
            public Builder rootCertificates(String rootCertificates) {
                this.rootCertificates = rootCertificates;
                return this;
            }

            /**
             * TlsRootCertificates.
             */
            public Builder tlsRootCertificates(String tlsRootCertificates) {
                this.tlsRootCertificates = tlsRootCertificates;
                return this;
            }

            public AddedOrganizations build() {
                return new AddedOrganizations(this);
            } 

        } 

    }
    public static class Cs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private String input;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Cs(Builder builder) {
            this.input = builder.input;
            this.name = builder.name;
            this.path = builder.path;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cs create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public String getInput() {
            return this.input;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String input; 
            private String name; 
            private String path; 
            private Integer type; 
            private String version; 

            /**
             * Input.
             */
            public Builder input(String input) {
                this.input = input;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Cs build() {
                return new Cs(this);
            } 

        } 

    }
    public static class ChaincodeSpecPkg extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cs")
        private Cs cs;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Sha256")
        private String sha256;

        private ChaincodeSpecPkg(Builder builder) {
            this.cs = builder.cs;
            this.policy = builder.policy;
            this.sha256 = builder.sha256;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChaincodeSpecPkg create() {
            return builder().build();
        }

        /**
         * @return cs
         */
        public Cs getCs() {
            return this.cs;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return sha256
         */
        public String getSha256() {
            return this.sha256;
        }

        public static final class Builder {
            private Cs cs; 
            private String policy; 
            private String sha256; 

            /**
             * Cs.
             */
            public Builder cs(Cs cs) {
                this.cs = cs;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Sha256.
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            public ChaincodeSpecPkg build() {
                return new ChaincodeSpecPkg(this);
            } 

        } 

    }
    public static class OrdererConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchTimeout")
        private String batchTimeout;

        @com.aliyun.core.annotation.NameInMap("MaxMessageCount")
        private Integer maxMessageCount;

        @com.aliyun.core.annotation.NameInMap("PreferredMaxBytes")
        private Integer preferredMaxBytes;

        private OrdererConfig(Builder builder) {
            this.batchTimeout = builder.batchTimeout;
            this.maxMessageCount = builder.maxMessageCount;
            this.preferredMaxBytes = builder.preferredMaxBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrdererConfig create() {
            return builder().build();
        }

        /**
         * @return batchTimeout
         */
        public String getBatchTimeout() {
            return this.batchTimeout;
        }

        /**
         * @return maxMessageCount
         */
        public Integer getMaxMessageCount() {
            return this.maxMessageCount;
        }

        /**
         * @return preferredMaxBytes
         */
        public Integer getPreferredMaxBytes() {
            return this.preferredMaxBytes;
        }

        public static final class Builder {
            private String batchTimeout; 
            private Integer maxMessageCount; 
            private Integer preferredMaxBytes; 

            /**
             * BatchTimeout.
             */
            public Builder batchTimeout(String batchTimeout) {
                this.batchTimeout = batchTimeout;
                return this;
            }

            /**
             * MaxMessageCount.
             */
            public Builder maxMessageCount(Integer maxMessageCount) {
                this.maxMessageCount = maxMessageCount;
                return this;
            }

            /**
             * PreferredMaxBytes.
             */
            public Builder preferredMaxBytes(Integer preferredMaxBytes) {
                this.preferredMaxBytes = preferredMaxBytes;
                return this;
            }

            public OrdererConfig build() {
                return new OrdererConfig(this);
            } 

        } 

    }
    public static class RemovedOrganizationsAnchorPeers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private RemovedOrganizationsAnchorPeers(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedOrganizationsAnchorPeers create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private Integer port; 

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public RemovedOrganizationsAnchorPeers build() {
                return new RemovedOrganizationsAnchorPeers(this);
            } 

        } 

    }
    public static class RemovedOrganizationsOrdererNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Certificate")
        private String certificate;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Tlsroot")
        private String tlsroot;

        private RemovedOrganizationsOrdererNodes(Builder builder) {
            this.address = builder.address;
            this.certificate = builder.certificate;
            this.key = builder.key;
            this.tlsroot = builder.tlsroot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedOrganizationsOrdererNodes create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return tlsroot
         */
        public String getTlsroot() {
            return this.tlsroot;
        }

        public static final class Builder {
            private String address; 
            private String certificate; 
            private String key; 
            private String tlsroot; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Certificate.
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Tlsroot.
             */
            public Builder tlsroot(String tlsroot) {
                this.tlsroot = tlsroot;
                return this;
            }

            public RemovedOrganizationsOrdererNodes build() {
                return new RemovedOrganizationsOrdererNodes(this);
            } 

        } 

    }
    public static class RemovedOrganizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnchorPeers")
        private java.util.List < RemovedOrganizationsAnchorPeers> anchorPeers;

        @com.aliyun.core.annotation.NameInMap("Crls")
        private String crls;

        @com.aliyun.core.annotation.NameInMap("MspId")
        private String mspId;

        @com.aliyun.core.annotation.NameInMap("MspType")
        private String mspType;

        @com.aliyun.core.annotation.NameInMap("Orderer")
        private Boolean orderer;

        @com.aliyun.core.annotation.NameInMap("OrdererNodes")
        private java.util.List < RemovedOrganizationsOrdererNodes> ordererNodes;

        @com.aliyun.core.annotation.NameInMap("RootCertificates")
        private String rootCertificates;

        @com.aliyun.core.annotation.NameInMap("TlsRootCertificates")
        private String tlsRootCertificates;

        private RemovedOrganizations(Builder builder) {
            this.anchorPeers = builder.anchorPeers;
            this.crls = builder.crls;
            this.mspId = builder.mspId;
            this.mspType = builder.mspType;
            this.orderer = builder.orderer;
            this.ordererNodes = builder.ordererNodes;
            this.rootCertificates = builder.rootCertificates;
            this.tlsRootCertificates = builder.tlsRootCertificates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovedOrganizations create() {
            return builder().build();
        }

        /**
         * @return anchorPeers
         */
        public java.util.List < RemovedOrganizationsAnchorPeers> getAnchorPeers() {
            return this.anchorPeers;
        }

        /**
         * @return crls
         */
        public String getCrls() {
            return this.crls;
        }

        /**
         * @return mspId
         */
        public String getMspId() {
            return this.mspId;
        }

        /**
         * @return mspType
         */
        public String getMspType() {
            return this.mspType;
        }

        /**
         * @return orderer
         */
        public Boolean getOrderer() {
            return this.orderer;
        }

        /**
         * @return ordererNodes
         */
        public java.util.List < RemovedOrganizationsOrdererNodes> getOrdererNodes() {
            return this.ordererNodes;
        }

        /**
         * @return rootCertificates
         */
        public String getRootCertificates() {
            return this.rootCertificates;
        }

        /**
         * @return tlsRootCertificates
         */
        public String getTlsRootCertificates() {
            return this.tlsRootCertificates;
        }

        public static final class Builder {
            private java.util.List < RemovedOrganizationsAnchorPeers> anchorPeers; 
            private String crls; 
            private String mspId; 
            private String mspType; 
            private Boolean orderer; 
            private java.util.List < RemovedOrganizationsOrdererNodes> ordererNodes; 
            private String rootCertificates; 
            private String tlsRootCertificates; 

            /**
             * AnchorPeers.
             */
            public Builder anchorPeers(java.util.List < RemovedOrganizationsAnchorPeers> anchorPeers) {
                this.anchorPeers = anchorPeers;
                return this;
            }

            /**
             * Crls.
             */
            public Builder crls(String crls) {
                this.crls = crls;
                return this;
            }

            /**
             * MspId.
             */
            public Builder mspId(String mspId) {
                this.mspId = mspId;
                return this;
            }

            /**
             * MspType.
             */
            public Builder mspType(String mspType) {
                this.mspType = mspType;
                return this;
            }

            /**
             * Orderer.
             */
            public Builder orderer(Boolean orderer) {
                this.orderer = orderer;
                return this;
            }

            /**
             * OrdererNodes.
             */
            public Builder ordererNodes(java.util.List < RemovedOrganizationsOrdererNodes> ordererNodes) {
                this.ordererNodes = ordererNodes;
                return this;
            }

            /**
             * RootCertificates.
             */
            public Builder rootCertificates(String rootCertificates) {
                this.rootCertificates = rootCertificates;
                return this;
            }

            /**
             * TlsRootCertificates.
             */
            public Builder tlsRootCertificates(String tlsRootCertificates) {
                this.tlsRootCertificates = tlsRootCertificates;
                return this;
            }

            public RemovedOrganizations build() {
                return new RemovedOrganizations(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddedOrganizations")
        private java.util.List < AddedOrganizations> addedOrganizations;

        @com.aliyun.core.annotation.NameInMap("ChaincodeSpecPkg")
        private ChaincodeSpecPkg chaincodeSpecPkg;

        @com.aliyun.core.annotation.NameInMap("OrdererConfig")
        private OrdererConfig ordererConfig;

        @com.aliyun.core.annotation.NameInMap("Raw")
        private String raw;

        @com.aliyun.core.annotation.NameInMap("RemovedOrganizations")
        private java.util.List < RemovedOrganizations> removedOrganizations;

        @com.aliyun.core.annotation.NameInMap("RwSets")
        private String rwSets;

        private Content(Builder builder) {
            this.addedOrganizations = builder.addedOrganizations;
            this.chaincodeSpecPkg = builder.chaincodeSpecPkg;
            this.ordererConfig = builder.ordererConfig;
            this.raw = builder.raw;
            this.removedOrganizations = builder.removedOrganizations;
            this.rwSets = builder.rwSets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return addedOrganizations
         */
        public java.util.List < AddedOrganizations> getAddedOrganizations() {
            return this.addedOrganizations;
        }

        /**
         * @return chaincodeSpecPkg
         */
        public ChaincodeSpecPkg getChaincodeSpecPkg() {
            return this.chaincodeSpecPkg;
        }

        /**
         * @return ordererConfig
         */
        public OrdererConfig getOrdererConfig() {
            return this.ordererConfig;
        }

        /**
         * @return raw
         */
        public String getRaw() {
            return this.raw;
        }

        /**
         * @return removedOrganizations
         */
        public java.util.List < RemovedOrganizations> getRemovedOrganizations() {
            return this.removedOrganizations;
        }

        /**
         * @return rwSets
         */
        public String getRwSets() {
            return this.rwSets;
        }

        public static final class Builder {
            private java.util.List < AddedOrganizations> addedOrganizations; 
            private ChaincodeSpecPkg chaincodeSpecPkg; 
            private OrdererConfig ordererConfig; 
            private String raw; 
            private java.util.List < RemovedOrganizations> removedOrganizations; 
            private String rwSets; 

            /**
             * AddedOrganizations.
             */
            public Builder addedOrganizations(java.util.List < AddedOrganizations> addedOrganizations) {
                this.addedOrganizations = addedOrganizations;
                return this;
            }

            /**
             * ChaincodeSpecPkg.
             */
            public Builder chaincodeSpecPkg(ChaincodeSpecPkg chaincodeSpecPkg) {
                this.chaincodeSpecPkg = chaincodeSpecPkg;
                return this;
            }

            /**
             * OrdererConfig.
             */
            public Builder ordererConfig(OrdererConfig ordererConfig) {
                this.ordererConfig = ordererConfig;
                return this;
            }

            /**
             * Raw.
             */
            public Builder raw(String raw) {
                this.raw = raw;
                return this;
            }

            /**
             * RemovedOrganizations.
             */
            public Builder removedOrganizations(java.util.List < RemovedOrganizations> removedOrganizations) {
                this.removedOrganizations = removedOrganizations;
                return this;
            }

            /**
             * RwSets.
             */
            public Builder rwSets(String rwSets) {
                this.rwSets = rwSets;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("Content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.channelName = builder.channelName;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String channelName; 
            private Content content; 
            private Long createTime; 
            private String creator; 
            private String description; 
            private String status; 
            private String taskId; 
            private String type; 

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
