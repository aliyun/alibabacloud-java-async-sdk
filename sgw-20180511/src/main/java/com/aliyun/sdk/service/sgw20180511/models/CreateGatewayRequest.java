// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayRequest</p>
 */
public class CreateGatewayRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GatewayClass")
    private String gatewayClass;

    @Query
    @NameInMap("Location")
    @Validation(required = true)
    private String location;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PostPaid")
    private Boolean postPaid;

    @Query
    @NameInMap("PublicNetworkBandwidth")
    private Integer publicNetworkBandwidth;

    @Query
    @NameInMap("ReleaseAfterExpiration")
    private Boolean releaseAfterExpiration;

    @Query
    @NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @Query
    @NameInMap("SecondaryVSwitchId")
    private String secondaryVSwitchId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StorageBundleId")
    @Validation(required = true)
    private String storageBundleId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Query
    @NameInMap("UntrustedEnvId")
    private String untrustedEnvId;

    @Query
    @NameInMap("UntrustedEnvInstanceType")
    private String untrustedEnvInstanceType;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateGatewayRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.gatewayClass = builder.gatewayClass;
        this.location = builder.location;
        this.name = builder.name;
        this.postPaid = builder.postPaid;
        this.publicNetworkBandwidth = builder.publicNetworkBandwidth;
        this.releaseAfterExpiration = builder.releaseAfterExpiration;
        this.resourceRegionId = builder.resourceRegionId;
        this.secondaryVSwitchId = builder.secondaryVSwitchId;
        this.securityToken = builder.securityToken;
        this.storageBundleId = builder.storageBundleId;
        this.type = builder.type;
        this.untrustedEnvId = builder.untrustedEnvId;
        this.untrustedEnvInstanceType = builder.untrustedEnvInstanceType;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayRequest create() {
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
     * @return gatewayClass
     */
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return postPaid
     */
    public Boolean getPostPaid() {
        return this.postPaid;
    }

    /**
     * @return publicNetworkBandwidth
     */
    public Integer getPublicNetworkBandwidth() {
        return this.publicNetworkBandwidth;
    }

    /**
     * @return releaseAfterExpiration
     */
    public Boolean getReleaseAfterExpiration() {
        return this.releaseAfterExpiration;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return secondaryVSwitchId
     */
    public String getSecondaryVSwitchId() {
        return this.secondaryVSwitchId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return storageBundleId
     */
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return untrustedEnvId
     */
    public String getUntrustedEnvId() {
        return this.untrustedEnvId;
    }

    /**
     * @return untrustedEnvInstanceType
     */
    public String getUntrustedEnvInstanceType() {
        return this.untrustedEnvInstanceType;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateGatewayRequest, Builder> {
        private String description; 
        private String gatewayClass; 
        private String location; 
        private String name; 
        private Boolean postPaid; 
        private Integer publicNetworkBandwidth; 
        private Boolean releaseAfterExpiration; 
        private String resourceRegionId; 
        private String secondaryVSwitchId; 
        private String securityToken; 
        private String storageBundleId; 
        private String type; 
        private String untrustedEnvId; 
        private String untrustedEnvInstanceType; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayRequest request) {
            super(request);
            this.description = request.description;
            this.gatewayClass = request.gatewayClass;
            this.location = request.location;
            this.name = request.name;
            this.postPaid = request.postPaid;
            this.publicNetworkBandwidth = request.publicNetworkBandwidth;
            this.releaseAfterExpiration = request.releaseAfterExpiration;
            this.resourceRegionId = request.resourceRegionId;
            this.secondaryVSwitchId = request.secondaryVSwitchId;
            this.securityToken = request.securityToken;
            this.storageBundleId = request.storageBundleId;
            this.type = request.type;
            this.untrustedEnvId = request.untrustedEnvId;
            this.untrustedEnvInstanceType = request.untrustedEnvInstanceType;
            this.vSwitchId = request.vSwitchId;
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
         * GatewayClass.
         */
        public Builder gatewayClass(String gatewayClass) {
            this.putQueryParameter("GatewayClass", gatewayClass);
            this.gatewayClass = gatewayClass;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PostPaid.
         */
        public Builder postPaid(Boolean postPaid) {
            this.putQueryParameter("PostPaid", postPaid);
            this.postPaid = postPaid;
            return this;
        }

        /**
         * PublicNetworkBandwidth.
         */
        public Builder publicNetworkBandwidth(Integer publicNetworkBandwidth) {
            this.putQueryParameter("PublicNetworkBandwidth", publicNetworkBandwidth);
            this.publicNetworkBandwidth = publicNetworkBandwidth;
            return this;
        }

        /**
         * ReleaseAfterExpiration.
         */
        public Builder releaseAfterExpiration(Boolean releaseAfterExpiration) {
            this.putQueryParameter("ReleaseAfterExpiration", releaseAfterExpiration);
            this.releaseAfterExpiration = releaseAfterExpiration;
            return this;
        }

        /**
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * SecondaryVSwitchId.
         */
        public Builder secondaryVSwitchId(String secondaryVSwitchId) {
            this.putQueryParameter("SecondaryVSwitchId", secondaryVSwitchId);
            this.secondaryVSwitchId = secondaryVSwitchId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StorageBundleId.
         */
        public Builder storageBundleId(String storageBundleId) {
            this.putQueryParameter("StorageBundleId", storageBundleId);
            this.storageBundleId = storageBundleId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UntrustedEnvId.
         */
        public Builder untrustedEnvId(String untrustedEnvId) {
            this.putQueryParameter("UntrustedEnvId", untrustedEnvId);
            this.untrustedEnvId = untrustedEnvId;
            return this;
        }

        /**
         * UntrustedEnvInstanceType.
         */
        public Builder untrustedEnvInstanceType(String untrustedEnvInstanceType) {
            this.putQueryParameter("UntrustedEnvInstanceType", untrustedEnvInstanceType);
            this.untrustedEnvInstanceType = untrustedEnvInstanceType;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateGatewayRequest build() {
            return new CreateGatewayRequest(this);
        } 

    } 

}
