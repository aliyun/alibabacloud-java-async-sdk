// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link DetachControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>DetachControlPolicyRequest</p>
 */
public class DetachControlPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetId;

    private DetachControlPolicyRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachControlPolicyRequest create() {
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
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<DetachControlPolicyRequest, Builder> {
        private String policyId; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(DetachControlPolicyRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.targetId = request.targetId;
        } 

        /**
         * <p>The ID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-jExXAqIYkwHN****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The ID of the object from which you want to detach the access control policy. Access control policies can be attached to the following objects:</p>
         * <ul>
         * <li>Root folder</li>
         * <li>Subfolders of the Root folder</li>
         * <li>Members</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-ZDNPiT****</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public DetachControlPolicyRequest build() {
            return new DetachControlPolicyRequest(this);
        } 

    } 

}
