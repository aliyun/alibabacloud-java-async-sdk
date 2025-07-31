// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link UpdateOssCheckResultsFeedBackRequest} extends {@link RequestModel}
 *
 * <p>UpdateOssCheckResultsFeedBackRequest</p>
 */
public class UpdateOssCheckResultsFeedBackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Feedback")
    private String feedback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryRequestId")
    private String queryRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private UpdateOssCheckResultsFeedBackRequest(Builder builder) {
        super(builder);
        this.feedback = builder.feedback;
        this.queryRequestId = builder.queryRequestId;
        this.regionId = builder.regionId;
        this.serviceCode = builder.serviceCode;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOssCheckResultsFeedBackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return feedback
     */
    public String getFeedback() {
        return this.feedback;
    }

    /**
     * @return queryRequestId
     */
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<UpdateOssCheckResultsFeedBackRequest, Builder> {
        private String feedback; 
        private String queryRequestId; 
        private String regionId; 
        private String serviceCode; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOssCheckResultsFeedBackRequest request) {
            super(request);
            this.feedback = request.feedback;
            this.queryRequestId = request.queryRequestId;
            this.regionId = request.regionId;
            this.serviceCode = request.serviceCode;
            this.taskId = request.taskId;
        } 

        /**
         * Feedback.
         */
        public Builder feedback(String feedback) {
            this.putQueryParameter("Feedback", feedback);
            this.feedback = feedback;
            return this;
        }

        /**
         * QueryRequestId.
         */
        public Builder queryRequestId(String queryRequestId) {
            this.putQueryParameter("QueryRequestId", queryRequestId);
            this.queryRequestId = queryRequestId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ServiceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public UpdateOssCheckResultsFeedBackRequest build() {
            return new UpdateOssCheckResultsFeedBackRequest(this);
        } 

    } 

}
