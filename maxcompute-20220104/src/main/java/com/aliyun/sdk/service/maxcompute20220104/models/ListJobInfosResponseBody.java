// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListJobInfosResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobInfosResponseBody</p>
 */
public class ListJobInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListJobInfosResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListJobInfosResponseBody model) {
            this.data = model.data;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc13a9516807484336515320e38f5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListJobInfosResponseBody build() {
            return new ListJobInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobInfosResponseBody</p>
     */
    public static class SceneResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("params")
        private java.util.Map<String, String> params;

        @com.aliyun.core.annotation.NameInMap("scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("sceneTag")
        private String sceneTag;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SceneResults(Builder builder) {
            this.description = builder.description;
            this.params = builder.params;
            this.scene = builder.scene;
            this.sceneTag = builder.sceneTag;
            this.summary = builder.summary;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneResults create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return params
         */
        public java.util.Map<String, String> getParams() {
            return this.params;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return sceneTag
         */
        public String getSceneTag() {
            return this.sceneTag;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private java.util.Map<String, String> params; 
            private String scene; 
            private String sceneTag; 
            private String summary; 
            private String type; 

            private Builder() {
            } 

            private Builder(SceneResults model) {
                this.description = model.description;
                this.params = model.params;
                this.scene = model.scene;
                this.sceneTag = model.sceneTag;
                this.summary = model.summary;
                this.type = model.type;
            } 

            /**
             * <p>The intelligent diagnostics result description.</p>
             * 
             * <strong>example:</strong>
             * <p>This job uses annual and monthly computing resources. It may be that the job is waiting for resources due to the large amount of overall job running data, many resources requested, and low job priority. Please go to Resource Consumption to view the specific situation. You can also go to Cost Optimization to see if you need to adjust resource configuration.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Information about the nodes where data skew or data expansion is detected. This parameter is returned only when the diagnostics scenario is data skew or data expansion.</p>
             */
            public Builder params(java.util.Map<String, String> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>LackResource</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result tag.</p>
             * 
             * <strong>example:</strong>
             * <p>SubscriptionLackResource</p>
             */
            public Builder sceneTag(String sceneTag) {
                this.sceneTag = sceneTag;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result summary.</p>
             * 
             * <strong>example:</strong>
             * <p>Insufficient computing resources available for the job. Click to view details.</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The intelligent diagnostics result type.</p>
             * 
             * <strong>example:</strong>
             * <p>warning</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SceneResults build() {
                return new SceneResults(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobInfosResponseBody</p>
     */
    public static class JobInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("cuSnapshot")
        private Double cuSnapshot;

        @com.aliyun.core.annotation.NameInMap("cuUsage")
        private Long cuUsage;

        @com.aliyun.core.annotation.NameInMap("endAtTime")
        private Long endAtTime;

        @com.aliyun.core.annotation.NameInMap("extNodeId")
        private String extNodeId;

        @com.aliyun.core.annotation.NameInMap("extNodeOnDuty")
        private String extNodeOnDuty;

        @com.aliyun.core.annotation.NameInMap("extPlantFrom")
        private String extPlantFrom;

        @com.aliyun.core.annotation.NameInMap("inputBytes")
        private Double inputBytes;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("jobOwner")
        private String jobOwner;

        @com.aliyun.core.annotation.NameInMap("jobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("memorySnapshot")
        private Double memorySnapshot;

        @com.aliyun.core.annotation.NameInMap("memoryUsage")
        private Long memoryUsage;

        @com.aliyun.core.annotation.NameInMap("priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("quotaNickname")
        private String quotaNickname;

        @com.aliyun.core.annotation.NameInMap("quotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("runningAtTime")
        private Long runningAtTime;

        @com.aliyun.core.annotation.NameInMap("runningTime")
        private Long runningTime;

        @com.aliyun.core.annotation.NameInMap("sceneResults")
        private java.util.List<SceneResults> sceneResults;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("statusSnapshot")
        private String statusSnapshot;

        @com.aliyun.core.annotation.NameInMap("submittedAtTime")
        private Long submittedAtTime;

        @com.aliyun.core.annotation.NameInMap("tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("totalTime")
        private Long totalTime;

        @com.aliyun.core.annotation.NameInMap("waitingTime")
        private Long waitingTime;

        private JobInfoList(Builder builder) {
            this.cluster = builder.cluster;
            this.cuSnapshot = builder.cuSnapshot;
            this.cuUsage = builder.cuUsage;
            this.endAtTime = builder.endAtTime;
            this.extNodeId = builder.extNodeId;
            this.extNodeOnDuty = builder.extNodeOnDuty;
            this.extPlantFrom = builder.extPlantFrom;
            this.inputBytes = builder.inputBytes;
            this.instanceId = builder.instanceId;
            this.jobOwner = builder.jobOwner;
            this.jobType = builder.jobType;
            this.memorySnapshot = builder.memorySnapshot;
            this.memoryUsage = builder.memoryUsage;
            this.priority = builder.priority;
            this.project = builder.project;
            this.quotaNickname = builder.quotaNickname;
            this.quotaType = builder.quotaType;
            this.region = builder.region;
            this.runningAtTime = builder.runningAtTime;
            this.runningTime = builder.runningTime;
            this.sceneResults = builder.sceneResults;
            this.signature = builder.signature;
            this.status = builder.status;
            this.statusSnapshot = builder.statusSnapshot;
            this.submittedAtTime = builder.submittedAtTime;
            this.tags = builder.tags;
            this.tenantId = builder.tenantId;
            this.totalTime = builder.totalTime;
            this.waitingTime = builder.waitingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobInfoList create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return cuSnapshot
         */
        public Double getCuSnapshot() {
            return this.cuSnapshot;
        }

        /**
         * @return cuUsage
         */
        public Long getCuUsage() {
            return this.cuUsage;
        }

        /**
         * @return endAtTime
         */
        public Long getEndAtTime() {
            return this.endAtTime;
        }

        /**
         * @return extNodeId
         */
        public String getExtNodeId() {
            return this.extNodeId;
        }

        /**
         * @return extNodeOnDuty
         */
        public String getExtNodeOnDuty() {
            return this.extNodeOnDuty;
        }

        /**
         * @return extPlantFrom
         */
        public String getExtPlantFrom() {
            return this.extPlantFrom;
        }

        /**
         * @return inputBytes
         */
        public Double getInputBytes() {
            return this.inputBytes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobOwner
         */
        public String getJobOwner() {
            return this.jobOwner;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return memorySnapshot
         */
        public Double getMemorySnapshot() {
            return this.memorySnapshot;
        }

        /**
         * @return memoryUsage
         */
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return quotaNickname
         */
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return runningAtTime
         */
        public Long getRunningAtTime() {
            return this.runningAtTime;
        }

        /**
         * @return runningTime
         */
        public Long getRunningTime() {
            return this.runningTime;
        }

        /**
         * @return sceneResults
         */
        public java.util.List<SceneResults> getSceneResults() {
            return this.sceneResults;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusSnapshot
         */
        public String getStatusSnapshot() {
            return this.statusSnapshot;
        }

        /**
         * @return submittedAtTime
         */
        public Long getSubmittedAtTime() {
            return this.submittedAtTime;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return totalTime
         */
        public Long getTotalTime() {
            return this.totalTime;
        }

        /**
         * @return waitingTime
         */
        public Long getWaitingTime() {
            return this.waitingTime;
        }

        public static final class Builder {
            private String cluster; 
            private Double cuSnapshot; 
            private Long cuUsage; 
            private Long endAtTime; 
            private String extNodeId; 
            private String extNodeOnDuty; 
            private String extPlantFrom; 
            private Double inputBytes; 
            private String instanceId; 
            private String jobOwner; 
            private String jobType; 
            private Double memorySnapshot; 
            private Long memoryUsage; 
            private Long priority; 
            private String project; 
            private String quotaNickname; 
            private String quotaType; 
            private String region; 
            private Long runningAtTime; 
            private Long runningTime; 
            private java.util.List<SceneResults> sceneResults; 
            private String signature; 
            private String status; 
            private String statusSnapshot; 
            private Long submittedAtTime; 
            private String tags; 
            private String tenantId; 
            private Long totalTime; 
            private Long waitingTime; 

            private Builder() {
            } 

            private Builder(JobInfoList model) {
                this.cluster = model.cluster;
                this.cuSnapshot = model.cuSnapshot;
                this.cuUsage = model.cuUsage;
                this.endAtTime = model.endAtTime;
                this.extNodeId = model.extNodeId;
                this.extNodeOnDuty = model.extNodeOnDuty;
                this.extPlantFrom = model.extPlantFrom;
                this.inputBytes = model.inputBytes;
                this.instanceId = model.instanceId;
                this.jobOwner = model.jobOwner;
                this.jobType = model.jobType;
                this.memorySnapshot = model.memorySnapshot;
                this.memoryUsage = model.memoryUsage;
                this.priority = model.priority;
                this.project = model.project;
                this.quotaNickname = model.quotaNickname;
                this.quotaType = model.quotaType;
                this.region = model.region;
                this.runningAtTime = model.runningAtTime;
                this.runningTime = model.runningTime;
                this.sceneResults = model.sceneResults;
                this.signature = model.signature;
                this.status = model.status;
                this.statusSnapshot = model.statusSnapshot;
                this.submittedAtTime = model.submittedAtTime;
                this.tags = model.tags;
                this.tenantId = model.tenantId;
                this.totalTime = model.totalTime;
                this.waitingTime = model.waitingTime;
            } 

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>AY20A</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The CU snapshot proportion of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0.48</p>
             */
            public Builder cuSnapshot(Double cuSnapshot) {
                this.cuSnapshot = cuSnapshot;
                return this;
            }

            /**
             * <p>The total number of used compute units (CUs).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cuUsage(Long cuUsage) {
                this.cuUsage = cuUsage;
                return this;
            }

            /**
             * <p>The time when the job stops running.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder endAtTime(Long endAtTime) {
                this.endAtTime = endAtTime;
                return this;
            }

            /**
             * <p>The node ID of DataWorks.</p>
             * 
             * <strong>example:</strong>
             * <p>node_4</p>
             */
            public Builder extNodeId(String extNodeId) {
                this.extNodeId = extNodeId;
                return this;
            }

            /**
             * <p>The account of the node owner.</p>
             * 
             * <strong>example:</strong>
             * <p>duty_2</p>
             */
            public Builder extNodeOnDuty(String extNodeOnDuty) {
                this.extNodeOnDuty = extNodeOnDuty;
                return this;
            }

            /**
             * <p>The upstream platform.</p>
             * 
             * <strong>example:</strong>
             * <p>platform_3</p>
             */
            public Builder extPlantFrom(String extPlantFrom) {
                this.extPlantFrom = extPlantFrom;
                return this;
            }

            /**
             * <p>The amount of scanned data for the job. Unit: byte.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder inputBytes(Double inputBytes) {
                this.inputBytes = inputBytes;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>20230410050036549gfmsdwf60gg</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The account that commits the job.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN$<a href="mailto:xxx@test.aliyunid.com">xxx@test.aliyunid.com</a></p>
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * <p>The type of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The memory snapshot proportion of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0.42</p>
             */
            public Builder memorySnapshot(Double memorySnapshot) {
                this.memorySnapshot = memorySnapshot;
                return this;
            }

            /**
             * <p>The total memory usage.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder memoryUsage(Long memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * <p>The priority of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The name of the MaxCompute project.</p>
             * 
             * <strong>example:</strong>
             * <p>openrec_new</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The nickname of the quota that is used by the job.</p>
             * 
             * <strong>example:</strong>
             * <p>my_quota</p>
             */
            public Builder quotaNickname(String quotaNickname) {
                this.quotaNickname = quotaNickname;
                return this;
            }

            /**
             * <p>The type of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>subscription</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The time when the job starts to run.</p>
             * 
             * <strong>example:</strong>
             * <p>1672112113</p>
             */
            public Builder runningAtTime(Long runningAtTime) {
                this.runningAtTime = runningAtTime;
                return this;
            }

            /**
             * <p>The period for which the job runs.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder runningTime(Long runningTime) {
                this.runningTime = runningTime;
                return this;
            }

            /**
             * <p>The intelligent diagnostics results.</p>
             */
            public Builder sceneResults(java.util.List<SceneResults> sceneResults) {
                this.sceneResults = sceneResults;
                return this;
            }

            /**
             * <p>The signature of the SQL job.</p>
             * 
             * <strong>example:</strong>
             * <p>i094KijGrN3kOXZ74kbexB77XQY=</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The status of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status of the snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder statusSnapshot(String statusSnapshot) {
                this.statusSnapshot = statusSnapshot;
                return this;
            }

            /**
             * <p>The time when the job was committed.</p>
             * 
             * <strong>example:</strong>
             * <p>1672112013</p>
             */
            public Builder submittedAtTime(Long submittedAtTime) {
                this.submittedAtTime = submittedAtTime;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>213065738244354</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The total period for which the job runs.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder totalTime(Long totalTime) {
                this.totalTime = totalTime;
                return this;
            }

            /**
             * <p>The duration for which the job waits to start.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder waitingTime(Long waitingTime) {
                this.waitingTime = waitingTime;
                return this;
            }

            public JobInfoList build() {
                return new JobInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobInfosResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobInfosResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobInfoList")
        private java.util.List<JobInfoList> jobInfoList;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.jobInfoList = builder.jobInfoList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobInfoList
         */
        public java.util.List<JobInfoList> getJobInfoList() {
            return this.jobInfoList;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<JobInfoList> jobInfoList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobInfoList = model.jobInfoList;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The information about the jobs.</p>
             */
            public Builder jobInfoList(java.util.List<JobInfoList> jobInfoList) {
                this.jobInfoList = jobInfoList;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
