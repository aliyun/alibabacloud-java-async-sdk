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
 * {@link CreateTemplateBuildConfig} extends {@link TeaModel}
 *
 * <p>CreateTemplateBuildConfig</p>
 */
public class CreateTemplateBuildConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("copy")
    private CreateTemplateCopyAction copy;

    @com.aliyun.core.annotation.NameInMap("envdInject")
    private CreateTemplateEnvdInjectAction envdInject;

    @com.aliyun.core.annotation.NameInMap("installStorageClients")
    private Boolean installStorageClients;

    private CreateTemplateBuildConfig(Builder builder) {
        this.copy = builder.copy;
        this.envdInject = builder.envdInject;
        this.installStorageClients = builder.installStorageClients;
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

    /**
     * @return installStorageClients
     */
    public Boolean getInstallStorageClients() {
        return this.installStorageClients;
    }

    public static final class Builder {
        private CreateTemplateCopyAction copy; 
        private CreateTemplateEnvdInjectAction envdInject; 
        private Boolean installStorageClients; 

        private Builder() {
        } 

        private Builder(CreateTemplateBuildConfig model) {
            this.copy = model.copy;
            this.envdInject = model.envdInject;
            this.installStorageClients = model.installStorageClients;
        } 

        /**
         * <p>The action configuration for pulling the source image and pushing it to the destination repository.</p>
         */
        public Builder copy(CreateTemplateCopyAction copy) {
            this.copy = copy;
            return this;
        }

        /**
         * <p>The action configuration for packaging the envd daemon process into the image. This is an optional intermediate step in the copy process and is supported only by first-generation sandboxes.</p>
         */
        public Builder envdInject(CreateTemplateEnvdInjectAction envdInject) {
            this.envdInject = envdInject;
            return this;
        }

        /**
         * <p>The installation of clients required for storage mounting.</p>
         */
        public Builder installStorageClients(Boolean installStorageClients) {
            this.installStorageClients = installStorageClients;
            return this;
        }

        public CreateTemplateBuildConfig build() {
            return new CreateTemplateBuildConfig(this);
        } 

    } 

}
