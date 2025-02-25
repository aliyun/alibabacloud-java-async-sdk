// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFullLogTtlRequest} extends {@link RequestModel}
 *
 * <p>ModifyFullLogTtlRequest</p>
 */
public class ModifyFullLogTtlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ttl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ttl;

    private ModifyFullLogTtlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.ttl = builder.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFullLogTtlRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<ModifyFullLogTtlRequest, Builder> {
        private String regionId; 
        private String resourceGroupId; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFullLogTtlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.ttl = request.ttl;
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
         * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The log storage duration of a website. Valid values: <strong>7</strong> to <strong>180</strong>. Unit: days.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ttl(Integer ttl) {
            this.putQueryParameter("Ttl", ttl);
            this.ttl = ttl;
            return this;
        }

        @Override
        public ModifyFullLogTtlRequest build() {
            return new ModifyFullLogTtlRequest(this);
        } 

    } 

}
