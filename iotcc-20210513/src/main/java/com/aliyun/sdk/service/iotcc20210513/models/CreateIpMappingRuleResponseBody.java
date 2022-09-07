// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpMappingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpMappingRuleResponseBody</p>
 */
public class CreateIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("IpMappingRuleId")
    private String ipMappingRuleId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateIpMappingRuleResponseBody(Builder builder) {
        this.ipMappingRuleId = builder.ipMappingRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpMappingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipMappingRuleId
     */
    public String getIpMappingRuleId() {
        return this.ipMappingRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipMappingRuleId; 
        private String requestId; 

        /**
         * IpMappingRuleId.
         */
        public Builder ipMappingRuleId(String ipMappingRuleId) {
            this.ipMappingRuleId = ipMappingRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpMappingRuleResponseBody build() {
            return new CreateIpMappingRuleResponseBody(this);
        } 

    } 

}
