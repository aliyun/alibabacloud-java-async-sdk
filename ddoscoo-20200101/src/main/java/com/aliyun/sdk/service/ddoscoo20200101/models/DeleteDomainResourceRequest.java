// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainResourceRequest</p>
 */
public class DeleteDomainResourceRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteDomainResourceRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDomainResourceRequest, Builder> {
        private String domain; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainResourceRequest response) {
            super(response);
            this.domain = response.domain;
            this.regionId = response.regionId;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDomainResourceRequest build() {
            return new DeleteDomainResourceRequest(this);
        } 

    } 

}
