// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStudioLayoutsRequest} extends {@link RequestModel}
 *
 * <p>DescribeStudioLayoutsRequest</p>
 */
public class DescribeStudioLayoutsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("LayoutId")
    private String layoutId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeStudioLayoutsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.casterId = builder.casterId;
        this.layoutId = builder.layoutId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStudioLayoutsRequest create() {
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
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return layoutId
     */
    public String getLayoutId() {
        return this.layoutId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeStudioLayoutsRequest, Builder> {
        private String regionId; 
        private String casterId; 
        private String layoutId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStudioLayoutsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.casterId = request.casterId;
            this.layoutId = request.layoutId;
            this.ownerId = request.ownerId;
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
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * LayoutId.
         */
        public Builder layoutId(String layoutId) {
            this.putQueryParameter("LayoutId", layoutId);
            this.layoutId = layoutId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeStudioLayoutsRequest build() {
            return new DescribeStudioLayoutsRequest(this);
        } 

    } 

}
