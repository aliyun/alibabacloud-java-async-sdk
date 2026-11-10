// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link AssociateTransitRouterPolicyTableRequest} extends {@link RequestModel}
 *
 * <p>AssociateTransitRouterPolicyTableRequest</p>
 */
public class AssociateTransitRouterPolicyTableRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attachmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyTableId;

    private AssociateTransitRouterPolicyTableRequest(Builder builder) {
        super(builder);
        this.attachmentId = builder.attachmentId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.policyTableId = builder.policyTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateTransitRouterPolicyTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachmentId
     */
    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return policyTableId
     */
    public String getPolicyTableId() {
        return this.policyTableId;
    }

    public static final class Builder extends Request.Builder<AssociateTransitRouterPolicyTableRequest, Builder> {
        private String attachmentId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String policyTableId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateTransitRouterPolicyTableRequest request) {
            super(request);
            this.attachmentId = request.attachmentId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.policyTableId = request.policyTableId;
        } 

        /**
         * <p>The ID of the network instance connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-2nalp6yksc805w****</p>
         */
        public Builder attachmentId(String attachmentId) {
            this.putQueryParameter("AttachmentId", attachmentId);
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value from your client. Make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request. The dry run includes checks on permissions and instance status. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): sends a normal request. The system performs the check and directly associates the policy route table if the check passes.</li>
         * <li><strong>true</strong>: sends a dry run request. The system only performs the check and does not associate the policy route table. Check items include whether required parameters are specified and the request format. If the check fails, an error is returned. If the check passes, the request ID is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance ID of the policy routing table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ptbl-abc123xyz</p>
         */
        public Builder policyTableId(String policyTableId) {
            this.putQueryParameter("PolicyTableId", policyTableId);
            this.policyTableId = policyTableId;
            return this;
        }

        @Override
        public AssociateTransitRouterPolicyTableRequest build() {
            return new AssociateTransitRouterPolicyTableRequest(this);
        } 

    } 

}
