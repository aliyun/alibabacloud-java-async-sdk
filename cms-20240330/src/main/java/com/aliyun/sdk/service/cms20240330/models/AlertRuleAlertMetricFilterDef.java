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
         * <p>The dimension in APM metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>status</p>
         */
        public Builder dim(String dim) {
            this.dim = dim;
            return this;
        }

        /**
         * <p>Specifies whether to disable the dimension. If set to true, the filter item does not appear in the group by clause of PromQL.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dimDisabled(Boolean dimDisabled) {
            this.dimDisabled = dimDisabled;
            return this;
        }

        /**
         * <p>The Chinese display name.</p>
         * 
         * <strong>example:</strong>
         * <p>应用状态</p>
         */
        public Builder displayNameCn(String displayNameCn) {
            this.displayNameCn = displayNameCn;
            return this;
        }

        /**
         * <p>The English display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Application Status</p>
         */
        public Builder displayNameEn(String displayNameEn) {
            this.displayNameEn = displayNameEn;
            return this;
        }

        /**
         * <p>Specifies whether to hide the filter. If hidden, the filter is not displayed in frontend interactions, but its value can be passed when rendering PromQL. A typical example is the pid filter in APM scenarios, which is typically not displayed through configuration but shown as a separate application search list in the frontend.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        /**
         * <p>Specifies whether to disable the label. If set to true, the filter item does not appear in the label filter of PromQL.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder labelDisabled(Boolean labelDisabled) {
            this.labelDisabled = labelDisabled;
            return this;
        }

        /**
         * <p>The filter condition operator.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        public Builder opt(String opt) {
            this.opt = opt;
            return this;
        }

        /**
         * <p>The list of supported options.</p>
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
             * <p>The Chinese display name.</p>
             * 
             * <strong>example:</strong>
             * <p>在线</p>
             */
            public Builder displayNameCn(String displayNameCn) {
                this.displayNameCn = displayNameCn;
                return this;
            }

            /**
             * <p>The English display name.</p>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder displayNameEn(String displayNameEn) {
                this.displayNameEn = displayNameEn;
                return this;
            }

            /**
             * <p>The match value.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
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
