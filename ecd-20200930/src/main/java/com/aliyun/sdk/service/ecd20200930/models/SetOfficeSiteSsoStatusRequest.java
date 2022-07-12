// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetOfficeSiteSsoStatusRequest} extends {@link RequestModel}
 *
 * <p>SetOfficeSiteSsoStatusRequest</p>
 */
public class SetOfficeSiteSsoStatusRequest extends Request {
    @Query
    @NameInMap("EnableSso")
    @Validation(required = true)
    private Boolean enableSso;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SetOfficeSiteSsoStatusRequest(Builder builder) {
        super(builder);
        this.enableSso = builder.enableSso;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetOfficeSiteSsoStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableSso
     */
    public Boolean getEnableSso() {
        return this.enableSso;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetOfficeSiteSsoStatusRequest, Builder> {
        private Boolean enableSso; 
        private String officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetOfficeSiteSsoStatusRequest request) {
            super(request);
            this.enableSso = request.enableSso;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * EnableSso.
         */
        public Builder enableSso(Boolean enableSso) {
            this.putQueryParameter("EnableSso", enableSso);
            this.enableSso = enableSso;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetOfficeSiteSsoStatusRequest build() {
            return new SetOfficeSiteSsoStatusRequest(this);
        } 

    } 

}
