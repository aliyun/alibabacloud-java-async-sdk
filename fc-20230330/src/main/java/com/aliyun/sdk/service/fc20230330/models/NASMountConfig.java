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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(NASMountConfig model) {
            this.enableTLS = model.enableTLS;
            this.mountDir = model.mountDir;
            this.serverAddr = model.serverAddr;
        } 

        /**
         * <p>Specifies whether to use the Transport Layer Security (TLS) protocol to secure data transmission. Note: Only General-purpose NAS supports transmission encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTLS(Boolean enableTLS) {
            this.enableTLS = enableTLS;
            return this;
        }

        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/home/test</p>
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * <p>The address of a NAS server.</p>
         * 
         * <strong>example:</strong>
         * <p>***-uni85.cn-hangzhou.nas.com:/</p>
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
