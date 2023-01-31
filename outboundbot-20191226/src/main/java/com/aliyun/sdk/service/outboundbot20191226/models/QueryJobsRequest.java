// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryJobsRequest} extends {@link RequestModel}
 *
 * <p>QueryJobsRequest</p>
 */
public class QueryJobsRequest extends Request {
    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    private String jobGroupId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    @Query
    @NameInMap("ScenarioId")
    private String scenarioId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("TimeAlignment")
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
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PhoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * ScenarioId.
         */
        public Builder scenarioId(String scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TimeAlignment.
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
