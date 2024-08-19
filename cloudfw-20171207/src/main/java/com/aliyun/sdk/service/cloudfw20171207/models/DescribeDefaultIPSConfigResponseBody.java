// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefaultIPSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefaultIPSConfigResponseBody</p>
 */
public class DescribeDefaultIPSConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasicRules")
    private Integer basicRules;

    @com.aliyun.core.annotation.NameInMap("CtiRules")
    private Integer ctiRules;

    @com.aliyun.core.annotation.NameInMap("PatchRules")
    private Integer patchRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleClass")
    private Integer ruleClass;

    @com.aliyun.core.annotation.NameInMap("RunMode")
    private Integer runMode;

    private DescribeDefaultIPSConfigResponseBody(Builder builder) {
        this.basicRules = builder.basicRules;
        this.ctiRules = builder.ctiRules;
        this.patchRules = builder.patchRules;
        this.requestId = builder.requestId;
        this.ruleClass = builder.ruleClass;
        this.runMode = builder.runMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefaultIPSConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return basicRules
     */
    public Integer getBasicRules() {
        return this.basicRules;
    }

    /**
     * @return ctiRules
     */
    public Integer getCtiRules() {
        return this.ctiRules;
    }

    /**
     * @return patchRules
     */
    public Integer getPatchRules() {
        return this.patchRules;
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
        private Integer ctiRules; 
        private Integer patchRules; 
        private String requestId; 
        private Integer ruleClass; 
        private Integer runMode; 

        /**
         * Indicates whether basic protection is enabled. Valid values:
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
         * Indicates whether threat intelligence is enabled. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder ctiRules(Integer ctiRules) {
            this.ctiRules = ctiRules;
            return this;
        }

        /**
         * Indicates whether virtual patching is enabled. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder patchRules(Integer patchRules) {
            this.patchRules = patchRules;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The level of the rule group for the IPS. Valid values:
         * <p>
         * 
         * *   **1**: loose
         * *   **2**: medium
         * *   **3**: strict
         */
        public Builder ruleClass(Integer ruleClass) {
            this.ruleClass = ruleClass;
            return this;
        }

        /**
         * The mode of the IPS. Valid values:
         * <p>
         * 
         * *   **1**: block mode
         * *   **0**: monitor mode
         */
        public Builder runMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }

        public DescribeDefaultIPSConfigResponseBody build() {
            return new DescribeDefaultIPSConfigResponseBody(this);
        } 

    } 

}
