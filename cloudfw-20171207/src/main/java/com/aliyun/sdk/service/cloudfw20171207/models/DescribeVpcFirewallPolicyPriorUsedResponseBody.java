// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallPolicyPriorUsedResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallPolicyPriorUsedResponseBody</p>
 */
public class DescribeVpcFirewallPolicyPriorUsedResponseBody extends TeaModel {
    @NameInMap("End")
    private Integer end;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Start")
    private Integer start;

    private DescribeVpcFirewallPolicyPriorUsedResponseBody(Builder builder) {
        this.end = builder.end;
        this.requestId = builder.requestId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallPolicyPriorUsedResponseBody create() {
        return builder().build();
    }

    /**
     * @return end
     */
    public Integer getEnd() {
        return this.end;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    public static final class Builder {
        private Integer end; 
        private String requestId; 
        private Integer start; 

        /**
         * The lowest priority for the access control policy.
         */
        public Builder end(Integer end) {
            this.end = end;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The highest priority for the access control policy.
         */
        public Builder start(Integer start) {
            this.start = start;
            return this;
        }

        public DescribeVpcFirewallPolicyPriorUsedResponseBody build() {
            return new DescribeVpcFirewallPolicyPriorUsedResponseBody(this);
        } 

    } 

}
