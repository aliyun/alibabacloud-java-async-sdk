// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WildcardRule} extends {@link TeaModel}
 *
 * <p>WildcardRule</p>
 */
public class WildcardRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("match")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
    private String match;

    @com.aliyun.core.annotation.NameInMap("replacement")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
    private String replacement;

    private WildcardRule(Builder builder) {
        this.match = builder.match;
        this.replacement = builder.replacement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WildcardRule create() {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/*</p>
         */
        public Builder match(String match) {
            this.match = match;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/$1</p>
         */
        public Builder replacement(String replacement) {
            this.replacement = replacement;
            return this;
        }

        public WildcardRule build() {
            return new WildcardRule(this);
        } 

    } 

}
