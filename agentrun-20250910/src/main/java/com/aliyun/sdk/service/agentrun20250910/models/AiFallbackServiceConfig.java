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
 * {@link AiFallbackServiceConfig} extends {@link TeaModel}
 *
 * <p>AiFallbackServiceConfig</p>
 */
public class AiFallbackServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("passThroughModelName")
    private Boolean passThroughModelName;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("targetModelName")
    private String targetModelName;

    private AiFallbackServiceConfig(Builder builder) {
        this.passThroughModelName = builder.passThroughModelName;
        this.serviceId = builder.serviceId;
        this.targetModelName = builder.targetModelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiFallbackServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return passThroughModelName
     */
    public Boolean getPassThroughModelName() {
        return this.passThroughModelName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return targetModelName
     */
    public String getTargetModelName() {
        return this.targetModelName;
    }

    public static final class Builder {
        private Boolean passThroughModelName; 
        private String serviceId; 
        private String targetModelName; 

        private Builder() {
        } 

        private Builder(AiFallbackServiceConfig model) {
            this.passThroughModelName = model.passThroughModelName;
            this.serviceId = model.serviceId;
            this.targetModelName = model.targetModelName;
        } 

        /**
         * passThroughModelName.
         */
        public Builder passThroughModelName(Boolean passThroughModelName) {
            this.passThroughModelName = passThroughModelName;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * targetModelName.
         */
        public Builder targetModelName(String targetModelName) {
            this.targetModelName = targetModelName;
            return this;
        }

        public AiFallbackServiceConfig build() {
            return new AiFallbackServiceConfig(this);
        } 

    } 

}
