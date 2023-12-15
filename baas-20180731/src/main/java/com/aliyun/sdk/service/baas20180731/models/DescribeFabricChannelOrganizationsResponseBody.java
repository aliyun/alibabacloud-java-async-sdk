// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricChannelOrganizationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricChannelOrganizationsResponseBody</p>
 */
public class DescribeFabricChannelOrganizationsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeFabricChannelOrganizationsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricChannelOrganizationsResponseBody create() {
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

        public DescribeFabricChannelOrganizationsResponseBody build() {
            return new DescribeFabricChannelOrganizationsResponseBody(this);
        } 

    } 

    public static class AnchorPeers extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Port")
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
        @NameInMap("Address")
        private String address;

        @NameInMap("Certificate")
        private String certificate;

        @NameInMap("Key")
        private String key;

        @NameInMap("Tlsroot")
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
    public static class Result extends TeaModel {
        @NameInMap("AnchorPeers")
        private java.util.List < AnchorPeers> anchorPeers;

        @NameInMap("Crls")
        private String crls;

        @NameInMap("MspId")
        private String mspId;

        @NameInMap("MspType")
        private String mspType;

        @NameInMap("Orderer")
        private Boolean orderer;

        @NameInMap("OrdererNodes")
        private java.util.List < OrdererNodes> ordererNodes;

        @NameInMap("RootCertificates")
        private String rootCertificates;

        @NameInMap("TlsRootCertificates")
        private String tlsRootCertificates;

        private Result(Builder builder) {
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

        public static Result create() {
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
