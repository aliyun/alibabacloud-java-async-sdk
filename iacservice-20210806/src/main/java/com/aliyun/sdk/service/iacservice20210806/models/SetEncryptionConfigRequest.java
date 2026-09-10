// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link SetEncryptionConfigRequest} extends {@link RequestModel}
 *
 * <p>SetEncryptionConfigRequest</p>
 */
public class SetEncryptionConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kmsKeyId")
    private String kmsKeyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kmsRegionId")
    private String kmsRegionId;

    private SetEncryptionConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.kmsKeyId = builder.kmsKeyId;
        this.kmsRegionId = builder.kmsRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetEncryptionConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return kmsKeyId
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * @return kmsRegionId
     */
    public String getKmsRegionId() {
        return this.kmsRegionId;
    }

    public static final class Builder extends Request.Builder<SetEncryptionConfigRequest, Builder> {
        private String clientToken; 
        private String kmsKeyId; 
        private String kmsRegionId; 

        private Builder() {
            super();
        } 

        private Builder(SetEncryptionConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.kmsKeyId = request.kmsKeyId;
            this.kmsRegionId = request.kmsRegionId;
        } 

        /**
         * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the KMS key used for encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>09d0641c-e96c-495a-925e-9b50xxxxxxxx</p>
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.putBodyParameter("kmsKeyId", kmsKeyId);
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * <p>The region ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder kmsRegionId(String kmsRegionId) {
            this.putBodyParameter("kmsRegionId", kmsRegionId);
            this.kmsRegionId = kmsRegionId;
            return this;
        }

        @Override
        public SetEncryptionConfigRequest build() {
            return new SetEncryptionConfigRequest(this);
        } 

    } 

}
