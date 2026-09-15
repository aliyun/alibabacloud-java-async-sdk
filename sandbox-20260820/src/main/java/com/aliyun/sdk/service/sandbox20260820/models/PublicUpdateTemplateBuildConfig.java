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
 * {@link PublicUpdateTemplateBuildConfig} extends {@link TeaModel}
 *
 * <p>PublicUpdateTemplateBuildConfig</p>
 */
public class PublicUpdateTemplateBuildConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("copy")
    private PublicUpdateTemplateCopyAction copy;

    @com.aliyun.core.annotation.NameInMap("envdInject")
    private PublicUpdateTemplateEnvdInjectAction envdInject;

    private PublicUpdateTemplateBuildConfig(Builder builder) {
        this.copy = builder.copy;
        this.envdInject = builder.envdInject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicUpdateTemplateBuildConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return copy
     */
    public PublicUpdateTemplateCopyAction getCopy() {
        return this.copy;
    }

    /**
     * @return envdInject
     */
    public PublicUpdateTemplateEnvdInjectAction getEnvdInject() {
        return this.envdInject;
    }

    public static final class Builder {
        private PublicUpdateTemplateCopyAction copy; 
        private PublicUpdateTemplateEnvdInjectAction envdInject; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateBuildConfig model) {
            this.copy = model.copy;
            this.envdInject = model.envdInject;
        } 

        /**
         * copy.
         */
        public Builder copy(PublicUpdateTemplateCopyAction copy) {
            this.copy = copy;
            return this;
        }

        /**
         * envdInject.
         */
        public Builder envdInject(PublicUpdateTemplateEnvdInjectAction envdInject) {
            this.envdInject = envdInject;
            return this;
        }

        public PublicUpdateTemplateBuildConfig build() {
            return new PublicUpdateTemplateBuildConfig(this);
        } 

    } 

}
