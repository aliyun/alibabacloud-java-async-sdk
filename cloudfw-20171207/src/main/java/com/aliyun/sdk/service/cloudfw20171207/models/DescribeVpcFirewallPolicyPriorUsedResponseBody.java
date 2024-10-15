// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVpcFirewallPolicyPriorUsedResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallPolicyPriorUsedResponseBody</p>
 */
public class DescribeVpcFirewallPolicyPriorUsedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("End")
    private Integer end;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Start")
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
         * <p>The lowest priority for the access control policies.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder end(Integer end) {
            this.end = end;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The highest priority for the access control policies.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
