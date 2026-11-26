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
 * {@link RLJobObservabilityConfig} extends {@link TeaModel}
 *
 * <p>RLJobObservabilityConfig</p>
 */
public class RLJobObservabilityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RayDashboardEnabled")
    private Boolean rayDashboardEnabled;

    @com.aliyun.core.annotation.NameInMap("XfuseEnabled")
    private Boolean xfuseEnabled;

    private RLJobObservabilityConfig(Builder builder) {
        this.rayDashboardEnabled = builder.rayDashboardEnabled;
        this.xfuseEnabled = builder.xfuseEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobObservabilityConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return rayDashboardEnabled
     */
    public Boolean getRayDashboardEnabled() {
        return this.rayDashboardEnabled;
    }

    /**
     * @return xfuseEnabled
     */
    public Boolean getXfuseEnabled() {
        return this.xfuseEnabled;
    }

    public static final class Builder {
        private Boolean rayDashboardEnabled; 
        private Boolean xfuseEnabled; 

        private Builder() {
        } 

        private Builder(RLJobObservabilityConfig model) {
            this.rayDashboardEnabled = model.rayDashboardEnabled;
            this.xfuseEnabled = model.xfuseEnabled;
        } 

        /**
         * <p>是否开启 Ray Dashboard 入口。Ray 后端缺省 true，Monarch 后端缺省 false；Monarch 不接受 true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder rayDashboardEnabled(Boolean rayDashboardEnabled) {
            this.rayDashboardEnabled = rayDashboardEnabled;
            return this;
        }

        /**
         * <p>是否启用训练观测数据采集，默认 true。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder xfuseEnabled(Boolean xfuseEnabled) {
            this.xfuseEnabled = xfuseEnabled;
            return this;
        }

        public RLJobObservabilityConfig build() {
            return new RLJobObservabilityConfig(this);
        } 

    } 

}
