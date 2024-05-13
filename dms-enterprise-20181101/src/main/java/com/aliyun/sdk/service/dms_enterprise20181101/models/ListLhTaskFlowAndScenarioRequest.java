// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLhTaskFlowAndScenarioRequest} extends {@link RequestModel}
 *
 * <p>ListLhTaskFlowAndScenarioRequest</p>
 */
public class ListLhTaskFlowAndScenarioRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long spaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
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
         * The ID of the workspace. You can call the [GetLhSpaceByName](~~424379~~) operation to obtain the workspace ID.
         */
        public Builder spaceId(Long spaceId) {
            this.putQueryParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The ID of the user. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
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
