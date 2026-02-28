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
 * {@link ReupgradeOTATaskRequest} extends {@link RequestModel}
 *
 * <p>ReupgradeOTATaskRequest</p>
 */
public class ReupgradeOTATaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskId;

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
    public java.util.List<String> getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ReupgradeOTATaskRequest, Builder> {
        private String iotInstanceId; 
        private String jobId; 
        private java.util.List<String> taskId; 

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
         * <p>The ID of the instance. You can view the ID of an instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
         * <blockquote>
         * <ul>
         * <li>If the instance has an ID, you must specify the <strong>IotInstanceId</strong> parameter. If you do not specify this parameter, the call fails.</li>
         * <li>If the instance does not have an <strong>ID</strong> or no <strong>Overview</strong> page is displayed for the instance, you do not need to specify this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-v64***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the update batch.</p>
         * <p>After you call the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation to create an update batch, the <strong>JobId</strong> parameter is returned.</p>
         * <p>You can also view the <strong>batch ID</strong> on the <strong>Firmware Details</strong> page in the IoT Platform console.</p>
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>y3tOmCDNgpR8F9jnVEzC01****</p>
         */
        public Builder taskId(java.util.List<String> taskId) {
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
