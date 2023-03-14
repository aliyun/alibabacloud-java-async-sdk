// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFullLogTtlRequest} extends {@link RequestModel}
 *
 * <p>ModifyFullLogTtlRequest</p>
 */
public class ModifyFullLogTtlRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Ttl")
    @Validation(required = true)
    private Integer ttl;

    private ModifyFullLogTtlRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.lang = builder.lang;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceIp = builder.sourceIp;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
    }

    public static final class Builder extends Request.Builder<ModifyFullLogTtlRequest, Builder> {
        private String regionId; 
        private String lang; 
        private String resourceGroupId; 
        private String sourceIp; 
        private Integer ttl; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFullLogTtlRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.lang = request.lang;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceIp = request.sourceIp;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Ttl.
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
