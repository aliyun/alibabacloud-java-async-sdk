// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegexRule} extends {@link TeaModel}
 *
 * <p>RegexRule</p>
 */
public class RegexRule extends TeaModel {
    @NameInMap("match")
    @Validation(maxLength = 256)
    private String match;

    @NameInMap("replacement")
    @Validation(maxLength = 256)
    private String replacement;

    private RegexRule(Builder builder) {
        this.match = builder.match;
        this.replacement = builder.replacement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegexRule create() {
        return builder().build();
    }

    /**
     * @return match
     */
    public String getMatch() {
        return this.match;
    }

    /**
     * @return replacement
     */
    public String getReplacement() {
        return this.replacement;
    }

    public static final class Builder {
        private String match; 
        private String replacement; 

        /**
         * match.
         */
        public Builder match(String match) {
            this.match = match;
            return this;
        }

        /**
         * replacement.
         */
        public Builder replacement(String replacement) {
            this.replacement = replacement;
            return this;
        }

        public RegexRule build() {
            return new RegexRule(this);
        } 

    } 

}
