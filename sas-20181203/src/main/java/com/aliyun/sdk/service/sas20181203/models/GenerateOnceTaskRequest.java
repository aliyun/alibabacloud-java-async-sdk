// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>GenerateOnceTaskRequest</p>
 */
public class GenerateOnceTaskRequest extends Request {
    @Query
    @NameInMap("Param")
    @Validation(required = true)
    private String param;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TaskType")
    @Validation(required = true)
    private String taskType;

    private GenerateOnceTaskRequest(Builder builder) {
        super(builder);
        this.param = builder.param;
        this.source = builder.source;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOnceTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<GenerateOnceTaskRequest, Builder> {
        private String param; 
        private String source; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOnceTaskRequest request) {
            super(request);
            this.param = request.param;
            this.source = request.source;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * The collection time.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * The total number of scan tasks.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the last scan task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * Indicates whether you can create more scan tasks. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         * 
         * > By default, a maximum of 10 scan tasks can be running at the same time. If 10 image scan tasks are running, you cannot create a scan task by calling this operation. You must wait for at least one of the 10 existing scan tasks to complete before you can create a scan task.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GenerateOnceTaskRequest build() {
            return new GenerateOnceTaskRequest(this);
        } 

    } 

}
