// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDCdnDomainSchdmByPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyDCdnDomainSchdmByPropertyRequest</p>
 */
public class ModifyDCdnDomainSchdmByPropertyRequest extends Request {
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

    private ModifyDCdnDomainSchdmByPropertyRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.property = builder.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDCdnDomainSchdmByPropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ModifyDCdnDomainSchdmByPropertyRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String property; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDCdnDomainSchdmByPropertyRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.property = response.property;
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
        public ModifyDCdnDomainSchdmByPropertyRequest build() {
            return new ModifyDCdnDomainSchdmByPropertyRequest(this);
        } 

    } 

}
