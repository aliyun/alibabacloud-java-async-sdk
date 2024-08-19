// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefaultIPSConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefaultIPSConfigRequest</p>
 */
public class ModifyDefaultIPSConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BasicRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String basicRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CtiRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ctiRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PatchRules")
    private String patchRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleClass")
    private String ruleClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runMode;

    private ModifyDefaultIPSConfigRequest(Builder builder) {
        super(builder);
        this.basicRules = builder.basicRules;
        this.ctiRules = builder.ctiRules;
        this.lang = builder.lang;
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
    public String getBasicRules() {
        return this.basicRules;
    }

    /**
     * @return ctiRules
     */
    public String getCtiRules() {
        return this.ctiRules;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return patchRules
     */
    public String getPatchRules() {
        return this.patchRules;
    }

    /**
     * @return ruleClass
     */
    public String getRuleClass() {
        return this.ruleClass;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    public static final class Builder extends Request.Builder<ModifyDefaultIPSConfigRequest, Builder> {
        private String basicRules; 
        private String ctiRules; 
        private String lang; 
        private String patchRules; 
        private String ruleClass; 
        private String runMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefaultIPSConfigRequest request) {
            super(request);
            this.basicRules = request.basicRules;
            this.ctiRules = request.ctiRules;
            this.lang = request.lang;
            this.patchRules = request.patchRules;
            this.ruleClass = request.ruleClass;
            this.runMode = request.runMode;
        } 

        /**
         * Specifies whether to enable basic protection. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder basicRules(String basicRules) {
            this.putQueryParameter("BasicRules", basicRules);
            this.basicRules = basicRules;
            return this;
        }

        /**
         * Specifies whether to enable threat intelligence. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder ctiRules(String ctiRules) {
            this.putQueryParameter("CtiRules", ctiRules);
            this.ctiRules = ctiRules;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default)
         * *   **en**
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether to enable virtual patching. Valid values:
         * <p>
         * 
         * *   **1**: yes
         * *   **0**: no
         */
        public Builder patchRules(String patchRules) {
            this.putQueryParameter("PatchRules", patchRules);
            this.patchRules = patchRules;
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
        public Builder ruleClass(String ruleClass) {
            this.putQueryParameter("RuleClass", ruleClass);
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
        public Builder runMode(String runMode) {
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
