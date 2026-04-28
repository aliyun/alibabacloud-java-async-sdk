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
 * {@link ModifyBudgetPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBudgetPolicyResponseBody</p>
 */
public class ModifyBudgetPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    private String gwClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyBudgetPolicyResponseBody(Builder builder) {
        this.gwClusterId = builder.gwClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBudgetPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String gwClusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyBudgetPolicyResponseBody model) {
            this.gwClusterId = model.gwClusterId;
            this.requestId = model.requestId;
        } 

        /**
         * GwClusterId.
         */
        public Builder gwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyBudgetPolicyResponseBody build() {
            return new ModifyBudgetPolicyResponseBody(this);
        } 

    } 

}
