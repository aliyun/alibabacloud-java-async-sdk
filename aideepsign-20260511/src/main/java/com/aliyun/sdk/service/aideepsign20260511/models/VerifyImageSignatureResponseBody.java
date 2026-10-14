// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link VerifyImageSignatureResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyImageSignatureResponseBody</p>
 */
public class VerifyImageSignatureResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Issuer")
    private Issuer issuer;

    @com.aliyun.core.annotation.NameInMap("IssuerTrusted")
    private Boolean issuerTrusted;

    @com.aliyun.core.annotation.NameInMap("Manifest")
    private Manifest manifest;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VerificationState")
    private String verificationState;

    private VerifyImageSignatureResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.issuer = builder.issuer;
        this.issuerTrusted = builder.issuerTrusted;
        this.manifest = builder.manifest;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.verificationState = builder.verificationState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyImageSignatureResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return issuer
     */
    public Issuer getIssuer() {
        return this.issuer;
    }

    /**
     * @return issuerTrusted
     */
    public Boolean getIssuerTrusted() {
        return this.issuerTrusted;
    }

    /**
     * @return manifest
     */
    public Manifest getManifest() {
        return this.manifest;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return verificationState
     */
    public String getVerificationState() {
        return this.verificationState;
    }

    public static final class Builder {
        private String code; 
        private Long httpStatusCode; 
        private Issuer issuer; 
        private Boolean issuerTrusted; 
        private Manifest manifest; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String verificationState; 

        private Builder() {
        } 

        private Builder(VerifyImageSignatureResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.issuer = model.issuer;
            this.issuerTrusted = model.issuerTrusted;
            this.manifest = model.manifest;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.verificationState = model.verificationState;
        } 

        /**
         * <p>The business error code. The value &quot;OK&quot; is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. The value <code>200</code> is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The issuer information.</p>
         */
        public Builder issuer(Issuer issuer) {
            this.issuer = issuer;
            return this;
        }

        /**
         * <p>Indicates whether the issuer is trusted. A value of true indicates that the issuer certificate is issued by a trusted certification authority (CA).</p>
         */
        public Builder issuerTrusted(Boolean issuerTrusted) {
            this.issuerTrusted = issuerTrusted;
            return this;
        }

        /**
         * <p>The content credentials manifest information. This parameter is returned only when the image contains a C2PA signature.</p>
         */
        public Builder manifest(Manifest manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
         * <p>The additional information. The value <code>success</code> is returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The signature verification status. Valid values:</p>
         * <ul>
         * <li>Unsigned: The image does not contain C2PA data.</li>
         * <li>Invalid: The signature, data hash, or C2PA structure is invalid.</li>
         * <li>Valid: The signature and data hash are valid, but the issuer is not necessarily trusted.</li>
         * <li>Trusted: The signature is valid and the issuer certificate is trusted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Valid</p>
         */
        public Builder verificationState(String verificationState) {
            this.verificationState = verificationState;
            return this;
        }

        public VerifyImageSignatureResponseBody build() {
            return new VerifyImageSignatureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyImageSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyImageSignatureResponseBody</p>
     */
    public static class Issuer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommonName")
        private String commonName;

        @com.aliyun.core.annotation.NameInMap("Organization")
        private String organization;

        private Issuer(Builder builder) {
            this.commonName = builder.commonName;
            this.organization = builder.organization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issuer create() {
            return builder().build();
        }

        /**
         * @return commonName
         */
        public String getCommonName() {
            return this.commonName;
        }

        /**
         * @return organization
         */
        public String getOrganization() {
            return this.organization;
        }

        public static final class Builder {
            private String commonName; 
            private String organization; 

            private Builder() {
            } 

            private Builder(Issuer model) {
                this.commonName = model.commonName;
                this.organization = model.organization;
            } 

            /**
             * <p>The common name (CN) of the issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>AIDeepSign User Certificate</p>
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * <p>The organization name (O) of the issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud</p>
             */
            public Builder organization(String organization) {
                this.organization = organization;
                return this;
            }

            public Issuer build() {
                return new Issuer(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyImageSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyImageSignatureResponseBody</p>
     */
    public static class Assertions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        private Assertions(Builder builder) {
            this.data = builder.data;
            this.label = builder.label;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assertions create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        public static final class Builder {
            private String data; 
            private String label; 

            private Builder() {
            } 

            private Builder(Assertions model) {
                this.data = model.data;
                this.label = model.label;
            } 

            /**
             * <p>The assertion data, which is detailed metadata in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;actions&quot;:[{&quot;action&quot;:&quot;c2pa.created&quot;}]}</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The assertion label, such as c2pa.actions or stds.exif.</p>
             * 
             * <strong>example:</strong>
             * <p>c2pa.actions</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            public Assertions build() {
                return new Assertions(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyImageSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyImageSignatureResponseBody</p>
     */
    public static class SignatureInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alg")
        private String alg;

        @com.aliyun.core.annotation.NameInMap("Issuer")
        private String issuer;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private SignatureInfo(Builder builder) {
            this.alg = builder.alg;
            this.issuer = builder.issuer;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignatureInfo create() {
            return builder().build();
        }

        /**
         * @return alg
         */
        public String getAlg() {
            return this.alg;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String alg; 
            private String issuer; 
            private String time; 

            private Builder() {
            } 

            private Builder(SignatureInfo model) {
                this.alg = model.alg;
                this.issuer = model.issuer;
                this.time = model.time;
            } 

            /**
             * <p>The signature algorithm, such as <code>ps256</code> or <code>es256</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ps256</p>
             */
            public Builder alg(String alg) {
                this.alg = alg;
                return this;
            }

            /**
             * <p>The distinguished name (DN) of the signing certificate issuer.</p>
             * 
             * <strong>example:</strong>
             * <p>CN=AIDeepSign CA,O=Alibaba Cloud</p>
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            /**
             * <p>The signing time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-18T10:30:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public SignatureInfo build() {
                return new SignatureInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link VerifyImageSignatureResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyImageSignatureResponseBody</p>
     */
    public static class Manifest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assertions")
        private java.util.List<Assertions> assertions;

        @com.aliyun.core.annotation.NameInMap("SignatureInfo")
        private SignatureInfo signatureInfo;

        private Manifest(Builder builder) {
            this.assertions = builder.assertions;
            this.signatureInfo = builder.signatureInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Manifest create() {
            return builder().build();
        }

        /**
         * @return assertions
         */
        public java.util.List<Assertions> getAssertions() {
            return this.assertions;
        }

        /**
         * @return signatureInfo
         */
        public SignatureInfo getSignatureInfo() {
            return this.signatureInfo;
        }

        public static final class Builder {
            private java.util.List<Assertions> assertions; 
            private SignatureInfo signatureInfo; 

            private Builder() {
            } 

            private Builder(Manifest model) {
                this.assertions = model.assertions;
                this.signatureInfo = model.signatureInfo;
            } 

            /**
             * <p>The list of assertions, which contains metadata such as the provenance and editing history of the image.</p>
             */
            public Builder assertions(java.util.List<Assertions> assertions) {
                this.assertions = assertions;
                return this;
            }

            /**
             * <p>The signature details.</p>
             */
            public Builder signatureInfo(SignatureInfo signatureInfo) {
                this.signatureInfo = signatureInfo;
                return this;
            }

            public Manifest build() {
                return new Manifest(this);
            } 

        } 

    }
}
