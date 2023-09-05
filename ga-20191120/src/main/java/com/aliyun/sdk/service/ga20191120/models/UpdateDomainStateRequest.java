// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainStateRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainStateRequest</p>
 */
public class UpdateDomainStateRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private UpdateDomainStateRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainStateRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDomainStateRequest, Builder> {
        private String domain; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainStateRequest request) {
            super(request);
            this.domain = request.domain;
            this.regionId = request.regionId;
        } 

        /**
         * The accelerated domain name whose ICP filing status you want to update.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateDomainStateRequest build() {
            return new UpdateDomainStateRequest(this);
        } 

    } 

}
