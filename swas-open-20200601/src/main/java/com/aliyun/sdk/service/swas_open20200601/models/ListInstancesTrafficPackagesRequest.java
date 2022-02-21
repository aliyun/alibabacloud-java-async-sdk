// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesTrafficPackagesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesTrafficPackagesRequest</p>
 */
public class ListInstancesTrafficPackagesRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListInstancesTrafficPackagesRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesTrafficPackagesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListInstancesTrafficPackagesRequest, Builder> {
        private String instanceIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesTrafficPackagesRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
            this.regionId = response.regionId;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
        public ListInstancesTrafficPackagesRequest build() {
            return new ListInstancesTrafficPackagesRequest(this);
        } 

    } 

}
