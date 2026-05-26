// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link EncryptionConfig} extends {@link TeaModel}
 *
 * <p>EncryptionConfig</p>
 */
public class EncryptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyType")
    private String keyType;

    @com.aliyun.core.annotation.NameInMap("KmsKeyArn")
    private String kmsKeyArn;

    private EncryptionConfig(Builder builder) {
        this.keyType = builder.keyType;
        this.kmsKeyArn = builder.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptionConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * @return kmsKeyArn
     */
    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public static final class Builder {
        private String keyType; 
        private String kmsKeyArn; 

        private Builder() {
        } 

        private Builder(EncryptionConfig model) {
            this.keyType = model.keyType;
            this.kmsKeyArn = model.kmsKeyArn;
        } 

        /**
         * KeyType.
         */
        public Builder keyType(String keyType) {
            this.keyType = keyType;
            return this;
        }

        /**
         * KmsKeyArn.
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public EncryptionConfig build() {
            return new EncryptionConfig(this);
        } 

    } 

}
