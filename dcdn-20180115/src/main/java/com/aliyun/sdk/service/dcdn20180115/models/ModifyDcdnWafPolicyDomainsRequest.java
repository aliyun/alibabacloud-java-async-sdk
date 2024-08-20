// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDcdnWafPolicyDomainsRequest} extends {@link RequestModel}
 *
 * <p>ModifyDcdnWafPolicyDomainsRequest</p>
 */
public class ModifyDcdnWafPolicyDomainsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BindDomains")
    private String bindDomains;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Method")
    private Integer method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnbindDomains")
    private String unbindDomains;

    private ModifyDcdnWafPolicyDomainsRequest(Builder builder) {
        super(builder);
        this.bindDomains = builder.bindDomains;
        this.method = builder.method;
        this.policyId = builder.policyId;
        this.unbindDomains = builder.unbindDomains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDcdnWafPolicyDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindDomains
     */
    public String getBindDomains() {
        return this.bindDomains;
    }

    /**
     * @return method
     */
    public Integer getMethod() {
        return this.method;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return unbindDomains
     */
    public String getUnbindDomains() {
        return this.unbindDomains;
    }

    public static final class Builder extends Request.Builder<ModifyDcdnWafPolicyDomainsRequest, Builder> {
        private String bindDomains; 
        private Integer method; 
        private Long policyId; 
        private String unbindDomains; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDcdnWafPolicyDomainsRequest request) {
            super(request);
            this.bindDomains = request.bindDomains;
            this.method = request.method;
            this.policyId = request.policyId;
            this.unbindDomains = request.unbindDomains;
        } 

        /**
         * The domain names that you want to bind to the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).
         * <p>
         * 
         * > You can configure either **BindDomains** or **UnbindDomains**.
         */
        public Builder bindDomains(String bindDomains) {
            this.putBodyParameter("BindDomains", bindDomains);
            this.bindDomains = bindDomains;
            return this;
        }

        /**
         * The association method. Valid values:
         * <p>
         * 
         * *   0: replace.
         * *   1: add.
         * *   Default value: 0.
         * 
         * > 
         * 
         * *   This parameter takes effect only when you specify **BindDomains**. If you have associated a domain name indicated by **BindDomains** with the default protection policy, the `Policy.DefaultAndCustom.BindToSameDomain` error is returned.
         * 
         * *   You can only replace accelerated domain names that are bound to the default protection policy.
         */
        public Builder method(Integer method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * The ID of the protection policy. You can specify only one ID in each request.
         */
        public Builder policyId(Long policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The domain names that you want to unbind from the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).
         * <p>
         * 
         * > You can configure either **BindDomains** or **UnbindDomains**.
         */
        public Builder unbindDomains(String unbindDomains) {
            this.putBodyParameter("UnbindDomains", unbindDomains);
            this.unbindDomains = unbindDomains;
            return this;
        }

        @Override
        public ModifyDcdnWafPolicyDomainsRequest build() {
            return new ModifyDcdnWafPolicyDomainsRequest(this);
        } 

    } 

}
