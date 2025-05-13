// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link AlertRuleAlertMetricFilterDef} extends {@link TeaModel}
 *
 * <p>AlertRuleAlertMetricFilterDef</p>
 */
public class AlertRuleAlertMetricFilterDef extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dim")
    private String dim;

    @com.aliyun.core.annotation.NameInMap("dimDisabled")
    private Boolean dimDisabled;

    @com.aliyun.core.annotation.NameInMap("displayNameCn")
    private String displayNameCn;

    @com.aliyun.core.annotation.NameInMap("displayNameEn")
    private String displayNameEn;

    @com.aliyun.core.annotation.NameInMap("hidden")
    private Boolean hidden;

    @com.aliyun.core.annotation.NameInMap("labelDisabled")
    private Boolean labelDisabled;

    @com.aliyun.core.annotation.NameInMap("opt")
    private String opt;

    @com.aliyun.core.annotation.NameInMap("supportedOpts")
    private java.util.List<SupportedOpts> supportedOpts;

    private AlertRuleAlertMetricFilterDef(Builder builder) {
        this.dim = builder.dim;
        this.dimDisabled = builder.dimDisabled;
        this.displayNameCn = builder.displayNameCn;
        this.displayNameEn = builder.displayNameEn;
        this.hidden = builder.hidden;
        this.labelDisabled = builder.labelDisabled;
        this.opt = builder.opt;
        this.supportedOpts = builder.supportedOpts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleAlertMetricFilterDef create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dim
     */
    public String getDim() {
        return this.dim;
    }

    /**
     * @return dimDisabled
     */
    public Boolean getDimDisabled() {
        return this.dimDisabled;
    }

    /**
     * @return displayNameCn
     */
    public String getDisplayNameCn() {
        return this.displayNameCn;
    }

    /**
     * @return displayNameEn
     */
    public String getDisplayNameEn() {
        return this.displayNameEn;
    }

    /**
     * @return hidden
     */
    public Boolean getHidden() {
        return this.hidden;
    }

    /**
     * @return labelDisabled
     */
    public Boolean getLabelDisabled() {
        return this.labelDisabled;
    }

    /**
     * @return opt
     */
    public String getOpt() {
        return this.opt;
    }

    /**
     * @return supportedOpts
     */
    public java.util.List<SupportedOpts> getSupportedOpts() {
        return this.supportedOpts;
    }

    public static final class Builder {
        private String dim; 
        private Boolean dimDisabled; 
        private String displayNameCn; 
        private String displayNameEn; 
        private Boolean hidden; 
        private Boolean labelDisabled; 
        private String opt; 
        private java.util.List<SupportedOpts> supportedOpts; 

        private Builder() {
        } 

        private Builder(AlertRuleAlertMetricFilterDef model) {
            this.dim = model.dim;
            this.dimDisabled = model.dimDisabled;
            this.displayNameCn = model.displayNameCn;
            this.displayNameEn = model.displayNameEn;
            this.hidden = model.hidden;
            this.labelDisabled = model.labelDisabled;
            this.opt = model.opt;
            this.supportedOpts = model.supportedOpts;
        } 

        /**
         * dim.
         */
        public Builder dim(String dim) {
            this.dim = dim;
            return this;
        }

        /**
         * dimDisabled.
         */
        public Builder dimDisabled(Boolean dimDisabled) {
            this.dimDisabled = dimDisabled;
            return this;
        }

        /**
         * displayNameCn.
         */
        public Builder displayNameCn(String displayNameCn) {
            this.displayNameCn = displayNameCn;
            return this;
        }

        /**
         * displayNameEn.
         */
        public Builder displayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }

        /**
         * hidden.
         */
        public Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        /**
         * labelDisabled.
         */
        public Builder labelDisabled(Boolean labelDisabled) {
            this.labelDisabled = labelDisabled;
            return this;
        }

        /**
         * opt.
         */
        public Builder opt(String opt) {
            this.opt = opt;
            return this;
        }

        /**
         * supportedOpts.
         */
        public Builder supportedOpts(java.util.List<SupportedOpts> supportedOpts) {
            this.supportedOpts = supportedOpts;
            return this;
        }

        public AlertRuleAlertMetricFilterDef build() {
            return new AlertRuleAlertMetricFilterDef(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleAlertMetricFilterDef} extends {@link TeaModel}
     *
     * <p>AlertRuleAlertMetricFilterDef</p>
     */
    public static class SupportedOpts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayNameCn")
        private String displayNameCn;

        @com.aliyun.core.annotation.NameInMap("displayNameEn")
        private String displayNameEn;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private SupportedOpts(Builder builder) {
            this.displayNameCn = builder.displayNameCn;
            this.displayNameEn = builder.displayNameEn;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedOpts create() {
            return builder().build();
        }

        /**
         * @return displayNameCn
         */
        public String getDisplayNameCn() {
            return this.displayNameCn;
        }

        /**
         * @return displayNameEn
         */
        public String getDisplayNameEn() {
            return this.displayNameEn;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String displayNameCn; 
            private String displayNameEn; 
            private String value; 

            private Builder() {
            } 

            private Builder(SupportedOpts model) {
                this.displayNameCn = model.displayNameCn;
                this.displayNameEn = model.displayNameEn;
                this.value = model.value;
            } 

            /**
             * displayNameCn.
             */
            public Builder displayNameCn(String displayNameCn) {
                this.displayNameCn = displayNameCn;
                return this;
            }

            /**
             * displayNameEn.
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SupportedOpts build() {
                return new SupportedOpts(this);
            } 

        } 

    }
}
