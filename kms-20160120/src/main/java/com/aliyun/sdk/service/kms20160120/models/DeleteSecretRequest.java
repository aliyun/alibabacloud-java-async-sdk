// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link DeleteSecretRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecretRequest</p>
 */
public class DeleteSecretRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDeleteWithoutRecovery")
    private String forceDeleteWithoutRecovery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryWindowInDays")
    private String recoveryWindowInDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    private DeleteSecretRequest(Builder builder) {
        super(builder);
        this.forceDeleteWithoutRecovery = builder.forceDeleteWithoutRecovery;
        this.recoveryWindowInDays = builder.recoveryWindowInDays;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDeleteWithoutRecovery
     */
    public String getForceDeleteWithoutRecovery() {
        return this.forceDeleteWithoutRecovery;
    }

    /**
     * @return recoveryWindowInDays
     */
    public String getRecoveryWindowInDays() {
        return this.recoveryWindowInDays;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<DeleteSecretRequest, Builder> {
        private String forceDeleteWithoutRecovery; 
        private String recoveryWindowInDays; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecretRequest request) {
            super(request);
            this.forceDeleteWithoutRecovery = request.forceDeleteWithoutRecovery;
            this.recoveryWindowInDays = request.recoveryWindowInDays;
            this.secretName = request.secretName;
        } 

        /**
         * <p>Specifies whether to forcibly delete the secret. If this parameter is set to true, the secret cannot be recovered.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default value)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceDeleteWithoutRecovery(String forceDeleteWithoutRecovery) {
            this.putQueryParameter("ForceDeleteWithoutRecovery", forceDeleteWithoutRecovery);
            this.forceDeleteWithoutRecovery = forceDeleteWithoutRecovery;
            return this;
        }

        /**
         * <p>Specifies the recovery period of the secret if you do not forcibly delete it. Default value: 30. Unit: Days.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recoveryWindowInDays(String recoveryWindowInDays) {
            this.putQueryParameter("RecoveryWindowInDays", recoveryWindowInDays);
            this.recoveryWindowInDays = recoveryWindowInDays;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        @Override
        public DeleteSecretRequest build() {
            return new DeleteSecretRequest(this);
        } 

    } 

}
