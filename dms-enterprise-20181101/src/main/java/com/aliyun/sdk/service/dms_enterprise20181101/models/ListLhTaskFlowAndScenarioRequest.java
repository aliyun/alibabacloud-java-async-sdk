// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLhTaskFlowAndScenarioRequest} extends {@link RequestModel}
 *
 * <p>ListLhTaskFlowAndScenarioRequest</p>
 */
public class ListLhTaskFlowAndScenarioRequest extends Request {
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

    @Query
    @NameInMap("UserId")
    private Long userId;

    private ListLhTaskFlowAndScenarioRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.spaceId = builder.spaceId;
        this.tid = builder.tid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLhTaskFlowAndScenarioRequest create() {
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

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListLhTaskFlowAndScenarioRequest, Builder> {
        private String regionId; 
        private Long spaceId; 
        private Long tid; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(ListLhTaskFlowAndScenarioRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.spaceId = request.spaceId;
            this.tid = request.tid;
            this.userId = request.userId;
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

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListLhTaskFlowAndScenarioRequest build() {
            return new ListLhTaskFlowAndScenarioRequest(this);
        } 

    } 

}
