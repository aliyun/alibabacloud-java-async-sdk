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
 * {@link CreateAirflowRequest} extends {@link RequestModel}
 *
 * <p>CreateAirflowRequest</p>
 */
public class CreateAirflowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AirflowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String airflowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSpec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagsDir")
    private String dagsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginsDir")
    private String pluginsDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequirementFile")
    private String requirementFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartupFile")
    private String startupFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkerServerlessReplicas")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer workerServerlessReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateAirflowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.airflowName = builder.airflowName;
        this.appSpec = builder.appSpec;
        this.clientToken = builder.clientToken;
        this.dagsDir = builder.dagsDir;
        this.description = builder.description;
        this.ossBucketName = builder.ossBucketName;
        this.ossPath = builder.ossPath;
        this.pluginsDir = builder.pluginsDir;
        this.requirementFile = builder.requirementFile;
        this.securityGroupId = builder.securityGroupId;
        this.startupFile = builder.startupFile;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.workerServerlessReplicas = builder.workerServerlessReplicas;
        this.workspaceId = builder.workspaceId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAirflowRequest create() {
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
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossPath
     */
    public String getOssPath() {
        return this.ossPath;
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
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return startupFile
     */
    public String getStartupFile() {
        return this.startupFile;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateAirflowRequest, Builder> {
        private String regionId; 
        private String airflowName; 
        private String appSpec; 
        private String clientToken; 
        private String dagsDir; 
        private String description; 
        private String ossBucketName; 
        private String ossPath; 
        private String pluginsDir; 
        private String requirementFile; 
        private String securityGroupId; 
        private String startupFile; 
        private String vSwitchId; 
        private String vpcId; 
        private Integer workerServerlessReplicas; 
        private String workspaceId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAirflowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.airflowName = request.airflowName;
            this.appSpec = request.appSpec;
            this.clientToken = request.clientToken;
            this.dagsDir = request.dagsDir;
            this.description = request.description;
            this.ossBucketName = request.ossBucketName;
            this.ossPath = request.ossPath;
            this.pluginsDir = request.pluginsDir;
            this.requirementFile = request.requirementFile;
            this.securityGroupId = request.securityGroupId;
            this.startupFile = request.startupFile;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.workerServerlessReplicas = request.workerServerlessReplicas;
            this.workspaceId = request.workspaceId;
            this.zoneId = request.zoneId;
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
         * <p>testairflow</p>
         */
        public Builder airflowName(String airflowName) {
            this.putQueryParameter("AirflowName", airflowName);
            this.airflowName = airflowName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SMALL</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>order scheduler</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-test</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/airflow</p>
         */
        public Builder ossPath(String ossPath) {
            this.putQueryParameter("OssPath", ossPath);
            this.ossPath = ossPath;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp108t8ldzeyk1****</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vbaf073jawozfp****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>VPC ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf63r6coyiw9o5****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>8630242382****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateAirflowRequest build() {
            return new CreateAirflowRequest(this);
        } 

    } 

}
