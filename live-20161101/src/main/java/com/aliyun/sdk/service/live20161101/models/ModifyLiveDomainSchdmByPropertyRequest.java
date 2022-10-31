// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLiveDomainSchdmByPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyLiveDomainSchdmByPropertyRequest</p>
 */
public class ModifyLiveDomainSchdmByPropertyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Property")
    @Validation(required = true)
    private String property;

    private ModifyLiveDomainSchdmByPropertyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.property = builder.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveDomainSchdmByPropertyRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    public static final class Builder extends Request.Builder<ModifyLiveDomainSchdmByPropertyRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private Long ownerId; 
        private String property; 

        private Builder() {
            super();
        } 

        private Builder(ModifyLiveDomainSchdmByPropertyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.property = request.property;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Property.
         */
        public Builder property(String property) {
            this.putQueryParameter("Property", property);
            this.property = property;
            return this;
        }

        @Override
        public ModifyLiveDomainSchdmByPropertyRequest build() {
            return new ModifyLiveDomainSchdmByPropertyRequest(this);
        } 

    } 

}
