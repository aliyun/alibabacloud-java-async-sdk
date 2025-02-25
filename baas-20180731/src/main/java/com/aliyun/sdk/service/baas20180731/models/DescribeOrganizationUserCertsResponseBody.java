// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrganizationUserCertsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrganizationUserCertsResponseBody</p>
 */
public class DescribeOrganizationUserCertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeOrganizationUserCertsResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrganizationUserCertsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

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

        public DescribeOrganizationUserCertsResponseBody build() {
            return new DescribeOrganizationUserCertsResponseBody(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertData")
        private String certData;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("ValidFrom")
        private String validFrom;

        @com.aliyun.core.annotation.NameInMap("ValidTo")
        private String validTo;

        private Certificates(Builder builder) {
            this.certData = builder.certData;
            this.issuer = builder.issuer;
            this.name = builder.name;
            this.scope = builder.scope;
            this.subject = builder.subject;
            this.validFrom = builder.validFrom;
            this.validTo = builder.validTo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return certData
         */
        public String getCertData() {
            return this.certData;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return validFrom
         */
        public String getValidFrom() {
            return this.validFrom;
        }

        /**
         * @return validTo
         */
        public String getValidTo() {
            return this.validTo;
        }

        public static final class Builder {
            private String certData; 
            private String issuer; 
            private String name; 
            private String scope; 
            private String subject; 
            private String validFrom; 
            private String validTo; 

            /**
             * CertData.
             */
            public Builder certData(String certData) {
                this.certData = certData;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
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
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * ValidFrom.
             */
            public Builder validFrom(String validFrom) {
                this.validFrom = validFrom;
                return this;
            }

            /**
             * ValidTo.
             */
            public Builder validTo(String validTo) {
                this.validTo = validTo;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
    public static class KeyPair extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateKey")
        private String privateKey;

        @com.aliyun.core.annotation.NameInMap("PublicKey")
        private String publicKey;

        private KeyPair(Builder builder) {
            this.privateKey = builder.privateKey;
            this.publicKey = builder.publicKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyPair create() {
            return builder().build();
        }

        /**
         * @return privateKey
         */
        public String getPrivateKey() {
            return this.privateKey;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        public static final class Builder {
            private String privateKey; 
            private String publicKey; 

            /**
             * PrivateKey.
             */
            public Builder privateKey(String privateKey) {
                this.privateKey = privateKey;
                return this;
            }

            /**
             * PublicKey.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            public KeyPair build() {
                return new KeyPair(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificates")
        private java.util.List < Certificates> certificates;

        @com.aliyun.core.annotation.NameInMap("KeyPair")
        private KeyPair keyPair;

        private Result(Builder builder) {
            this.certificates = builder.certificates;
            this.keyPair = builder.keyPair;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return certificates
         */
        public java.util.List < Certificates> getCertificates() {
            return this.certificates;
        }

        /**
         * @return keyPair
         */
        public KeyPair getKeyPair() {
            return this.keyPair;
        }

        public static final class Builder {
            private java.util.List < Certificates> certificates; 
            private KeyPair keyPair; 

            /**
             * Certificates.
             */
            public Builder certificates(java.util.List < Certificates> certificates) {
                this.certificates = certificates;
                return this;
            }

            /**
             * KeyPair.
             */
            public Builder keyPair(KeyPair keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
