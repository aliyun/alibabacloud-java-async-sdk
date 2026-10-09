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
 * {@link ModifyDefaultIPSConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefaultIPSConfigRequest</p>
 */
public class ModifyDefaultIPSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BasicRules")
    private Integer basicRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CtiRules")
    private Integer ctiRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSdl")
    private Long maxSdl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatchRules")
    private Integer patchRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleClass")
    private Integer ruleClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer runMode;

    private ModifyDefaultIPSConfigRequest(Builder builder) {
        super(builder);
        this.basicRules = builder.basicRules;
        this.ctiRules = builder.ctiRules;
        this.lang = builder.lang;
        this.maxSdl = builder.maxSdl;
        this.patchRules = builder.patchRules;
        this.ruleClass = builder.ruleClass;
        this.runMode = builder.runMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefaultIPSConfigRequest create() {
        return builder().build();
    }

@Override
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<ModifyDefaultIPSConfigRequest, Builder> {
        private Integer basicRules; 
        private Integer ctiRules; 
        private String lang; 
        private Long maxSdl; 
        private Integer patchRules; 
        private Integer ruleClass; 
        private Integer runMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefaultIPSConfigRequest request) {
            super(request);
            this.basicRules = request.basicRules;
            this.ctiRules = request.ctiRules;
            this.lang = request.lang;
            this.maxSdl = request.maxSdl;
            this.patchRules = request.patchRules;
            this.ruleClass = request.ruleClass;
            this.runMode = request.runMode;
        } 

        /**
         * <p>Specifies whether to enable Basic Policies. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Enable.</p>
         * </li>
         * <li><p><strong>0</strong>: shutdown.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder basicRules(Integer basicRules) {
            this.putQueryParameter("BasicRules", basicRules);
            this.basicRules = basicRules;
            return this;
        }

        /**
         * <p>Specifies whether to enable threat intelligence. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Enable.</p>
         * </li>
         * <li><p><strong>0</strong>: Disable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ctiRules(Integer ctiRules) {
            this.putQueryParameter("CtiRules", ctiRules);
            this.ctiRules = ctiRules;
            return this;
        }

        /**
         * <p>The language type of the request and response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The daily traffic limit for sensitive data detection.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxSdl(Long maxSdl) {
            this.putQueryParameter("MaxSdl", maxSdl);
            this.maxSdl = maxSdl;
            return this;
        }

        /**
         * <p>Specifies whether to enable virtual patches. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Enable.</p>
         * </li>
         * <li><p><strong>0</strong>: Disable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder patchRules(Integer patchRules) {
            this.putQueryParameter("PatchRules", patchRules);
            this.patchRules = patchRules;
            return this;
        }

        /**
         * <p>The IPS rules group. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Loose rule group.</p>
         * </li>
         * <li><p><strong>2</strong>: Medium rule group.</p>
         * </li>
         * <li><p><strong>3</strong>: Strict rule group.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleClass(Integer ruleClass) {
            this.putQueryParameter("RuleClass", ruleClass);
            this.ruleClass = ruleClass;
            return this;
        }

        /**
         * <p>The IPS defense mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Block Mode.</p>
         * </li>
         * <li><p><strong>0</strong>: monitor mode.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder runMode(Integer runMode) {
            this.putQueryParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        @Override
        public ModifyDefaultIPSConfigRequest build() {
            return new ModifyDefaultIPSConfigRequest(this);
        } 

    } 

}
