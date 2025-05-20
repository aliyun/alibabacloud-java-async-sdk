// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link LocalMountSpec} extends {@link TeaModel}
 *
 * <p>LocalMountSpec</p>
 */
public class LocalMountSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LocalPath")
    private String localPath;

    @com.aliyun.core.annotation.NameInMap("MountMode")
    private String mountMode;

    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    private LocalMountSpec(Builder builder) {
        this.localPath = builder.localPath;
        this.mountMode = builder.mountMode;
        this.mountPath = builder.mountPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LocalMountSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return localPath
     */
    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * @return mountMode
     */
    public String getMountMode() {
        return this.mountMode;
    }

    /**
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    public static final class Builder {
        private String localPath; 
        private String mountMode; 
        private String mountPath; 

        private Builder() {
        } 

        private Builder(LocalMountSpec model) {
            this.localPath = model.localPath;
            this.mountMode = model.mountMode;
            this.mountPath = model.mountPath;
        } 

        /**
         * LocalPath.
         */
        public Builder localPath(String localPath) {
            this.localPath = localPath;
            return this;
        }

        /**
         * MountMode.
         */
        public Builder mountMode(String mountMode) {
            this.mountMode = mountMode;
            return this;
        }

        /**
         * MountPath.
         */
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }

        public LocalMountSpec build() {
            return new LocalMountSpec(this);
        } 

    } 

}
