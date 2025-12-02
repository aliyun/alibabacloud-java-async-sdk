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
 * {@link GetStockOssCheckTasksListResponseBody} extends {@link TeaModel}
 *
 * <p>GetStockOssCheckTasksListResponseBody</p>
 */
public class GetStockOssCheckTasksListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetStockOssCheckTasksListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStockOssCheckTasksListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetStockOssCheckTasksListResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Data of the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Backend-assigned ID used to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetStockOssCheckTasksListResponseBody build() {
            return new GetStockOssCheckTasksListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStockOssCheckTasksListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStockOssCheckTasksListResponseBody</p>
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
             * <p>Primary service.</p>
             * 
             * <strong>example:</strong>
             * <p>baselineCheck</p>
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * <p>Whether to copy.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * <p>Service code.</p>
             * 
             * <strong>example:</strong>
             * <p>baselineCheck_01</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>通用基线检测</p>
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
     * {@link GetStockOssCheckTasksListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStockOssCheckTasksListResponseBody</p>
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
             * <p>Storage path for transfer</p>
             * 
             * <strong>example:</strong>
             * <p>/backup</p>
             */
            public Builder freezeRestorePath(String freezeRestorePath) {
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
     * {@link GetStockOssCheckTasksListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStockOssCheckTasksListResponseBody</p>
     */
    public static class Config extends TeaModel {
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
             * <p>Callback notification ID</p>
             * 
             * <strong>example:</strong>
             * <p>3942</p>
             */
            public Builder callbackId(Long callbackId) {
                this.callbackId = callbackId;
                return this;
            }

            /**
             * <p>Whether to deduplicate historical detected tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder distinctHistoryTasks(Boolean distinctHistoryTasks) {
                this.distinctHistoryTasks = distinctHistoryTasks;
                return this;
            }

            /**
             * <p>End time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-10 11:42:31</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Scheduled task execution date.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executeDate(Integer executeDate) {
                this.executeDate = executeDate;
                return this;
            }

            /**
             * <p>Scheduled task expected execution time.</p>
             * 
             * <strong>example:</strong>
             * <p>02:00:00</p>
             */
            public Builder executeTime(String executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>Whether to freeze</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder freeze(Boolean freeze) {
                this.freeze = freeze;
                return this;
            }

            /**
             * <p>Freeze high-risk images</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeHighRisk1(Boolean freezeHighRisk1) {
                this.freezeHighRisk1 = freezeHighRisk1;
                return this;
            }

            /**
             * <p>Freeze high-risk audio and text</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeHighRisk2(Boolean freezeHighRisk2) {
                this.freezeHighRisk2 = freezeHighRisk2;
                return this;
            }

            /**
             * <p>Freeze medium-risk images</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeMediumRisk1(Boolean freezeMediumRisk1) {
                this.freezeMediumRisk1 = freezeMediumRisk1;
                return this;
            }

            /**
             * <p>Freeze medium-risk audio and text</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder freezeMediumRisk2(Boolean freezeMediumRisk2) {
                this.freezeMediumRisk2 = freezeMediumRisk2;
                return this;
            }

            /**
             * <p>Storage path for transfer</p>
             * 
             * <strong>example:</strong>
             * <p>/backup</p>
             */
            public Builder freezeRestorePath(String freezeRestorePath) {
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
                this.freezeType = freezeType;
                return this;
            }

            /**
             * <p>Prefix filter type.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder prefixFilterType(String prefixFilterType) {
                this.prefixFilterType = prefixFilterType;
                return this;
            }

            /**
             * <p>Prefixes.</p>
             */
            public Builder prefixFilters(java.util.List<String> prefixFilters) {
                this.prefixFilters = prefixFilters;
                return this;
            }

            /**
             * <p>Priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Referer</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder referer(String referer) {
                this.referer = referer;
                return this;
            }

            /**
             * <p>Scan limit quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scanLimit(Long scanLimit) {
                this.scanLimit = scanLimit;
                return this;
            }

            /**
             * <p>Whether to scan images without file extensions.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scanNoFileType(Boolean scanNoFileType) {
                this.scanNoFileType = scanNoFileType;
                return this;
            }

            /**
             * <p>Scanned file type.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder scanResourceType(Integer scanResourceType) {
                this.scanResourceType = scanResourceType;
                return this;
            }

            /**
             * <p>Scan service code</p>
             */
            public Builder scanService(java.util.List<String> scanService) {
                this.scanService = scanService;
                return this;
            }

            /**
             * <p>Scan service information</p>
             */
            public Builder scanServiceInfos(java.util.List<ScanServiceInfos> scanServiceInfos) {
                this.scanServiceInfos = scanServiceInfos;
                return this;
            }

            /**
             * <p>Start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-21 15:30:19</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Scheduling date.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskCycle(Integer taskCycle) {
                this.taskCycle = taskCycle;
                return this;
            }

            /**
             * <p>Manual freeze configuration</p>
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
    /**
     * 
     * {@link GetStockOssCheckTasksListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStockOssCheckTasksListResponseBody</p>
     */
    public static class Items extends TeaModel {
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

        private Items(Builder builder) {
            this.buckets = builder.buckets;
            this.config = builder.config;
            this.endTime = builder.endTime;
            this.finishNum = builder.finishNum;
            this.isInc = builder.isInc;
            this.lastExecuteDate = builder.lastExecuteDate;
            this.mediaType = builder.mediaType;
            this.nextExecuteDate = builder.nextExecuteDate;
            this.objectNum = builder.objectNum;
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

        public static Items create() {
            return builder().build();
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
            private Long searchNum; 
            private String startTime; 
            private Integer status; 
            private String taskId; 
            private String taskName; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.buckets = model.buckets;
                this.config = model.config;
                this.endTime = model.endTime;
                this.finishNum = model.finishNum;
                this.isInc = model.isInc;
                this.lastExecuteDate = model.lastExecuteDate;
                this.mediaType = model.mediaType;
                this.nextExecuteDate = model.nextExecuteDate;
                this.objectNum = model.objectNum;
                this.searchNum = model.searchNum;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
            } 

            /**
             * <p>Storage space.</p>
             * 
             * <strong>example:</strong>
             * <p>tmp</p>
             */
            public Builder buckets(String buckets) {
                this.buckets = buckets;
                return this;
            }

            /**
             * <p>Configuration items.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>End time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-10 11:42:31</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Number of completed tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder finishNum(Long finishNum) {
                this.finishNum = finishNum;
                return this;
            }

            /**
             * <p>Whether it is a scheduled scan task</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isInc(Boolean isInc) {
                this.isInc = isInc;
                return this;
            }

            /**
             * <p>Next execution time of the scheduled task</p>
             * 
             * <strong>example:</strong>
             * <p>02:00:00</p>
             */
            public Builder lastExecuteDate(String lastExecuteDate) {
                this.lastExecuteDate = lastExecuteDate;
                return this;
            }

            /**
             * <p>Media type.</p>
             * 
             * <strong>example:</strong>
             * <p>video</p>
             */
            public Builder mediaType(Integer mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * <p>Last execution time of the scheduled task</p>
             * 
             * <strong>example:</strong>
             * <p>02:00:00</p>
             */
            public Builder nextExecuteDate(String nextExecuteDate) {
                this.nextExecuteDate = nextExecuteDate;
                return this;
            }

            /**
             * <p>Total number of files in the bucket</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder objectNum(Long objectNum) {
                this.objectNum = objectNum;
                return this;
            }

            /**
             * <p>Number of scan tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder searchNum(Long searchNum) {
                this.searchNum = searchNum;
                return this;
            }

            /**
             * <p>Start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-21 15:30:19</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Task status.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>P_XHDUS</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task name.</p>
             * 
             * <strong>example:</strong>
             * <p>图片定时任务20231205135716797</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>Task type</p>
             * 
             * <strong>example:</strong>
             * <p>batch</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
