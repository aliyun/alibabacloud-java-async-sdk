// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachRabbitmqPublisherRequest} extends {@link RequestModel}
 *
 * <p>AttachRabbitmqPublisherRequest</p>
 */
public class AttachRabbitmqPublisherRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("publisherId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publisherId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private AttachRabbitmqPublisherRequest(Builder builder) {
        super(builder);
        this.publisherId = builder.publisherId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachRabbitmqPublisherRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return publisherId
     */
    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<AttachRabbitmqPublisherRequest, Builder> {
        private String publisherId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(AttachRabbitmqPublisherRequest request) {
            super(request);
            this.publisherId = request.publisherId;
            this.taskId = request.taskId;
        } 

        /**
         * publisherId.
         */
        public Builder publisherId(String publisherId) {
            this.putPathParameter("publisherId", publisherId);
            this.publisherId = publisherId;
            return this;
        }

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public AttachRabbitmqPublisherRequest build() {
            return new AttachRabbitmqPublisherRequest(this);
        } 

    } 

}
