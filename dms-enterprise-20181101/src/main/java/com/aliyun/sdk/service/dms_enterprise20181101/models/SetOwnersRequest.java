// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetOwnersRequest} extends {@link RequestModel}
 *
 * <p>SetOwnersRequest</p>
 */
public class SetOwnersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OwnerIds")
    @Validation(required = true)
    private String ownerIds;

    @Query
    @NameInMap("OwnerType")
    @Validation(required = true)
    private String ownerType;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private SetOwnersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerIds = builder.ownerIds;
        this.ownerType = builder.ownerType;
        this.resourceId = builder.resourceId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetOwnersRequest create() {
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
     * @return ownerIds
     */
    public String getOwnerIds() {
        return this.ownerIds;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<SetOwnersRequest, Builder> {
        private String regionId; 
        private String ownerIds; 
        private String ownerType; 
        private String resourceId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(SetOwnersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ownerIds = request.ownerIds;
            this.ownerType = request.ownerType;
            this.resourceId = request.resourceId;
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
         * OwnerIds.
         */
        public Builder ownerIds(String ownerIds) {
            this.putQueryParameter("OwnerIds", ownerIds);
            this.ownerIds = ownerIds;
            return this;
        }

        /**
         * OwnerType.
         */
        public Builder ownerType(String ownerType) {
            this.putQueryParameter("OwnerType", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
        public SetOwnersRequest build() {
            return new SetOwnersRequest(this);
        } 

    } 

}
