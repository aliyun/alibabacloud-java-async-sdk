// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ManageTerraformStateResponseBody} extends {@link TeaModel}
 *
 * <p>ManageTerraformStateResponseBody</p>
 */
public class ManageTerraformStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ManageTerraformStateResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageTerraformStateResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ManageTerraformStateResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0A80B4F1-4E8C-515A-B3C1-0E1A9B85B6A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ManageTerraformStateResponseBody build() {
            return new ManageTerraformStateResponseBody(this);
        } 

    } 

}
