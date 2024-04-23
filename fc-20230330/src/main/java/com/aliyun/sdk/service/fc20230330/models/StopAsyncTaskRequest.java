// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>StopAsyncTaskRequest</p>
 */
public class StopAsyncTaskRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("taskId")
    @Validation(required = true)
    private String taskId;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    private StopAsyncTaskRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.taskId = builder.taskId;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopAsyncTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<StopAsyncTaskRequest, Builder> {
        private String functionName; 
        private String taskId; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(StopAsyncTaskRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.taskId = request.taskId;
            this.qualifier = request.qualifier;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
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

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public StopAsyncTaskRequest build() {
            return new StopAsyncTaskRequest(this);
        } 

    } 

}
