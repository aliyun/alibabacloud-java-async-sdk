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

        private Builder(UpdateSecretRotationPolicyRequest request) {
            super(request);
            this.enableAutomaticRotation = request.enableAutomaticRotation;
            this.rotationInterval = request.rotationInterval;
            this.secretName = request.secretName;
        } 

        /**
         * Specifies whether to enable automatic rotation. Valid values:
         * <p>
         * 
         * *   true: enables automatic rotation.
         * *   false: does not enable automatic rotation. This is the default value.
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * The interval for automatic rotation. Valid values: 6 hours to 8,760 hours (365 days).
         * <p>
         * 
         * The value is in the `integer[unit]` format.````
         * 
         * The unit can be d (day), h (hour), m (minute), or s (second). For example, both 7d and 604800s indicate a seven-day interval.
         * 
         * >  This parameter is required if you set the EnableAutomaticRotation parameter to true. This parameter is ignored if you set the EnableAutomaticRotation parameter to false or does not specify the EnableAutomaticRotation parameter.
         */
        public Builder rotationInterval(String rotationInterval) {
            this.putQueryParameter("RotationInterval", rotationInterval);
            this.rotationInterval = rotationInterval;
            return this;
        }

        /**
         * The name of the secret.
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
