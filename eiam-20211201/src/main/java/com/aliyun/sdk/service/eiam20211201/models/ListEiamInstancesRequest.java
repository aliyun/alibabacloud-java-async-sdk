// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEiamInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListEiamInstancesRequest</p>
 */
public class ListEiamInstancesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("InstanceRegionId")
    @Validation(maxLength = 32)
    private String instanceRegionId;

    private ListEiamInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceIds = builder.instanceIds;
        this.instanceRegionId = builder.instanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEiamInstancesRequest create() {
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceRegionId
     */
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public static final class Builder extends Request.Builder<ListEiamInstancesRequest, Builder> {
        private String regionId; 
        private java.util.List < String > instanceIds; 
        private String instanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEiamInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceIds = request.instanceIds;
            this.instanceRegionId = request.instanceRegionId;
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
         * 实例ID列表，支持0到100个
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * 实例所属Region
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        @Override
        public ListEiamInstancesRequest build() {
            return new ListEiamInstancesRequest(this);
        } 

    } 

}
