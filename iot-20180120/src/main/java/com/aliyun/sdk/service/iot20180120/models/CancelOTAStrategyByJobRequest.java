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
 * {@link CancelOTAStrategyByJobRequest} extends {@link RequestModel}
 *
 * <p>CancelOTAStrategyByJobRequest</p>
 */
public class CancelOTAStrategyByJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private CancelOTAStrategyByJobRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOTAStrategyByJobRequest create() {
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

    public static final class Builder extends Request.Builder<CancelOTAStrategyByJobRequest, Builder> {
        private String iotInstanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOTAStrategyByJobRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
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
         * <p>After you call the <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation to create an update batch, the <strong>JobId</strong> parameter is returned. You can also view the batch ID on the <strong>Firmware Details</strong> page of the IoT Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HvKuBpuk3rdk6E92CP****0200</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public CancelOTAStrategyByJobRequest build() {
            return new CancelOTAStrategyByJobRequest(this);
        } 

    } 

}
