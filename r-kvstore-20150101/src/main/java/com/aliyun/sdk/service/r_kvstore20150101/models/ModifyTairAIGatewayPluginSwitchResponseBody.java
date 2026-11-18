// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link ModifyTairAIGatewayPluginSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTairAIGatewayPluginSwitchResponseBody</p>
 */
public class ModifyTairAIGatewayPluginSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyTairAIGatewayPluginSwitchResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTairAIGatewayPluginSwitchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyTairAIGatewayPluginSwitchResponseBody model) {
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the Tair AI gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABAF95F6-35C1-4177-AF3A-70969EBD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyTairAIGatewayPluginSwitchResponseBody build() {
            return new ModifyTairAIGatewayPluginSwitchResponseBody(this);
        } 

    } 

}
