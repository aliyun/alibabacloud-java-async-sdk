// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsServiceLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsServiceLogRequest</p>
 */
public class DescribeDtsServiceLogRequest extends Request {
    @Query
    @NameInMap("DtsJobId")
    private String dtsJobId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SubJobType")
    private String subJobType;

    private DescribeDtsServiceLogRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.subJobType = builder.subJobType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDtsServiceLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return subJobType
     */
    public String getSubJobType() {
        return this.subJobType;
    }

    public static final class Builder extends Request.Builder<DescribeDtsServiceLogRequest, Builder> {
        private String dtsJobId; 
        private Long endTime; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long startTime; 
        private String status; 
        private String subJobType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDtsServiceLogRequest request) {
            super(request);
            this.dtsJobId = request.dtsJobId;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
            this.status = request.status;
            this.subJobType = request.subJobType;
        } 

        /**
         * The ID of the data migration or synchronization task.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * The end of the time range to query. You can call the [DescribePreCheckStatus](~~209718~~) operation to query the execution time of the subtasks.
         * <p>
         * 
         * > *   To obtain the logs that are generated for DTS subtasks within a specific period of time, you can call the [DescribePreCheckStatus](~~209718~~) operation to query the execution time of the subtasks.
         * >*   Specify the time in the 13-digit UNIX timestamp format. Unit: milliseconds. You can use a search engine to obtain a UNIX timestamp converter.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The keyword that is passed to specify the query content.
         * <p>
         * 
         * >  Fuzzy match is used and the keyword is case-sensitive.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The number of the page to return. The value must be an integer that is greater than 0 and less than or equal to the maximum value supported by the integer data type. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of log entries to return on each page. Valid values: **20**, **50**, **100**, **500**, and **1000**. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * > *   To obtain the logs that are generated for Data Transmission Service (DTS) subtasks within a specific period of time, you can call the [DescribePreCheckStatus](~~209718~~) operation to query the execution time of the subtasks.
         * >*   Specify the time in the 13-digit UNIX timestamp format. Unit: milliseconds. You can use a search engine to obtain a UNIX timestamp converter.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The log level. Separate multiple log levels with commas (,). Valid values:
         * <p>
         * 
         * *   **NORMAL**: displays the logs that are generated when the DTS task runs as expected.
         * *   **WARN**: displays the logs about severe issues that stop the DTS task from running.
         * *   **ERROR**: displays the logs about unexpected issues that stop specific processes form running.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of a DTS subtask. Valid values:
         * <p>
         * 
         * *   **DATA_LOAD**: full migration or full synchronization
         * *   **ONLINE_WRITER**: incremental migration
         * *   **SYNC_WRITER**: incremental synchronization
         */
        public Builder subJobType(String subJobType) {
            this.putQueryParameter("SubJobType", subJobType);
            this.subJobType = subJobType;
            return this;
        }

        @Override
        public DescribeDtsServiceLogRequest build() {
            return new DescribeDtsServiceLogRequest(this);
        } 

    } 

}
