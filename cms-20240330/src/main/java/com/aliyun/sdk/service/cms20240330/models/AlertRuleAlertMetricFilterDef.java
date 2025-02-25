// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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

    @com.aliyun.core.annotation.NameInMap("displayNameCn")
    private String displayNameCn;

    @com.aliyun.core.annotation.NameInMap("displayNameEn")
    private String displayNameEn;

    @com.aliyun.core.annotation.NameInMap("hidden")
    private Boolean hidden;

    @com.aliyun.core.annotation.NameInMap("opt")
    private String opt;

    @com.aliyun.core.annotation.NameInMap("supportedOpts")
    private java.util.List < SupportedOpts> supportedOpts;

    private AlertRuleAlertMetricFilterDef(Builder builder) {
        this.dim = builder.dim;
        this.displayNameCn = builder.displayNameCn;
        this.displayNameEn = builder.displayNameEn;
        this.hidden = builder.hidden;
        this.opt = builder.opt;
        this.supportedOpts = builder.supportedOpts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleAlertMetricFilterDef create() {
        return builder().build();
    }

    /**
     * @return dim
     */
    public String getDim() {
        return this.dim;
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
     * @return opt
     */
    public String getOpt() {
        return this.opt;
    }

    /**
     * @return supportedOpts
     */
    public java.util.List < SupportedOpts> getSupportedOpts() {
        return this.supportedOpts;
    }

    public static final class Builder {
        private String dim; 
        private String displayNameCn; 
        private String displayNameEn; 
        private Boolean hidden; 
        private String opt; 
        private java.util.List < SupportedOpts> supportedOpts; 

        /**
         * dim.
         */
        public Builder dim(String dim) {
            this.dim = dim;
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
         * opt.
         */
        public Builder opt(String opt) {
            this.opt = opt;
            return this;
        }

        /**
         * supportedOpts.
         */
        public Builder supportedOpts(java.util.List < SupportedOpts> supportedOpts) {
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
