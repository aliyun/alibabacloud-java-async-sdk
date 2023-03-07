// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountingReportRequest} extends {@link RequestModel}
 *
 * <p>GetAccountingReportRequest</p>
 */
public class GetAccountingReportRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Dim")
    private String dim;

    @Query
    @NameInMap("EndTime")
    private Integer endTime;

    @Query
    @NameInMap("FilterValue")
    private String filterValue;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ReportType")
    @Validation(required = true)
    private String reportType;

    @Query
    @NameInMap("StartTime")
    private Integer startTime;

    private GetAccountingReportRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dim = builder.dim;
        this.endTime = builder.endTime;
        this.filterValue = builder.filterValue;
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reportType = builder.reportType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountingReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dim
     */
    public String getDim() {
        return this.dim;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
    }

    /**
     * @return filterValue
     */
    public String getFilterValue() {
        return this.filterValue;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    /**
     * @return startTime
     */
    public Integer getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetAccountingReportRequest, Builder> {
        private String clusterId; 
        private String dim; 
        private Integer endTime; 
        private String filterValue; 
        private String jobId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String reportType; 
        private Integer startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountingReportRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dim = request.dim;
            this.endTime = request.endTime;
            this.filterValue = request.filterValue;
            this.jobId = request.jobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.reportType = request.reportType;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The layers at which you want to query the bandwidth and traffic data. Valid values:
         * <p>
         * 
         * *   user: Query by user.
         * *   queue: Query by queue.
         * *   instance: Query by instance.
         */
        public Builder dim(String dim) {
            this.putQueryParameter("Dim", dim);
            this.dim = dim;
            return this;
        }

        /**
         * The end of the time range to query. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The actual name of the dimension to be queried. Valid values:
         * <p>
         * 
         * *   If you set the value of the parameter Dim to user, the value of FilterValue is the name of the specified user.
         * *   If you set the value of the parameter Dim to queue, the value of FilterValue is the name of the specified queue.
         * *   If you set the value of the parameter Dim to instance, the value of FilterValue is the instance name.
         */
        public Builder filterValue(String filterValue) {
            this.putQueryParameter("FilterValue", filterValue);
            this.filterValue = filterValue;
            return this;
        }

        /**
         * The ID of the job.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 50.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page number of the returned page.
         * <p>
         * 
         * Pages start from page 1.
         * 
         * Default value: 1.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The query type. Valid values:
         * <p>
         * 
         * *   total_report: Queries the number of CPU cores in different dimensions.
         * *   job_report: Collects the historical node data of a node.
         * *   number_report: Queries job information in different dimensions.
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        /**
         * The beginning of the time range to query. This value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(Integer startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetAccountingReportRequest build() {
            return new GetAccountingReportRequest(this);
        } 

    } 

}
