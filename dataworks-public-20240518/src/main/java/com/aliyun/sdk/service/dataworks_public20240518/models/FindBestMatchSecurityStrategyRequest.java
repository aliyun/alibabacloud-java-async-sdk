// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link FindBestMatchSecurityStrategyRequest} extends {@link RequestModel}
 *
 * <p>FindBestMatchSecurityStrategyRequest</p>
 */
public class FindBestMatchSecurityStrategyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlModule")
    private String controlModule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ControlSubModule")
    private String controlSubModule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private FindBestMatchSecurityStrategyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.controlModule = builder.controlModule;
        this.controlSubModule = builder.controlSubModule;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindBestMatchSecurityStrategyRequest create() {
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
     * @return controlModule
     */
    public String getControlModule() {
        return this.controlModule;
    }

    /**
     * @return controlSubModule
     */
    public String getControlSubModule() {
        return this.controlSubModule;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<FindBestMatchSecurityStrategyRequest, Builder> {
        private String regionId; 
        private String controlModule; 
        private String controlSubModule; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(FindBestMatchSecurityStrategyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.controlModule = request.controlModule;
            this.controlSubModule = request.controlSubModule;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ControlModule.
         */
        public Builder controlModule(String controlModule) {
            this.putQueryParameter("ControlModule", controlModule);
            this.controlModule = controlModule;
            return this;
        }

        /**
         * ControlSubModule.
         */
        public Builder controlSubModule(String controlSubModule) {
            this.putQueryParameter("ControlSubModule", controlSubModule);
            this.controlSubModule = controlSubModule;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public FindBestMatchSecurityStrategyRequest build() {
            return new FindBestMatchSecurityStrategyRequest(this);
        } 

    } 

}
