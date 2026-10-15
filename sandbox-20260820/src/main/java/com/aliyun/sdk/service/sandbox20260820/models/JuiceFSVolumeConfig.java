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
 * {@link JuiceFSVolumeConfig} extends {@link TeaModel}
 *
 * <p>JuiceFSVolumeConfig</p>
 */
public class JuiceFSVolumeConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("args")
    private java.util.List<String> args;

    @com.aliyun.core.annotation.NameInMap("baseURL")
    private String baseURL;

    @com.aliyun.core.annotation.NameInMap("remoteDir")
    private String remoteDir;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("volumeName")
    private String volumeName;

    private JuiceFSVolumeConfig(Builder builder) {
        this.args = builder.args;
        this.baseURL = builder.baseURL;
        this.remoteDir = builder.remoteDir;
        this.token = builder.token;
        this.volumeName = builder.volumeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JuiceFSVolumeConfig create() {
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
     * @return baseURL
     */
    public String getBaseURL() {
        return this.baseURL;
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
        private String baseURL; 
        private String remoteDir; 
        private String token; 
        private String volumeName; 

        private Builder() {
        } 

        private Builder(JuiceFSVolumeConfig model) {
            this.args = model.args;
            this.baseURL = model.baseURL;
            this.remoteDir = model.remoteDir;
            this.token = model.token;
            this.volumeName = model.volumeName;
        } 

        /**
         * <p>The additional mount parameters.</p>
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            return this;
        }

        /**
         * <p>The access point address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8080">http://127.0.0.1:8080</a></p>
         */
        public Builder baseURL(String baseURL) {
            this.baseURL = baseURL;
            return this;
        }

        /**
         * <p>The remote mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/sandbox/workspace</p>
         */
        public Builder remoteDir(String remoteDir) {
            this.remoteDir = remoteDir;
            return this;
        }

        /**
         * <p>The access token.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * <p>The JuiceFS volume name.</p>
         * 
         * <strong>example:</strong>
         * <p>data</p>
         */
        public Builder volumeName(String volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public JuiceFSVolumeConfig build() {
            return new JuiceFSVolumeConfig(this);
        } 

    } 

}
