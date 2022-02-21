// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainRequest} extends {@link RequestModel}
 *
 * <p>AddDomainRequest</p>
 */
public class AddDomainRequest extends Request {
    @Query
    @NameInMap("BusinessType")
    @Validation(required = true)
    private String businessType;

    @Query
    @NameInMap("DemoUrls")
    private String demoUrls;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("LiveFormat")
    private String liveFormat;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SliceDomain")
    private String sliceDomain;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private AddDomainRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.demoUrls = builder.demoUrls;
        this.domain = builder.domain;
        this.liveFormat = builder.liveFormat;
        this.region = builder.region;
        this.securityToken = builder.securityToken;
        this.sliceDomain = builder.sliceDomain;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return demoUrls
     */
    public String getDemoUrls() {
        return this.demoUrls;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return liveFormat
     */
    public String getLiveFormat() {
        return this.liveFormat;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sliceDomain
     */
    public String getSliceDomain() {
        return this.sliceDomain;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<AddDomainRequest, Builder> {
        private String businessType; 
        private String demoUrls; 
        private String domain; 
        private String liveFormat; 
        private String region; 
        private String securityToken; 
        private String sliceDomain; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(AddDomainRequest response) {
            super(response);
            this.businessType = response.businessType;
            this.demoUrls = response.demoUrls;
            this.domain = response.domain;
            this.liveFormat = response.liveFormat;
            this.region = response.region;
            this.securityToken = response.securityToken;
            this.sliceDomain = response.sliceDomain;
            this.version = response.version;
        } 

        /**
         * BusinessType.
         */
        public Builder businessType(String businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * DemoUrls.
         */
        public Builder demoUrls(String demoUrls) {
            this.putQueryParameter("DemoUrls", demoUrls);
            this.demoUrls = demoUrls;
            return this;
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
         * LiveFormat.
         */
        public Builder liveFormat(String liveFormat) {
            this.putQueryParameter("LiveFormat", liveFormat);
            this.liveFormat = liveFormat;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
         * SliceDomain.
         */
        public Builder sliceDomain(String sliceDomain) {
            this.putQueryParameter("SliceDomain", sliceDomain);
            this.sliceDomain = sliceDomain;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public AddDomainRequest build() {
            return new AddDomainRequest(this);
        } 

    } 

}
