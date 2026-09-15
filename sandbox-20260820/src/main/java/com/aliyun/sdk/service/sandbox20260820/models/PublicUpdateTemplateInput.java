// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicUpdateTemplateInput} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateInput</p>
 */
public class PublicUpdateTemplateInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buildConfig")
    private PublicUpdateTemplateBuildConfig buildConfig;

    @com.aliyun.core.annotation.NameInMap("runtimeConfig")
    private PublicUpdateTemplateRuntimeConfig runtimeConfig;

    private PublicUpdateTemplateInput(Builder builder) {
        this.buildConfig = builder.buildConfig;
        this.runtimeConfig = builder.runtimeConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return buildConfig
     */
    public PublicUpdateTemplateBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    /**
     * @return runtimeConfig
     */
    public PublicUpdateTemplateRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public static final class Builder {
        private PublicUpdateTemplateBuildConfig buildConfig; 
        private PublicUpdateTemplateRuntimeConfig runtimeConfig; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateInput model) {
            this.buildConfig = model.buildConfig;
            this.runtimeConfig = model.runtimeConfig;
        } 

        /**
         * buildConfig.
         */
        public Builder buildConfig(PublicUpdateTemplateBuildConfig buildConfig) {
            this.buildConfig = buildConfig;
            return this;
        }

        /**
         * runtimeConfig.
         */
        public Builder runtimeConfig(PublicUpdateTemplateRuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            return this;
        }

        public PublicUpdateTemplateInput build() {
            return new PublicUpdateTemplateInput(this);
        } 

    } 

}
