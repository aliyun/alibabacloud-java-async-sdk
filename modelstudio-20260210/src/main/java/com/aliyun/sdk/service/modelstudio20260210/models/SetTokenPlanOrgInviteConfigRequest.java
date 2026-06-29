// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link SetTokenPlanOrgInviteConfigRequest} extends {@link RequestModel}
 *
 * <p>SetTokenPlanOrgInviteConfigRequest</p>
 */
public class SetTokenPlanOrgInviteConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRoleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultRoleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SeatAssignStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String seatAssignStrategy;

    private SetTokenPlanOrgInviteConfigRequest(Builder builder) {
        super(builder);
        this.defaultRoleId = builder.defaultRoleId;
        this.seatAssignStrategy = builder.seatAssignStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTokenPlanOrgInviteConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultRoleId
     */
    public String getDefaultRoleId() {
        return this.defaultRoleId;
    }

    /**
     * @return seatAssignStrategy
     */
    public String getSeatAssignStrategy() {
        return this.seatAssignStrategy;
    }

    public static final class Builder extends Request.Builder<SetTokenPlanOrgInviteConfigRequest, Builder> {
        private String defaultRoleId; 
        private String seatAssignStrategy; 

        private Builder() {
            super();
        } 

        private Builder(SetTokenPlanOrgInviteConfigRequest request) {
            super(request);
            this.defaultRoleId = request.defaultRoleId;
            this.seatAssignStrategy = request.seatAssignStrategy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ORG_MEMBER</p>
         */
        public Builder defaultRoleId(String defaultRoleId) {
            this.putQueryParameter("DefaultRoleId", defaultRoleId);
            this.defaultRoleId = defaultRoleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder seatAssignStrategy(String seatAssignStrategy) {
            this.putQueryParameter("SeatAssignStrategy", seatAssignStrategy);
            this.seatAssignStrategy = seatAssignStrategy;
            return this;
        }

        @Override
        public SetTokenPlanOrgInviteConfigRequest build() {
            return new SetTokenPlanOrgInviteConfigRequest(this);
        } 

    } 

}
