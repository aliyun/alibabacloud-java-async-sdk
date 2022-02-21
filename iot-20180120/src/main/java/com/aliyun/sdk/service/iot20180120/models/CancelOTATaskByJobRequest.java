// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOTATaskByJobRequest} extends {@link RequestModel}
 *
 * <p>CancelOTATaskByJobRequest</p>
 */
public class CancelOTATaskByJobRequest extends Request {
    @Query
    @NameInMap("CancelInProgressTask")
    private Boolean cancelInProgressTask;

    @Query
    @NameInMap("CancelNotifiedTask")
    private Boolean cancelNotifiedTask;

    @Query
    @NameInMap("CancelQueuedTask")
    private Boolean cancelQueuedTask;

    @Query
    @NameInMap("CancelScheduledTask")
    private Boolean cancelScheduledTask;

    @Query
    @NameInMap("CancelUnconfirmedTask")
    private Boolean cancelUnconfirmedTask;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    private CancelOTATaskByJobRequest(Builder builder) {
        super(builder);
        this.cancelInProgressTask = builder.cancelInProgressTask;
        this.cancelNotifiedTask = builder.cancelNotifiedTask;
        this.cancelQueuedTask = builder.cancelQueuedTask;
        this.cancelScheduledTask = builder.cancelScheduledTask;
        this.cancelUnconfirmedTask = builder.cancelUnconfirmedTask;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOTATaskByJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cancelInProgressTask
     */
    public Boolean getCancelInProgressTask() {
        return this.cancelInProgressTask;
    }

    /**
     * @return cancelNotifiedTask
     */
    public Boolean getCancelNotifiedTask() {
        return this.cancelNotifiedTask;
    }

    /**
     * @return cancelQueuedTask
     */
    public Boolean getCancelQueuedTask() {
        return this.cancelQueuedTask;
    }

    /**
     * @return cancelScheduledTask
     */
    public Boolean getCancelScheduledTask() {
        return this.cancelScheduledTask;
    }

    /**
     * @return cancelUnconfirmedTask
     */
    public Boolean getCancelUnconfirmedTask() {
        return this.cancelUnconfirmedTask;
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

    public static final class Builder extends Request.Builder<CancelOTATaskByJobRequest, Builder> {
        private Boolean cancelInProgressTask; 
        private Boolean cancelNotifiedTask; 
        private Boolean cancelQueuedTask; 
        private Boolean cancelScheduledTask; 
        private Boolean cancelUnconfirmedTask; 
        private String iotInstanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOTATaskByJobRequest response) {
            super(response);
            this.cancelInProgressTask = response.cancelInProgressTask;
            this.cancelNotifiedTask = response.cancelNotifiedTask;
            this.cancelQueuedTask = response.cancelQueuedTask;
            this.cancelScheduledTask = response.cancelScheduledTask;
            this.cancelUnconfirmedTask = response.cancelUnconfirmedTask;
            this.iotInstanceId = response.iotInstanceId;
            this.jobId = response.jobId;
        } 

        /**
         * CancelInProgressTask.
         */
        public Builder cancelInProgressTask(Boolean cancelInProgressTask) {
            this.putQueryParameter("CancelInProgressTask", cancelInProgressTask);
            this.cancelInProgressTask = cancelInProgressTask;
            return this;
        }

        /**
         * CancelNotifiedTask.
         */
        public Builder cancelNotifiedTask(Boolean cancelNotifiedTask) {
            this.putQueryParameter("CancelNotifiedTask", cancelNotifiedTask);
            this.cancelNotifiedTask = cancelNotifiedTask;
            return this;
        }

        /**
         * CancelQueuedTask.
         */
        public Builder cancelQueuedTask(Boolean cancelQueuedTask) {
            this.putQueryParameter("CancelQueuedTask", cancelQueuedTask);
            this.cancelQueuedTask = cancelQueuedTask;
            return this;
        }

        /**
         * CancelScheduledTask.
         */
        public Builder cancelScheduledTask(Boolean cancelScheduledTask) {
            this.putQueryParameter("CancelScheduledTask", cancelScheduledTask);
            this.cancelScheduledTask = cancelScheduledTask;
            return this;
        }

        /**
         * CancelUnconfirmedTask.
         */
        public Builder cancelUnconfirmedTask(Boolean cancelUnconfirmedTask) {
            this.putQueryParameter("CancelUnconfirmedTask", cancelUnconfirmedTask);
            this.cancelUnconfirmedTask = cancelUnconfirmedTask;
            return this;
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

        @Override
        public CancelOTATaskByJobRequest build() {
            return new CancelOTATaskByJobRequest(this);
        } 

    } 

}
