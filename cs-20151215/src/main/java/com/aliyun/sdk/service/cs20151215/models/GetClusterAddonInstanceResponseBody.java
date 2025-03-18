// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetClusterAddonInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterAddonInstanceResponseBody</p>
 */
public class GetClusterAddonInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("logging")
    private Logging logging;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("version")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetClusterAddonInstanceResponseBody model) {
            this.config = model.config;
            this.logging = model.logging;
            this.name = model.name;
            this.state = model.state;
            this.version = model.version;
        } 

        /**
         * <p>The custom configurations of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sls_project_name&quot;:&quot;&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The status of Simple Log Service.</p>
         */
        public Builder logging(Logging logging) {
            this.logging = logging;
            return this;
        }

        /**
         * <p>The name of the component instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-node-problem-detector</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The status of the component. Valid values:</p>
         * <ul>
         * <li>active: The component is installed.</li>
         * <li>updating: The component is being modified.</li>
         * <li>upgrading: The component is being updated.</li>
         * <li>deleting: The component is being uninstalled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The version of the component instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.16</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public GetClusterAddonInstanceResponseBody build() {
            return new GetClusterAddonInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterAddonInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterAddonInstanceResponseBody</p>
     */
    public static class Logging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("capable")
        private Boolean capable;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("log_project")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("logstore")
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

            private Builder() {
            } 

            private Builder(Logging model) {
                this.capable = model.capable;
                this.enabled = model.enabled;
                this.logProject = model.logProject;
                this.logstore = model.logstore;
            } 

            /**
             * <p>Indicates whether Simple Log Service is supported by the component.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder capable(Boolean capable) {
                this.capable = capable;
                return this;
            }

            /**
             * <p>Indicates whether Simple Log Service is enabled for the component.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The Simple Log Service project that is used to collect logs for the component.</p>
             * 
             * <strong>example:</strong>
             * <p>my-log-project</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore that is used to collect logs for the component.</p>
             * 
             * <strong>example:</strong>
             * <p>my-logstore</p>
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
