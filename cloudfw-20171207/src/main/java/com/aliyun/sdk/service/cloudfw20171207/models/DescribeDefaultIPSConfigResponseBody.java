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
 * {@link DescribeDefaultIPSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefaultIPSConfigResponseBody</p>
 */
public class DescribeDefaultIPSConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasicRules")
    private Integer basicRules;

    @com.aliyun.core.annotation.NameInMap("CtiRules")
    private Integer ctiRules;

    @com.aliyun.core.annotation.NameInMap("MaxSdl")
    private Long maxSdl;

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
        this.maxSdl = builder.maxSdl;
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
     * @return ctiRules
     */
    public Integer getCtiRules() {
        return this.ctiRules;
    }

    /**
     * @return maxSdl
     */
    public Long getMaxSdl() {
        return this.maxSdl;
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
        private Long maxSdl; 
        private Integer patchRules; 
        private String requestId; 
        private Integer ruleClass; 
        private Integer runMode; 

        private Builder() {
        } 

        private Builder(DescribeDefaultIPSConfigResponseBody model) {
            this.basicRules = model.basicRules;
            this.ctiRules = model.ctiRules;
            this.maxSdl = model.maxSdl;
            this.patchRules = model.patchRules;
            this.requestId = model.requestId;
            this.ruleClass = model.ruleClass;
            this.runMode = model.runMode;
        } 

        /**
         * <p>The status of the basic policies feature. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled</p>
         * </li>
         * <li><p><strong>0</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder basicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }

        /**
         * <p>The status of the threat intelligence feature. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled</p>
         * </li>
         * <li><p><strong>0</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ctiRules(Integer ctiRules) {
            this.ctiRules = ctiRules;
            return this;
        }

        /**
         * <p>The maximum daily traffic that can be scanned for sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxSdl(Long maxSdl) {
            this.maxSdl = maxSdl;
            return this;
        }

        /**
         * <p>The status of the virtual patching feature. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled</p>
         * </li>
         * <li><p><strong>0</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder patchRules(Integer patchRules) {
            this.patchRules = patchRules;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>133173B9-8010-5DF5-8B93-********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The strictness level of the intrusion prevention system (IPS) rules. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Loose</p>
         * </li>
         * <li><p><strong>2</strong>: Medium</p>
         * </li>
         * <li><p><strong>3</strong>: Strict</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder ruleClass(Integer ruleClass) {
            this.ruleClass = ruleClass;
            return this;
        }

        /**
         * <p>The mode of the IPS. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Block Mode</p>
         * </li>
         * <li><p><strong>0</strong>: Monitor Mode</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
