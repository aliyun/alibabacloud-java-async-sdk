// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainRequest} extends {@link RequestModel}
 *
 * <p>CreateDomainRequest</p>
 */
public class CreateDomainRequest extends Request {
    @Query
    @NameInMap("AcceleratorIds")
    @Validation(required = true)
    private java.util.List < String > acceleratorIds;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateDomainRequest(Builder builder) {
        super(builder);
        this.acceleratorIds = builder.acceleratorIds;
        this.domain = builder.domain;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorIds
     */
    public java.util.List < String > getAcceleratorIds() {
        return this.acceleratorIds;
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

    public static final class Builder extends Request.Builder<CreateDomainRequest, Builder> {
        private java.util.List < String > acceleratorIds; 
        private String domain; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDomainRequest request) {
            super(request);
            this.acceleratorIds = request.acceleratorIds;
            this.domain = request.domain;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the GA instance.
         * <p>
         * 
         * You can enter up to 50 IDs.
         */
        public Builder acceleratorIds(java.util.List < String > acceleratorIds) {
            this.putQueryParameter("AcceleratorIds", acceleratorIds);
            this.acceleratorIds = acceleratorIds;
            return this;
        }

        /**
         * The accelerated domain name to be added.
         * <p>
         * 
         * Wildcard domain names are supported. A wildcard domain name must start with `*.`, such as `*.example.com`.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDomainRequest build() {
            return new CreateDomainRequest(this);
        } 

    } 

}
