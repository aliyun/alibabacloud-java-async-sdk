// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyPolarClawSkillResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPolarClawSkillResponseBody</p>
 */
public class ModifyPolarClawSkillResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("EvaluateStatus")
    private String evaluateStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskDetail")
    private String riskDetail;

    private ModifyPolarClawSkillResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.evaluateStatus = builder.evaluateStatus;
        this.requestId = builder.requestId;
        this.riskDetail = builder.riskDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolarClawSkillResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return evaluateStatus
     */
    public String getEvaluateStatus() {
        return this.evaluateStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskDetail
     */
    public String getRiskDetail() {
        return this.riskDetail;
    }

    public static final class Builder {
        private String applicationId; 
        private String evaluateStatus; 
        private String requestId; 
        private String riskDetail; 

        private Builder() {
        } 

        private Builder(ModifyPolarClawSkillResponseBody model) {
            this.applicationId = model.applicationId;
            this.evaluateStatus = model.evaluateStatus;
            this.requestId = model.requestId;
            this.riskDetail = model.riskDetail;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The evaluation status.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder evaluateStatus(String evaluateStatus) {
            this.evaluateStatus = evaluateStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The baseline risk details.</p>
         * 
         * <strong>example:</strong>
         * <p>riskDetail</p>
         */
        public Builder riskDetail(String riskDetail) {
            this.riskDetail = riskDetail;
            return this;
        }

        public ModifyPolarClawSkillResponseBody build() {
            return new ModifyPolarClawSkillResponseBody(this);
        } 

    } 

}
