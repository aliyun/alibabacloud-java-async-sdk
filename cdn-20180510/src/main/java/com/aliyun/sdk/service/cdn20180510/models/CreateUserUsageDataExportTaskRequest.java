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
    @NameInMap("OwnerId")
    private Long ownerId;

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
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private String startTime; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserUsageDataExportTaskRequest response) {
            super(response);
            this.endTime = response.endTime;
            this.language = response.language;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.taskName = response.taskName;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TaskName.
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
