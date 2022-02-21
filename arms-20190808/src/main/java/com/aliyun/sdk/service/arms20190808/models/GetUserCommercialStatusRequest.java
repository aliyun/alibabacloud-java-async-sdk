// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserCommercialStatusRequest} extends {@link RequestModel}
 *
 * <p>GetUserCommercialStatusRequest</p>
 */
public class GetUserCommercialStatusRequest extends Request {
    @Query
    @NameInMap("ParentId")
    private String parentId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TargetUserId")
    private String targetUserId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private GetUserCommercialStatusRequest(Builder builder) {
        super(builder);
        this.parentId = builder.parentId;
        this.regionId = builder.regionId;
        this.targetUserId = builder.targetUserId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserCommercialStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetUserCommercialStatusRequest, Builder> {
        private String parentId; 
        private String regionId; 
        private String targetUserId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserCommercialStatusRequest response) {
            super(response);
            this.parentId = response.parentId;
            this.regionId = response.regionId;
            this.targetUserId = response.targetUserId;
            this.userId = response.userId;
        } 

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
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

        /**
         * TargetUserId.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetUserCommercialStatusRequest build() {
            return new GetUserCommercialStatusRequest(this);
        } 

    } 

}
