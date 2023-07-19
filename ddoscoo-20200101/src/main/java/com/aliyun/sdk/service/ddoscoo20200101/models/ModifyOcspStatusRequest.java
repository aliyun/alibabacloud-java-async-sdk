// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOcspStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyOcspStatusRequest</p>
 */
public class ModifyOcspStatusRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private Integer enable;

    private ModifyOcspStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOcspStatusRequest create() {
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
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
    }

    public static final class Builder extends Request.Builder<ModifyOcspStatusRequest, Builder> {
        private String regionId; 
        private String domain; 
        private Integer enable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOcspStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.enable = request.enable;
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
         * The domain name for which you want to configure the Static Page Caching policy.
         * <p>
         * 
         * > You can call the [DescribeDomains](~~91724~~) operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Specifies whether to enable the OCSP feature. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        @Override
        public ModifyOcspStatusRequest build() {
            return new ModifyOcspStatusRequest(this);
        } 

    } 

}
