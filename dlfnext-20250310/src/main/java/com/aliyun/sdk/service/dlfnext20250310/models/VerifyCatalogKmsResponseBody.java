// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link VerifyCatalogKmsResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCatalogKmsResponseBody</p>
 */
public class VerifyCatalogKmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("hint")
    private String hint;

    @com.aliyun.core.annotation.NameInMap("kmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.NameInMap("serverSideEncryption")
    private String serverSideEncryption;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private VerifyCatalogKmsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.hint = builder.hint;
        this.kmsKeyId = builder.kmsKeyId;
        this.serverSideEncryption = builder.serverSideEncryption;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCatalogKmsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return hint
     */
    public String getHint() {
        return this.hint;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return serverSideEncryption
     */
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String hint; 
        private String kmsKeyId; 
        private String serverSideEncryption; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VerifyCatalogKmsResponseBody model) {
            this.errorCode = model.errorCode;
            this.hint = model.hint;
            this.kmsKeyId = model.kmsKeyId;
            this.serverSideEncryption = model.serverSideEncryption;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned when the validation fails. An empty string is returned when the validation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyNotFound</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The description of the failure cause and remediation suggestions returned when the validation fails. An empty string is returned when the validation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter KMS keyId is not found.</p>
         */
        public Builder hint(String hint) {
            this.hint = hint;
            return this;
        }

        /**
         * <p>The KMS key identifier actually used by the probe object. When the validation is successful, this corresponds to the customer master key (CMK) specified in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1234567890abcdef</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The server-side encryption method actually used by the probe object. Returns KMS when the validation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>KMS</p>
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * <p>Indicates whether the validation is successful. A value of true indicates that the write probe succeeded and the SSE-KMS configuration of the object meets expectations. A value of false indicates that the validation failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public VerifyCatalogKmsResponseBody build() {
            return new VerifyCatalogKmsResponseBody(this);
        } 

    } 

}
