// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ConfigAirflowRequest} extends {@link RequestModel}
 *
 * <p>ConfigAirflowRequest</p>
 */
public class ConfigAirflowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AirflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String airflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomAirflowCfg")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> customAirflowCfg;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ConfigAirflowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.airflowId = builder.airflowId;
        this.customAirflowCfg = builder.customAirflowCfg;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigAirflowRequest create() {
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
     * @return airflowId
     */
    public String getAirflowId() {
        return this.airflowId;
    }

    /**
     * @return customAirflowCfg
     */
    public java.util.List<String> getCustomAirflowCfg() {
        return this.customAirflowCfg;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ConfigAirflowRequest, Builder> {
        private String regionId; 
        private String airflowId; 
        private java.util.List<String> customAirflowCfg; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigAirflowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.airflowId = request.airflowId;
            this.customAirflowCfg = request.customAirflowCfg;
            this.workspaceId = request.workspaceId;
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
         * <p>af-b3a7f110a6vmvn7xxxxxx</p>
         */
        public Builder airflowId(String airflowId) {
            this.putQueryParameter("AirflowId", airflowId);
            this.airflowId = airflowId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder customAirflowCfg(java.util.List<String> customAirflowCfg) {
            String customAirflowCfgShrink = shrink(customAirflowCfg, "CustomAirflowCfg", "simple");
            this.putQueryParameter("CustomAirflowCfg", customAirflowCfgShrink);
            this.customAirflowCfg = customAirflowCfg;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8630242382****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ConfigAirflowRequest build() {
            return new ConfigAirflowRequest(this);
        } 

    } 

}
