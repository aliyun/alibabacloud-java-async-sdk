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
 * {@link NASConfig} extends {@link TeaModel}
 *
 * <p>NASConfig</p>
 */
public class NASConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mountPoints")
    private java.util.List<NASMountConfig> mountPoints;

    private NASConfig(Builder builder) {
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NASConfig create() {
        return builder().build();
    }

    /**
     * @return mountPoints
     */
    public java.util.List<NASMountConfig> getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private java.util.List<NASMountConfig> mountPoints; 

        /**
         * mountPoints.
         */
        public Builder mountPoints(java.util.List<NASMountConfig> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public NASConfig build() {
            return new NASConfig(this);
        } 

    } 

}
