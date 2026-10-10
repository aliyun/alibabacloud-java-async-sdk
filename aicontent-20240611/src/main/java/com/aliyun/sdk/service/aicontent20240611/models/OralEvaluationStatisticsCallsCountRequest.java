// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link OralEvaluationStatisticsCallsCountRequest} extends {@link RequestModel}
 *
 * <p>OralEvaluationStatisticsCallsCountRequest</p>
 */
public class OralEvaluationStatisticsCallsCountRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("applicationAccessId")
    private String applicationAccessId;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private OralEvaluationStatisticsCallsCountRequest(Builder builder) {
        super(builder);
        this.applicationAccessId = builder.applicationAccessId;
        this.endTime = builder.endTime;
        this.granularity = builder.granularity;
        this.projectId = builder.projectId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OralEvaluationStatisticsCallsCountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationAccessId
     */
    public String getApplicationAccessId() {
        return this.applicationAccessId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<OralEvaluationStatisticsCallsCountRequest, Builder> {
        private String applicationAccessId; 
        private String endTime; 
        private String granularity; 
        private String projectId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(OralEvaluationStatisticsCallsCountRequest request) {
            super(request);
            this.applicationAccessId = request.applicationAccessId;
            this.endTime = request.endTime;
            this.granularity = request.granularity;
            this.projectId = request.projectId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>appId,appkey</p>
         * 
         * <strong>example:</strong>
         * <p>a0007g7</p>
         */
        public Builder applicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }

        /**
         * <p>End Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-15 07:40:01</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Query granularity (hour, Day, month)</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * <p>project ID</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>Start Time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-14 07:40:01</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        @Override
        public OralEvaluationStatisticsCallsCountRequest build() {
            return new OralEvaluationStatisticsCallsCountRequest(this);
        } 

    } 

}
