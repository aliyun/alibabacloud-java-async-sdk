// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLastOnceTaskInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLastOnceTaskInfoRequest</p>
 */
public class GetLastOnceTaskInfoRequest extends Request {
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

    private GetLastOnceTaskInfoRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
        this.taskName = builder.taskName;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLastOnceTaskInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetLastOnceTaskInfoRequest, Builder> {
        private String source; 
        private String taskName; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(GetLastOnceTaskInfoRequest request) {
            super(request);
            this.source = request.source;
            this.taskName = request.taskName;
            this.taskType = request.taskType;
        } 

        /**
         * The number of tasks that have been completed.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the latest scan task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public GetLastOnceTaskInfoRequest build() {
            return new GetLastOnceTaskInfoRequest(this);
        } 

    } 

}
