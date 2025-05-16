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
 * {@link OralEvaluationStatisticsErrorCountRequest} extends {@link RequestModel}
 *
 * <p>OralEvaluationStatisticsErrorCountRequest</p>
 */
public class OralEvaluationStatisticsErrorCountRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("applicationAccessId")
    private String applicationAccessId;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private java.util.List<String> errorCode;

    @com.aliyun.core.annotation.NameInMap("granularity")
    private String granularity;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private OralEvaluationStatisticsErrorCountRequest(Builder builder) {
        super(builder);
        this.applicationAccessId = builder.applicationAccessId;
        this.endTime = builder.endTime;
        this.errorCode = builder.errorCode;
        this.granularity = builder.granularity;
        this.projectId = builder.projectId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OralEvaluationStatisticsErrorCountRequest create() {
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
     * @return errorCode
     */
    public java.util.List<String> getErrorCode() {
        return this.errorCode;
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

    public static final class Builder extends Request.Builder<OralEvaluationStatisticsErrorCountRequest, Builder> {
        private String applicationAccessId; 
        private String endTime; 
        private java.util.List<String> errorCode; 
        private String granularity; 
        private String projectId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(OralEvaluationStatisticsErrorCountRequest request) {
            super(request);
            this.applicationAccessId = request.applicationAccessId;
            this.endTime = request.endTime;
            this.errorCode = request.errorCode;
            this.granularity = request.granularity;
            this.projectId = request.projectId;
            this.startTime = request.startTime;
        } 

        /**
         * applicationAccessId.
         */
        public Builder applicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(java.util.List<String> errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * granularity.
         */
        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        @Override
        public OralEvaluationStatisticsErrorCountRequest build() {
            return new OralEvaluationStatisticsErrorCountRequest(this);
        } 

    } 

}
