// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOfficeSitesRequest} extends {@link RequestModel}
 *
 * <p>DeleteOfficeSitesRequest</p>
 */
public class DeleteOfficeSitesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteOfficeSitesRequest(Builder builder) {
        super(builder);
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOfficeSitesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return officeSiteId
     */
    public java.util.List < String > getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteOfficeSitesRequest, Builder> {
        private java.util.List < String > officeSiteId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOfficeSitesRequest request) {
            super(request);
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the office networks. You can specify 1 to 100 office networks.
         */
        public Builder officeSiteId(java.util.List < String > officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteOfficeSitesRequest build() {
            return new DeleteOfficeSitesRequest(this);
        } 

    } 

}
