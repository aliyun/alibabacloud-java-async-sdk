// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20221014.models;

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
 * {@link GetCoordinationTicketRequest} extends {@link RequestModel}
 *
 * <p>GetCoordinationTicketRequest</p>
 */
public class GetCoordinationTicketRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetCoordinationTicketRequest(Builder builder) {
        super(builder);
        this.coId = builder.coId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCoordinationTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coId
     */
    public String getCoId() {
        return this.coId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetCoordinationTicketRequest, Builder> {
        private String coId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetCoordinationTicketRequest request) {
            super(request);
            this.coId = request.coId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>co-ik1nu2hxg5zbu****</p>
         */
        public Builder coId(String coId) {
            this.putBodyParameter("CoId", coId);
            this.coId = coId;
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
        public GetCoordinationTicketRequest build() {
            return new GetCoordinationTicketRequest(this);
        } 

    } 

}
