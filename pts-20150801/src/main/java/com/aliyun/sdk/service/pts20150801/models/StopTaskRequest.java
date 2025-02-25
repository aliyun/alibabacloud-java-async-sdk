// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopTaskRequest} extends {@link RequestModel}
 *
 * <p>StopTaskRequest</p>
 */
public class StopTaskRequest extends Request {
    @Query
    @NameInMap("Msg")
    private String msg;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Integer taskId;

    @Query
    @NameInMap("Type")
    private String type;

    private StopTaskRequest(Builder builder) {
        super(builder);
        this.msg = builder.msg;
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return taskId
     */
    public Integer getTaskId() {
        return this.taskId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<StopTaskRequest, Builder> {
        private String msg; 
        private Integer taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(StopTaskRequest request) {
            super(request);
            this.msg = request.msg;
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.putQueryParameter("Msg", msg);
            this.msg = msg;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Integer taskId) {
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
        public StopTaskRequest build() {
            return new StopTaskRequest(this);
        } 

    } 

}
