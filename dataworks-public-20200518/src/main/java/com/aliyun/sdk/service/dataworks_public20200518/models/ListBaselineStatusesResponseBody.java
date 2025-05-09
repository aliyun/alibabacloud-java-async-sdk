// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListBaselineStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBaselineStatusesResponseBody</p>
 */
public class ListBaselineStatusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListBaselineStatusesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaselineStatusesResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListBaselineStatusesResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBaselineStatusesResponseBody build() {
            return new ListBaselineStatusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBaselineStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBaselineStatusesResponseBody</p>
     */
    public static class BaselineStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("BaselineType")
        private String baselineType;

        @com.aliyun.core.annotation.NameInMap("Bizdate")
        private Long bizdate;

        @com.aliyun.core.annotation.NameInMap("Buffer")
        private Long buffer;

        @com.aliyun.core.annotation.NameInMap("EndCast")
        private Long endCast;

        @com.aliyun.core.annotation.NameInMap("ExpTime")
        private Long expTime;

        @com.aliyun.core.annotation.NameInMap("FinishStatus")
        private String finishStatus;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("InGroupId")
        private Integer inGroupId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SlaTime")
        private Long slaTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private BaselineStatuses(Builder builder) {
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
            this.baselineType = builder.baselineType;
            this.bizdate = builder.bizdate;
            this.buffer = builder.buffer;
            this.endCast = builder.endCast;
            this.expTime = builder.expTime;
            this.finishStatus = builder.finishStatus;
            this.finishTime = builder.finishTime;
            this.inGroupId = builder.inGroupId;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.slaTime = builder.slaTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineStatuses create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return baselineName
         */
        public String getBaselineName() {
            return this.baselineName;
        }

        /**
         * @return baselineType
         */
        public String getBaselineType() {
            return this.baselineType;
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return buffer
         */
        public Long getBuffer() {
            return this.buffer;
        }

        /**
         * @return endCast
         */
        public Long getEndCast() {
            return this.endCast;
        }

        /**
         * @return expTime
         */
        public Long getExpTime() {
            return this.expTime;
        }

        /**
         * @return finishStatus
         */
        public String getFinishStatus() {
            return this.finishStatus;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return inGroupId
         */
        public Integer getInGroupId() {
            return this.inGroupId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return slaTime
         */
        public Long getSlaTime() {
            return this.slaTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long baselineId; 
            private String baselineName; 
            private String baselineType; 
            private Long bizdate; 
            private Long buffer; 
            private Long endCast; 
            private Long expTime; 
            private String finishStatus; 
            private Long finishTime; 
            private Integer inGroupId; 
            private String owner; 
            private Integer priority; 
            private Long projectId; 
            private Long slaTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(BaselineStatuses model) {
                this.baselineId = model.baselineId;
                this.baselineName = model.baselineName;
                this.baselineType = model.baselineType;
                this.bizdate = model.bizdate;
                this.buffer = model.buffer;
                this.endCast = model.endCast;
                this.expTime = model.expTime;
                this.finishStatus = model.finishStatus;
                this.finishTime = model.finishTime;
                this.inGroupId = model.inGroupId;
                this.owner = model.owner;
                this.priority = model.priority;
                this.projectId = model.projectId;
                this.slaTime = model.slaTime;
                this.status = model.status;
            } 

            /**
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Baseline name</p>
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * <p>The type of the baseline, including DAILY and HOURLY. Separate multiple types with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY,HOURLY</p>
             */
            public Builder baselineType(String baselineType) {
                this.baselineType = baselineType;
                return this;
            }

            /**
             * <p>The data timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1553443200000</p>
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * <p>The margin of the baseline instance. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder buffer(Long buffer) {
                this.buffer = buffer;
                return this;
            }

            /**
             * <p>The timestamp of the predicted time when the baseline instance finished running.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531400000</p>
             */
            public Builder endCast(Long endCast) {
                this.endCast = endCast;
                return this;
            }

            /**
             * <p>The timestamp of the alerting time of the baseline instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531400000</p>
             */
            public Builder expTime(Long expTime) {
                this.expTime = expTime;
                return this;
            }

            /**
             * <p>The status of the baseline instance. Valid values: UNFINISH and FINISH.</p>
             * 
             * <strong>example:</strong>
             * <p>UNFINISH</p>
             */
            public Builder finishStatus(String finishStatus) {
                this.finishStatus = finishStatus;
                return this;
            }

            /**
             * <p>The timestamp of the actual time when the baseline instance finished running. This parameter is returned if the value of the FinishStatus parameter is FINISH.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531400000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the cycle of the baseline instance. Valid values of the ID of an hour-level cycle: [1,24]. The ID of a day-level cycle is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inGroupId(Integer inGroupId) {
                this.inGroupId = inGroupId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>9527952795****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the baseline belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The timestamp of the actual time when the baseline instance finished running.</p>
             * 
             * <strong>example:</strong>
             * <p>1553531400000</p>
             */
            public Builder slaTime(Long slaTime) {
                this.slaTime = slaTime;
                return this;
            }

            /**
             * <p>The status of the baseline. Valid values: ERROR, SAFE, DANGEROUS, and OVER. The value ERROR indicates that no nodes are associated with the baseline, or all nodes associated with the baseline are suspended. The value SAFE indicates that nodes are run before the alert duration begins. The value DANGEROUS indicates that nodes are still running after the alert duration ends but the committed completion time does not arrive. The value OVER indicates that nodes are still running after the committed completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>SAFE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BaselineStatuses build() {
                return new BaselineStatuses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBaselineStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListBaselineStatusesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineStatuses")
        private java.util.List<BaselineStatuses> baselineStatuses;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.baselineStatuses = builder.baselineStatuses;
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
         * @return baselineStatuses
         */
        public java.util.List<BaselineStatuses> getBaselineStatuses() {
            return this.baselineStatuses;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private java.util.List<BaselineStatuses> baselineStatuses; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baselineStatuses = model.baselineStatuses;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of baseline instances.</p>
             */
            public Builder baselineStatuses(java.util.List<BaselineStatuses> baselineStatuses) {
                this.baselineStatuses = baselineStatuses;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of baseline instances.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
