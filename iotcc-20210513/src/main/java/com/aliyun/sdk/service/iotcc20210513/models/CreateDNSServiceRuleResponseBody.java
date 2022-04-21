// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDNSServiceRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDNSServiceRuleResponseBody</p>
 */
public class CreateDNSServiceRuleResponseBody extends TeaModel {
    @NameInMap("DNSServiceRuleId")
    private String DNSServiceRuleId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDNSServiceRuleResponseBody(Builder builder) {
        this.DNSServiceRuleId = builder.DNSServiceRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDNSServiceRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return DNSServiceRuleId
     */
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DNSServiceRuleId; 
        private String requestId; 

        /**
         * DNSServiceRuleId.
         */
        public Builder DNSServiceRuleId(String DNSServiceRuleId) {
            this.DNSServiceRuleId = DNSServiceRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDNSServiceRuleResponseBody build() {
            return new CreateDNSServiceRuleResponseBody(this);
        } 

    } 

}
