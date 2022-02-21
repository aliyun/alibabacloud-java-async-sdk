// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCnameReuseRequest} extends {@link RequestModel}
 *
 * <p>ModifyCnameReuseRequest</p>
 */
public class ModifyCnameReuseRequest extends Request {
    @Query
    @NameInMap("Cname")
    private String cname;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private Integer enable;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyCnameReuseRequest(Builder builder) {
        super(builder);
        this.cname = builder.cname;
        this.domain = builder.domain;
        this.enable = builder.enable;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCnameReuseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cname
     */
    public String getCname() {
        return this.cname;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyCnameReuseRequest, Builder> {
        private String cname; 
        private String domain; 
        private Integer enable; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCnameReuseRequest response) {
            super(response);
            this.cname = response.cname;
            this.domain = response.domain;
            this.enable = response.enable;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * Cname.
         */
        public Builder cname(String cname) {
            this.putQueryParameter("Cname", cname);
            this.cname = cname;
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
         * Enable.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyCnameReuseRequest build() {
            return new ModifyCnameReuseRequest(this);
        } 

    } 

}
