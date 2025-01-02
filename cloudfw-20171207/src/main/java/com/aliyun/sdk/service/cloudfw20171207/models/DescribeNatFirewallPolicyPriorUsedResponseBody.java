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
 * {@link DescribeNatFirewallPolicyPriorUsedResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallPolicyPriorUsedResponseBody</p>
 */
public class DescribeNatFirewallPolicyPriorUsedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("End")
    private Integer end;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Start")
    private Integer start;

    private DescribeNatFirewallPolicyPriorUsedResponseBody(Builder builder) {
        this.end = builder.end;
        this.requestId = builder.requestId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallPolicyPriorUsedResponseBody create() {
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
         * <p>The lowest priority for the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder end(Integer end) {
            this.end = end;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BCDF3907-1011-5504-B015-CC7603C0E6B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The highest priority for the access control policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder start(Integer start) {
            this.start = start;
            return this;
        }

        public DescribeNatFirewallPolicyPriorUsedResponseBody build() {
            return new DescribeNatFirewallPolicyPriorUsedResponseBody(this);
        } 

    } 

}
