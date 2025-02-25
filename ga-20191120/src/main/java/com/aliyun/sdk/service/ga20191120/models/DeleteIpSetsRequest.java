// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpSetsRequest} extends {@link RequestModel}
 *
 * <p>DeleteIpSetsRequest</p>
 */
public class DeleteIpSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSetIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ipSetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteIpSetsRequest request) {
            super(request);
            this.ipSetIds = request.ipSetIds;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the acceleration regions that you want to delete.
         */
        public Builder ipSetIds(java.util.List < String > ipSetIds) {
            this.putQueryParameter("IpSetIds", ipSetIds);
            this.ipSetIds = ipSetIds;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
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
