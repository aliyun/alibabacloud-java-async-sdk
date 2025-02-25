// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link KillSparkJobRequest} extends {@link RequestModel}
 *
 * <p>KillSparkJobRequest</p>
 */
public class KillSparkJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vcName;

    private KillSparkJobRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillSparkJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<KillSparkJobRequest, Builder> {
        private String jobId; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(KillSparkJobRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.vcName = request.vcName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>j202011031935hangzhouf742a4330003667</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCluster</p>
         */
        public Builder vcName(String vcName) {
            this.putBodyParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public KillSparkJobRequest build() {
            return new KillSparkJobRequest(this);
        } 

    } 

}
