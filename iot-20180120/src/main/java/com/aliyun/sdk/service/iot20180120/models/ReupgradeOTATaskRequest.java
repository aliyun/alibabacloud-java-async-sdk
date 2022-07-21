// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReupgradeOTATaskRequest} extends {@link RequestModel}
 *
 * <p>ReupgradeOTATaskRequest</p>
 */
public class ReupgradeOTATaskRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private java.util.List < String > taskId;

    private ReupgradeOTATaskRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReupgradeOTATaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return taskId
     */
    public java.util.List < String > getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ReupgradeOTATaskRequest, Builder> {
        private String iotInstanceId; 
        private String jobId; 
        private java.util.List < String > taskId; 

        private Builder() {
            super();
        } 

        private Builder(ReupgradeOTATaskRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
            this.taskId = request.taskId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(java.util.List < String > taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ReupgradeOTATaskRequest build() {
            return new ReupgradeOTATaskRequest(this);
        } 

    } 

}
