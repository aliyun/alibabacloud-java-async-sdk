// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpecReviewTaskRequest} extends {@link RequestModel}
 *
 * <p>GetSpecReviewTaskRequest</p>
 */
public class GetSpecReviewTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskId;

    private GetSpecReviewTaskRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpecReviewTaskRequest create() {
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
    public Integer getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetSpecReviewTaskRequest, Builder> {
        private String appName; 
        private Integer taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetSpecReviewTaskRequest request) {
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
        public Builder taskId(Integer taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetSpecReviewTaskRequest build() {
            return new GetSpecReviewTaskRequest(this);
        } 

    } 

}
