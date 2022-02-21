// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateKeyRequest</p>
 */
public class CreateKeyRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableAutomaticRotation")
    private Boolean enableAutomaticRotation;

    @Query
    @NameInMap("KeySpec")
    private String keySpec;

    @Query
    @NameInMap("KeyUsage")
    private String keyUsage;

    @Query
    @NameInMap("Origin")
    private String origin;

    @Query
    @NameInMap("ProtectionLevel")
    private String protectionLevel;

    @Query
    @NameInMap("RotationInterval")
    private String rotationInterval;

    private CreateKeyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.enableAutomaticRotation = builder.enableAutomaticRotation;
        this.keySpec = builder.keySpec;
        this.keyUsage = builder.keyUsage;
        this.origin = builder.origin;
        this.protectionLevel = builder.protectionLevel;
        this.rotationInterval = builder.rotationInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAutomaticRotation
     */
    public Boolean getEnableAutomaticRotation() {
        return this.enableAutomaticRotation;
    }

    /**
     * @return keySpec
     */
    public String getKeySpec() {
        return this.keySpec;
    }

    /**
     * @return keyUsage
     */
    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return protectionLevel
     */
    public String getProtectionLevel() {
        return this.protectionLevel;
    }

    /**
     * @return rotationInterval
     */
    public String getRotationInterval() {
        return this.rotationInterval;
    }

    public static final class Builder extends Request.Builder<CreateKeyRequest, Builder> {
        private String description; 
        private Boolean enableAutomaticRotation; 
        private String keySpec; 
        private String keyUsage; 
        private String origin; 
        private String protectionLevel; 
        private String rotationInterval; 

        private Builder() {
            super();
        } 

        private Builder(CreateKeyRequest response) {
            super(response);
            this.description = response.description;
            this.enableAutomaticRotation = response.enableAutomaticRotation;
            this.keySpec = response.keySpec;
            this.keyUsage = response.keyUsage;
            this.origin = response.origin;
            this.protectionLevel = response.protectionLevel;
            this.rotationInterval = response.rotationInterval;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * KeySpec.
         */
        public Builder keySpec(String keySpec) {
            this.putQueryParameter("KeySpec", keySpec);
            this.keySpec = keySpec;
            return this;
        }

        /**
         * KeyUsage.
         */
        public Builder keyUsage(String keyUsage) {
            this.putQueryParameter("KeyUsage", keyUsage);
            this.keyUsage = keyUsage;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * ProtectionLevel.
         */
        public Builder protectionLevel(String protectionLevel) {
            this.putQueryParameter("ProtectionLevel", protectionLevel);
            this.protectionLevel = protectionLevel;
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
        public CreateKeyRequest build() {
            return new CreateKeyRequest(this);
        } 

    } 

}
