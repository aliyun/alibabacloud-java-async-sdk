// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

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
 * {@link CheckVersionsOfComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>CheckVersionsOfComponentsResponseBody</p>
 */
public class CheckVersionsOfComponentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Components")
    private Components components;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckVersionsOfComponentsResponseBody(Builder builder) {
        this.components = builder.components;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckVersionsOfComponentsResponseBody create() {
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

        public CheckVersionsOfComponentsResponseBody build() {
            return new CheckVersionsOfComponentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckVersionsOfComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>CheckVersionsOfComponentsResponseBody</p>
     */
    public static class ComponentsComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Component")
        private String component;

        @com.aliyun.core.annotation.NameInMap("IsLatestVersion")
        private String isLatestVersion;

        private ComponentsComponents(Builder builder) {
            this.component = builder.component;
            this.isLatestVersion = builder.isLatestVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentsComponents create() {
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

            public ComponentsComponents build() {
                return new ComponentsComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckVersionsOfComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>CheckVersionsOfComponentsResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<ComponentsComponents> components;

        private Components(Builder builder) {
            this.components = builder.components;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return components
         */
        public java.util.List<ComponentsComponents> getComponents() {
            return this.components;
        }

        public static final class Builder {
            private java.util.List<ComponentsComponents> components; 

            /**
             * Components.
             */
            public Builder components(java.util.List<ComponentsComponents> components) {
                this.components = components;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
