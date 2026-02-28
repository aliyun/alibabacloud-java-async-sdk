// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelOTATaskByJobRequest} extends {@link RequestModel}
 *
 * <p>CancelOTATaskByJobRequest</p>
 */
public class CancelOTATaskByJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelInProgressTask")
    private Boolean cancelInProgressTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelNotifiedTask")
    private Boolean cancelNotifiedTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelQueuedTask")
    private Boolean cancelQueuedTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelScheduledTask")
    private Boolean cancelScheduledTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CancelUnconfirmedTask")
    private Boolean cancelUnconfirmedTask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CancelOTATaskByJobRequest request) {
            super(request);
            this.cancelInProgressTask = request.cancelInProgressTask;
            this.cancelNotifiedTask = request.cancelNotifiedTask;
            this.cancelQueuedTask = request.cancelQueuedTask;
            this.cancelScheduledTask = request.cancelScheduledTask;
            this.cancelUnconfirmedTask = request.cancelUnconfirmedTask;
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>Specifies whether to cancel the update tasks that are in the <strong>IN_PROGRESS</strong> state in an update batch. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: cancel the update tasks that are in the IN_PROGRESS state.</li>
         * <li><strong>false</strong>: do not cancel the update tasks that are in the IN_PROGRESS state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cancelInProgressTask(Boolean cancelInProgressTask) {
            this.putQueryParameter("CancelInProgressTask", cancelInProgressTask);
            this.cancelInProgressTask = cancelInProgressTask;
            return this;
        }

        /**
         * <p>Specifies whether to cancel the update tasks that are in the <strong>NOTIFIED</strong> state in an update batch. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: cancel the update tasks that are in the NOTIFIED state.</li>
         * <li><strong>false</strong>: do not cancel the update tasks that are in the NOTIFIED state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cancelNotifiedTask(Boolean cancelNotifiedTask) {
            this.putQueryParameter("CancelNotifiedTask", cancelNotifiedTask);
            this.cancelNotifiedTask = cancelNotifiedTask;
            return this;
        }

        /**
         * <p>Specifies whether to cancel the update tasks that are in the <strong>QUEUED</strong> state in an update batch. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: cancel the update tasks that are in the NOTIFIED state.</li>
         * <li><strong>false</strong>: do not cancel the update tasks that are in the NOTIFIED state.</li>
         * </ul>
         * <blockquote>
         * <p>If you set this parameter to <strong>true</strong> and specify the <strong>CancelUnconfirmedTask</strong> parameter, only the update tasks that are in the QUEUED state are canceled. If you do not specify the <strong>CancelUnconfirmedTask</strong> parameter, the update tasks that are in the QUEUED or CONFIRM state are canceled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cancelQueuedTask(Boolean cancelQueuedTask) {
            this.putQueryParameter("CancelQueuedTask", cancelQueuedTask);
            this.cancelQueuedTask = cancelQueuedTask;
            return this;
        }

        /**
         * <p>Specifies whether to cancel update tasks of a scheduled update batch. If you specify the <strong>ScheduleTime</strong> parameter when you call the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> operation, a scheduled update batch is created. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: cancel update tasks of a scheduled update batch.</li>
         * <li><strong>false</strong>: do not cancel update tasks of a scheduled update batch.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cancelScheduledTask(Boolean cancelScheduledTask) {
            this.putQueryParameter("CancelScheduledTask", cancelScheduledTask);
            this.cancelScheduledTask = cancelScheduledTask;
            return this;
        }

        /**
         * <p>Specifies whether to cancel the update tasks that are in the <strong>CONFIRM</strong> state in an update batch. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: cancel the update tasks that are in the CONFIRM state.</li>
         * <li><strong>false</strong>: do not cancel the update tasks that are in the CONFIRM state.</li>
         * </ul>
         * <p>This parameter is empty by default.</p>
         * <blockquote>
         * <p>If you do not specify this parameter and set the <strong>CancelQueuedTask</strong> parameter to <strong>true</strong>, the update tasks that are in the CONFIRM state are canceled. If you set the <strong>CancelQueuedTask</strong> parameter to <strong>false</strong>, the update tasks that are in the CONFIRM state are not canceled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cancelUnconfirmedTask(Boolean cancelUnconfirmedTask) {
            this.putQueryParameter("CancelUnconfirmedTask", cancelUnconfirmedTask);
            this.cancelUnconfirmedTask = cancelUnconfirmedTask;
            return this;
        }

        /**
         * <p>The ID of the instance. You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or an instance ID is not displayed in the IoT Platform console, ignore this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the update batch.</p>
         * <p>Use the value that is returned for the <strong>JobId</strong> parameter contained in the response of the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation. You can also obtain the batch ID on the <strong>Firmware Details</strong> page of the IoT Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7glPHmaDYLAYMD1HHutT02****</p>
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
