// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIllegalUrlExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateIllegalUrlExportTaskRequest</p>
 */
public class CreateIllegalUrlExportTaskRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("TimePoint")
    @Validation(required = true)
    private String timePoint;

    private CreateIllegalUrlExportTaskRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.taskName = builder.taskName;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIllegalUrlExportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return timePoint
     */
    public String getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder<CreateIllegalUrlExportTaskRequest, Builder> {
        private Long ownerId; 
        private String taskName; 
        private String timePoint; 

        private Builder() {
            super();
        } 

        private Builder(CreateIllegalUrlExportTaskRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.taskName = response.taskName;
            this.timePoint = response.timePoint;
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
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * TimePoint.
         */
        public Builder timePoint(String timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        @Override
        public CreateIllegalUrlExportTaskRequest build() {
            return new CreateIllegalUrlExportTaskRequest(this);
        } 

    } 

}
