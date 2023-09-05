// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainRequest</p>
 */
public class UpdateDomainRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetDomain")
    @Validation(required = true)
    private String targetDomain;

    private UpdateDomainRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.regionId = builder.regionId;
        this.targetDomain = builder.targetDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainRequest create() {
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

    /**
     * @return targetDomain
     */
    public String getTargetDomain() {
        return this.targetDomain;
    }

    public static final class Builder extends Request.Builder<UpdateDomainRequest, Builder> {
        private String domain; 
        private String regionId; 
        private String targetDomain; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRequest request) {
            super(request);
            this.domain = request.domain;
            this.regionId = request.regionId;
            this.targetDomain = request.targetDomain;
        } 

        /**
         * The new accelerated domain name.
         * <p>
         * 
         * Only primary domain names are supported, such as `example.net`.
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

        /**
         * The accelerated domain name to be modified.
         */
        public Builder targetDomain(String targetDomain) {
            this.putQueryParameter("TargetDomain", targetDomain);
            this.targetDomain = targetDomain;
            return this;
        }

        @Override
        public UpdateDomainRequest build() {
            return new UpdateDomainRequest(this);
        } 

    } 

}
