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
 * {@link QueryJobsRequest} extends {@link RequestModel}
 *
 * <p>QueryJobsRequest</p>
 */
public class QueryJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobGroupId")
    private String jobGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private String scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeAlignment")
    private String timeAlignment;

    private QueryJobsRequest(Builder builder) {
        super(builder);
        this.contactName = builder.contactName;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.phoneNumber = builder.phoneNumber;
        this.scenarioId = builder.scenarioId;
        this.startTime = builder.startTime;
        this.timeAlignment = builder.timeAlignment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeAlignment
     */
    public String getTimeAlignment() {
        return this.timeAlignment;
    }

    public static final class Builder extends Request.Builder<QueryJobsRequest, Builder> {
        private String contactName; 
        private Long endTime; 
        private String instanceId; 
        private String jobGroupId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String phoneNumber; 
        private String scenarioId; 
        private Long startTime; 
        private String timeAlignment; 

        private Builder() {
            super();
        } 

        private Builder(QueryJobsRequest request) {
            super(request);
            this.contactName = request.contactName;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.phoneNumber = request.phoneNumber;
            this.scenarioId = request.scenarioId;
            this.startTime = request.startTime;
            this.timeAlignment = request.timeAlignment;
        } 

        /**
         * <p>The contact name for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The end time for filtering. Default value: 0, which indicates the current time. Specify a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579077794665</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The job group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>994b8baf-7ef8-480c-b141-b7b6db77c4df</p>
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
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
         * <p>The page size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The contact phone number for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>135****8888</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The scenario ID. <strong>[Deprecated]</strong> Legacy parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>b0f35dd1-0337-402e-9c4f-3a6c2426950a</p>
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * <p>The start time for filtering. Default value: 0, which indicates 00:00 today. Specify a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time basis for filtering. This parameter specifies the filtering criterion rather than a specific date or time. Valid values:</p>
         * <ul>
         * <li>start: Filters by start time.</li>
         * <li>end: Filters by end time.</li>
         * <li>job_create: Filters by job creation time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        public Builder timeAlignment(String timeAlignment) {
            this.putQueryParameter("TimeAlignment", timeAlignment);
            this.timeAlignment = timeAlignment;
            return this;
        }

        @Override
        public QueryJobsRequest build() {
            return new QueryJobsRequest(this);
        } 

    } 

}
