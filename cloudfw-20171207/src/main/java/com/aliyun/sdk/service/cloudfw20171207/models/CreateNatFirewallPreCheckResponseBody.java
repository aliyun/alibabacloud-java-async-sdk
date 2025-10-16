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
 * {@link CreateNatFirewallPreCheckResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNatFirewallPreCheckResponseBody</p>
 */
public class CreateNatFirewallPreCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreCheckId")
    private String preCheckId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNatFirewallPreCheckResponseBody(Builder builder) {
        this.preCheckId = builder.preCheckId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNatFirewallPreCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preCheckId
     */
    public String getPreCheckId() {
        return this.preCheckId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String preCheckId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNatFirewallPreCheckResponseBody model) {
            this.preCheckId = model.preCheckId;
            this.requestId = model.requestId;
        } 

        /**
         * PreCheckId.
         */
        public Builder preCheckId(String preCheckId) {
            this.preCheckId = preCheckId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNatFirewallPreCheckResponseBody build() {
            return new CreateNatFirewallPreCheckResponseBody(this);
        } 

    } 

}
