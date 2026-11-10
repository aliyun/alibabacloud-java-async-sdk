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
 * {@link DeleteTransitRouterPolicyTableRequest} extends {@link RequestModel}
 *
 * <p>DeleteTransitRouterPolicyTableRequest</p>
 */
public class DeleteTransitRouterPolicyTableRequest extends Request {
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

    private DeleteTransitRouterPolicyTableRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.policyTableId = builder.policyTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTransitRouterPolicyTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DeleteTransitRouterPolicyTableRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String policyTableId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTransitRouterPolicyTableRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.policyTableId = request.policyTableId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
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
        public DeleteTransitRouterPolicyTableRequest build() {
            return new DeleteTransitRouterPolicyTableRequest(this);
        } 

    } 

}
