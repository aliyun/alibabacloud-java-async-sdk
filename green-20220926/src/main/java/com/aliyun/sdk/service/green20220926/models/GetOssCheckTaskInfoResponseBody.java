// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetOssCheckTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssCheckTaskInfoResponseBody</p>
 */
public class GetOssCheckTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FinishNum")
    private Long finishNum;

    @com.aliyun.core.annotation.NameInMap("IsInc")
    private Boolean isInc;

    @com.aliyun.core.annotation.NameInMap("LastExecuteDate")
    private String lastExecuteDate;

    @com.aliyun.core.annotation.NameInMap("MediaType")
    private Integer mediaType;

    @com.aliyun.core.annotation.NameInMap("NextExecuteDate")
    private String nextExecuteDate;

    @com.aliyun.core.annotation.NameInMap("ObjectNum")
    private Long objectNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchNum")
    private Long searchNum;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private GetOssCheckTaskInfoResponseBody(Builder builder) {
        this.buckets = builder.buckets;
        this.config = builder.config;
        this.endTime = builder.endTime;
        this.finishNum = builder.finishNum;
        this.isInc = builder.isInc;
        this.lastExecuteDate = builder.lastExecuteDate;
        this.mediaType = builder.mediaType;
        this.nextExecuteDate = builder.nextExecuteDate;
        this.objectNum = builder.objectNum;
        this.requestId = builder.requestId;
        this.searchNum = builder.searchNum;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssCheckTaskInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return finishNum
     */
    public Long getFinishNum() {
        return this.finishNum;
    }

    /**
     * @return isInc
     */
    public Boolean getIsInc() {
        return this.isInc;
    }

    /**
     * @return lastExecuteDate
     */
    public String getLastExecuteDate() {
        return this.lastExecuteDate;
    }

    /**
     * @return mediaType
     */
    public Integer getMediaType() {
        return this.mediaType;
    }

    /**
     * @return nextExecuteDate
     */
    public String getNextExecuteDate() {
        return this.nextExecuteDate;
    }

    /**
     * @return objectNum
     */
    public Long getObjectNum() {
        return this.objectNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchNum
     */
    public Long getSearchNum() {
        return this.searchNum;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
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

    public static final class Builder {
        private String buckets; 
        private Config config; 
        private String endTime; 
        private Long finishNum; 
        private Boolean isInc; 
        private String lastExecuteDate; 
        private Integer mediaType; 
        private String nextExecuteDate; 
        private Long objectNum; 
        private String requestId; 
        private Long searchNum; 
        private String startTime; 
        private Integer status; 
        private String taskId; 
        private String taskName; 
        private String taskType; 

        private Builder() {
        } 

        private Builder(GetOssCheckTaskInfoResponseBody model) {
            this.buckets = model.buckets;
            this.config = model.config;
            this.endTime = model.endTime;
            this.finishNum = model.finishNum;
            this.isInc = model.isInc;
            this.lastExecuteDate = model.lastExecuteDate;
            this.mediaType = model.mediaType;
            this.nextExecuteDate = model.nextExecuteDate;
            this.objectNum = model.objectNum;
            this.requestId = model.requestId;
            this.searchNum = model.searchNum;
            this.startTime = model.startTime;
            this.status = model.status;
            this.taskId = model.taskId;
            this.taskName = model.taskName;
            this.taskType = model.taskType;
        } 

        /**
         * <p>The storage buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Bucket\&quot;:\&quot;aileshijie\&quot;,\&quot;Region\&quot;:\&quot;cn-hangzhou\&quot;}]</p>
         */
        public Builder buckets(String buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * <p>The configuration item.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The end time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-09 10:30:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of completed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>56</p>
         */
        public Builder finishNum(Long finishNum) {
            this.finishNum = finishNum;
            return this;
        }

        /**
         * <p>Indicates whether this is a scheduled scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isInc(Boolean isInc) {
            this.isInc = isInc;
            return this;
        }

        /**
         * <p>The next execution time of the scheduled task. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-09 10:30:00</p>
         */
        public Builder lastExecuteDate(String lastExecuteDate) {
            this.lastExecuteDate = lastExecuteDate;
            return this;
        }

        /**
         * <p>The media asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mediaType(Integer mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The last execution time of the scheduled task. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-08 10:30:00</p>
         */
        public Builder nextExecuteDate(String nextExecuteDate) {
            this.nextExecuteDate = nextExecuteDate;
            return this;
        }

        /**
         * <p>The total number of files in the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder objectNum(Long objectNum) {
            this.objectNum = objectNum;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of scan tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder searchNum(Long searchNum) {
            this.searchNum = searchNum;
            return this;
        }

        /**
         * <p>The start time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-21 16:08:38</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxx</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Document stock task 20240914100517757</p>
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>increment</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        public GetOssCheckTaskInfoResponseBody build() {
            return new GetOssCheckTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOssCheckTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckTaskInfoResponseBody</p>
     */
    public static class ScanServiceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CopyFrom")
        private String copyFrom;

        @com.aliyun.core.annotation.NameInMap("IsCopy")
        private Boolean isCopy;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private ScanServiceInfos(Builder builder) {
            this.copyFrom = builder.copyFrom;
            this.isCopy = builder.isCopy;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanServiceInfos create() {
            return builder().build();
        }

        /**
         * @return copyFrom
         */
        public String getCopyFrom() {
            return this.copyFrom;
        }

        /**
         * @return isCopy
         */
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private String copyFrom; 
            private Boolean isCopy; 
            private String serviceCode; 
            private String serviceName; 

            private Builder() {
            } 

            private Builder(ScanServiceInfos model) {
                this.copyFrom = model.copyFrom;
                this.isCopy = model.isCopy;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
            } 

            /**
             * <p>The primary service.</p>
             * 
             * <strong>example:</strong>
             * <p>oss_baselineCheck</p>
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * <p>Indicates whether the service is copied.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * <p>The service code.</p>
             * 
             * <strong>example:</strong>
             * <p>oss_baselineCheck</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>Content moderation.</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public ScanServiceInfos build() {
                return new ScanServiceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOssCheckTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckTaskInfoResponseBody</p>
     */
    public static class UserFreezeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FreezeRestorePath")
        private String freezeRestorePath;

        @com.aliyun.core.annotation.NameInMap("FreezeType")
        private String freezeType;

        private UserFreezeConfig(Builder builder) {
            this.freezeRestorePath = builder.freezeRestorePath;
            this.freezeType = builder.freezeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserFreezeConfig create() {
            return builder().build();
        }

        /**
         * @return freezeRestorePath
         */
        public String getFreezeRestorePath() {
            return this.freezeRestorePath;
        }

        /**
         * @return freezeType
         */
        public String getFreezeType() {
            return this.freezeType;
        }

        public static final class Builder {
            private String freezeRestorePath; 
            private String freezeType; 

            private Builder() {
            } 

            private Builder(UserFreezeConfig model) {
                this.freezeRestorePath = model.freezeRestorePath;
                this.freezeType = model.freezeType;
            } 

            /**
             * <p>The transfer directory.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder freezeRestorePath(String freezeRestorePath) {
                this.freezeRestorePath = freezeRestorePath;
                return this;
            }

            /**
             * <p>The freeze type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACL</p>
             */
            public Builder freezeType(String freezeType) {
                this.freezeType = freezeType;
                return this;
            }

            public UserFreezeConfig build() {
                return new UserFreezeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOssCheckTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetOssCheckTaskInfoResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketPrefixFilterConfig")
        private java.util.Map<String, ConfigBucketPrefixFilterConfigValue> bucketPrefixFilterConfig;

        @com.aliyun.core.annotation.NameInMap("CallbackId")
        private Long callbackId;

        @com.aliyun.core.annotation.NameInMap("DistinctHistoryTasks")
        private Boolean distinctHistoryTasks;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecuteDate")
        private Integer executeDate;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private String executeTime;

        @com.aliyun.core.annotation.NameInMap("Freeze")
        private Boolean freeze;

        @com.aliyun.core.annotation.NameInMap("FreezeHighRisk1")
        private Boolean freezeHighRisk1;

        @com.aliyun.core.annotation.NameInMap("FreezeHighRisk2")
        private Boolean freezeHighRisk2;

        @com.aliyun.core.annotation.NameInMap("FreezeMediumRisk1")
        private Boolean freezeMediumRisk1;

        @com.aliyun.core.annotation.NameInMap("FreezeMediumRisk2")
        private Boolean freezeMediumRisk2;

        @com.aliyun.core.annotation.NameInMap("FreezeRestorePath")
        private String freezeRestorePath;

        @com.aliyun.core.annotation.NameInMap("FreezeType")
        private String freezeType;

        @com.aliyun.core.annotation.NameInMap("PrefixFilterType")
        private String prefixFilterType;

        @com.aliyun.core.annotation.NameInMap("PrefixFilters")
        private java.util.List<String> prefixFilters;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Referer")
        private String referer;

        @com.aliyun.core.annotation.NameInMap("ScanLimit")
        private Long scanLimit;

        @com.aliyun.core.annotation.NameInMap("ScanNoFileType")
        private Boolean scanNoFileType;

        @com.aliyun.core.annotation.NameInMap("ScanResourceType")
        private Integer scanResourceType;

        @com.aliyun.core.annotation.NameInMap("ScanService")
        private java.util.List<String> scanService;

        @com.aliyun.core.annotation.NameInMap("ScanServiceInfos")
        private java.util.List<ScanServiceInfos> scanServiceInfos;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TaskCycle")
        private Integer taskCycle;

        @com.aliyun.core.annotation.NameInMap("UserFreezeConfig")
        private UserFreezeConfig userFreezeConfig;

        private Config(Builder builder) {
            this.bucketPrefixFilterConfig = builder.bucketPrefixFilterConfig;
            this.callbackId = builder.callbackId;
            this.distinctHistoryTasks = builder.distinctHistoryTasks;
            this.endTime = builder.endTime;
            this.executeDate = builder.executeDate;
            this.executeTime = builder.executeTime;
            this.freeze = builder.freeze;
            this.freezeHighRisk1 = builder.freezeHighRisk1;
            this.freezeHighRisk2 = builder.freezeHighRisk2;
            this.freezeMediumRisk1 = builder.freezeMediumRisk1;
            this.freezeMediumRisk2 = builder.freezeMediumRisk2;
            this.freezeRestorePath = builder.freezeRestorePath;
            this.freezeType = builder.freezeType;
            this.prefixFilterType = builder.prefixFilterType;
            this.prefixFilters = builder.prefixFilters;
            this.priority = builder.priority;
            this.referer = builder.referer;
            this.scanLimit = builder.scanLimit;
            this.scanNoFileType = builder.scanNoFileType;
            this.scanResourceType = builder.scanResourceType;
            this.scanService = builder.scanService;
            this.scanServiceInfos = builder.scanServiceInfos;
            this.startTime = builder.startTime;
            this.taskCycle = builder.taskCycle;
            this.userFreezeConfig = builder.userFreezeConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return bucketPrefixFilterConfig
         */
        public java.util.Map<String, ConfigBucketPrefixFilterConfigValue> getBucketPrefixFilterConfig() {
            return this.bucketPrefixFilterConfig;
        }

        /**
         * @return callbackId
         */
        public Long getCallbackId() {
            return this.callbackId;
        }

        /**
         * @return distinctHistoryTasks
         */
        public Boolean getDistinctHistoryTasks() {
            return this.distinctHistoryTasks;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executeDate
         */
        public Integer getExecuteDate() {
            return this.executeDate;
        }

        /**
         * @return executeTime
         */
        public String getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return freeze
         */
        public Boolean getFreeze() {
            return this.freeze;
        }

        /**
         * @return freezeHighRisk1
         */
        public Boolean getFreezeHighRisk1() {
            return this.freezeHighRisk1;
        }

        /**
         * @return freezeHighRisk2
         */
        public Boolean getFreezeHighRisk2() {
            return this.freezeHighRisk2;
        }

        /**
         * @return freezeMediumRisk1
         */
        public Boolean getFreezeMediumRisk1() {
            return this.freezeMediumRisk1;
        }

        /**
         * @return freezeMediumRisk2
         */
        public Boolean getFreezeMediumRisk2() {
            return this.freezeMediumRisk2;
        }

        /**
         * @return freezeRestorePath
         */
        public String getFreezeRestorePath() {
            return this.freezeRestorePath;
        }

        /**
         * @return freezeType
         */
        public String getFreezeType() {
            return this.freezeType;
        }

        /**
         * @return prefixFilterType
         */
        public String getPrefixFilterType() {
            return this.prefixFilterType;
        }

        /**
         * @return prefixFilters
         */
        public java.util.List<String> getPrefixFilters() {
            return this.prefixFilters;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return referer
         */
        public String getReferer() {
            return this.referer;
        }

        /**
         * @return scanLimit
         */
        public Long getScanLimit() {
            return this.scanLimit;
        }

        /**
         * @return scanNoFileType
         */
        public Boolean getScanNoFileType() {
            return this.scanNoFileType;
        }

        /**
         * @return scanResourceType
         */
        public Integer getScanResourceType() {
            return this.scanResourceType;
        }

        /**
         * @return scanService
         */
        public java.util.List<String> getScanService() {
            return this.scanService;
        }

        /**
         * @return scanServiceInfos
         */
        public java.util.List<ScanServiceInfos> getScanServiceInfos() {
            return this.scanServiceInfos;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskCycle
         */
        public Integer getTaskCycle() {
            return this.taskCycle;
        }

        /**
         * @return userFreezeConfig
         */
        public UserFreezeConfig getUserFreezeConfig() {
            return this.userFreezeConfig;
        }

        public static final class Builder {
            private java.util.Map<String, ConfigBucketPrefixFilterConfigValue> bucketPrefixFilterConfig; 
            private Long callbackId; 
            private Boolean distinctHistoryTasks; 
            private String endTime; 
            private Integer executeDate; 
            private String executeTime; 
            private Boolean freeze; 
            private Boolean freezeHighRisk1; 
            private Boolean freezeHighRisk2; 
            private Boolean freezeMediumRisk1; 
            private Boolean freezeMediumRisk2; 
            private String freezeRestorePath; 
            private String freezeType; 
            private String prefixFilterType; 
            private java.util.List<String> prefixFilters; 
            private Integer priority; 
            private String referer; 
            private Long scanLimit; 
            private Boolean scanNoFileType; 
            private Integer scanResourceType; 
            private java.util.List<String> scanService; 
            private java.util.List<ScanServiceInfos> scanServiceInfos; 
            private String startTime; 
            private Integer taskCycle; 
            private UserFreezeConfig userFreezeConfig; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.bucketPrefixFilterConfig = model.bucketPrefixFilterConfig;
                this.callbackId = model.callbackId;
                this.distinctHistoryTasks = model.distinctHistoryTasks;
                this.endTime = model.endTime;
                this.executeDate = model.executeDate;
                this.executeTime = model.executeTime;
                this.freeze = model.freeze;
                this.freezeHighRisk1 = model.freezeHighRisk1;
                this.freezeHighRisk2 = model.freezeHighRisk2;
                this.freezeMediumRisk1 = model.freezeMediumRisk1;
                this.freezeMediumRisk2 = model.freezeMediumRisk2;
                this.freezeRestorePath = model.freezeRestorePath;
                this.freezeType = model.freezeType;
                this.prefixFilterType = model.prefixFilterType;
                this.prefixFilters = model.prefixFilters;
                this.priority = model.priority;
                this.referer = model.referer;
                this.scanLimit = model.scanLimit;
                this.scanNoFileType = model.scanNoFileType;
                this.scanResourceType = model.scanResourceType;
                this.scanService = model.scanService;
                this.scanServiceInfos = model.scanServiceInfos;
                this.startTime = model.startTime;
                this.taskCycle = model.taskCycle;
                this.userFreezeConfig = model.userFreezeConfig;
            } 

            /**
             * <p>The filter configuration for each bucket. The key is the bucket name, and the value is the filter configuration, which includes prefix/suffix filters and filter character lists.</p>
             */
            public Builder bucketPrefixFilterConfig(java.util.Map<String, ConfigBucketPrefixFilterConfigValue> bucketPrefixFilterConfig) {
                this.bucketPrefixFilterConfig = bucketPrefixFilterConfig;
                return this;
            }

            /**
             * <p>The callback notification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>188</p>
             */
            public Builder callbackId(Long callbackId) {
                this.callbackId = callbackId;
                return this;
            }

            /**
             * <p>Indicates whether to deduplicate previously scanned tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder distinctHistoryTasks(Boolean distinctHistoryTasks) {
                this.distinctHistoryTasks = distinctHistoryTasks;
                return this;
            }

            /**
             * <p>The end time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-09 10:30:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The execution date of the scheduled task. The value is an integer in the format of a single digit, such as 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executeDate(Integer executeDate) {
                this.executeDate = executeDate;
                return this;
            }

            /**
             * <p>The expected execution time of the scheduled task. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-09 10:30:00</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>Indicates whether to freeze.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freeze(Boolean freeze) {
                this.freeze = freeze;
                return this;
            }

            /**
             * <p>Specifies whether to freeze high-risk images.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeHighRisk1(Boolean freezeHighRisk1) {
                this.freezeHighRisk1 = freezeHighRisk1;
                return this;
            }

            /**
             * <p>Specifies whether to freeze high-risk audio and text.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeHighRisk2(Boolean freezeHighRisk2) {
                this.freezeHighRisk2 = freezeHighRisk2;
                return this;
            }

            /**
             * <p>Specifies whether to freeze medium-risk images.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeMediumRisk1(Boolean freezeMediumRisk1) {
                this.freezeMediumRisk1 = freezeMediumRisk1;
                return this;
            }

            /**
             * <p>Specifies whether to freeze medium-risk audio and text.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder freezeMediumRisk2(Boolean freezeMediumRisk2) {
                this.freezeMediumRisk2 = freezeMediumRisk2;
                return this;
            }

            /**
             * <p>The transfer path.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder freezeRestorePath(String freezeRestorePath) {
                this.freezeRestorePath = freezeRestorePath;
                return this;
            }

            /**
             * <p>The freeze type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACL</p>
             */
            public Builder freezeType(String freezeType) {
                this.freezeType = freezeType;
                return this;
            }

            /**
             * <p>The prefix filter type.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder prefixFilterType(String prefixFilterType) {
                this.prefixFilterType = prefixFilterType;
                return this;
            }

            /**
             * <p>The prefixes.</p>
             */
            public Builder prefixFilters(java.util.List<String> prefixFilters) {
                this.prefixFilters = prefixFilters;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Referer。</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com/">https://www.aliyun.com/</a></p>
             */
            public Builder referer(String referer) {
                this.referer = referer;
                return this;
            }

            /**
             * <p>The scan limit quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder scanLimit(Long scanLimit) {
                this.scanLimit = scanLimit;
                return this;
            }

            /**
             * <p>Indicates whether to scan images without file extensions.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scanNoFileType(Boolean scanNoFileType) {
                this.scanNoFileType = scanNoFileType;
                return this;
            }

            /**
             * <p>The file type to scan.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanResourceType(Integer scanResourceType) {
                this.scanResourceType = scanResourceType;
                return this;
            }

            /**
             * <p>The scan service code.</p>
             */
            public Builder scanService(java.util.List<String> scanService) {
                this.scanService = scanService;
                return this;
            }

            /**
             * <p>The scan service information.</p>
             */
            public Builder scanServiceInfos(java.util.List<ScanServiceInfos> scanServiceInfos) {
                this.scanServiceInfos = scanServiceInfos;
                return this;
            }

            /**
             * <p>The start time. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-21 16:08:38</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The scheduling date.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskCycle(Integer taskCycle) {
                this.taskCycle = taskCycle;
                return this;
            }

            /**
             * <p>The user freeze configuration.</p>
             */
            public Builder userFreezeConfig(UserFreezeConfig userFreezeConfig) {
                this.userFreezeConfig = userFreezeConfig;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
