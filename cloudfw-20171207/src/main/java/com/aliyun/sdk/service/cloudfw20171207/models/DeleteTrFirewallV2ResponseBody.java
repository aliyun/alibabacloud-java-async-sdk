// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrFirewallV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTrFirewallV2ResponseBody</p>
 */
public class DeleteTrFirewallV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteTrFirewallV2ResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrFirewallV2ResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTrFirewallV2ResponseBody build() {
            return new DeleteTrFirewallV2ResponseBody(this);
        } 

    } 

}
