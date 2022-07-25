// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPackSceneTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetPackSceneTaskStatusRequest</p>
 */
public class GetPackSceneTaskStatusRequest extends Request {
    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private GetPackSceneTaskStatusRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPackSceneTaskStatusRequest create() {
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

    public static final class Builder extends Request.Builder<GetPackSceneTaskStatusRequest, Builder> {
        private String taskId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetPackSceneTaskStatusRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.type = request.type;
        } 

        /**
         * 任务ID
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * 操作类型：download（下载），sync（同步）
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetPackSceneTaskStatusRequest build() {
            return new GetPackSceneTaskStatusRequest(this);
        } 

    } 

}
