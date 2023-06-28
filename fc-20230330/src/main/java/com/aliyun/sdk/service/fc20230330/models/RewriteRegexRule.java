// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RewriteRegexRule} extends {@link TeaModel}
 *
 * <p>RewriteRegexRule</p>
 */
public class RewriteRegexRule extends TeaModel {
    @NameInMap("regexStr")
    private String regexStr;

    @NameInMap("replacement")
    private String replacement;

    private RewriteRegexRule(Builder builder) {
        this.regexStr = builder.regexStr;
        this.replacement = builder.replacement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RewriteRegexRule create() {
        return builder().build();
    }

    /**
     * @return regexStr
     */
    public String getRegexStr() {
        return this.regexStr;
    }

    /**
     * @return replacement
     */
    public String getReplacement() {
        return this.replacement;
    }

    public static final class Builder {
        private String regexStr; 
        private String replacement; 

        /**
         * regexStr.
         */
        public Builder regexStr(String regexStr) {
            this.regexStr = regexStr;
            return this;
        }

        /**
         * replacement.
         */
        public Builder replacement(String replacement) {
            this.replacement = replacement;
            return this;
        }

        public RewriteRegexRule build() {
            return new RewriteRegexRule(this);
        } 

    } 

}
