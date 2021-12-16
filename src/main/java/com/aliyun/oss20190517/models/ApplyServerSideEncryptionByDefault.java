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
    @NameInMap("KMSDataEncryption")
    private String KMSDataEncryption;

    @NameInMap("KMSMasterKeyID")
    private String KMSMasterKeyID;

    @NameInMap("SSEAlgorithm")
    private String SSEAlgorithm;


    private ApplyServerSideEncryptionByDefault(Builder builder) {
        this.KMSDataEncryption = builder.KMSDataEncryption;
        this.KMSMasterKeyID = builder.KMSMasterKeyID;
        this.SSEAlgorithm = builder.SSEAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyServerSideEncryptionByDefault create() {
        return builder().build();
    }

    /**
     * @return KMSDataEncryption
     */
    public String getKMSDataEncryption() {
        return this.KMSDataEncryption;
    }

    /**
     * @return KMSMasterKeyID
     */
    public String getKMSMasterKeyID() {
        return this.KMSMasterKeyID;
    }

    /**
     * @return SSEAlgorithm
     */
    public String getSSEAlgorithm() {
        return this.SSEAlgorithm;
    }

    public static final class Builder {
        private String KMSDataEncryption; 
        private String KMSMasterKeyID; 
        private String SSEAlgorithm; 

        /**
         * <p>description</p>
         */
        public Builder KMSDataEncryption(String KMSDataEncryption) {
            this.KMSDataEncryption = KMSDataEncryption;
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
        public Builder SSEAlgorithm(String SSEAlgorithm) {
            this.SSEAlgorithm = SSEAlgorithm;
            return this;
        }

        public ApplyServerSideEncryptionByDefault build() {
            return new ApplyServerSideEncryptionByDefault(this);
        } 

    } 

}
