// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateVpcFirewallPrecheckResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpcFirewallPrecheckResponseBody</p>
 */
public class CreateVpcFirewallPrecheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrecheckId")
    private String precheckId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateVpcFirewallPrecheckResponseBody(Builder builder) {
        this.precheckId = builder.precheckId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcFirewallPrecheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return precheckId
     */
    public String getPrecheckId() {
        return this.precheckId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String precheckId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateVpcFirewallPrecheckResponseBody model) {
            this.precheckId = model.precheckId;
            this.requestId = model.requestId;
        } 

        /**
         * PrecheckId.
         */
        public Builder precheckId(String precheckId) {
            this.precheckId = precheckId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateVpcFirewallPrecheckResponseBody build() {
            return new CreateVpcFirewallPrecheckResponseBody(this);
        } 

    } 

}
