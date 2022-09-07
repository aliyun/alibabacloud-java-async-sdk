// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupIpMappingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupIpMappingRuleResponseBody</p>
 */
public class CreateGroupIpMappingRuleResponseBody extends TeaModel {
    @NameInMap("GroupIpMappingRuleId")
    private String groupIpMappingRuleId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateGroupIpMappingRuleResponseBody(Builder builder) {
        this.groupIpMappingRuleId = builder.groupIpMappingRuleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupIpMappingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupIpMappingRuleId
     */
    public String getGroupIpMappingRuleId() {
        return this.groupIpMappingRuleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupIpMappingRuleId; 
        private String requestId; 

        /**
         * GroupIpMappingRuleId.
         */
        public Builder groupIpMappingRuleId(String groupIpMappingRuleId) {
            this.groupIpMappingRuleId = groupIpMappingRuleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGroupIpMappingRuleResponseBody build() {
            return new CreateGroupIpMappingRuleResponseBody(this);
        } 

    } 

}
