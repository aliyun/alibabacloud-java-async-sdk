// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NASMountConfig} extends {@link TeaModel}
 *
 * <p>NASMountConfig</p>
 */
public class NASMountConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableTLS")
    private Boolean enableTLS;

    @com.aliyun.core.annotation.NameInMap("mountDir")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String mountDir;

    @com.aliyun.core.annotation.NameInMap("serverAddr")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String serverAddr;

    private NASMountConfig(Builder builder) {
        this.enableTLS = builder.enableTLS;
        this.mountDir = builder.mountDir;
        this.serverAddr = builder.serverAddr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NASMountConfig create() {
        return builder().build();
    }

    /**
     * @return enableTLS
     */
    public Boolean getEnableTLS() {
        return this.enableTLS;
    }

    /**
     * @return mountDir
     */
    public String getMountDir() {
        return this.mountDir;
    }

    /**
     * @return serverAddr
     */
    public String getServerAddr() {
        return this.serverAddr;
    }

    public static final class Builder {
        private Boolean enableTLS; 
        private String mountDir; 
        private String serverAddr; 

        /**
         * enableTLS.
         */
        public Builder enableTLS(Boolean enableTLS) {
            this.enableTLS = enableTLS;
            return this;
        }

        /**
         * mountDir.
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * serverAddr.
         */
        public Builder serverAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }

        public NASMountConfig build() {
            return new NASMountConfig(this);
        } 

    } 

}
