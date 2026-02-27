// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link UpdateKMSEncryptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateKMSEncryptionRequest</p>
 */
public class UpdateKMSEncryptionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable_encryption")
    private Boolean disableEncryption;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kms_key_id")
    private String kmsKeyId;

    private UpdateKMSEncryptionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.disableEncryption = builder.disableEncryption;
        this.kmsKeyId = builder.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKMSEncryptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return disableEncryption
     */
    public Boolean getDisableEncryption() {
        return this.disableEncryption;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public static final class Builder extends Request.Builder<UpdateKMSEncryptionRequest, Builder> {
        private String clusterId; 
        private Boolean disableEncryption; 
        private String kmsKeyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKMSEncryptionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.disableEncryption = request.disableEncryption;
            this.kmsKeyId = request.kmsKeyId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c4fe1e3a721544***</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * disable_encryption.
         */
        public Builder disableEncryption(Boolean disableEncryption) {
            this.putBodyParameter("disable_encryption", disableEncryption);
            this.disableEncryption = disableEncryption;
            return this;
        }

        /**
         * kms_key_id.
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putBodyParameter("kms_key_id", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        @Override
        public UpdateKMSEncryptionRequest build() {
            return new UpdateKMSEncryptionRequest(this);
        } 

    } 

}
