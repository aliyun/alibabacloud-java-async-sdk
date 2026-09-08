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
 * {@link GetAirflowResponseBody} extends {@link TeaModel}
 *
 * <p>GetAirflowResponseBody</p>
 */
public class GetAirflowResponseBody extends TeaModel {
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

    private GetAirflowResponseBody(Builder builder) {
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

    public static GetAirflowResponseBody create() {
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

        private Builder(GetAirflowResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.root = model.root;
            this.success = model.success;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_FOUND</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Unknown error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-CD3E-4D98-8264-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder root(Root root) {
            this.root = root;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. The following values are returned:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAirflowResponseBody build() {
            return new GetAirflowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAirflowResponseBody} extends {@link TeaModel}
     *
     * <p>GetAirflowResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AirflowId")
        private String airflowId;

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

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("PluginsDir")
        private String pluginsDir;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RequirementFile")
        private String requirementFile;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("StartupFile")
        private String startupFile;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

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
            this.airflowId = builder.airflowId;
            this.airflowName = builder.airflowName;
            this.appSpec = builder.appSpec;
            this.appType = builder.appType;
            this.customAirflowCfg = builder.customAirflowCfg;
            this.dagsDir = builder.dagsDir;
            this.deployErrorMsg = builder.deployErrorMsg;
            this.description = builder.description;
            this.gmtCreated = builder.gmtCreated;
            this.ossBucketName = builder.ossBucketName;
            this.ossPath = builder.ossPath;
            this.pluginsDir = builder.pluginsDir;
            this.regionId = builder.regionId;
            this.requirementFile = builder.requirementFile;
            this.securityGroupId = builder.securityGroupId;
            this.startupFile = builder.startupFile;
            this.status = builder.status;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String airflowId; 
            private String airflowName; 
            private String appSpec; 
            private String appType; 
            private java.util.List<String> customAirflowCfg; 
            private String dagsDir; 
            private String deployErrorMsg; 
            private String description; 
            private String gmtCreated; 
            private String ossBucketName; 
            private String ossPath; 
            private String pluginsDir; 
            private String regionId; 
            private String requirementFile; 
            private String securityGroupId; 
            private String startupFile; 
            private String status; 
            private String vSwitchId; 
            private String vpcId; 
            private Integer workerServerlessReplicas; 
            private String workspaceId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.airflowId = model.airflowId;
                this.airflowName = model.airflowName;
                this.appSpec = model.appSpec;
                this.appType = model.appType;
                this.customAirflowCfg = model.customAirflowCfg;
                this.dagsDir = model.dagsDir;
                this.deployErrorMsg = model.deployErrorMsg;
                this.description = model.description;
                this.gmtCreated = model.gmtCreated;
                this.ossBucketName = model.ossBucketName;
                this.ossPath = model.ossPath;
                this.pluginsDir = model.pluginsDir;
                this.regionId = model.regionId;
                this.requirementFile = model.requirementFile;
                this.securityGroupId = model.securityGroupId;
                this.startupFile = model.startupFile;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
                this.workerServerlessReplicas = model.workerServerlessReplicas;
                this.workspaceId = model.workspaceId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the Airflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>af-7a6ygsh80dx1jn****</p>
             */
            public Builder airflowId(String airflowId) {
                this.airflowId = airflowId;
                return this;
            }

            /**
             * <p>The name of the Airflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>testairflow</p>
             */
            public Builder airflowName(String airflowName) {
                this.airflowName = airflowName;
                return this;
            }

            /**
             * <p>The specifications of the Airflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>SMALL</p>
             */
            public Builder appSpec(String appSpec) {
                this.appSpec = appSpec;
                return this;
            }

            /**
             * <p>The application type.</p>
             * 
             * <strong>example:</strong>
             * <p>AIRFLOW</p>
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * <p>The custom configurations.</p>
             */
            public Builder customAirflowCfg(java.util.List<String> customAirflowCfg) {
                this.customAirflowCfg = customAirflowCfg;
                return this;
            }

            /**
             * <p>The DAG directory that Airflow scans.</p>
             * 
             * <strong>example:</strong>
             * <p>default/dags</p>
             */
            public Builder dagsDir(String dagsDir) {
                this.dagsDir = dagsDir;
                return this;
            }

            /**
             * <p>The deployment error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Deployed</p>
             */
            public Builder deployErrorMsg(String deployErrorMsg) {
                this.deployErrorMsg = deployErrorMsg;
                return this;
            }

            /**
             * <p>The description of the Airflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test airflow</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-08-12T05:46:01.000+0000</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>osstest</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>The OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p>/airflow</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * <p>The plugin directory that Airflow scans.</p>
             * 
             * <strong>example:</strong>
             * <p>default/plugins</p>
             */
            public Builder pluginsDir(String pluginsDir) {
                this.pluginsDir = pluginsDir;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The path to the Python dependencies file (requirements.txt).</p>
             * 
             * <strong>example:</strong>
             * <p>default/requirements.txt</p>
             */
            public Builder requirementFile(String requirementFile) {
                this.requirementFile = requirementFile;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-2ze9gj646bkv****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The startup script that runs before Airflow starts.</p>
             * 
             * <strong>example:</strong>
             * <p>default/startup.sh</p>
             */
            public Builder startupFile(String startupFile) {
                this.startupFile = startupFile;
                return this;
            }

            /**
             * <p>The status of the Airflow instance.</p>
             * 
             * <strong>example:</strong>
             * <p>DEPLOYED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1931trfxkvf74v****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zevqv4obraqd5p****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The number of worker nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder workerServerlessReplicas(Integer workerServerlessReplicas) {
                this.workerServerlessReplicas = workerServerlessReplicas;
                return this;
            }

            /**
             * <p>The ID of the DMS workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>8630242382****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-h</p>
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
