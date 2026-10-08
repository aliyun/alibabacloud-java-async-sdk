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
 * {@link JuiceFsMountConfig} extends {@link TeaModel}
 *
 * <p>JuiceFsMountConfig</p>
 */
public class JuiceFsMountConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private java.util.List<String> args;

    @com.aliyun.core.annotation.NameInMap("mountDir")
    private String mountDir;

    @com.aliyun.core.annotation.NameInMap("remoteDir")
    private String remoteDir;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("volumeName")
    private String volumeName;

    private JuiceFsMountConfig(Builder builder) {
        this.args = builder.args;
        this.mountDir = builder.mountDir;
        this.remoteDir = builder.remoteDir;
        this.token = builder.token;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JuiceFsMountConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public java.util.List<String> getArgs() {
        return this.args;
    }

    /**
     * @return mountDir
     */
    public String getMountDir() {
        return this.mountDir;
    }

    /**
     * @return remoteDir
     */
    public String getRemoteDir() {
        return this.remoteDir;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return volumeName
     */
    public String getVolumeName() {
        return this.volumeName;
    }

    public static final class Builder {
        private java.util.List<String> args; 
        private String mountDir; 
        private String remoteDir; 
        private String token; 
        private String volumeName; 

        private Builder() {
        } 

        private Builder(JuiceFsMountConfig model) {
            this.args = model.args;
            this.mountDir = model.mountDir;
            this.remoteDir = model.remoteDir;
            this.token = model.token;
            this.volumeName = model.volumeName;
        } 

        /**
         * <p>An array of strings containing additional command-line arguments for the mount command. For example, use these arguments to set cache sizes or other performance-tuning options.</p>
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            return this;
        }

        /**
         * <p>The path within the function\&quot;s local filesystem to mount the volume. For example, /mnt/data. This parameter is required.</p>
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * <p>The subdirectory within the JuiceFS volume to mount. If not specified, the root of the volume is mounted.</p>
         */
        public Builder remoteDir(String remoteDir) {
            this.remoteDir = remoteDir;
            return this;
        }

        /**
         * <p>The authentication token to access the JuiceFS volume.</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>The name of the JuiceFS volume to mount. This parameter is required.</p>
         */
        public Builder volumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public JuiceFsMountConfig build() {
            return new JuiceFsMountConfig(this);
        } 

    } 

}
