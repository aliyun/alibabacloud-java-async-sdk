// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiFallbackConfig} extends {@link TeaModel}
 *
 * <p>AiFallbackConfig</p>
 */
public class AiFallbackConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("onlyRedirectUpstreamCode")
    private Boolean onlyRedirectUpstreamCode;

    @com.aliyun.core.annotation.NameInMap("serviceConfigs")
    private java.util.List<ServiceConfigs> serviceConfigs;

    private AiFallbackConfig(Builder builder) {
        this.onlyRedirectUpstreamCode = builder.onlyRedirectUpstreamCode;
        this.serviceConfigs = builder.serviceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiFallbackConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onlyRedirectUpstreamCode
     */
    public Boolean getOnlyRedirectUpstreamCode() {
        return this.onlyRedirectUpstreamCode;
    }

    /**
     * @return serviceConfigs
     */
    public java.util.List<ServiceConfigs> getServiceConfigs() {
        return this.serviceConfigs;
    }

    public static final class Builder {
        private Boolean onlyRedirectUpstreamCode; 
        private java.util.List<ServiceConfigs> serviceConfigs; 

        private Builder() {
        } 

        private Builder(AiFallbackConfig model) {
            this.onlyRedirectUpstreamCode = model.onlyRedirectUpstreamCode;
            this.serviceConfigs = model.serviceConfigs;
        } 

        /**
         * onlyRedirectUpstreamCode.
         */
        public Builder onlyRedirectUpstreamCode(Boolean onlyRedirectUpstreamCode) {
            this.onlyRedirectUpstreamCode = onlyRedirectUpstreamCode;
            return this;
        }

        /**
         * serviceConfigs.
         */
        public Builder serviceConfigs(java.util.List<ServiceConfigs> serviceConfigs) {
            this.serviceConfigs = serviceConfigs;
            return this;
        }

        public AiFallbackConfig build() {
            return new AiFallbackConfig(this);
        } 

    } 

    /**
     * 
     * {@link AiFallbackConfig} extends {@link TeaModel}
     *
     * <p>AiFallbackConfig</p>
     */
    public static class ServiceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("passThroughModelName")
        private Boolean passThroughModelName;

        @com.aliyun.core.annotation.NameInMap("serviceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("targetModelName")
        private String targetModelName;

        private ServiceConfigs(Builder builder) {
            this.name = builder.name;
            this.passThroughModelName = builder.passThroughModelName;
            this.serviceId = builder.serviceId;
            this.targetModelName = builder.targetModelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String name; 
            private Boolean passThroughModelName; 
            private String serviceId; 
            private String targetModelName; 

            private Builder() {
            } 

            private Builder(ServiceConfigs model) {
                this.name = model.name;
                this.passThroughModelName = model.passThroughModelName;
                this.serviceId = model.serviceId;
                this.targetModelName = model.targetModelName;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
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

            public ServiceConfigs build() {
                return new ServiceConfigs(this);
            } 

        } 

    }
}
