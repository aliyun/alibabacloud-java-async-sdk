// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterAddonInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterAddonInstanceResponseBody</p>
 */
public class GetClusterAddonInstanceResponseBody extends TeaModel {
    @NameInMap("config")
    private String config;

    @NameInMap("logging")
    private Logging logging;

    @NameInMap("name")
    private String name;

    @NameInMap("state")
    private String state;

    @NameInMap("version")
    private String version;

    private GetClusterAddonInstanceResponseBody(Builder builder) {
        this.config = builder.config;
        this.logging = builder.logging;
        this.name = builder.name;
        this.state = builder.state;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterAddonInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return logging
     */
    public Logging getLogging() {
        return this.logging;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String config; 
        private Logging logging; 
        private String name; 
        private String state; 
        private String version; 

        /**
         * config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * logging.
         */
        public Builder logging(Logging logging) {
            this.logging = logging;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * state.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetClusterAddonInstanceResponseBody build() {
            return new GetClusterAddonInstanceResponseBody(this);
        } 

    } 

    public static class Logging extends TeaModel {
        @NameInMap("capable")
        private Boolean capable;

        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("log_project")
        private String logProject;

        @NameInMap("logstore")
        private String logstore;

        private Logging(Builder builder) {
            this.capable = builder.capable;
            this.enabled = builder.enabled;
            this.logProject = builder.logProject;
            this.logstore = builder.logstore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logging create() {
            return builder().build();
        }

        /**
         * @return capable
         */
        public Boolean getCapable() {
            return this.capable;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        public static final class Builder {
            private Boolean capable; 
            private Boolean enabled; 
            private String logProject; 
            private String logstore; 

            /**
             * capable.
             */
            public Builder capable(Boolean capable) {
                this.capable = capable;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * log_project.
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            public Logging build() {
                return new Logging(this);
            } 

        } 

    }
}
