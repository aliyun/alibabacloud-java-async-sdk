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
 * {@link UpdateAirflowRequest} extends {@link RequestModel}
 *
 * <p>UpdateAirflowRequest</p>
 */
public class UpdateAirflowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AirflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String airflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AirflowName")
    private String airflowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSpec")
    private String appSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagsDir")
    private String dagsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginsDir")
    private String pluginsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequirementFile")
    private String requirementFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartupFile")
    private String startupFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerServerlessReplicas")
    private Integer workerServerlessReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateAirflowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.airflowId = builder.airflowId;
        this.airflowName = builder.airflowName;
        this.appSpec = builder.appSpec;
        this.clientToken = builder.clientToken;
        this.dagsDir = builder.dagsDir;
        this.description = builder.description;
        this.pluginsDir = builder.pluginsDir;
        this.requirementFile = builder.requirementFile;
        this.startupFile = builder.startupFile;
        this.workerServerlessReplicas = builder.workerServerlessReplicas;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAirflowRequest create() {
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
     * @return airflowName
     */
    public String getAirflowName() {
        return this.airflowName;
    }

    /**
     * @return appSpec
     */
    public String getAppSpec() {
        return this.appSpec;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dagsDir
     */
    public String getDagsDir() {
        return this.dagsDir;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return pluginsDir
     */
    public String getPluginsDir() {
        return this.pluginsDir;
    }

    /**
     * @return requirementFile
     */
    public String getRequirementFile() {
        return this.requirementFile;
    }

    /**
     * @return startupFile
     */
    public String getStartupFile() {
        return this.startupFile;
    }

    /**
     * @return workerServerlessReplicas
     */
    public Integer getWorkerServerlessReplicas() {
        return this.workerServerlessReplicas;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateAirflowRequest, Builder> {
        private String regionId; 
        private String airflowId; 
        private String airflowName; 
        private String appSpec; 
        private String clientToken; 
        private String dagsDir; 
        private String description; 
        private String pluginsDir; 
        private String requirementFile; 
        private String startupFile; 
        private Integer workerServerlessReplicas; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAirflowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.airflowId = request.airflowId;
            this.airflowName = request.airflowName;
            this.appSpec = request.appSpec;
            this.clientToken = request.clientToken;
            this.dagsDir = request.dagsDir;
            this.description = request.description;
            this.pluginsDir = request.pluginsDir;
            this.requirementFile = request.requirementFile;
            this.startupFile = request.startupFile;
            this.workerServerlessReplicas = request.workerServerlessReplicas;
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
         * <p>af-test****</p>
         */
        public Builder airflowId(String airflowId) {
            this.putQueryParameter("AirflowId", airflowId);
            this.airflowId = airflowId;
            return this;
        }

        /**
         * AirflowName.
         */
        public Builder airflowName(String airflowName) {
            this.putQueryParameter("AirflowName", airflowName);
            this.airflowName = airflowName;
            return this;
        }

        /**
         * AppSpec.
         */
        public Builder appSpec(String appSpec) {
            this.putQueryParameter("AppSpec", appSpec);
            this.appSpec = appSpec;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DagsDir.
         */
        public Builder dagsDir(String dagsDir) {
            this.putQueryParameter("DagsDir", dagsDir);
            this.dagsDir = dagsDir;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * PluginsDir.
         */
        public Builder pluginsDir(String pluginsDir) {
            this.putQueryParameter("PluginsDir", pluginsDir);
            this.pluginsDir = pluginsDir;
            return this;
        }

        /**
         * RequirementFile.
         */
        public Builder requirementFile(String requirementFile) {
            this.putQueryParameter("RequirementFile", requirementFile);
            this.requirementFile = requirementFile;
            return this;
        }

        /**
         * StartupFile.
         */
        public Builder startupFile(String startupFile) {
            this.putQueryParameter("StartupFile", startupFile);
            this.startupFile = startupFile;
            return this;
        }

        /**
         * WorkerServerlessReplicas.
         */
        public Builder workerServerlessReplicas(Integer workerServerlessReplicas) {
            this.putQueryParameter("WorkerServerlessReplicas", workerServerlessReplicas);
            this.workerServerlessReplicas = workerServerlessReplicas;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>863024238280****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateAirflowRequest build() {
            return new UpdateAirflowRequest(this);
        } 

    } 

}
