// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretRotationPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecretRotationPolicyRequest</p>
 */
public class UpdateSecretRotationPolicyRequest extends Request {
    @Query
    @NameInMap("EnableAutomaticRotation")
    @Validation(required = true)
    private Boolean enableAutomaticRotation;

    @Query
    @NameInMap("RotationInterval")
    private String rotationInterval;

    @Query
    @NameInMap("SecretName")
    @Validation(required = true)
    private String secretName;

    private UpdateSecretRotationPolicyRequest(Builder builder) {
        super(builder);
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.rotationInterval = builder.rotationInterval;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretRotationPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableAutomaticRotation
     */
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    public static final class Builder extends Request.Builder<UpdateSecretRotationPolicyRequest, Builder> {
        private Boolean enableAutomaticRotation; 
        private String rotationInterval; 
        private String secretName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecretRotationPolicyRequest response) {
            super(response);
            this.enableAutomaticRotation = response.enableAutomaticRotation;
            this.rotationInterval = response.rotationInterval;
            this.secretName = response.secretName;
        } 

        /**
         * EnableAutomaticRotation.
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * RotationInterval.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        @Override
        public UpdateSecretRotationPolicyRequest build() {
            return new UpdateSecretRotationPolicyRequest(this);
        } 

    } 

}
