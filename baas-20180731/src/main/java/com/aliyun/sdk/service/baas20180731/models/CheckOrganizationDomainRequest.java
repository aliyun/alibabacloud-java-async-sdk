// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckOrganizationDomainRequest} extends {@link RequestModel}
 *
 * <p>CheckOrganizationDomainRequest</p>
 */
public class CheckOrganizationDomainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    private String domainCode;

    private CheckOrganizationDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.domainCode = builder.domainCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckOrganizationDomainRequest create() {
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

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    public static final class Builder extends Request.Builder<CheckOrganizationDomainRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String domainCode; 

        private Builder() {
            super();
        } 

        private Builder(CheckOrganizationDomainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.domainCode = request.domainCode;
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

        @Override
        public CheckOrganizationDomainRequest build() {
            return new CheckOrganizationDomainRequest(this);
        } 

    } 

}
