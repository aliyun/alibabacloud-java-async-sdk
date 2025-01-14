// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DetachPolicy2ApprovalProcessRequest} extends {@link RequestModel}
 *
 * <p>DetachPolicy2ApprovalProcessRequest</p>
 */
public class DetachPolicy2ApprovalProcessRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processId;

    private DetachPolicy2ApprovalProcessRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.policyType = builder.policyType;
        this.processId = builder.processId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachPolicy2ApprovalProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return processId
     */
    public String getProcessId() {
        return this.processId;
    }

    public static final class Builder extends Request.Builder<DetachPolicy2ApprovalProcessRequest, Builder> {
        private String policyId; 
        private String policyType; 
        private String processId; 

        private Builder() {
            super();
        } 

        private Builder(DetachPolicy2ApprovalProcessRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.policyType = request.policyType;
            this.processId = request.processId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ladp-27a4fedf5e73****</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PeripheralBlock</p>
         */
        public Builder policyType(String policyType) {
            this.putBodyParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-2677fcf063f5****</p>
         */
        public Builder processId(String processId) {
            this.putBodyParameter("ProcessId", processId);
            this.processId = processId;
            return this;
        }

        @Override
        public DetachPolicy2ApprovalProcessRequest build() {
            return new DetachPolicy2ApprovalProcessRequest(this);
        } 

    } 

}
