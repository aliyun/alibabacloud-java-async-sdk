// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchQueryMotionShopTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryMotionShopTaskStatusRequest</p>
 */
public class BatchQueryMotionShopTaskStatusRequest extends Request {
    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private BatchQueryMotionShopTaskStatusRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryMotionShopTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<BatchQueryMotionShopTaskStatusRequest, Builder> {
        private String jwtToken; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryMotionShopTaskStatusRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.taskId = request.taskId;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public BatchQueryMotionShopTaskStatusRequest build() {
            return new BatchQueryMotionShopTaskStatusRequest(this);
        } 

    } 

}
