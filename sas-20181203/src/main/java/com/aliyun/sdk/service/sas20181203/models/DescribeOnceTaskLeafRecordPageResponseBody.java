// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOnceTaskLeafRecordPageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnceTaskLeafRecordPageResponseBody</p>
 */
public class DescribeOnceTaskLeafRecordPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnceTasks")
    private java.util.List < OnceTasks> onceTasks;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOnceTaskLeafRecordPageResponseBody(Builder builder) {
        this.onceTasks = builder.onceTasks;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnceTaskLeafRecordPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return onceTasks
     */
    public java.util.List < OnceTasks> getOnceTasks() {
        return this.onceTasks;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OnceTasks> onceTasks; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The details of the sub-task.</p>
         */
        public Builder onceTasks(java.util.List < OnceTasks> onceTasks) {
            this.onceTasks = onceTasks;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB393****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOnceTaskLeafRecordPageResponseBody build() {
            return new DescribeOnceTaskLeafRecordPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOnceTaskLeafRecordPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnceTaskLeafRecordPageResponseBody</p>
     */
    public static class TaskImageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CostTimeInfo")
        private String costTimeInfo;

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
            this.costTimeInfo = builder.costTimeInfo;
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
         * @return costTimeInfo
         */
        public String getCostTimeInfo() {
            return this.costTimeInfo;
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
            private String costTimeInfo; 
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
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>ACK-test-****</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The time consumed. The value is in the JSON format. The end time of each item is displayed.</p>
             * <ul>
             * <li><strong>vul</strong>: system vulnerabilities</li>
             * <li><strong>scaVul</strong>: application vulnerabilities</li>
             * <li><strong>scaVul</strong>: baseline</li>
             * <li><strong>binary</strong>: binary</li>
             * <li><strong>forbiddenPackageInfo</strong>: information about the prohibited package</li>
             * <li><strong>identificationInfo</strong>: identity authentication</li>
             * <li><strong>script</strong>: malicious scripts</li>
             * <li><strong>sensitiveFile</strong>: sensitive files</li>
             * <li><strong>sensitiveInfo</strong>: AccessKey pair leaks</li>
             * <li><strong>webshell</strong>: website scripts</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;scaVul&quot;:&quot;2023-09-04 09:37:21&quot;,&quot;identificationInfo&quot;:&quot;2023-09-04 09:37:30&quot;,&quot;forbiddenPackageInfo&quot;:&quot;2023-09-04 09:37:16&quot;,&quot;binary&quot;:&quot;2023-09-04 09:37:25&quot;,&quot;baseline&quot;:&quot;2023-09-04 09:37:19&quot;,&quot;sensitiveFile&quot;:&quot;2023-09-04 09:38:34&quot;,&quot;vul&quot;:&quot;2023-09-04 09:37:31&quot;,&quot;webshell&quot;:&quot;2023-09-04 09:38:27&quot;,&quot;sensitiveInfo&quot;:&quot;2023-09-04 09:37:16&quot;,&quot;script&quot;:&quot;2023-09-04 09:39:44&quot;}</p>
             */
            public Builder costTimeInfo(String costTimeInfo) {
                this.costTimeInfo = costTimeInfo;
                return this;
            }

            /**
             * <p>The digest of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>9e0dc29d872d2e386cc5c0c92b529a84e3acfade16f5cb1d054a2ee3c99****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The image of the container.</p>
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
             * <p>The name of the namespace to which the image repository belongs.</p>
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
             * <p>The tag that is added to the image.</p>
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
     * {@link DescribeOnceTaskLeafRecordPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnceTaskLeafRecordPageResponseBody</p>
     */
    public static class OnceTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Finish")
        private Integer finish;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private String finishCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("RealRunTime")
        private Long realRunTime;

        @com.aliyun.core.annotation.NameInMap("ResultInfo")
        private String resultInfo;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

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
        private String totalCount;

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
        public String getFinishCount() {
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
        public String getStatus() {
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
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long endTime; 
            private Integer finish; 
            private String finishCount; 
            private Long progress; 
            private Long realRunTime; 
            private String resultInfo; 
            private Long startTime; 
            private String status; 
            private String statusText; 
            private String target; 
            private String targetType; 
            private String taskId; 
            private TaskImageInfo taskImageInfo; 
            private String taskName; 
            private String taskType; 
            private String totalCount; 

            /**
             * <p>The time when the sub-task ends.</p>
             * 
             * <strong>example:</strong>
             * <p>1670307567000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether the sub-task is complete.</p>
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
             * <p>The number of the assets that are scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>67</p>
             */
            public Builder finishCount(String finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>The progress percentage of the sub-task.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The execution duration of the sub-task.</p>
             * 
             * <strong>example:</strong>
             * <p>1670307567000</p>
             */
            public Builder realRunTime(Long realRunTime) {
                this.realRunTime = realRunTime;
                return this;
            }

            /**
             * <p>The execution result.</p>
             * 
             * <strong>example:</strong>
             * <p>TASK_NOT_SUPPORT_REGION</p>
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * <p>The time when the sub-task starts.</p>
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
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-task status. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The sub-task is not started.</li>
             * <li><strong>START</strong>: The sub-task is started.</li>
             * <li><strong>SUCCESS</strong>: The sub-task is complete.</li>
             * <li><strong>TIMEOUT</strong>: The sub-task timed out.</li>
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
             * <p>The objective of the sub-task.</p>
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
             * <p>The sub-task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9fb50f2af8bb67c9fdb684194c83****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The information about the image scan.</p>
             */
            public Builder taskImageInfo(TaskImageInfo taskImageInfo) {
                this.taskImageInfo = taskImageInfo;
                return this;
            }

            /**
             * <p>The name of the sub-task.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the sub-task.</p>
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
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public OnceTasks build() {
                return new OnceTasks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeOnceTaskLeafRecordPageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnceTaskLeafRecordPageResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
