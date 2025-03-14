// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListUnfinishedOnceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListUnfinishedOnceTaskResponseBody</p>
 */
public class ListUnfinishedOnceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnceTasks")
    private java.util.List<OnceTasks> onceTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUnfinishedOnceTaskResponseBody(Builder builder) {
        this.onceTasks = builder.onceTasks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnfinishedOnceTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onceTasks
     */
    public java.util.List<OnceTasks> getOnceTasks() {
        return this.onceTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OnceTasks> onceTasks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUnfinishedOnceTaskResponseBody model) {
            this.onceTasks = model.onceTasks;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the tasks.</p>
         */
        public Builder onceTasks(java.util.List<OnceTasks> onceTasks) {
            this.onceTasks = onceTasks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUnfinishedOnceTaskResponseBody build() {
            return new ListUnfinishedOnceTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUnfinishedOnceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnfinishedOnceTaskResponseBody</p>
     */
    public static class TaskImageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceId")
        private String nodeInstanceId;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoId")
        private String repoId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RepoRegionId")
        private String repoRegionId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private TaskImageInfo(Builder builder) {
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.digest = builder.digest;
            this.image = builder.image;
            this.nodeInstanceId = builder.nodeInstanceId;
            this.nodeIp = builder.nodeIp;
            this.nodeName = builder.nodeName;
            this.pod = builder.pod;
            this.regionId = builder.regionId;
            this.repoId = builder.repoId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.repoRegionId = builder.repoRegionId;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskImageInfo create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return nodeInstanceId
         */
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoId
         */
        public String getRepoId() {
            return this.repoId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return repoRegionId
         */
        public String getRepoRegionId() {
            return this.repoRegionId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String appName; 
            private String clusterId; 
            private String clusterName; 
            private String digest; 
            private String image; 
            private String nodeInstanceId; 
            private String nodeIp; 
            private String nodeName; 
            private String pod; 
            private String regionId; 
            private String repoId; 
            private String repoName; 
            private String repoNamespace; 
            private String repoRegionId; 
            private String tag; 

            private Builder() {
            } 

            private Builder(TaskImageInfo model) {
                this.appName = model.appName;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.digest = model.digest;
                this.image = model.image;
                this.nodeInstanceId = model.nodeInstanceId;
                this.nodeIp = model.nodeIp;
                this.nodeName = model.nodeName;
                this.pod = model.pod;
                this.regionId = model.regionId;
                this.repoId = model.repoId;
                this.repoName = model.repoName;
                this.repoNamespace = model.repoNamespace;
                this.repoRegionId = model.repoRegionId;
                this.tag = model.tag;
            } 

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-jenkins-****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>a765ba1435e7f9446065370e9a41****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ACK-test-****</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The image digest.</p>
             * 
             * <strong>example:</strong>
             * <p>default_digest</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The container image.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong>s.com/sas_test/baseli</strong></em></p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The instance ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-0xi5mxvtmfw9****</p>
             */
            public Builder nodeInstanceId(String nodeInstanceId) {
                this.nodeInstanceId = nodeInstanceId;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>172.18.XXX.XXX</p>
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>pztest****</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The pod of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>expoit-law-****</p>
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * <p>The region ID of the server image.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>crr-r88w2vryp8m****</p>
             */
            public Builder repoId(String repoId) {
                this.repoId = repoId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>testyyy</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>bitn***</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The region ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder repoRegionId(String repoRegionId) {
                this.repoRegionId = repoRegionId;
                return this;
            }

            /**
             * <p>The image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.20-002-a2*****</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public TaskImageInfo build() {
                return new TaskImageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUnfinishedOnceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnfinishedOnceTaskResponseBody</p>
     */
    public static class OnceTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Finish")
        private Integer finish;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private Integer finishCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("RealRunTime")
        private Long realRunTime;

        @com.aliyun.core.annotation.NameInMap("ResultInfo")
        private String resultInfo;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StatusText")
        private String statusText;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskImageInfo")
        private TaskImageInfo taskImageInfo;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private OnceTasks(Builder builder) {
            this.endTime = builder.endTime;
            this.finish = builder.finish;
            this.finishCount = builder.finishCount;
            this.progress = builder.progress;
            this.realRunTime = builder.realRunTime;
            this.resultInfo = builder.resultInfo;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusText = builder.statusText;
            this.target = builder.target;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.taskImageInfo = builder.taskImageInfo;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnceTasks create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return finish
         */
        public Integer getFinish() {
            return this.finish;
        }

        /**
         * @return finishCount
         */
        public Integer getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return realRunTime
         */
        public Long getRealRunTime() {
            return this.realRunTime;
        }

        /**
         * @return resultInfo
         */
        public String getResultInfo() {
            return this.resultInfo;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return statusText
         */
        public String getStatusText() {
            return this.statusText;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskImageInfo
         */
        public TaskImageInfo getTaskImageInfo() {
            return this.taskImageInfo;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long endTime; 
            private Integer finish; 
            private Integer finishCount; 
            private Long progress; 
            private Long realRunTime; 
            private String resultInfo; 
            private Long startTime; 
            private Integer status; 
            private String statusText; 
            private String target; 
            private String targetType; 
            private String taskId; 
            private TaskImageInfo taskImageInfo; 
            private String taskName; 
            private String taskType; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(OnceTasks model) {
                this.endTime = model.endTime;
                this.finish = model.finish;
                this.finishCount = model.finishCount;
                this.progress = model.progress;
                this.realRunTime = model.realRunTime;
                this.resultInfo = model.resultInfo;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusText = model.statusText;
                this.target = model.target;
                this.targetType = model.targetType;
                this.taskId = model.taskId;
                this.taskImageInfo = model.taskImageInfo;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The time when the task ends.</p>
             * 
             * <strong>example:</strong>
             * <p>1670307567000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the task is complete. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder finish(Integer finish) {
                this.finish = finish;
                return this;
            }

            /**
             * <p>The number of assets on which the task is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>67</p>
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>The progress percentage of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The execution duration of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1670307567000</p>
             */
            public Builder realRunTime(Long realRunTime) {
                this.realRunTime = realRunTime;
                return this;
            }

            /**
             * <p>The execution result of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>TASK_NOT_SUPPORT_REGION</p>
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * <p>The time when the task is started.</p>
             * 
             * <strong>example:</strong>
             * <p>1640102400000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is not started.</li>
             * <li><strong>START</strong>: The task is started.</li>
             * <li><strong>SUCCESS</strong>: The task is complete.</li>
             * <li><strong>TIMEOUT</strong>: The task timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder statusText(String statusText) {
                this.statusText = statusText;
                return this;
            }

            /**
             * <p>The objective of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>238cf050a7270dd6940602e70f1e5a11eeaf4e02035f445b7f613ff5e064****</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the assets that are scanned. Valid values:</p>
             * <ul>
             * <li><strong>IMAGE_REPO</strong>: image repository</li>
             * <li><strong>IMAGE</strong>: image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>9fb50f2af8bb67c9fdb684194c83****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The information about the image scan task.</p>
             */
            public Builder taskImageInfo(TaskImageInfo taskImageInfo) {
                this.taskImageInfo = taskImageInfo;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public OnceTasks build() {
                return new OnceTasks(this);
            } 

        } 

    }
}
