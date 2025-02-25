// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link DescribeDtsServiceLogRequest} extends {@link RequestModel}
 *
 * <p>DescribeDtsServiceLogRequest</p>
 */
public class DescribeDtsServiceLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubJobType")
    private String subJobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private DescribeDtsServiceLogRequest(Builder builder) {
        super(builder);
        this.dtsJobId = builder.dtsJobId;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.subJobType = builder.subJobType;
        this.zeroEtlJob = builder.zeroEtlJob;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<DescribeDtsServiceLogRequest, Builder> {
        private String dtsJobId; 
        private Long endTime; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private Long startTime; 
        private String status; 
        private String subJobType; 
        private Boolean zeroEtlJob; 

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
            this.resourceGroupId = request.resourceGroupId;
            this.startTime = request.startTime;
            this.status = request.status;
            this.subJobType = request.subJobType;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The ID of the data migration or synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>c1yr56py103****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The end of the time range to query. You can call the <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> operation to query the execution time of the subtasks.</p>
         * <blockquote>
         * <ul>
         * <li>To obtain the logs that are generated for DTS subtasks within a specific period of time, you can call the <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> operation to query the execution time of the subtasks.</li>
         * <li>Specify the time in the 13-digit UNIX timestamp format. Unit: milliseconds. You can use a search engine to obtain a UNIX timestamp converter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1620897227000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The keyword that is passed to specify the query content.</p>
         * <blockquote>
         * <p> Fuzzy match is used and the keyword is case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>state = IDLE</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The number of the page to return. The value must be an integer that is greater than 0 and less than or equal to the maximum value supported by the integer data type. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of log entries to return on each page. Valid values: <strong>20</strong>, <strong>50</strong>, <strong>100</strong>, <strong>500</strong>, and <strong>1000</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * <blockquote>
         * <ul>
         * <li>To obtain the logs that are generated for Data Transmission Service (DTS) subtasks within a specific period of time, you can call the <a href="https://help.aliyun.com/document_detail/209718.html">DescribePreCheckStatus</a> operation to query the execution time of the subtasks.</li>
         * <li>Specify the time in the 13-digit UNIX timestamp format. Unit: milliseconds. You can use a search engine to obtain a UNIX timestamp converter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1620896327000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The log level. Separate multiple log levels with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: displays the logs that are generated when the DTS task runs as expected.</li>
         * <li><strong>WARN</strong>: displays the logs about severe issues that stop the DTS task from running.</li>
         * <li><strong>ERROR</strong>: displays the logs about unexpected issues that stop specific processes form running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL,WARN,ERROR</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of a DTS subtask. Valid values:</p>
         * <ul>
         * <li><strong>DATA_LOAD</strong>: full migration or full synchronization</li>
         * <li><strong>ONLINE_WRITER</strong>: incremental migration</li>
         * <li><strong>SYNC_WRITER</strong>: incremental synchronization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYNC_WRITER</p>
         */
        public Builder subJobType(String subJobType) {
            this.putQueryParameter("SubJobType", subJobType);
            this.subJobType = subJobType;
            return this;
        }

        /**
         * <p>Whether it is a seamless integration (Zero-ETL) task, the value can be: - <strong>true</strong>: Yes. - <strong>false</strong>: No.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public DescribeDtsServiceLogRequest build() {
            return new DescribeDtsServiceLogRequest(this);
        } 

    } 

}
