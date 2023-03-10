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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyCnameReuseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cname = builder.cname;
        this.domain = builder.domain;
        this.enable = builder.enable;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyCnameReuseRequest, Builder> {
        private String regionId; 
        private String cname; 
        private String domain; 
        private Integer enable; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCnameReuseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cname = request.cname;
            this.domain = request.domain;
            this.enable = request.enable;
            this.resourceGroupId = request.resourceGroupId;
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
         * The CNAME record that you want to reuse for the website.
         */
        public Builder cname(String cname) {
            this.putQueryParameter("Cname", cname);
            this.cname = cname;
            return this;
        }

        /**
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Specifies whether to enable CNAME reuse. Valid values:
         * <p>
         * 
         * *   **1**: enables CNAME reuse.
         * *   **2**: disables CNAME reuse.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
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
