// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRotationPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateRotationPolicyRequest</p>
 */
public class UpdateRotationPolicyRequest extends Request {
    @Query
    @NameInMap("EnableAutomaticRotation")
    @Validation(required = true)
    private Boolean enableAutomaticRotation;

    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("RotationInterval")
    private String rotationInterval;

    private UpdateRotationPolicyRequest(Builder builder) {
        super(builder);
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.keyId = builder.keyId;
        this.rotationInterval = builder.rotationInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRotationPolicyRequest create() {
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
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public static final class Builder extends Request.Builder<UpdateRotationPolicyRequest, Builder> {
        private Boolean enableAutomaticRotation; 
        private String keyId; 
        private String rotationInterval; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRotationPolicyRequest response) {
            super(response);
            this.enableAutomaticRotation = response.enableAutomaticRotation;
            this.keyId = response.keyId;
            this.rotationInterval = response.rotationInterval;
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
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
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

        @Override
        public UpdateRotationPolicyRequest build() {
            return new UpdateRotationPolicyRequest(this);
        } 

    } 

}
