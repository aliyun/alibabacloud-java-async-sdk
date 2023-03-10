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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    private DeleteDomainResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    public static final class Builder extends Request.Builder<DeleteDomainResourceRequest, Builder> {
        private String regionId; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
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
         * The domain name for which the forwarding rule is configured.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public DeleteDomainResourceRequest build() {
            return new DeleteDomainResourceRequest(this);
        } 

    } 

}
