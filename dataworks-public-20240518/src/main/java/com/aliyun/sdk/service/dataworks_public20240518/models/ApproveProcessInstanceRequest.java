// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ApproveProcessInstanceRequest} extends {@link RequestModel}
 *
 * <p>ApproveProcessInstanceRequest</p>
 */
public class ApproveProcessInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalComment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalComment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewExpiration")
    private Long newExpiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processInstanceId;

    private ApproveProcessInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.approvalAction = builder.approvalAction;
        this.approvalComment = builder.approvalComment;
        this.clientToken = builder.clientToken;
        this.newExpiration = builder.newExpiration;
        this.processInstanceId = builder.processInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApproveProcessInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return approvalAction
     */
    public String getApprovalAction() {
        return this.approvalAction;
    }

    /**
     * @return approvalComment
     */
    public String getApprovalComment() {
        return this.approvalComment;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return newExpiration
     */
    public Long getNewExpiration() {
        return this.newExpiration;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public static final class Builder extends Request.Builder<ApproveProcessInstanceRequest, Builder> {
        private String regionId; 
        private String approvalAction; 
        private String approvalComment; 
        private String clientToken; 
        private Long newExpiration; 
        private String processInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ApproveProcessInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.approvalAction = request.approvalAction;
            this.approvalComment = request.approvalComment;
            this.clientToken = request.clientToken;
            this.newExpiration = request.newExpiration;
            this.processInstanceId = request.processInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The approval action. Valid values:</p>
         * <ul>
         * <li><p>Agree: approves the request.</p>
         * </li>
         * <li><p>Deny: rejects the request.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Agree</p>
         */
        public Builder approvalAction(String approvalAction) {
            this.putBodyParameter("ApprovalAction", approvalAction);
            this.approvalAction = approvalAction;
            return this;
        }

        /**
         * <p>The approval comment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Approve authorization</p>
         */
        public Builder approvalComment(String approvalComment) {
            this.putBodyParameter("ApprovalComment", approvalComment);
            this.approvalComment = approvalComment;
            return this;
        }

        /**
         * <p>The idempotency token. We recommend that you use a UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AFAE64E-D1BE-432B-A9*****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The modified authorization expiration time. The value is a millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782541464000</p>
         */
        public Builder newExpiration(Long newExpiration) {
            this.putBodyParameter("NewExpiration", newExpiration);
            this.newExpiration = newExpiration;
            return this;
        }

        /**
         * <p>The flow instance ID. Both new and legacy Security Center approval orders are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>332066440109224007</p>
         */
        public Builder processInstanceId(String processInstanceId) {
            this.putBodyParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        @Override
        public ApproveProcessInstanceRequest build() {
            return new ApproveProcessInstanceRequest(this);
        } 

    } 

}
