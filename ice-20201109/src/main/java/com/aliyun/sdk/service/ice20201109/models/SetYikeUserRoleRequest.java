// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetYikeUserRoleRequest} extends {@link RequestModel}
 *
 * <p>SetYikeUserRoleRequest</p>
 */
public class SetYikeUserRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YikeUserId")
    private String yikeUserId;

    private SetYikeUserRoleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleName = builder.roleName;
        this.yikeUserId = builder.yikeUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetYikeUserRoleRequest create() {
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return yikeUserId
     */
    public String getYikeUserId() {
        return this.yikeUserId;
    }

    public static final class Builder extends Request.Builder<SetYikeUserRoleRequest, Builder> {
        private String regionId; 
        private String roleName; 
        private String yikeUserId; 

        private Builder() {
            super();
        } 

        private Builder(SetYikeUserRoleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleName = request.roleName;
            this.yikeUserId = request.yikeUserId;
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
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * YikeUserId.
         */
        public Builder yikeUserId(String yikeUserId) {
            this.putQueryParameter("YikeUserId", yikeUserId);
            this.yikeUserId = yikeUserId;
            return this;
        }

        @Override
        public SetYikeUserRoleRequest build() {
            return new SetYikeUserRoleRequest(this);
        } 

    } 

}
