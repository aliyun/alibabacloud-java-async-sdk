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
 * {@link UpdateRotationPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateRotationPolicyRequest</p>
 */
public class UpdateRotationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutomaticRotation")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableAutomaticRotation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RotationInterval")
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
         * <p>Specifies whether to enable automatic key rotation. Valid values:</p>
         * <ul>
         * <li>true: enables automatic key rotation.</li>
         * <li>false: disables automatic key rotation.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutomaticRotation(Boolean enableAutomaticRotation) {
            this.putQueryParameter("EnableAutomaticRotation", enableAutomaticRotation);
            this.enableAutomaticRotation = enableAutomaticRotation;
            return this;
        }

        /**
         * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abcd-12ab-34cd-56ef-12345678****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The period of automatic key rotation. Specify the value in the integer[unit] format. The following units are supported: d (day), h (hour), m (minute), and s (second). For example, you can use either 7d or 604800s to specify a seven-day period. The period can range from 7 days to 730 days.</p>
         * <blockquote>
         * <p> If you set the EnableAutomaticRotation parameter to true, you must also specify this parameter. If you set the EnableAutomaticRotation parameter to false, you can leave this parameter unspecified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30d</p>
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
