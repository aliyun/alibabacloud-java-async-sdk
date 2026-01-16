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
 * {@link CreatStockOssCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>CreatStockOssCheckTaskRequest</p>
 */
public class CreatStockOssCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketPrefixFilterConfig")
    private String bucketPrefixFilterConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackId")
    private String callbackId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistinctHistoryTasks")
    private Boolean distinctHistoryTasks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteDate")
    private Integer executeDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecuteTime")
    private String executeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Freeze")
    private Boolean freeze;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeHighRisk1")
    private Boolean freezeHighRisk1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeHighRisk2")
    private Boolean freezeHighRisk2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeMediumRisk1")
    private Boolean freezeMediumRisk1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeMediumRisk2")
    private Boolean freezeMediumRisk2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeRestorePath")
    private String freezeRestorePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FreezeType")
    private String freezeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsInc")
    private Boolean isInc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private Integer mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixFilterType")
    private String prefixFilterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrefixFilters")
    private String prefixFilters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Referer")
    private String referer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanLimit")
    private Long scanLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanNoFileType")
    private Boolean scanNoFileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanResourceType")
    private String scanResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanService")
    private String scanService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskCycle")
    private Integer taskCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    private CreatStockOssCheckTaskRequest(Builder builder) {
        super(builder);
        this.bucketPrefixFilterConfig = builder.bucketPrefixFilterConfig;
        this.buckets = builder.buckets;
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
        this.isInc = builder.isInc;
        this.mediaType = builder.mediaType;
        this.prefixFilterType = builder.prefixFilterType;
        this.prefixFilters = builder.prefixFilters;
        this.priority = builder.priority;
        this.referer = builder.referer;
        this.regionId = builder.regionId;
        this.scanLimit = builder.scanLimit;
        this.scanNoFileType = builder.scanNoFileType;
        this.scanResourceType = builder.scanResourceType;
        this.scanService = builder.scanService;
        this.startTime = builder.startTime;
        this.taskCycle = builder.taskCycle;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatStockOssCheckTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketPrefixFilterConfig
     */
    public String getBucketPrefixFilterConfig() {
        return this.bucketPrefixFilterConfig;
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return callbackId
     */
    public String getCallbackId() {
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
     * @return isInc
     */
    public Boolean getIsInc() {
        return this.isInc;
    }

    /**
     * @return mediaType
     */
    public Integer getMediaType() {
        return this.mediaType;
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
    public String getPrefixFilters() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public String getScanResourceType() {
        return this.scanResourceType;
    }

    /**
     * @return scanService
     */
    public String getScanService() {
        return this.scanService;
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

    public static final class Builder extends Request.Builder<CreatStockOssCheckTaskRequest, Builder> {
        private String bucketPrefixFilterConfig; 
        private String buckets; 
        private String callbackId; 
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
        private Boolean isInc; 
        private Integer mediaType; 
        private String prefixFilterType; 
        private String prefixFilters; 
        private Integer priority; 
        private String referer; 
        private String regionId; 
        private Long scanLimit; 
        private Boolean scanNoFileType; 
        private String scanResourceType; 
        private String scanService; 
        private String startTime; 
        private Integer taskCycle; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreatStockOssCheckTaskRequest request) {
            super(request);
            this.bucketPrefixFilterConfig = request.bucketPrefixFilterConfig;
            this.buckets = request.buckets;
            this.callbackId = request.callbackId;
            this.distinctHistoryTasks = request.distinctHistoryTasks;
            this.endTime = request.endTime;
            this.executeDate = request.executeDate;
            this.executeTime = request.executeTime;
            this.freeze = request.freeze;
            this.freezeHighRisk1 = request.freezeHighRisk1;
            this.freezeHighRisk2 = request.freezeHighRisk2;
            this.freezeMediumRisk1 = request.freezeMediumRisk1;
            this.freezeMediumRisk2 = request.freezeMediumRisk2;
            this.freezeRestorePath = request.freezeRestorePath;
            this.freezeType = request.freezeType;
            this.isInc = request.isInc;
            this.mediaType = request.mediaType;
            this.prefixFilterType = request.prefixFilterType;
            this.prefixFilters = request.prefixFilters;
            this.priority = request.priority;
            this.referer = request.referer;
            this.regionId = request.regionId;
            this.scanLimit = request.scanLimit;
            this.scanNoFileType = request.scanNoFileType;
            this.scanResourceType = request.scanResourceType;
            this.scanService = request.scanService;
            this.startTime = request.startTime;
            this.taskCycle = request.taskCycle;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * BucketPrefixFilterConfig.
         */
        public Builder bucketPrefixFilterConfig(String bucketPrefixFilterConfig) {
            this.putQueryParameter("BucketPrefixFilterConfig", bucketPrefixFilterConfig);
            this.bucketPrefixFilterConfig = bucketPrefixFilterConfig;
            return this;
        }

        /**
         * <p>OSS buckets</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Bucket&quot;:&quot;bucket01-test&quot;,&quot;Region&quot;:&quot;cn-beijing&quot;}]</p>
         */
        public Builder buckets(String buckets) {
            this.putQueryParameter("Buckets", buckets);
            this.buckets = buckets;
            return this;
        }

        /**
         * <p>Callback ID</p>
         * 
         * <strong>example:</strong>
         * <p>1751</p>
         */
        public Builder callbackId(String callbackId) {
            this.putQueryParameter("CallbackId", callbackId);
            this.callbackId = callbackId;
            return this;
        }

        /**
         * <p>Flag for deduplicating against previously detected tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder distinctHistoryTasks(Boolean distinctHistoryTasks) {
            this.putQueryParameter("DistinctHistoryTasks", distinctHistoryTasks);
            this.distinctHistoryTasks = distinctHistoryTasks;
            return this;
        }

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-18 10:08:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Execute date of scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder executeDate(Integer executeDate) {
            this.putQueryParameter("ExecuteDate", executeDate);
            this.executeDate = executeDate;
            return this;
        }

        /**
         * <p>Execute time of scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>01:09:30-01:19:30</p>
         */
        public Builder executeTime(String executeTime) {
            this.putQueryParameter("ExecuteTime", executeTime);
            this.executeTime = executeTime;
            return this;
        }

        /**
         * <p>Freeze indicator</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder freeze(Boolean freeze) {
            this.putQueryParameter("Freeze", freeze);
            this.freeze = freeze;
            return this;
        }

        /**
         * <p>Freeze High-Risk Images</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder freezeHighRisk1(Boolean freezeHighRisk1) {
            this.putQueryParameter("FreezeHighRisk1", freezeHighRisk1);
            this.freezeHighRisk1 = freezeHighRisk1;
            return this;
        }

        /**
         * <p>Freeze High-Risk Audio and Text</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder freezeHighRisk2(Boolean freezeHighRisk2) {
            this.putQueryParameter("FreezeHighRisk2", freezeHighRisk2);
            this.freezeHighRisk2 = freezeHighRisk2;
            return this;
        }

        /**
         * <p>Freeze Medium-Risk Images</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder freezeMediumRisk1(Boolean freezeMediumRisk1) {
            this.putQueryParameter("FreezeMediumRisk1", freezeMediumRisk1);
            this.freezeMediumRisk1 = freezeMediumRisk1;
            return this;
        }

        /**
         * <p>Freeze Medium-Risk Audio and Text</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder freezeMediumRisk2(Boolean freezeMediumRisk2) {
            this.putQueryParameter("FreezeMediumRisk2", freezeMediumRisk2);
            this.freezeMediumRisk2 = freezeMediumRisk2;
            return this;
        }

        /**
         * <p>Freeze Restore Path</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder freezeRestorePath(String freezeRestorePath) {
            this.putQueryParameter("FreezeRestorePath", freezeRestorePath);
            this.freezeRestorePath = freezeRestorePath;
            return this;
        }

        /**
         * <p>Freeze type</p>
         * 
         * <strong>example:</strong>
         * <p>ACL</p>
         */
        public Builder freezeType(String freezeType) {
            this.putQueryParameter("FreezeType", freezeType);
            this.freezeType = freezeType;
            return this;
        }

        /**
         * <p>Indicator for scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isInc(Boolean isInc) {
            this.putQueryParameter("IsInc", isInc);
            this.isInc = isInc;
            return this;
        }

        /**
         * <p>Media type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder mediaType(Integer mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>Prefix filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder prefixFilterType(String prefixFilterType) {
            this.putQueryParameter("PrefixFilterType", prefixFilterType);
            this.prefixFilterType = prefixFilterType;
            return this;
        }

        /**
         * <p>Prefix filters</p>
         * 
         * <strong>example:</strong>
         * <p>dir1,dir2</p>
         */
        public Builder prefixFilters(String prefixFilters) {
            this.putQueryParameter("PrefixFilters", prefixFilters);
            this.prefixFilters = prefixFilters;
            return this;
        }

        /**
         * <p>The priority of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>Referer.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        public Builder referer(String referer) {
            this.putQueryParameter("Referer", referer);
            this.referer = referer;
            return this;
        }

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The scan limit of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder scanLimit(Long scanLimit) {
            this.putQueryParameter("ScanLimit", scanLimit);
            this.scanLimit = scanLimit;
            return this;
        }

        /**
         * <p>Indicator for scanning files without file type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scanNoFileType(Boolean scanNoFileType) {
            this.putQueryParameter("ScanNoFileType", scanNoFileType);
            this.scanNoFileType = scanNoFileType;
            return this;
        }

        /**
         * <p>Scan resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder scanResourceType(String scanResourceType) {
            this.putQueryParameter("ScanResourceType", scanResourceType);
            this.scanResourceType = scanResourceType;
            return this;
        }

        /**
         * <p>The code of scan service.</p>
         * 
         * <strong>example:</strong>
         * <p>baselineCheck</p>
         */
        public Builder scanService(String scanService) {
            this.putQueryParameter("ScanService", scanService);
            this.scanService = scanService;
            return this;
        }

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-17 10:08:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Task Cycle</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder taskCycle(Integer taskCycle) {
            this.putQueryParameter("TaskCycle", taskCycle);
            this.taskCycle = taskCycle;
            return this;
        }

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>image task 20240709101602004</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>Task type.</p>
         * 
         * <strong>example:</strong>
         * <p>batch</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreatStockOssCheckTaskRequest build() {
            return new CreatStockOssCheckTaskRequest(this);
        } 

    } 

}
