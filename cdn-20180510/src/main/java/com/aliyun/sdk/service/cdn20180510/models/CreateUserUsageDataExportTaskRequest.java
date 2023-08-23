// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserUsageDataExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateUserUsageDataExportTaskRequest</p>
 */
public class CreateUserUsageDataExportTaskRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("TaskName")
    private String taskName;

    private CreateUserUsageDataExportTaskRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.language = builder.language;
        this.startTime = builder.startTime;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserUsageDataExportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<CreateUserUsageDataExportTaskRequest, Builder> {
        private String endTime; 
        private String language; 
        private String startTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserUsageDataExportTaskRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.language = request.language;
            this.startTime = request.startTime;
            this.taskName = request.taskName;
        } 

        /**
         * The end of the time range to query. The end time must be later than the start time.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The language in which you want to export the file. Default value: zh-cn. Valid values:
         * <p>
         * 
         * *   **zh-cn**: Chinese
         * *   **en-us**: English
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The start of the time range to query. The data is collected every 5 minutes.
         * <p>
         * 
         * Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The name of the task.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public CreateUserUsageDataExportTaskRequest build() {
            return new CreateUserUsageDataExportTaskRequest(this);
        } 

    } 

}
