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
    @com.aliyun.core.annotation.NameInMap("AiRules")
    private Integer aiRules;

    @com.aliyun.core.annotation.NameInMap("BasicRules")
    private Integer basicRules;

    @com.aliyun.core.annotation.NameInMap("CtiRules")
    private Integer ctiRules;

    @com.aliyun.core.annotation.NameInMap("EnableAllPatch")
    private Integer enableAllPatch;

    @com.aliyun.core.annotation.NameInMap("EnableDefault")
    private Integer enableDefault;

    @com.aliyun.core.annotation.NameInMap("PatchRules")
    private Integer patchRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleClass")
    private Integer ruleClass;

    @com.aliyun.core.annotation.NameInMap("RunMode")
    private Integer runMode;

    private DescribeDefaultIPSConfigResponseBody(Builder builder) {
        this.aiRules = builder.aiRules;
        this.basicRules = builder.basicRules;
        this.ctiRules = builder.ctiRules;
        this.enableAllPatch = builder.enableAllPatch;
        this.enableDefault = builder.enableDefault;
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
     * @return aiRules
     */
    public Integer getAiRules() {
        return this.aiRules;
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
     * @return enableAllPatch
     */
    public Integer getEnableAllPatch() {
        return this.enableAllPatch;
    }

    /**
     * @return enableDefault
     */
    public Integer getEnableDefault() {
        return this.enableDefault;
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
        private Integer aiRules; 
        private Integer basicRules; 
        private Integer ctiRules; 
        private Integer enableAllPatch; 
        private Integer enableDefault; 
        private Integer patchRules; 
        private String requestId; 
        private Integer ruleClass; 
        private Integer runMode; 

        /**
         * AiRules.
         */
        public Builder aiRules(Integer aiRules) {
            this.aiRules = aiRules;
            return this;
        }

        /**
         * BasicRules.
         */
        public Builder basicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }

        /**
         * CtiRules.
         */
        public Builder ctiRules(Integer ctiRules) {
            this.ctiRules = ctiRules;
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
         * EnableDefault.
         */
        public Builder enableDefault(Integer enableDefault) {
            this.enableDefault = enableDefault;
            return this;
        }

        /**
         * PatchRules.
         */
        public Builder patchRules(Integer patchRules) {
            this.patchRules = patchRules;
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

        public DescribeDefaultIPSConfigResponseBody build() {
            return new DescribeDefaultIPSConfigResponseBody(this);
        } 

    } 

}
