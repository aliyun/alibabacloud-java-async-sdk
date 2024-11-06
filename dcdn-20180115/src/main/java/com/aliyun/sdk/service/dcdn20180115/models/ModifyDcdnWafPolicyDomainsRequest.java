// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The domain names that you want to bind to the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
         * <blockquote>
         * <p>You can configure either <strong>BindDomains</strong> or <strong>UnbindDomains</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com,example2.com</p>
         */
        public Builder bindDomains(String bindDomains) {
            this.putBodyParameter("BindDomains", bindDomains);
            this.bindDomains = bindDomains;
            return this;
        }

        /**
         * <p>The association method. Valid values:</p>
         * <ul>
         * <li>0: replace.</li>
         * <li>1: add.</li>
         * <li>Default value: 0.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter takes effect only when you specify <strong>BindDomains</strong>. If you have associated a domain name indicated by <strong>BindDomains</strong> with the default protection policy, the <code>Policy.DefaultAndCustom.BindToSameDomain</code> error is returned.</p>
         * </li>
         * <li><p>You can only replace accelerated domain names that are bound to the default protection policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder method(Integer method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The ID of the protection policy. You can specify only one ID in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        public Builder policyId(Long policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The domain names that you want to unbind from the protection policy. You can specify up to 50 domain names. Separate multiple domain names with commas (,).</p>
         * <blockquote>
         * <p>You can configure either <strong>BindDomains</strong> or <strong>UnbindDomains</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example3.com</p>
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
