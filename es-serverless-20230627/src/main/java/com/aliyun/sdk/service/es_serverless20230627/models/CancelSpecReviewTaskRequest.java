// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSpecReviewTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelSpecReviewTaskRequest</p>
 */
public class CancelSpecReviewTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private CancelSpecReviewTaskRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSpecReviewTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CancelSpecReviewTaskRequest, Builder> {
        private String appName; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelSpecReviewTaskRequest request) {
            super(request);
            this.appName = request.appName;
            this.taskId = request.taskId;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CancelSpecReviewTaskRequest build() {
            return new CancelSpecReviewTaskRequest(this);
        } 

    } 

}
