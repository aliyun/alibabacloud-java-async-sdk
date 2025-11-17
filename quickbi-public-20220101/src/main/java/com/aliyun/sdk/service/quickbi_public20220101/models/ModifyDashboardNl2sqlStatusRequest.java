// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ModifyDashboardNl2sqlStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyDashboardNl2sqlStatusRequest</p>
 */
public class ModifyDashboardNl2sqlStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashboardIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dashboardIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer status;

    private ModifyDashboardNl2sqlStatusRequest(Builder builder) {
        super(builder);
        this.dashboardIds = builder.dashboardIds;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDashboardNl2sqlStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dashboardIds
     */
    public String getDashboardIds() {
        return this.dashboardIds;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyDashboardNl2sqlStatusRequest, Builder> {
        private String dashboardIds; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDashboardNl2sqlStatusRequest request) {
            super(request);
            this.dashboardIds = request.dashboardIds;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asda,sadaf</p>
         */
        public Builder dashboardIds(String dashboardIds) {
            this.putQueryParameter("DashboardIds", dashboardIds);
            this.dashboardIds = dashboardIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyDashboardNl2sqlStatusRequest build() {
            return new ModifyDashboardNl2sqlStatusRequest(this);
        } 

    } 

}
