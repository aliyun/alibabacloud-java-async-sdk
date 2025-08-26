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
 * {@link UpdateAirflowResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAirflowResponseBody</p>
 */
public class UpdateAirflowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private Root root;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateAirflowResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.root = builder.root;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAirflowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return root
     */
    public Root getRoot() {
        return this.root;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String errorCode; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Root root; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateAirflowResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.root = model.root;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Root.
         */
        public Builder root(Root root) {
            this.root = root;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateAirflowResponseBody build() {
            return new UpdateAirflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAirflowResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAirflowResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AirflowName")
        private String airflowName;

        @com.aliyun.core.annotation.NameInMap("AppSpec")
        private String appSpec;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("CustomAirflowCfg")
        private java.util.List<String> customAirflowCfg;

        @com.aliyun.core.annotation.NameInMap("DagsDir")
        private String dagsDir;

        @com.aliyun.core.annotation.NameInMap("DeployErrorMsg")
        private String deployErrorMsg;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Environments")
        private String environments;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("PluginsDir")
        private String pluginsDir;

        @com.aliyun.core.annotation.NameInMap("RequirementFile")
        private String requirementFile;

        @com.aliyun.core.annotation.NameInMap("Requirements")
        private String requirements;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("StartupFile")
        private String startupFile;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("WorkerServerlessReplicas")
        private Integer workerServerlessReplicas;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Root(Builder builder) {
            this.airflowName = builder.airflowName;
            this.appSpec = builder.appSpec;
            this.appType = builder.appType;
            this.customAirflowCfg = builder.customAirflowCfg;
            this.dagsDir = builder.dagsDir;
            this.deployErrorMsg = builder.deployErrorMsg;
            this.description = builder.description;
            this.environments = builder.environments;
            this.gmtCreated = builder.gmtCreated;
            this.ossBucketName = builder.ossBucketName;
            this.ossPath = builder.ossPath;
            this.pluginsDir = builder.pluginsDir;
            this.requirementFile = builder.requirementFile;
            this.requirements = builder.requirements;
            this.securityGroupId = builder.securityGroupId;
            this.startupFile = builder.startupFile;
            this.status = builder.status;
            this.uuid = builder.uuid;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.workerServerlessReplicas = builder.workerServerlessReplicas;
            this.workspaceId = builder.workspaceId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Root create() {
            return builder().build();
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
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return customAirflowCfg
         */
        public java.util.List<String> getCustomAirflowCfg() {
            return this.customAirflowCfg;
        }

        /**
         * @return dagsDir
         */
        public String getDagsDir() {
            return this.dagsDir;
        }

        /**
         * @return deployErrorMsg
         */
        public String getDeployErrorMsg() {
            return this.deployErrorMsg;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environments
         */
        public String getEnvironments() {
            return this.environments;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
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
         * @return requirements
         */
        public String getRequirements() {
            return this.requirements;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
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

        public static final class Builder {
            private String airflowName; 
            private String appSpec; 
            private String appType; 
            private java.util.List<String> customAirflowCfg; 
            private String dagsDir; 
            private String deployErrorMsg; 
            private String description; 
            private String environments; 
            private String gmtCreated; 
            private String ossBucketName; 
            private String ossPath; 
            private String pluginsDir; 
            private String requirementFile; 
            private String requirements; 
            private String securityGroupId; 
            private String startupFile; 
            private String status; 
            private String uuid; 
            private String vSwitchId; 
            private String vpcId; 
            private Integer workerServerlessReplicas; 
            private String workspaceId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.airflowName = model.airflowName;
                this.appSpec = model.appSpec;
                this.appType = model.appType;
                this.customAirflowCfg = model.customAirflowCfg;
                this.dagsDir = model.dagsDir;
                this.deployErrorMsg = model.deployErrorMsg;
                this.description = model.description;
                this.environments = model.environments;
                this.gmtCreated = model.gmtCreated;
                this.ossBucketName = model.ossBucketName;
                this.ossPath = model.ossPath;
                this.pluginsDir = model.pluginsDir;
                this.requirementFile = model.requirementFile;
                this.requirements = model.requirements;
                this.securityGroupId = model.securityGroupId;
                this.startupFile = model.startupFile;
                this.status = model.status;
                this.uuid = model.uuid;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.workerServerlessReplicas = model.workerServerlessReplicas;
                this.workspaceId = model.workspaceId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AirflowName.
             */
            public Builder airflowName(String airflowName) {
                this.airflowName = airflowName;
                return this;
            }

            /**
             * <p>SMALL。</p>
             * 
             * <strong>example:</strong>
             * <p>SMALL</p>
             */
            public Builder appSpec(String appSpec) {
                this.appSpec = appSpec;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * CustomAirflowCfg.
             */
            public Builder customAirflowCfg(java.util.List<String> customAirflowCfg) {
                this.customAirflowCfg = customAirflowCfg;
                return this;
            }

            /**
             * DagsDir.
             */
            public Builder dagsDir(String dagsDir) {
                this.dagsDir = dagsDir;
                return this;
            }

            /**
             * DeployErrorMsg.
             */
            public Builder deployErrorMsg(String deployErrorMsg) {
                this.deployErrorMsg = deployErrorMsg;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Environments.
             */
            public Builder environments(String environments) {
                this.environments = environments;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * OssBucketName.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * OssPath.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * PluginsDir.
             */
            public Builder pluginsDir(String pluginsDir) {
                this.pluginsDir = pluginsDir;
                return this;
            }

            /**
             * RequirementFile.
             */
            public Builder requirementFile(String requirementFile) {
                this.requirementFile = requirementFile;
                return this;
            }

            /**
             * Requirements.
             */
            public Builder requirements(String requirements) {
                this.requirements = requirements;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * StartupFile.
             */
            public Builder startupFile(String startupFile) {
                this.startupFile = startupFile;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp16ko44pgciwv0****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * WorkerServerlessReplicas.
             */
            public Builder workerServerlessReplicas(Integer workerServerlessReplicas) {
                this.workerServerlessReplicas = workerServerlessReplicas;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Root build() {
                return new Root(this);
            } 

        } 

    }
}
