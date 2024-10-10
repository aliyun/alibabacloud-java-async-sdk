// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WebNASMountPoint} extends {@link TeaModel}
 *
 * <p>WebNASMountPoint</p>
 */
public class WebNASMountPoint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountDir")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String mountDir;

    @com.aliyun.core.annotation.NameInMap("NasAddr")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String nasAddr;

    @com.aliyun.core.annotation.NameInMap("NasPath")
    private String nasPath;

    private WebNASMountPoint(Builder builder) {
        this.mountDir = builder.mountDir;
        this.nasAddr = builder.nasAddr;
        this.nasPath = builder.nasPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebNASMountPoint create() {
        return builder().build();
    }

    /**
     * @return mountDir
     */
    public String getMountDir() {
        return this.mountDir;
    }

    /**
     * @return nasAddr
     */
    public String getNasAddr() {
        return this.nasAddr;
    }

    /**
     * @return nasPath
     */
    public String getNasPath() {
        return this.nasPath;
    }

    public static final class Builder {
        private String mountDir; 
        private String nasAddr; 
        private String nasPath; 

        /**
         * MountDir.
         */
        public Builder mountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }

        /**
         * NasAddr.
         */
        public Builder nasAddr(String nasAddr) {
            this.nasAddr = nasAddr;
            return this;
        }

        /**
         * NasPath.
         */
        public Builder nasPath(String nasPath) {
            this.nasPath = nasPath;
            return this;
        }

        public WebNASMountPoint build() {
            return new WebNASMountPoint(this);
        } 

    } 

}
