// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishSdkRequest} extends {@link RequestModel}
 *
 * <p>PublishSdkRequest</p>
 */
public class PublishSdkRequest extends Request {
    @Query
    @NameInMap("taskId")
    private String taskId;

    private PublishSdkRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishSdkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<PublishSdkRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(PublishSdkRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public PublishSdkRequest build() {
            return new PublishSdkRequest(this);
        } 

    } 

}
