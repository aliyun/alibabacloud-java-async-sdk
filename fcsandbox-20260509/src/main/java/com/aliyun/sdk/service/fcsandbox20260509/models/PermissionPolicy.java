// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link PermissionPolicy} extends {@link TeaModel}
 *
 * <p>PermissionPolicy</p>
 */
public class PermissionPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allow")
    private Allow allow;

    @com.aliyun.core.annotation.NameInMap("catalogVersion")
    private Long catalogVersion;

    @com.aliyun.core.annotation.NameInMap("deny")
    private Deny deny;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private Long schemaVersion;

    private PermissionPolicy(Builder builder) {
        this.allow = builder.allow;
        this.catalogVersion = builder.catalogVersion;
        this.deny = builder.deny;
        this.schemaVersion = builder.schemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PermissionPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allow
     */
    public Allow getAllow() {
        return this.allow;
    }

    /**
     * @return catalogVersion
     */
    public Long getCatalogVersion() {
        return this.catalogVersion;
    }

    /**
     * @return deny
     */
    public Deny getDeny() {
        return this.deny;
    }

    /**
     * @return schemaVersion
     */
    public Long getSchemaVersion() {
        return this.schemaVersion;
    }

    public static final class Builder {
        private Allow allow; 
        private Long catalogVersion; 
        private Deny deny; 
        private Long schemaVersion; 

        private Builder() {
        } 

        private Builder(PermissionPolicy model) {
            this.allow = model.allow;
            this.catalogVersion = model.catalogVersion;
            this.deny = model.deny;
            this.schemaVersion = model.schemaVersion;
        } 

        /**
         * allow.
         */
        public Builder allow(Allow allow) {
            this.allow = allow;
            return this;
        }

        /**
         * catalogVersion.
         */
        public Builder catalogVersion(Long catalogVersion) {
            this.catalogVersion = catalogVersion;
            return this;
        }

        /**
         * deny.
         */
        public Builder deny(Deny deny) {
            this.deny = deny;
            return this;
        }

        /**
         * schemaVersion.
         */
        public Builder schemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        public PermissionPolicy build() {
            return new PermissionPolicy(this);
        } 

    } 

    /**
     * 
     * {@link PermissionPolicy} extends {@link TeaModel}
     *
     * <p>PermissionPolicy</p>
     */
    public static class Allow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("capabilities")
        private java.util.List<String> capabilities;

        private Allow(Builder builder) {
            this.actions = builder.actions;
            this.capabilities = builder.capabilities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Allow create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return capabilities
         */
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private java.util.List<String> capabilities; 

            private Builder() {
            } 

            private Builder(Allow model) {
                this.actions = model.actions;
                this.capabilities = model.capabilities;
            } 

            /**
             * actions.
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * capabilities.
             */
            public Builder capabilities(java.util.List<String> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            public Allow build() {
                return new Allow(this);
            } 

        } 

    }
    /**
     * 
     * {@link PermissionPolicy} extends {@link TeaModel}
     *
     * <p>PermissionPolicy</p>
     */
    public static class Deny extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("capabilities")
        private java.util.List<String> capabilities;

        private Deny(Builder builder) {
            this.actions = builder.actions;
            this.capabilities = builder.capabilities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deny create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return capabilities
         */
        public java.util.List<String> getCapabilities() {
            return this.capabilities;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private java.util.List<String> capabilities; 

            private Builder() {
            } 

            private Builder(Deny model) {
                this.actions = model.actions;
                this.capabilities = model.capabilities;
            } 

            /**
             * actions.
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * capabilities.
             */
            public Builder capabilities(java.util.List<String> capabilities) {
                this.capabilities = capabilities;
                return this;
            }

            public Deny build() {
                return new Deny(this);
            } 

        } 

    }
}
