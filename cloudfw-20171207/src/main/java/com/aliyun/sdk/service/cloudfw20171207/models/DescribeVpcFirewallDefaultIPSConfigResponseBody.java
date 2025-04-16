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

    @com.aliyun.core.annotation.NameInMap("RuleClass")
    private Integer ruleClass;

    @com.aliyun.core.annotation.NameInMap("RunMode")
    private Integer runMode;

    private DescribeVpcFirewallDefaultIPSConfigResponseBody(Builder builder) {
        this.basicRules = builder.basicRules;
        this.enableAllPatch = builder.enableAllPatch;
        this.requestId = builder.requestId;
        this.ruleClass = builder.ruleClass;
        this.runMode = builder.runMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallDefaultIPSConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ruleClass
     */
    public Integer getRuleClass() {
        return this.ruleClass;
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
        private Integer ruleClass; 
        private Integer runMode; 

        private Builder() {
        } 

        private Builder(DescribeVpcFirewallDefaultIPSConfigResponseBody model) {
            this.basicRules = model.basicRules;
            this.enableAllPatch = model.enableAllPatch;
            this.requestId = model.requestId;
            this.ruleClass = model.ruleClass;
            this.runMode = model.runMode;
        } 

        /**
         * BasicRules.
         */
        public Builder basicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }

        /**
         * EnableAllPatch.
         */
        public Builder enableAllPatch(Integer enableAllPatch) {
            this.enableAllPatch = enableAllPatch;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleClass.
         */
        public Builder ruleClass(Integer ruleClass) {
            this.ruleClass = ruleClass;
            return this;
        }

        /**
         * RunMode.
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
