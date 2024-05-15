// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallDefaultIPSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallDefaultIPSConfigResponseBody</p>
 */
public class DescribeVpcFirewallDefaultIPSConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasicRules")
    private Integer basicRules;

    @com.aliyun.core.annotation.NameInMap("EnableAllPatch")
    private Integer enableAllPatch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RunMode")
    private Integer runMode;

    private DescribeVpcFirewallDefaultIPSConfigResponseBody(Builder builder) {
        this.basicRules = builder.basicRules;
        this.enableAllPatch = builder.enableAllPatch;
        this.requestId = builder.requestId;
        this.runMode = builder.runMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDefaultIPSConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return basicRules
     */
    public Integer getBasicRules() {
        return this.basicRules;
    }

    /**
     * @return enableAllPatch
     */
    public Integer getEnableAllPatch() {
        return this.enableAllPatch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runMode
     */
    public Integer getRunMode() {
        return this.runMode;
    }

    public static final class Builder {
        private Integer basicRules; 
        private Integer enableAllPatch; 
        private String requestId; 
        private Integer runMode; 

        /**
         * Indicates whether basic policies are enabled. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder basicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }

        /**
         * Indicates whether virtual patching is enabled. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder enableAllPatch(Integer enableAllPatch) {
            this.enableAllPatch = enableAllPatch;
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
         * The mode of the intrusion prevention system (IPS). Valid values:
         * <p>
         * 
         * *   **1**: block mode
         * *   **0**: monitor mode
         */
        public Builder runMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }

        public DescribeVpcFirewallDefaultIPSConfigResponseBody build() {
            return new DescribeVpcFirewallDefaultIPSConfigResponseBody(this);
        } 

    } 

}
