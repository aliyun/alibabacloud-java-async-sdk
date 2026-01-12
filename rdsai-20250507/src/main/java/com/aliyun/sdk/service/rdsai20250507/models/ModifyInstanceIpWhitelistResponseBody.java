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
 * {@link ModifyInstanceIpWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceIpWhitelistResponseBody</p>
 */
public class ModifyInstanceIpWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceIpWhitelistResponseBody(Builder builder) {
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceIpWhitelistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyInstanceIpWhitelistResponseBody model) {
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>87249A6F-xxx-804C-E1E0AD1FAD90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceIpWhitelistResponseBody build() {
            return new ModifyInstanceIpWhitelistResponseBody(this);
        } 

    } 

}
