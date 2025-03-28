// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link DefaultBuilderConfig} extends {@link TeaModel}
 *
 * <p>DefaultBuilderConfig</p>
 */
public class DefaultBuilderConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cache")
    private BuildCacheConfig cache;

    @com.aliyun.core.annotation.NameInMap("languages")
    private java.util.List<String> languages;

    @com.aliyun.core.annotation.NameInMap("steps")
    private java.util.List<?> steps;

    private DefaultBuilderConfig(Builder builder) {
        this.cache = builder.cache;
        this.languages = builder.languages;
        this.steps = builder.steps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DefaultBuilderConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cache
     */
    public BuildCacheConfig getCache() {
        return this.cache;
    }

    /**
     * @return languages
     */
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    /**
     * @return steps
     */
    public java.util.List<?> getSteps() {
        return this.steps;
    }

    public static final class Builder {
        private BuildCacheConfig cache; 
        private java.util.List<String> languages; 
        private java.util.List<?> steps; 

        private Builder() {
        } 

        private Builder(DefaultBuilderConfig model) {
            this.cache = model.cache;
            this.languages = model.languages;
            this.steps = model.steps;
        } 

        /**
         * cache.
         */
        public Builder cache(BuildCacheConfig cache) {
            this.cache = cache;
            return this;
        }

        /**
         * languages.
         */
        public Builder languages(java.util.List<String> languages) {
            this.languages = languages;
            return this;
        }

        /**
         * steps.
         */
        public Builder steps(java.util.List<?> steps) {
            this.steps = steps;
            return this;
        }

        public DefaultBuilderConfig build() {
            return new DefaultBuilderConfig(this);
        } 

    } 

}
