// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMessageRequest} extends {@link RequestModel}
 *
 * <p>RegisterMessageRequest</p>
 */
public class RegisterMessageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Extensions")
    private String extensions;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("PropertyAffiliation")
    @Validation(required = true)
    private Integer propertyAffiliation;

    @Query
    @NameInMap("PropertyName")
    @Validation(required = true)
    private String propertyName;

    @Query
    @NameInMap("PropertyPrivateIp")
    private String propertyPrivateIp;

    @Query
    @NameInMap("PropertyPublicIp")
    private String propertyPublicIp;

    @Query
    @NameInMap("PropertyUuid")
    @Validation(required = true)
    private String propertyUuid;

    private RegisterMessageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.extensions = builder.extensions;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.propertyAffiliation = builder.propertyAffiliation;
        this.propertyName = builder.propertyName;
        this.propertyPrivateIp = builder.propertyPrivateIp;
        this.propertyPublicIp = builder.propertyPublicIp;
        this.propertyUuid = builder.propertyUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return propertyAffiliation
     */
    public Integer getPropertyAffiliation() {
        return this.propertyAffiliation;
    }

    /**
     * @return propertyName
     */
    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * @return propertyPrivateIp
     */
    public String getPropertyPrivateIp() {
        return this.propertyPrivateIp;
    }

    /**
     * @return propertyPublicIp
     */
    public String getPropertyPublicIp() {
        return this.propertyPublicIp;
    }

    /**
     * @return propertyUuid
     */
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    public static final class Builder extends Request.Builder<RegisterMessageRequest, Builder> {
        private String regionId; 
        private String extensions; 
        private String instanceId; 
        private String instanceType; 
        private Integer propertyAffiliation; 
        private String propertyName; 
        private String propertyPrivateIp; 
        private String propertyPublicIp; 
        private String propertyUuid; 

        private Builder() {
            super();
        } 

        private Builder(RegisterMessageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.extensions = request.extensions;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.propertyAffiliation = request.propertyAffiliation;
            this.propertyName = request.propertyName;
            this.propertyPrivateIp = request.propertyPrivateIp;
            this.propertyPublicIp = request.propertyPublicIp;
            this.propertyUuid = request.propertyUuid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Extensions.
         */
        public Builder extensions(String extensions) {
            this.putQueryParameter("Extensions", extensions);
            this.extensions = extensions;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * PropertyAffiliation.
         */
        public Builder propertyAffiliation(Integer propertyAffiliation) {
            this.putQueryParameter("PropertyAffiliation", propertyAffiliation);
            this.propertyAffiliation = propertyAffiliation;
            return this;
        }

        /**
         * PropertyName.
         */
        public Builder propertyName(String propertyName) {
            this.putQueryParameter("PropertyName", propertyName);
            this.propertyName = propertyName;
            return this;
        }

        /**
         * PropertyPrivateIp.
         */
        public Builder propertyPrivateIp(String propertyPrivateIp) {
            this.putQueryParameter("PropertyPrivateIp", propertyPrivateIp);
            this.propertyPrivateIp = propertyPrivateIp;
            return this;
        }

        /**
         * PropertyPublicIp.
         */
        public Builder propertyPublicIp(String propertyPublicIp) {
            this.putQueryParameter("PropertyPublicIp", propertyPublicIp);
            this.propertyPublicIp = propertyPublicIp;
            return this;
        }

        /**
         * PropertyUuid.
         */
        public Builder propertyUuid(String propertyUuid) {
            this.putQueryParameter("PropertyUuid", propertyUuid);
            this.propertyUuid = propertyUuid;
            return this;
        }

        @Override
        public RegisterMessageRequest build() {
            return new RegisterMessageRequest(this);
        } 

    } 

}
