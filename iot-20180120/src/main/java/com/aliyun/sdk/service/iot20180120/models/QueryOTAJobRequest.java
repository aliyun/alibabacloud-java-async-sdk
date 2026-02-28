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
 * {@link QueryOTAJobRequest} extends {@link RequestModel}
 *
 * <p>QueryOTAJobRequest</p>
 */
public class QueryOTAJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    private QueryOTAJobRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOTAJobRequest create() {
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

    public static final class Builder extends Request.Builder<QueryOTAJobRequest, Builder> {
        private String iotInstanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOTAJobRequest request) {
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
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ID of the update batch.</p>
         * <p>After you call the <a href="https://help.aliyun.com/document_detail/147480.html">CreateOTAVerifyJob</a>, <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a>, or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> API operation to create the update batch, you can obtain the <strong>JobId</strong> parameter. You can also view the batch ID on the <strong>Update Package Details</strong> page of the IoT Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wahVIzGkCMuAUE2gDERM02****</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public QueryOTAJobRequest build() {
            return new QueryOTAJobRequest(this);
        } 

    } 

}
