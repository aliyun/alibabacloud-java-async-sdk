// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResponseBody</p>
 */
public class GetJobResponseBody extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("CodeSource")
    private CodeSource codeSource;

    @NameInMap("DataSources")
    private java.util.List < DataSources> dataSources;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("Duration")
    private Long duration;

    @NameInMap("ElasticSpec")
    private JobElasticSpec elasticSpec;

    @NameInMap("EnabledDebugger")
    private Boolean enabledDebugger;

    @NameInMap("Envs")
    private java.util.Map < String, String > envs;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtFailedTime")
    private String gmtFailedTime;

    @NameInMap("GmtFinishTime")
    private String gmtFinishTime;

    @NameInMap("GmtRunningTime")
    private String gmtRunningTime;

    @NameInMap("GmtStoppedTime")
    private String gmtStoppedTime;

    @NameInMap("GmtSubmittedTime")
    private String gmtSubmittedTime;

    @NameInMap("GmtSuccessedTime")
    private String gmtSuccessedTime;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobSpecs")
    private java.util.List < JobSpec > jobSpecs;

    @NameInMap("JobType")
    private String jobType;

    @NameInMap("Pods")
    private java.util.List < Pods> pods;

    @NameInMap("Priority")
    private Integer priority;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceId")
    private String resourceId;

    @NameInMap("ResourceLevel")
    private String resourceLevel;

    @NameInMap("Settings")
    private JobSettings settings;

    @NameInMap("Status")
    private String status;

    @NameInMap("ThirdpartyLibDir")
    private String thirdpartyLibDir;

    @NameInMap("ThirdpartyLibs")
    private java.util.List < String > thirdpartyLibs;

    @NameInMap("UserCommand")
    private String userCommand;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    @NameInMap("WorkspaceName")
    private String workspaceName;

    private GetJobResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.codeSource = builder.codeSource;
        this.dataSources = builder.dataSources;
        this.displayName = builder.displayName;
        this.duration = builder.duration;
        this.elasticSpec = builder.elasticSpec;
        this.enabledDebugger = builder.enabledDebugger;
        this.envs = builder.envs;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtFailedTime = builder.gmtFailedTime;
        this.gmtFinishTime = builder.gmtFinishTime;
        this.gmtRunningTime = builder.gmtRunningTime;
        this.gmtStoppedTime = builder.gmtStoppedTime;
        this.gmtSubmittedTime = builder.gmtSubmittedTime;
        this.gmtSuccessedTime = builder.gmtSuccessedTime;
        this.jobId = builder.jobId;
        this.jobSpecs = builder.jobSpecs;
        this.jobType = builder.jobType;
        this.pods = builder.pods;
        this.priority = builder.priority;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceLevel = builder.resourceLevel;
        this.settings = builder.settings;
        this.status = builder.status;
        this.thirdpartyLibDir = builder.thirdpartyLibDir;
        this.thirdpartyLibs = builder.thirdpartyLibs;
        this.userCommand = builder.userCommand;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return codeSource
     */
    public CodeSource getCodeSource() {
        return this.codeSource;
    }

    /**
     * @return dataSources
     */
    public java.util.List < DataSources> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return elasticSpec
     */
    public JobElasticSpec getElasticSpec() {
        return this.elasticSpec;
    }

    /**
     * @return enabledDebugger
     */
    public Boolean getEnabledDebugger() {
        return this.enabledDebugger;
    }

    /**
     * @return envs
     */
    public java.util.Map < String, String > getEnvs() {
        return this.envs;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtFailedTime
     */
    public String getGmtFailedTime() {
        return this.gmtFailedTime;
    }

    /**
     * @return gmtFinishTime
     */
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    /**
     * @return gmtRunningTime
     */
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    /**
     * @return gmtStoppedTime
     */
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    /**
     * @return gmtSubmittedTime
     */
    public String getGmtSubmittedTime() {
        return this.gmtSubmittedTime;
    }

    /**
     * @return gmtSuccessedTime
     */
    public String getGmtSuccessedTime() {
        return this.gmtSuccessedTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobSpecs
     */
    public java.util.List < JobSpec > getJobSpecs() {
        return this.jobSpecs;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return pods
     */
    public java.util.List < Pods> getPods() {
        return this.pods;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceLevel
     */
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    /**
     * @return settings
     */
    public JobSettings getSettings() {
        return this.settings;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return thirdpartyLibDir
     */
    public String getThirdpartyLibDir() {
        return this.thirdpartyLibDir;
    }

    /**
     * @return thirdpartyLibs
     */
    public java.util.List < String > getThirdpartyLibs() {
        return this.thirdpartyLibs;
    }

    /**
     * @return userCommand
     */
    public String getUserCommand() {
        return this.userCommand;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private String clusterId; 
        private CodeSource codeSource; 
        private java.util.List < DataSources> dataSources; 
        private String displayName; 
        private Long duration; 
        private JobElasticSpec elasticSpec; 
        private Boolean enabledDebugger; 
        private java.util.Map < String, String > envs; 
        private String gmtCreateTime; 
        private String gmtFailedTime; 
        private String gmtFinishTime; 
        private String gmtRunningTime; 
        private String gmtStoppedTime; 
        private String gmtSubmittedTime; 
        private String gmtSuccessedTime; 
        private String jobId; 
        private java.util.List < JobSpec > jobSpecs; 
        private String jobType; 
        private java.util.List < Pods> pods; 
        private Integer priority; 
        private String reasonCode; 
        private String reasonMessage; 
        private String requestId; 
        private String resourceId; 
        private String resourceLevel; 
        private JobSettings settings; 
        private String status; 
        private String thirdpartyLibDir; 
        private java.util.List < String > thirdpartyLibs; 
        private String userCommand; 
        private String userId; 
        private String workspaceId; 
        private String workspaceName; 

        /**
         * ??????ID
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder codeSource(CodeSource codeSource) {
            this.codeSource = codeSource;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder dataSources(java.util.List < DataSources> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * ?????????????????????s???
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder elasticSpec(JobElasticSpec elasticSpec) {
            this.elasticSpec = elasticSpec;
            return this;
        }

        /**
         * ????????????debugger??????
         */
        public Builder enabledDebugger(Boolean enabledDebugger) {
            this.enabledDebugger = enabledDebugger;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder envs(java.util.Map < String, String > envs) {
            this.envs = envs;
            return this;
        }

        /**
         * ?????????????????????UTC???
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtFailedTime.
         */
        public Builder gmtFailedTime(String gmtFailedTime) {
            this.gmtFailedTime = gmtFailedTime;
            return this;
        }

        /**
         * ?????????????????????UTC???
         */
        public Builder gmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }

        /**
         * GmtRunningTime.
         */
        public Builder gmtRunningTime(String gmtRunningTime) {
            this.gmtRunningTime = gmtRunningTime;
            return this;
        }

        /**
         * GmtStoppedTime.
         */
        public Builder gmtStoppedTime(String gmtStoppedTime) {
            this.gmtStoppedTime = gmtStoppedTime;
            return this;
        }

        /**
         * GmtSubmittedTime.
         */
        public Builder gmtSubmittedTime(String gmtSubmittedTime) {
            this.gmtSubmittedTime = gmtSubmittedTime;
            return this;
        }

        /**
         * GmtSuccessedTime.
         */
        public Builder gmtSuccessedTime(String gmtSuccessedTime) {
            this.gmtSuccessedTime = gmtSuccessedTime;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder jobSpecs(java.util.List < JobSpec > jobSpecs) {
            this.jobSpecs = jobSpecs;
            return this;
        }

        /**
         * ????????????
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * ??????????????????Pod??????
         */
        public Builder pods(java.util.List < Pods> pods) {
            this.pods = pods;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ????????????
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * ??????Id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ??????????????????????????????ID
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ????????????????????????????????????
         */
        public Builder resourceLevel(String resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }

        /**
         * ????????????????????????
         */
        public Builder settings(JobSettings settings) {
            this.settings = settings;
            return this;
        }

        /**
         * ????????????
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ?????????(requirements.txt)????????????
         */
        public Builder thirdpartyLibDir(String thirdpartyLibDir) {
            this.thirdpartyLibDir = thirdpartyLibDir;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder thirdpartyLibs(java.util.List < String > thirdpartyLibs) {
            this.thirdpartyLibs = thirdpartyLibs;
            return this;
        }

        /**
         * ????????????
         */
        public Builder userCommand(String userCommand) {
            this.userCommand = userCommand;
            return this;
        }

        /**
         * ???????????????Id
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * ????????????????????????ID
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public GetJobResponseBody build() {
            return new GetJobResponseBody(this);
        } 

    } 

    public static class CodeSource extends TeaModel {
        @NameInMap("Branch")
        private String branch;

        @NameInMap("CodeSourceId")
        private String codeSourceId;

        @NameInMap("Commit")
        private String commit;

        @NameInMap("MountPath")
        private String mountPath;

        private CodeSource(Builder builder) {
            this.branch = builder.branch;
            this.codeSourceId = builder.codeSourceId;
            this.commit = builder.commit;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeSource create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return codeSourceId
         */
        public String getCodeSourceId() {
            return this.codeSourceId;
        }

        /**
         * @return commit
         */
        public String getCommit() {
            return this.commit;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private String branch; 
            private String codeSourceId; 
            private String commit; 
            private String mountPath; 

            /**
             * ????????????
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * ?????????Id
             */
            public Builder codeSourceId(String codeSourceId) {
                this.codeSourceId = codeSourceId;
                return this;
            }

            /**
             * ??????Commit
             */
            public Builder commit(String commit) {
                this.commit = commit;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public CodeSource build() {
                return new CodeSource(this);
            } 

        } 

    }
    public static class DataSources extends TeaModel {
        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("MountPath")
        private String mountPath;

        private DataSources(Builder builder) {
            this.dataSourceId = builder.dataSourceId;
            this.mountPath = builder.mountPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        public static final class Builder {
            private String dataSourceId; 
            private String mountPath; 

            /**
             * ?????????Id
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    public static class HistoryPods extends TeaModel {
        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtFinishTime")
        private String gmtFinishTime;

        @NameInMap("GmtStartTime")
        private String gmtStartTime;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("PodId")
        private String podId;

        @NameInMap("PodUid")
        private String podUid;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private HistoryPods(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtFinishTime = builder.gmtFinishTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.ip = builder.ip;
            this.podId = builder.podId;
            this.podUid = builder.podUid;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HistoryPods create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtFinishTime
         */
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        /**
         * @return podUid
         */
        public String getPodUid() {
            return this.podUid;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtFinishTime; 
            private String gmtStartTime; 
            private String ip; 
            private String podId; 
            private String podUid; 
            private String status; 
            private String type; 

            /**
             * Pod???????????????UTC???
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Pod???????????????UTC???
             */
            public Builder gmtFinishTime(String gmtFinishTime) {
                this.gmtFinishTime = gmtFinishTime;
                return this;
            }

            /**
             * Pod???????????????UTC???
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * Pod Ip
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Pod Id
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            /**
             * Pod UId
             */
            public Builder podUid(String podUid) {
                this.podUid = podUid;
                return this;
            }

            /**
             * Pod??????
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Pod??????
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HistoryPods build() {
                return new HistoryPods(this);
            } 

        } 

    }
    public static class Pods extends TeaModel {
        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtFinishTime")
        private String gmtFinishTime;

        @NameInMap("GmtStartTime")
        private String gmtStartTime;

        @NameInMap("HistoryPods")
        private java.util.List < HistoryPods> historyPods;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("PodId")
        private String podId;

        @NameInMap("PodUid")
        private String podUid;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Pods(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtFinishTime = builder.gmtFinishTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.historyPods = builder.historyPods;
            this.ip = builder.ip;
            this.podId = builder.podId;
            this.podUid = builder.podUid;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pods create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtFinishTime
         */
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return historyPods
         */
        public java.util.List < HistoryPods> getHistoryPods() {
            return this.historyPods;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return podId
         */
        public String getPodId() {
            return this.podId;
        }

        /**
         * @return podUid
         */
        public String getPodUid() {
            return this.podUid;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtFinishTime; 
            private String gmtStartTime; 
            private java.util.List < HistoryPods> historyPods; 
            private String ip; 
            private String podId; 
            private String podUid; 
            private String status; 
            private String type; 

            /**
             * Pod???????????????UTC???
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * Pod???????????????UTC???
             */
            public Builder gmtFinishTime(String gmtFinishTime) {
                this.gmtFinishTime = gmtFinishTime;
                return this;
            }

            /**
             * Pod???????????????UTC???
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * ??????Pods
             */
            public Builder historyPods(java.util.List < HistoryPods> historyPods) {
                this.historyPods = historyPods;
                return this;
            }

            /**
             * Pod Ip
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Pod Id
             */
            public Builder podId(String podId) {
                this.podId = podId;
                return this;
            }

            /**
             * Pod UId
             */
            public Builder podUid(String podUid) {
                this.podUid = podUid;
                return this;
            }

            /**
             * Pod??????
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Pod??????
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Pods build() {
                return new Pods(this);
            } 

        } 

    }
}
