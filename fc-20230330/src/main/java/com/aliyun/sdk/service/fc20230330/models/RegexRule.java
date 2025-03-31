// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link RegexRule} extends {@link TeaModel}
 *
 * <p>RegexRule</p>
 */
public class RegexRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("match")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
    private String match;

    @com.aliyun.core.annotation.NameInMap("replacement")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256)
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RegexRule model) {
            this.match = model.match;
            this.replacement = model.replacement;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>^/api/.+?/(.*)</p>
         */
        public Builder match(String match) {
            this.match = match;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v2/$1</p>
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
