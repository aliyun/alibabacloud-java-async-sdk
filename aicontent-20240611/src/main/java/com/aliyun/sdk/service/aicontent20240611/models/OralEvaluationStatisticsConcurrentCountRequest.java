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
 * {@link OralEvaluationStatisticsConcurrentCountRequest} extends {@link RequestModel}
 *
 * <p>OralEvaluationStatisticsConcurrentCountRequest</p>
 */
public class OralEvaluationStatisticsConcurrentCountRequest extends Request {
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

    private OralEvaluationStatisticsConcurrentCountRequest(Builder builder) {
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

    public static OralEvaluationStatisticsConcurrentCountRequest create() {
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

    public static final class Builder extends Request.Builder<OralEvaluationStatisticsConcurrentCountRequest, Builder> {
        private String applicationAccessId; 
        private String endTime; 
        private String granularity; 
        private String projectId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(OralEvaluationStatisticsConcurrentCountRequest request) {
            super(request);
            this.applicationAccessId = request.applicationAccessId;
            this.endTime = request.endTime;
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
        public OralEvaluationStatisticsConcurrentCountRequest build() {
            return new OralEvaluationStatisticsConcurrentCountRequest(this);
        } 

    } 

}
