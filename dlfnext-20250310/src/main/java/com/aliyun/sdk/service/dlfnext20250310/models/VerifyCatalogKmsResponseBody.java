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
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * hint.
         */
        public Builder hint(String hint) {
            this.hint = hint;
            return this;
        }

        /**
         * kmsKeyId.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * serverSideEncryption.
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * success.
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
