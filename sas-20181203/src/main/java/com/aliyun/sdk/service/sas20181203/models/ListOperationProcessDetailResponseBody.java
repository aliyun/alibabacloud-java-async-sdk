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
 * {@link ListOperationProcessDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationProcessDetailResponseBody</p>
 */
public class ListOperationProcessDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("ProcessDetails")
    private java.util.List<ProcessDetails> processDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListOperationProcessDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.processDetails = builder.processDetails;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationProcessDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return processDetails
     */
    public java.util.List<ProcessDetails> getProcessDetails() {
        return this.processDetails;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List<ProcessDetails> processDetails; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The information about the operation subtasks.</p>
         */
        public Builder processDetails(java.util.List<ProcessDetails> processDetails) {
            this.processDetails = processDetails;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE500770-42D3-442E-9DDD-156E0F9F3***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOperationProcessDetailResponseBody build() {
            return new ListOperationProcessDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationProcessDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationProcessDetailResponseBody</p>
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
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
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
    /**
     * 
     * {@link ListOperationProcessDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationProcessDetailResponseBody</p>
     */
    public static class Checks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckShowName")
        private String checkShowName;

        private Checks(Builder builder) {
            this.checkId = builder.checkId;
            this.checkShowName = builder.checkShowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checks create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkShowName
         */
        public String getCheckShowName() {
            return this.checkShowName;
        }

        public static final class Builder {
            private Long checkId; 
            private String checkShowName; 

            /**
             * <p>The ID of the check item associated with the operation subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>133</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The name of the check item associated with the operation subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>Check for Security Center Agent Status</p>
             */
            public Builder checkShowName(String checkShowName) {
                this.checkShowName = checkShowName;
                return this;
            }

            public Checks build() {
                return new Checks(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOperationProcessDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationProcessDetailResponseBody</p>
     */
    public static class ProcessDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetSubType")
        private Integer assetSubType;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private Integer assetType;

        @com.aliyun.core.annotation.NameInMap("AssetVendor")
        private Integer assetVendor;

        @com.aliyun.core.annotation.NameInMap("Checks")
        private java.util.List<Checks> checks;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DetailTaskId")
        private String detailTaskId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Integer statusCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private ProcessDetails(Builder builder) {
            this.assetSubType = builder.assetSubType;
            this.assetType = builder.assetType;
            this.assetVendor = builder.assetVendor;
            this.checks = builder.checks;
            this.createTime = builder.createTime;
            this.detailTaskId = builder.detailTaskId;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.statusCode = builder.statusCode;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProcessDetails create() {
            return builder().build();
        }

        /**
         * @return assetSubType
         */
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        /**
         * @return assetType
         */
        public Integer getAssetType() {
            return this.assetType;
        }

        /**
         * @return assetVendor
         */
        public Integer getAssetVendor() {
            return this.assetVendor;
        }

        /**
         * @return checks
         */
        public java.util.List<Checks> getChecks() {
            return this.checks;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return detailTaskId
         */
        public String getDetailTaskId() {
            return this.detailTaskId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return statusCode
         */
        public Integer getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Integer assetSubType; 
            private Integer assetType; 
            private Integer assetVendor; 
            private java.util.List<Checks> checks; 
            private Long createTime; 
            private String detailTaskId; 
            private Long endTime; 
            private Long startTime; 
            private Integer statusCode; 
            private String taskId; 

            /**
             * <p>The subtype of the asset associated with the operation subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder assetSubType(Integer assetSubType) {
                this.assetSubType = assetSubType;
                return this;
            }

            /**
             * <p>The type of the asset associated with the operation subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder assetType(Integer assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The vendor of the asset associated with the operation subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assetVendor(Integer assetVendor) {
                this.assetVendor = assetVendor;
                return this;
            }

            /**
             * <p>The check items associated with the operation subtask.</p>
             */
            public Builder checks(java.util.List<Checks> checks) {
                this.checks = checks;
                return this;
            }

            /**
             * <p>The timestamp when the task was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1706544199000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the operation subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>fb4bcd41-a916-46bc-ab1a-65fd383be***</p>
             */
            public Builder detailTaskId(String detailTaskId) {
                this.detailTaskId = detailTaskId;
                return this;
            }

            /**
             * <p>The end timestamp of the operation subtask. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1706544199000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start timestamp of the operation subtask. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1730335622000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The subtask status code. Enumerated values:</p>
             * <ul>
             * <li>0: not started.</li>
             * <li>1: running.</li>
             * <li>2: successful.</li>
             * <li>3: times out.</li>
             * <li>4: failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder statusCode(Integer statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The ID of the operation subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>v34578b8-e567-47ec-2345-3e5b077ca***</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ProcessDetails build() {
                return new ProcessDetails(this);
            } 

        } 

    }
}
