// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link CreateTemplateBuildConfig} extends {@link TeaModel}
 *
 * <p>CreateTemplateBuildConfig</p>
 */
public class CreateTemplateBuildConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("copy")
    private CreateTemplateCopyAction copy;

    @com.aliyun.core.annotation.NameInMap("envdInject")
    private CreateTemplateEnvdInjectAction envdInject;

    private CreateTemplateBuildConfig(Builder builder) {
        this.copy = builder.copy;
        this.envdInject = builder.envdInject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateBuildConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return copy
     */
    public CreateTemplateCopyAction getCopy() {
        return this.copy;
    }

    /**
     * @return envdInject
     */
    public CreateTemplateEnvdInjectAction getEnvdInject() {
        return this.envdInject;
    }

    public static final class Builder {
        private CreateTemplateCopyAction copy; 
        private CreateTemplateEnvdInjectAction envdInject; 

        private Builder() {
        } 

        private Builder(CreateTemplateBuildConfig model) {
            this.copy = model.copy;
            this.envdInject = model.envdInject;
        } 

        /**
         * copy.
         */
        public Builder copy(CreateTemplateCopyAction copy) {
            this.copy = copy;
            return this;
        }

        /**
         * envdInject.
         */
        public Builder envdInject(CreateTemplateEnvdInjectAction envdInject) {
            this.envdInject = envdInject;
            return this;
        }

        public CreateTemplateBuildConfig build() {
            return new CreateTemplateBuildConfig(this);
        } 

    } 

}
