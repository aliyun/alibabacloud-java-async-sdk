// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InnerRewriteConfig} extends {@link TeaModel}
 *
 * <p>InnerRewriteConfig</p>
 */
public class InnerRewriteConfig extends TeaModel {
    @NameInMap("regexRules")
    private java.util.List < RewriteRegexRule > regexRules;

    private InnerRewriteConfig(Builder builder) {
        this.regexRules = builder.regexRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InnerRewriteConfig create() {
        return builder().build();
    }

    /**
     * @return regexRules
     */
    public java.util.List < RewriteRegexRule > getRegexRules() {
        return this.regexRules;
    }

    public static final class Builder {
        private java.util.List < RewriteRegexRule > regexRules; 

        /**
         * regexRules.
         */
        public Builder regexRules(java.util.List < RewriteRegexRule > regexRules) {
            this.regexRules = regexRules;
            return this;
        }

        public InnerRewriteConfig build() {
            return new InnerRewriteConfig(this);
        } 

    } 

}
