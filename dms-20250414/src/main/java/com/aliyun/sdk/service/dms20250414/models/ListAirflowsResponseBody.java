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
 * {@link ListAirflowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAirflowsResponseBody</p>
 */
public class ListAirflowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Root")
    private Root root;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAirflowsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.root = builder.root;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAirflowsResponseBody create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Root root; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAirflowsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Reuqest ID。</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
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

        public ListAirflowsResponseBody build() {
            return new ListAirflowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAirflowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAirflowsResponseBody</p>
     */
    public static class List extends TeaModel {
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

        private List(Builder builder) {
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

        public static List create() {
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

            private Builder(List model) {
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
             * AirflowId.
             */
            public Builder airflowId(String airflowId) {
                this.airflowId = airflowId;
                return this;
            }

            /**
             * AirflowName.
             */
            public Builder airflowName(String airflowName) {
                this.airflowName = airflowName;
                return this;
            }

            /**
             * AppSpec.
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
             * <p>vpc-8vbbfm33dy0y1pek****</p>
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

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAirflowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAirflowsResponseBody</p>
     */
    public static class Root extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Root(Builder builder) {
            this.list = builder.list;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Root create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Root model) {
                this.list = model.list;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Root build() {
                return new Root(this);
            } 

        } 

    }
}
