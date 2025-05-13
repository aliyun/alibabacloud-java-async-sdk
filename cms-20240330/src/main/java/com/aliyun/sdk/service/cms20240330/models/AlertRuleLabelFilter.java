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
 * {@link AlertRuleLabelFilter} extends {@link TeaModel}
 *
 * <p>AlertRuleLabelFilter</p>
 */
public class AlertRuleLabelFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.NameInMap("opt")
    private String opt;

    private AlertRuleLabelFilter(Builder builder) {
        this.labels = builder.labels;
        this.opt = builder.opt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleLabelFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labels
     */
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * @return opt
     */
    public String getOpt() {
        return this.opt;
    }

    public static final class Builder {
        private java.util.Map<String, String> labels; 
        private String opt; 

        private Builder() {
        } 

        private Builder(AlertRuleLabelFilter model) {
            this.labels = model.labels;
            this.opt = model.opt;
        } 

        /**
         * labels.
         */
        public Builder labels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * opt.
         */
        public Builder opt(String opt) {
            this.opt = opt;
            return this;
        }

        public AlertRuleLabelFilter build() {
            return new AlertRuleLabelFilter(this);
        } 

    } 

}
