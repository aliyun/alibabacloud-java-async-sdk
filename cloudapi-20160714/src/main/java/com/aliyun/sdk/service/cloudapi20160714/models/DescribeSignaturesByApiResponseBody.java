// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSignaturesByApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSignaturesByApiResponseBody</p>
 */
public class DescribeSignaturesByApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signatures")
    private Signatures signatures;

    private DescribeSignaturesByApiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.signatures = builder.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSignaturesByApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signatures
     */
    public Signatures getSignatures() {
        return this.signatures;
    }

    public static final class Builder {
        private String requestId; 
        private Signatures signatures; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned signature key information. It is an array consisting of SignatureItem data.
         */
        public Builder signatures(Signatures signatures) {
            this.signatures = signatures;
            return this;
        }

        public DescribeSignaturesByApiResponseBody build() {
            return new DescribeSignaturesByApiResponseBody(this);
        } 

    } 

    public static class SignatureItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundTime")
        private String boundTime;

        @com.aliyun.core.annotation.NameInMap("SignatureId")
        private String signatureId;

        @com.aliyun.core.annotation.NameInMap("SignatureName")
        private String signatureName;

        private SignatureItem(Builder builder) {
            this.boundTime = builder.boundTime;
            this.signatureId = builder.signatureId;
            this.signatureName = builder.signatureName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignatureItem create() {
            return builder().build();
        }

        /**
         * @return boundTime
         */
        public String getBoundTime() {
            return this.boundTime;
        }

        /**
         * @return signatureId
         */
        public String getSignatureId() {
            return this.signatureId;
        }

        /**
         * @return signatureName
         */
        public String getSignatureName() {
            return this.signatureName;
        }

        public static final class Builder {
            private String boundTime; 
            private String signatureId; 
            private String signatureName; 

            /**
             * The time when the key was bound.
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * The ID of the backend signature key.
             */
            public Builder signatureId(String signatureId) {
                this.signatureId = signatureId;
                return this;
            }

            /**
             * The name of the backend signature key.
             */
            public Builder signatureName(String signatureName) {
                this.signatureName = signatureName;
                return this;
            }

            public SignatureItem build() {
                return new SignatureItem(this);
            } 

        } 

    }
    public static class Signatures extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SignatureItem")
        private java.util.List < SignatureItem> signatureItem;

        private Signatures(Builder builder) {
            this.signatureItem = builder.signatureItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Signatures create() {
            return builder().build();
        }

        /**
         * @return signatureItem
         */
        public java.util.List < SignatureItem> getSignatureItem() {
            return this.signatureItem;
        }

        public static final class Builder {
            private java.util.List < SignatureItem> signatureItem; 

            /**
             * SignatureItem.
             */
            public Builder signatureItem(java.util.List < SignatureItem> signatureItem) {
                this.signatureItem = signatureItem;
                return this;
            }

            public Signatures build() {
                return new Signatures(this);
            } 

        } 

    }
}
