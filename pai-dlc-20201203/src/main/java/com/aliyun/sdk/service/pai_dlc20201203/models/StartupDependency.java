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
 * {@link StartupDependency} extends {@link TeaModel}
 *
 * <p>StartupDependency</p>
 */
public class StartupDependency extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MinReplicas")
    private String minReplicas;

    @com.aliyun.core.annotation.NameInMap("OnPhase")
    private String onPhase;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private StartupDependency(Builder builder) {
        this.minReplicas = builder.minReplicas;
        this.onPhase = builder.onPhase;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartupDependency create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return minReplicas
     */
    public String getMinReplicas() {
        return this.minReplicas;
    }

    /**
     * @return onPhase
     */
    public String getOnPhase() {
        return this.onPhase;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String minReplicas; 
        private String onPhase; 
        private String type; 

        private Builder() {
        } 

        private Builder(StartupDependency model) {
            this.minReplicas = model.minReplicas;
            this.onPhase = model.onPhase;
            this.type = model.type;
        } 

        /**
         * MinReplicas.
         */
        public Builder minReplicas(String minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        /**
         * OnPhase.
         */
        public Builder onPhase(String onPhase) {
            this.onPhase = onPhase;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public StartupDependency build() {
            return new StartupDependency(this);
        } 

    } 

}
