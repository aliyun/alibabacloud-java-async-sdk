// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ApplyServerSideEncryptionByDefault} extends {@link TeaModel}
 *
 * <p>ApplyServerSideEncryptionByDefault</p>
 */
public class ApplyServerSideEncryptionByDefault extends TeaModel {
    @NameInMap("SSEAlgorithm")
    private String SSEAlgorithm;

    @NameInMap("KMSMasterKeyID")
    private String KMSMasterKeyID;

    @NameInMap("KMSDataEncryption")
    private String KMSDataEncryption;


    private ApplyServerSideEncryptionByDefault(Builder builder) {
        this.SSEAlgorithm = builder.SSEAlgorithm;
        this.KMSMasterKeyID = builder.KMSMasterKeyID;
        this.KMSDataEncryption = builder.KMSDataEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyServerSideEncryptionByDefault create() {
        return builder().build();
    }

    /**
     * @return SSEAlgorithm
     */
    public String SSEAlgorithm() {
        return this.SSEAlgorithm;
    }

    /**
     * @return KMSMasterKeyID
     */
    public String KMSMasterKeyID() {
        return this.KMSMasterKeyID;
    }

    /**
     * @return KMSDataEncryption
     */
    public String KMSDataEncryption() {
        return this.KMSDataEncryption;
    }

    public static final class Builder {
        private String SSEAlgorithm; 
        private String KMSMasterKeyID; 
        private String KMSDataEncryption; 

        /**
         * <p>description</p>
         */
        public Builder SSEAlgorithm(String SSEAlgorithm) {
            this.SSEAlgorithm = SSEAlgorithm;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder KMSMasterKeyID(String KMSMasterKeyID) {
            this.KMSMasterKeyID = KMSMasterKeyID;
            return this;
        }

        /**
         * <p>description</p>
         */
        public Builder KMSDataEncryption(String KMSDataEncryption) {
            this.KMSDataEncryption = KMSDataEncryption;
            return this;
        }

        public ApplyServerSideEncryptionByDefault build() {
            return new ApplyServerSideEncryptionByDefault(this);
        } 

    } 

}
