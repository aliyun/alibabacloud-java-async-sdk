// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatStockOssCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>CreatStockOssCheckTaskRequest</p>
 */
public class CreatStockOssCheckTaskRequest extends Request {
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
        this.freezeType = builder.freezeType;
        this.isInc = builder.isInc;
        this.mediaType = builder.mediaType;
        this.prefixFilterType = builder.prefixFilterType;
        this.prefixFilters = builder.prefixFilters;
        this.priority = builder.priority;
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
        private String freezeType; 
        private Boolean isInc; 
        private Integer mediaType; 
        private String prefixFilterType; 
        private String prefixFilters; 
        private Integer priority; 
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
            this.freezeType = request.freezeType;
            this.isInc = request.isInc;
            this.mediaType = request.mediaType;
            this.prefixFilterType = request.prefixFilterType;
            this.prefixFilters = request.prefixFilters;
            this.priority = request.priority;
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
         * Buckets.
         */
        public Builder buckets(String buckets) {
            this.putQueryParameter("Buckets", buckets);
            this.buckets = buckets;
            return this;
        }

        /**
         * CallbackId.
         */
        public Builder callbackId(String callbackId) {
            this.putQueryParameter("CallbackId", callbackId);
            this.callbackId = callbackId;
            return this;
        }

        /**
         * DistinctHistoryTasks.
         */
        public Builder distinctHistoryTasks(Boolean distinctHistoryTasks) {
            this.putQueryParameter("DistinctHistoryTasks", distinctHistoryTasks);
            this.distinctHistoryTasks = distinctHistoryTasks;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecuteDate.
         */
        public Builder executeDate(Integer executeDate) {
            this.putQueryParameter("ExecuteDate", executeDate);
            this.executeDate = executeDate;
            return this;
        }

        /**
         * ExecuteTime.
         */
        public Builder executeTime(String executeTime) {
            this.putQueryParameter("ExecuteTime", executeTime);
            this.executeTime = executeTime;
            return this;
        }

        /**
         * Freeze.
         */
        public Builder freeze(Boolean freeze) {
            this.putQueryParameter("Freeze", freeze);
            this.freeze = freeze;
            return this;
        }

        /**
         * FreezeHighRisk1.
         */
        public Builder freezeHighRisk1(Boolean freezeHighRisk1) {
            this.putQueryParameter("FreezeHighRisk1", freezeHighRisk1);
            this.freezeHighRisk1 = freezeHighRisk1;
            return this;
        }

        /**
         * FreezeHighRisk2.
         */
        public Builder freezeHighRisk2(Boolean freezeHighRisk2) {
            this.putQueryParameter("FreezeHighRisk2", freezeHighRisk2);
            this.freezeHighRisk2 = freezeHighRisk2;
            return this;
        }

        /**
         * FreezeMediumRisk1.
         */
        public Builder freezeMediumRisk1(Boolean freezeMediumRisk1) {
            this.putQueryParameter("FreezeMediumRisk1", freezeMediumRisk1);
            this.freezeMediumRisk1 = freezeMediumRisk1;
            return this;
        }

        /**
         * FreezeMediumRisk2.
         */
        public Builder freezeMediumRisk2(Boolean freezeMediumRisk2) {
            this.putQueryParameter("FreezeMediumRisk2", freezeMediumRisk2);
            this.freezeMediumRisk2 = freezeMediumRisk2;
            return this;
        }

        /**
         * FreezeType.
         */
        public Builder freezeType(String freezeType) {
            this.putQueryParameter("FreezeType", freezeType);
            this.freezeType = freezeType;
            return this;
        }

        /**
         * IsInc.
         */
        public Builder isInc(Boolean isInc) {
            this.putQueryParameter("IsInc", isInc);
            this.isInc = isInc;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(Integer mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * PrefixFilterType.
         */
        public Builder prefixFilterType(String prefixFilterType) {
            this.putQueryParameter("PrefixFilterType", prefixFilterType);
            this.prefixFilterType = prefixFilterType;
            return this;
        }

        /**
         * PrefixFilters.
         */
        public Builder prefixFilters(String prefixFilters) {
            this.putQueryParameter("PrefixFilters", prefixFilters);
            this.prefixFilters = prefixFilters;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScanLimit.
         */
        public Builder scanLimit(Long scanLimit) {
            this.putQueryParameter("ScanLimit", scanLimit);
            this.scanLimit = scanLimit;
            return this;
        }

        /**
         * ScanNoFileType.
         */
        public Builder scanNoFileType(Boolean scanNoFileType) {
            this.putQueryParameter("ScanNoFileType", scanNoFileType);
            this.scanNoFileType = scanNoFileType;
            return this;
        }

        /**
         * ScanResourceType.
         */
        public Builder scanResourceType(String scanResourceType) {
            this.putQueryParameter("ScanResourceType", scanResourceType);
            this.scanResourceType = scanResourceType;
            return this;
        }

        /**
         * ScanService.
         */
        public Builder scanService(String scanService) {
            this.putQueryParameter("ScanService", scanService);
            this.scanService = scanService;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskCycle.
         */
        public Builder taskCycle(Integer taskCycle) {
            this.putQueryParameter("TaskCycle", taskCycle);
            this.taskCycle = taskCycle;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskType.
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
