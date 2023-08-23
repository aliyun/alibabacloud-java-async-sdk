// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefaultIPSConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefaultIPSConfigRequest</p>
 */
public class ModifyDefaultIPSConfigRequest extends Request {
    @Query
    @NameInMap("AiRules")
    private String aiRules;

    @Query
    @NameInMap("BasicRules")
    @Validation(required = true)
    private String basicRules;

    @Query
    @NameInMap("CtiRules")
    @Validation(required = true)
    private String ctiRules;

    @Query
    @NameInMap("EnableAllPatch")
    private String enableAllPatch;

    @Query
    @NameInMap("EnableDefault")
    private String enableDefault;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PatchRules")
    private String patchRules;

    @Query
    @NameInMap("RuleClass")
    private String ruleClass;

    @Query
    @NameInMap("RunMode")
    @Validation(required = true)
    private String runMode;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private ModifyDefaultIPSConfigRequest(Builder builder) {
        super(builder);
        this.aiRules = builder.aiRules;
        this.basicRules = builder.basicRules;
        this.ctiRules = builder.ctiRules;
        this.enableAllPatch = builder.enableAllPatch;
        this.enableDefault = builder.enableDefault;
        this.lang = builder.lang;
        this.patchRules = builder.patchRules;
        this.ruleClass = builder.ruleClass;
        this.runMode = builder.runMode;
        this.sourceIp = builder.sourceIp;
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
     * @return aiRules
     */
    public String getAiRules() {
        return this.aiRules;
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
     * @return enableAllPatch
     */
    public String getEnableAllPatch() {
        return this.enableAllPatch;
    }

    /**
     * @return enableDefault
     */
    public String getEnableDefault() {
        return this.enableDefault;
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

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ModifyDefaultIPSConfigRequest, Builder> {
        private String aiRules; 
        private String basicRules; 
        private String ctiRules; 
        private String enableAllPatch; 
        private String enableDefault; 
        private String lang; 
        private String patchRules; 
        private String ruleClass; 
        private String runMode; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefaultIPSConfigRequest request) {
            super(request);
            this.aiRules = request.aiRules;
            this.basicRules = request.basicRules;
            this.ctiRules = request.ctiRules;
            this.enableAllPatch = request.enableAllPatch;
            this.enableDefault = request.enableDefault;
            this.lang = request.lang;
            this.patchRules = request.patchRules;
            this.ruleClass = request.ruleClass;
            this.runMode = request.runMode;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * AiRules.
         */
        public Builder aiRules(String aiRules) {
            this.putQueryParameter("AiRules", aiRules);
            this.aiRules = aiRules;
            return this;
        }

        /**
         * BasicRules.
         */
        public Builder basicRules(String basicRules) {
            this.putQueryParameter("BasicRules", basicRules);
            this.basicRules = basicRules;
            return this;
        }

        /**
         * CtiRules.
         */
        public Builder ctiRules(String ctiRules) {
            this.putQueryParameter("CtiRules", ctiRules);
            this.ctiRules = ctiRules;
            return this;
        }

        /**
         * EnableAllPatch.
         */
        public Builder enableAllPatch(String enableAllPatch) {
            this.putQueryParameter("EnableAllPatch", enableAllPatch);
            this.enableAllPatch = enableAllPatch;
            return this;
        }

        /**
         * EnableDefault.
         */
        public Builder enableDefault(String enableDefault) {
            this.putQueryParameter("EnableDefault", enableDefault);
            this.enableDefault = enableDefault;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PatchRules.
         */
        public Builder patchRules(String patchRules) {
            this.putQueryParameter("PatchRules", patchRules);
            this.patchRules = patchRules;
            return this;
        }

        /**
         * RuleClass.
         */
        public Builder ruleClass(String ruleClass) {
            this.putQueryParameter("RuleClass", ruleClass);
            this.ruleClass = ruleClass;
            return this;
        }

        /**
         * RunMode.
         */
        public Builder runMode(String runMode) {
            this.putQueryParameter("RunMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ModifyDefaultIPSConfigRequest build() {
            return new ModifyDefaultIPSConfigRequest(this);
        } 

    } 

}
