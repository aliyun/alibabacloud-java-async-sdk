// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CreateVmcoreDiagnosisTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVmcoreDiagnosisTaskRequest</p>
 */
public class CreateVmcoreDiagnosisTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("debuginfoCommonUrl")
    private String debuginfoCommonUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("debuginfoUrl")
    private String debuginfoUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dmesgUrl")
    private String dmesgUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vmcoreUrl")
    private String vmcoreUrl;

    private CreateVmcoreDiagnosisTaskRequest(Builder builder) {
        super(builder);
        this.debuginfoCommonUrl = builder.debuginfoCommonUrl;
        this.debuginfoUrl = builder.debuginfoUrl;
        this.dmesgUrl = builder.dmesgUrl;
        this.taskType = builder.taskType;
        this.vmcoreUrl = builder.vmcoreUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVmcoreDiagnosisTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return debuginfoCommonUrl
     */
    public String getDebuginfoCommonUrl() {
        return this.debuginfoCommonUrl;
    }

    /**
     * @return debuginfoUrl
     */
    public String getDebuginfoUrl() {
        return this.debuginfoUrl;
    }

    /**
     * @return dmesgUrl
     */
    public String getDmesgUrl() {
        return this.dmesgUrl;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return vmcoreUrl
     */
    public String getVmcoreUrl() {
        return this.vmcoreUrl;
    }

    public static final class Builder extends Request.Builder<CreateVmcoreDiagnosisTaskRequest, Builder> {
        private String debuginfoCommonUrl; 
        private String debuginfoUrl; 
        private String dmesgUrl; 
        private String taskType; 
        private String vmcoreUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateVmcoreDiagnosisTaskRequest request) {
            super(request);
            this.debuginfoCommonUrl = request.debuginfoCommonUrl;
            this.debuginfoUrl = request.debuginfoUrl;
            this.dmesgUrl = request.dmesgUrl;
            this.taskType = request.taskType;
            this.vmcoreUrl = request.vmcoreUrl;
        } 

        /**
         * debuginfoCommonUrl.
         */
        public Builder debuginfoCommonUrl(String debuginfoCommonUrl) {
            this.putBodyParameter("debuginfoCommonUrl", debuginfoCommonUrl);
            this.debuginfoCommonUrl = debuginfoCommonUrl;
            return this;
        }

        /**
         * debuginfoUrl.
         */
        public Builder debuginfoUrl(String debuginfoUrl) {
            this.putBodyParameter("debuginfoUrl", debuginfoUrl);
            this.debuginfoUrl = debuginfoUrl;
            return this;
        }

        /**
         * dmesgUrl.
         */
        public Builder dmesgUrl(String dmesgUrl) {
            this.putBodyParameter("dmesgUrl", dmesgUrl);
            this.dmesgUrl = dmesgUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vmcore</p>
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * vmcoreUrl.
         */
        public Builder vmcoreUrl(String vmcoreUrl) {
            this.putBodyParameter("vmcoreUrl", vmcoreUrl);
            this.vmcoreUrl = vmcoreUrl;
            return this;
        }

        @Override
        public CreateVmcoreDiagnosisTaskRequest build() {
            return new CreateVmcoreDiagnosisTaskRequest(this);
        } 

    } 

}
