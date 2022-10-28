// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLakeHouseSpaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteLakeHouseSpaceRequest</p>
 */
public class DeleteLakeHouseSpaceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SpaceId")
    @Validation(required = true)
    private Long spaceId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private DeleteLakeHouseSpaceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.spaceId = builder.spaceId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLakeHouseSpaceRequest create() {
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
     * @return spaceId
     */
    public Long getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<DeleteLakeHouseSpaceRequest, Builder> {
        private String regionId; 
        private Long spaceId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLakeHouseSpaceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.spaceId = request.spaceId;
            this.tid = request.tid;
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
         * SpaceId.
         */
        public Builder spaceId(Long spaceId) {
            this.putQueryParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public DeleteLakeHouseSpaceRequest build() {
            return new DeleteLakeHouseSpaceRequest(this);
        } 

    } 

}
