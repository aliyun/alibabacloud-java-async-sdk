// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebNASConfig} extends {@link TeaModel}
 *
 * <p>WebNASConfig</p>
 */
public class WebNASConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountPoints")
    private java.util.List<WebNASMountPoint> mountPoints;

    private WebNASConfig(Builder builder) {
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebNASConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountPoints
     */
    public java.util.List<WebNASMountPoint> getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private java.util.List<WebNASMountPoint> mountPoints; 

        private Builder() {
        } 

        private Builder(WebNASConfig model) {
            this.mountPoints = model.mountPoints;
        } 

        /**
         * MountPoints.
         */
        public Builder mountPoints(java.util.List<WebNASMountPoint> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public WebNASConfig build() {
            return new WebNASConfig(this);
        } 

    } 

}
