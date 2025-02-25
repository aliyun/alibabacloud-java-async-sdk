// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateUserGroupSwitchRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserGroupSwitchRequest</p>
 */
public class UpdateUserGroupSwitchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupId;

    private UpdateUserGroupSwitchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.active = builder.active;
        this.opTenantId = builder.opTenantId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserGroupSwitchRequest create() {
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
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateUserGroupSwitchRequest, Builder> {
        private String regionId; 
        private Boolean active; 
        private Long opTenantId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserGroupSwitchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.active = request.active;
            this.opTenantId = request.opTenantId;
            this.userGroupId = request.userGroupId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder active(Boolean active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31323</p>
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public UpdateUserGroupSwitchRequest build() {
            return new UpdateUserGroupSwitchRequest(this);
        } 

    } 

}
