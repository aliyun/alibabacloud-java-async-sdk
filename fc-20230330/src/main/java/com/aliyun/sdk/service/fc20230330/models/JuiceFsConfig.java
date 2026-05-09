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
 * {@link JuiceFsConfig} extends {@link TeaModel}
 *
 * <p>JuiceFsConfig</p>
 */
public class JuiceFsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("envs")
    private java.util.Map<String, String> envs;

    @com.aliyun.core.annotation.NameInMap("mountPoints")
    private java.util.List<JuiceFsMountConfig> mountPoints;

    private JuiceFsConfig(Builder builder) {
        this.envs = builder.envs;
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JuiceFsConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return envs
     */
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    /**
     * @return mountPoints
     */
    public java.util.List<JuiceFsMountConfig> getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private java.util.Map<String, String> envs; 
        private java.util.List<JuiceFsMountConfig> mountPoints; 

        private Builder() {
        } 

        private Builder(JuiceFsConfig model) {
            this.envs = model.envs;
            this.mountPoints = model.mountPoints;
        } 

        /**
         * envs.
         */
        public Builder envs(java.util.Map<String, String> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * mountPoints.
         */
        public Builder mountPoints(java.util.List<JuiceFsMountConfig> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public JuiceFsConfig build() {
            return new JuiceFsConfig(this);
        } 

    } 

}
