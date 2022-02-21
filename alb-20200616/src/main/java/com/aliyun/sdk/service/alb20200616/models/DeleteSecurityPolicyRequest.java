// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecurityPolicyRequest</p>
 */
public class DeleteSecurityPolicyRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("SecurityPolicyId")
    @Validation(required = true)
    private String securityPolicyId;

    private DeleteSecurityPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.securityPolicyId = builder.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityPolicyRequest create() {
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
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public static final class Builder extends Request.Builder<DeleteSecurityPolicyRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String securityPolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecurityPolicyRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.securityPolicyId = response.securityPolicyId;
        } 

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 安全策略Id
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putQueryParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        @Override
        public DeleteSecurityPolicyRequest build() {
            return new DeleteSecurityPolicyRequest(this);
        } 

    } 

}
