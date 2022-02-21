// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFabricOrganizationDomainRequest} extends {@link RequestModel}
 *
 * <p>CheckFabricOrganizationDomainRequest</p>
 */
public class CheckFabricOrganizationDomainRequest extends Request {
    @Body
    @NameInMap("Domain")
    private String domain;

    @Body
    @NameInMap("DomainCode")
    private String domainCode;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CheckFabricOrganizationDomainRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.domainCode = builder.domainCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFabricOrganizationDomainRequest create() {
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
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CheckFabricOrganizationDomainRequest, Builder> {
        private String domain; 
        private String domainCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckFabricOrganizationDomainRequest response) {
            super(response);
            this.domain = response.domain;
            this.domainCode = response.domainCode;
            this.regionId = response.regionId;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * DomainCode.
         */
        public Builder domainCode(String domainCode) {
            this.putBodyParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
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
        public CheckFabricOrganizationDomainRequest build() {
            return new CheckFabricOrganizationDomainRequest(this);
        } 

    } 

}
