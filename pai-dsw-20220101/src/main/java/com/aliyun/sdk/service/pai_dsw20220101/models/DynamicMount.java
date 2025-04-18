// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link DynamicMount} extends {@link TeaModel}
 *
 * <p>DynamicMount</p>
 */
public class DynamicMount extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("MountPoints")
    private java.util.List<DynamicMountPoint> mountPoints;

    private DynamicMount(Builder builder) {
        this.enable = builder.enable;
        this.mountPoints = builder.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DynamicMount create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return mountPoints
     */
    public java.util.List<DynamicMountPoint> getMountPoints() {
        return this.mountPoints;
    }

    public static final class Builder {
        private Boolean enable; 
        private java.util.List<DynamicMountPoint> mountPoints; 

        private Builder() {
        } 

        private Builder(DynamicMount model) {
            this.enable = model.enable;
            this.mountPoints = model.mountPoints;
        } 

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * MountPoints.
         */
        public Builder mountPoints(java.util.List<DynamicMountPoint> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        public DynamicMount build() {
            return new DynamicMount(this);
        } 

    } 

}
