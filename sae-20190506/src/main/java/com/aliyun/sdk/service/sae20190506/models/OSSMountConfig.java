// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OSSMountConfig} extends {@link TeaModel}
 *
 * <p>OSSMountConfig</p>
 */
public class OSSMountConfig extends TeaModel {
    @NameInMap("mountPoints")
    private java.util.List < OSSMountPoint > mountPoints;

    private OSSMountConfig(Builder builder) {
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSMountConfig create() {
        return builder().build();
    }

    /**
     * @return mountPoints
     */
    public java.util.List < OSSMountPoint > getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private java.util.List < OSSMountPoint > mountPoints; 

        /**
         * mountPoints.
         */
        public Builder mountPoints(java.util.List < OSSMountPoint > mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public OSSMountConfig build() {
            return new OSSMountConfig(this);
        } 

    } 

}
