// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpSetsRequest} extends {@link RequestModel}
 *
 * <p>DeleteIpSetsRequest</p>
 */
public class DeleteIpSetsRequest extends Request {
    @Query
    @NameInMap("IpSetIds")
    @Validation(required = true)
    private java.util.List < String > ipSetIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteIpSetsRequest(Builder builder) {
        super(builder);
        this.ipSetIds = builder.ipSetIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpSetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipSetIds
     */
    public java.util.List < String > getIpSetIds() {
        return this.ipSetIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteIpSetsRequest, Builder> {
        private java.util.List < String > ipSetIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIpSetsRequest response) {
            super(response);
            this.ipSetIds = response.ipSetIds;
            this.regionId = response.regionId;
        } 

        /**
         * IpSetIds.
         */
        public Builder ipSetIds(java.util.List < String > ipSetIds) {
            this.putQueryParameter("IpSetIds", ipSetIds);
            this.ipSetIds = ipSetIds;
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
        public DeleteIpSetsRequest build() {
            return new DeleteIpSetsRequest(this);
        } 

    } 

}
