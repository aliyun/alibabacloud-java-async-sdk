// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetRealtimeConcurrencyReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeConcurrencyReportResponseBody</p>
 */
public class GetRealtimeConcurrencyReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ReportDate")
    private Long reportDate;

    @com.aliyun.core.annotation.NameInMap("Reports")
    private Reports reports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRealtimeConcurrencyReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.reportDate = builder.reportDate;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeConcurrencyReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return reportDate
     */
    public Long getReportDate() {
        return this.reportDate;
    }

    /**
     * @return reports
     */
    public Reports getReports() {
        return this.reports;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Long reportDate; 
        private Reports reports; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRealtimeConcurrencyReportResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.reportDate = model.reportDate;
            this.reports = model.reports;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The time when the report was generated. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1743474900488</p>
         */
        public Builder reportDate(Long reportDate) {
            this.reportDate = reportDate;
            return this;
        }

        /**
         * <p>The report details.</p>
         */
        public Builder reports(Reports reports) {
            this.reports = reports;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRealtimeConcurrencyReportResponseBody build() {
            return new GetRealtimeConcurrencyReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRealtimeConcurrencyReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetRealtimeConcurrencyReportResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("JobGroupId")
        private String jobGroupId;

        @com.aliyun.core.annotation.NameInMap("JobGroupName")
        private String jobGroupName;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrencyLimit")
        private Long maxConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("MinConcurrencyLimit")
        private Long minConcurrencyLimit;

        @com.aliyun.core.annotation.NameInMap("OccupiedConcurrencyCount")
        private Long occupiedConcurrencyCount;

        @com.aliyun.core.annotation.NameInMap("ReportDate")
        private Long reportDate;

        private List(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.jobGroupId = builder.jobGroupId;
            this.jobGroupName = builder.jobGroupName;
            this.maxConcurrencyLimit = builder.maxConcurrencyLimit;
            this.minConcurrencyLimit = builder.minConcurrencyLimit;
            this.occupiedConcurrencyCount = builder.occupiedConcurrencyCount;
            this.reportDate = builder.reportDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return jobGroupId
         */
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        /**
         * @return jobGroupName
         */
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        /**
         * @return maxConcurrencyLimit
         */
        public Long getMaxConcurrencyLimit() {
            return this.maxConcurrencyLimit;
        }

        /**
         * @return minConcurrencyLimit
         */
        public Long getMinConcurrencyLimit() {
            return this.minConcurrencyLimit;
        }

        /**
         * @return occupiedConcurrencyCount
         */
        public Long getOccupiedConcurrencyCount() {
            return this.occupiedConcurrencyCount;
        }

        /**
         * @return reportDate
         */
        public Long getReportDate() {
            return this.reportDate;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private String jobGroupId; 
            private String jobGroupName; 
            private Long maxConcurrencyLimit; 
            private Long minConcurrencyLimit; 
            private Long occupiedConcurrencyCount; 
            private Long reportDate; 

            private Builder() {
            } 

            private Builder(List model) {
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.jobGroupId = model.jobGroupId;
                this.jobGroupName = model.jobGroupName;
                this.maxConcurrencyLimit = model.maxConcurrencyLimit;
                this.minConcurrencyLimit = model.minConcurrencyLimit;
                this.occupiedConcurrencyCount = model.occupiedConcurrencyCount;
                this.reportDate = model.reportDate;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>85bf7efa-a07c-498a-850e-99a5849b8589</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent outbound call scenario</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
             */
            public Builder jobGroupId(String jobGroupId) {
                this.jobGroupId = jobGroupId;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>First job group</p>
             */
            public Builder jobGroupName(String jobGroupName) {
                this.jobGroupName = jobGroupName;
                return this;
            }

            /**
             * <p>The configured maximum concurrency limit.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxConcurrencyLimit(Long maxConcurrencyLimit) {
                this.maxConcurrencyLimit = maxConcurrencyLimit;
                return this;
            }

            /**
             * <p>The minimum concurrency limit for the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minConcurrencyLimit(Long minConcurrencyLimit) {
                this.minConcurrencyLimit = minConcurrencyLimit;
                return this;
            }

            /**
             * <p>The occupied concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder occupiedConcurrencyCount(Long occupiedConcurrencyCount) {
                this.occupiedConcurrencyCount = occupiedConcurrencyCount;
                return this;
            }

            /**
             * <p>The time when the report was generated. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1743474900488</p>
             */
            public Builder reportDate(Long reportDate) {
                this.reportDate = reportDate;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRealtimeConcurrencyReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetRealtimeConcurrencyReportResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Reports(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of reports.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
