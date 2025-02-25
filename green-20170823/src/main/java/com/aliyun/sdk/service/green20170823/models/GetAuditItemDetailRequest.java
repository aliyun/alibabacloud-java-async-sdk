// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuditItemDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAuditItemDetailRequest</p>
 */
public class GetAuditItemDetailRequest extends Request {
    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("Type")
    private String type;

    private GetAuditItemDetailRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuditItemDetailRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAuditItemDetailRequest, Builder> {
        private String taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetAuditItemDetailRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAuditItemDetailRequest build() {
            return new GetAuditItemDetailRequest(this);
        } 

    } 

}
