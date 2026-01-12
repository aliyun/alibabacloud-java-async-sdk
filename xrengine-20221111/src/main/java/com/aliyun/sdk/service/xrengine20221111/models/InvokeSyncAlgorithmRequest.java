// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20221111.models;

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
 * {@link InvokeSyncAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>InvokeSyncAlgorithmRequest</p>
 */
public class InvokeSyncAlgorithmRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Params")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> params;

    private InvokeSyncAlgorithmRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.params = builder.params;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeSyncAlgorithmRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return params
     */
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public static final class Builder extends Request.Builder<InvokeSyncAlgorithmRequest, Builder> {
        private String jobId; 
        private String name; 
        private java.util.Map<String, ?> params; 

        private Builder() {
            super();
        } 

        private Builder(InvokeSyncAlgorithmRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.name = request.name;
            this.params = request.params;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder params(java.util.Map<String, ?> params) {
            String paramsShrink = shrink(params, "Params", "json");
            this.putBodyParameter("Params", paramsShrink);
            this.params = params;
            return this;
        }

        @Override
        public InvokeSyncAlgorithmRequest build() {
            return new InvokeSyncAlgorithmRequest(this);
        } 

    } 

}
