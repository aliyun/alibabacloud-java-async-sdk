// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScriptRule} extends {@link TeaModel}
 *
 * <p>ScriptRule</p>
 */
public class ScriptRule extends TeaModel {
    @NameInMap("Arch")
    private String arch;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("Model")
    private String model;

    @NameInMap("Os")
    private String os;

    @NameInMap("Role")
    private String role;

    @NameInMap("RuleId")
    private String ruleId;

    @NameInMap("ScriptId")
    private String scriptId;

    @NameInMap("Vendor")
    private String vendor;

    private ScriptRule(Builder builder) {
        this.arch = builder.arch;
        this.domain = builder.domain;
        this.model = builder.model;
        this.os = builder.os;
        this.role = builder.role;
        this.ruleId = builder.ruleId;
        this.scriptId = builder.scriptId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScriptRule create() {
        return builder().build();
    }

    /**
     * @return arch
     */
    public String getArch() {
        return this.arch;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String arch; 
        private String domain; 
        private String model; 
        private String os; 
        private String role; 
        private String ruleId; 
        private String scriptId; 
        private String vendor; 

        /**
         * Arch.
         */
        public Builder arch(String arch) {
            this.arch = arch;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * Os.
         */
        public Builder os(String os) {
            this.os = os;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public ScriptRule build() {
            return new ScriptRule(this);
        } 

    } 

}
