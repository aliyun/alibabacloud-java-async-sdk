// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifyInstancesSSLResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstancesSSLResponseBody</p>
 */
public class ModifyInstancesSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceNames")
    private java.util.List<String> instanceNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyInstancesSSLResponseBody(Builder builder) {
        this.instanceNames = builder.instanceNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstancesSSLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceNames
     */
    public java.util.List<String> getInstanceNames() {
        return this.instanceNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> instanceNames; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyInstancesSSLResponseBody model) {
            this.instanceNames = model.instanceNames;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The RDS Supabase instances whose SSL settings are modified.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     &quot;ra-supabase-xxx&quot;,
         *     &quot;ra-supabase-xxx&quot;
         *   ]</p>
         */
        public Builder instanceNames(java.util.List<String> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32DEFB4A-xxxx-ADD5-918E4FD7AB8C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstancesSSLResponseBody build() {
            return new ModifyInstancesSSLResponseBody(this);
        } 

    } 

}
