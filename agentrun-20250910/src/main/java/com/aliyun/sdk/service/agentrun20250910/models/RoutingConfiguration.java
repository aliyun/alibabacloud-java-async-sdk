// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link RoutingConfiguration} extends {@link TeaModel}
 *
 * <p>RoutingConfiguration</p>
 */
public class RoutingConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("versionWeights")
    private java.util.List<VersionWeight> versionWeights;

    private RoutingConfiguration(Builder builder) {
        this.versionWeights = builder.versionWeights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoutingConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return versionWeights
     */
    public java.util.List<VersionWeight> getVersionWeights() {
        return this.versionWeights;
    }

    public static final class Builder {
        private java.util.List<VersionWeight> versionWeights; 

        private Builder() {
        } 

        private Builder(RoutingConfiguration model) {
            this.versionWeights = model.versionWeights;
        } 

        /**
         * <p>不同版本的流量权重配置</p>
         */
        public Builder versionWeights(java.util.List<VersionWeight> versionWeights) {
            this.versionWeights = versionWeights;
            return this;
        }

        public RoutingConfiguration build() {
            return new RoutingConfiguration(this);
        } 

    } 

}
