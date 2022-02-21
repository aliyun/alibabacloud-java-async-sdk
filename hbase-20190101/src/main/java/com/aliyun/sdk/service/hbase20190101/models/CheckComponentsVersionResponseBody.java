// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckComponentsVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckComponentsVersionResponseBody</p>
 */
public class CheckComponentsVersionResponseBody extends TeaModel {
    @NameInMap("Components")
    private Components components;

    @NameInMap("RequestId")
    private String requestId;

    private CheckComponentsVersionResponseBody(Builder builder) {
        this.components = builder.components;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckComponentsVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return components
     */
    public Components getComponents() {
        return this.components;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Components components; 
        private String requestId; 

        /**
         * Components.
         */
        public Builder components(Components components) {
            this.components = components;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckComponentsVersionResponseBody build() {
            return new CheckComponentsVersionResponseBody(this);
        } 

    } 

    public static class Component extends TeaModel {
        @NameInMap("Component")
        private String component;

        @NameInMap("IsLatestVersion")
        private String isLatestVersion;

        private Component(Builder builder) {
            this.component = builder.component;
            this.isLatestVersion = builder.isLatestVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Component create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public String getComponent() {
            return this.component;
        }

        /**
         * @return isLatestVersion
         */
        public String getIsLatestVersion() {
            return this.isLatestVersion;
        }

        public static final class Builder {
            private String component; 
            private String isLatestVersion; 

            /**
             * Component.
             */
            public Builder component(String component) {
                this.component = component;
                return this;
            }

            /**
             * IsLatestVersion.
             */
            public Builder isLatestVersion(String isLatestVersion) {
                this.isLatestVersion = isLatestVersion;
                return this;
            }

            public Component build() {
                return new Component(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @NameInMap("Component")
        private java.util.List < Component> component;

        private Components(Builder builder) {
            this.component = builder.component;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public java.util.List < Component> getComponent() {
            return this.component;
        }

        public static final class Builder {
            private java.util.List < Component> component; 

            /**
             * Component.
             */
            public Builder component(java.util.List < Component> component) {
                this.component = component;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
