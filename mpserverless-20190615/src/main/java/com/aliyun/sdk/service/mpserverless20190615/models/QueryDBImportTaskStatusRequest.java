// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBImportTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDBImportTaskStatusRequest</p>
 */
public class QueryDBImportTaskStatusRequest extends Request {
    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private QueryDBImportTaskStatusRequest(Builder builder) {
        super(builder);
        this.spaceId = builder.spaceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDBImportTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryDBImportTaskStatusRequest, Builder> {
        private String spaceId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDBImportTaskStatusRequest request) {
            super(request);
            this.spaceId = request.spaceId;
            this.taskId = request.taskId;
        } 

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
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
        public QueryDBImportTaskStatusRequest build() {
            return new QueryDBImportTaskStatusRequest(this);
        } 

    } 

}
