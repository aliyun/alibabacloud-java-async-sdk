// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAccessModeRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebAccessModeRequest</p>
 */
public class ModifyWebAccessModeRequest extends Request {
    @Query
    @NameInMap("AccessMode")
    @Validation(required = true)
    private Integer accessMode;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyWebAccessModeRequest(Builder builder) {
        super(builder);
        this.accessMode = builder.accessMode;
        this.domain = builder.domain;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebAccessModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessMode
     */
    public Integer getAccessMode() {
        return this.accessMode;
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

    public static final class Builder extends Request.Builder<ModifyWebAccessModeRequest, Builder> {
        private Integer accessMode; 
        private String domain; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebAccessModeRequest response) {
            super(response);
            this.accessMode = response.accessMode;
            this.domain = response.domain;
            this.regionId = response.regionId;
        } 

        /**
         * AccessMode.
         */
        public Builder accessMode(Integer accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyWebAccessModeRequest build() {
            return new ModifyWebAccessModeRequest(this);
        } 

    } 

}
