// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WebOSSConfig} extends {@link TeaModel}
 *
 * <p>WebOSSConfig</p>
 */
public class WebOSSConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountPoints")
    private java.util.List < WebOSSMountPoint > mountPoints;

    private WebOSSConfig(Builder builder) {
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebOSSConfig create() {
        return builder().build();
    }

    /**
     * @return mountPoints
     */
    public java.util.List < WebOSSMountPoint > getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private java.util.List < WebOSSMountPoint > mountPoints; 

        /**
         * MountPoints.
         */
        public Builder mountPoints(java.util.List < WebOSSMountPoint > mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public WebOSSConfig build() {
            return new WebOSSConfig(this);
        } 

    } 

}
