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

        private Builder(UpdateRotationPolicyRequest request) {
            super(request);
            this.enableAutomaticRotation = request.enableAutomaticRotation;
            this.keyId = request.keyId;
            this.rotationInterval = request.rotationInterval;
        } 

        /**
         * Specifies whether to enable automatic key rotation. Valid values:
         * <p>
         * 
         * *   true: enables automatic key rotation.
         * *   false: disables automatic key rotation.
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * The ID of the customer master key (CMK). The ID must be globally unique.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * The period of automatic key rotation. Specify the value in the integer\[unit] format. The following units are supported: d (day), h (hour), m (minute), and s (second). For example, you can use either 7d or 604800s to specify a seven-day period. The period can range from 7 days to 730 days.
         * <p>
         * 
         * >  If you set the EnableAutomaticRotation parameter to true, you must also specify this parameter. If you set the EnableAutomaticRotation parameter to false, you can leave this parameter unspecified.
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
