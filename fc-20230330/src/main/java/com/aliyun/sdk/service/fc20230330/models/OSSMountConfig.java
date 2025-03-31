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
 * {@link OSSMountConfig} extends {@link TeaModel}
 *
 * <p>OSSMountConfig</p>
 */
public class OSSMountConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mountPoints")
    private java.util.List<OSSMountPoint> mountPoints;

    private OSSMountConfig(Builder builder) {
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSMountConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountPoints
     */
    public java.util.List<OSSMountPoint> getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private java.util.List<OSSMountPoint> mountPoints; 

        private Builder() {
        } 

        private Builder(OSSMountConfig model) {
            this.mountPoints = model.mountPoints;
        } 

        /**
         * mountPoints.
         */
        public Builder mountPoints(java.util.List<OSSMountPoint> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public OSSMountConfig build() {
            return new OSSMountConfig(this);
        } 

    } 

}
