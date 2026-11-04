// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListSkillGroupSummaryReportsByIntervalRequest} extends {@link RequestModel}
 *
 * <p>ListSkillGroupSummaryReportsByIntervalRequest</p>
 */
public class ListSkillGroupSummaryReportsByIntervalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private String interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupIds")
    private String skillGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private ListSkillGroupSummaryReportsByIntervalRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.interval = builder.interval;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.skillGroupIds = builder.skillGroupIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupSummaryReportsByIntervalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
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
     * @return skillGroupIds
     */
    public String getSkillGroupIds() {
        return this.skillGroupIds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListSkillGroupSummaryReportsByIntervalRequest, Builder> {
        private String endTime; 
        private String instanceId; 
        private String interval; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String skillGroupIds; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillGroupSummaryReportsByIntervalRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.interval = request.interval;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.skillGroupIds = request.skillGroupIds;
            this.startTime = request.startTime;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
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
         * SkillGroupIds.
         */
        public Builder skillGroupIds(String skillGroupIds) {
            this.putQueryParameter("SkillGroupIds", skillGroupIds);
            this.skillGroupIds = skillGroupIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListSkillGroupSummaryReportsByIntervalRequest build() {
            return new ListSkillGroupSummaryReportsByIntervalRequest(this);
        } 

    } 

}
