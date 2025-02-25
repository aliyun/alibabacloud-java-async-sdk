// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDcdnWafPolicyDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDcdnWafPolicyDomainsResponseBody</p>
 */
public class ModifyDcdnWafPolicyDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDcdnWafPolicyDomainsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDcdnWafPolicyDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-2B35-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDcdnWafPolicyDomainsResponseBody build() {
            return new ModifyDcdnWafPolicyDomainsResponseBody(this);
        } 

    } 

}
