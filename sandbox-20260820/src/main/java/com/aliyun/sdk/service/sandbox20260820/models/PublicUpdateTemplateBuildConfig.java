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

    @com.aliyun.core.annotation.NameInMap("installStorageClients")
    private Boolean installStorageClients;

    private PublicUpdateTemplateBuildConfig(Builder builder) {
        this.copy = builder.copy;
        this.envdInject = builder.envdInject;
        this.installStorageClients = builder.installStorageClients;
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

    /**
     * @return installStorageClients
     */
    public Boolean getInstallStorageClients() {
        return this.installStorageClients;
    }

    public static final class Builder {
        private PublicUpdateTemplateCopyAction copy; 
        private PublicUpdateTemplateEnvdInjectAction envdInject; 
        private Boolean installStorageClients; 

        private Builder() {
        } 

        private Builder(PublicUpdateTemplateBuildConfig model) {
            this.copy = model.copy;
            this.envdInject = model.envdInject;
            this.installStorageClients = model.installStorageClients;
        } 

        /**
         * <p>The image replication action configuration.</p>
         */
        public Builder copy(PublicUpdateTemplateCopyAction copy) {
            this.copy = copy;
            return this;
        }

        /**
         * <p>The envd injection action configuration.</p>
         */
        public Builder envdInject(PublicUpdateTemplateEnvdInjectAction envdInject) {
            this.envdInject = envdInject;
            return this;
        }

        /**
         * <p>Installs the clients required for storage mounting.</p>
         */
        public Builder installStorageClients(Boolean installStorageClients) {
            this.installStorageClients = installStorageClients;
            return this;
        }

        public PublicUpdateTemplateBuildConfig build() {
            return new PublicUpdateTemplateBuildConfig(this);
        } 

    } 

}
