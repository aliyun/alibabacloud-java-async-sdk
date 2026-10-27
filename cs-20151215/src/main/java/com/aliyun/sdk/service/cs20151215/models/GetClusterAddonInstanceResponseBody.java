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
         * <p>The custom parameter settings of the add-on.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;sls_project_name&quot;:&quot;&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The log feature status of the add-on.</p>
         */
        public Builder logging(Logging logging) {
            this.logging = logging;
            return this;
        }

        /**
         * <p>The name of the add-on instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-node-problem-detector</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The state of the add-on. Valid values:</p>
         * <ul>
         * <li>active: Installed.</li>
         * <li>updating: Updating.</li>
         * <li>upgrading: Upgrading.</li>
         * <li>deleting: Uninstalling.</li>
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
         * <p>The version of the add-on instance.</p>
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
             * <p>Specifies whether the add-on supports the log feature. Valid values:</p>
             * <ul>
             * <li><p>true: Supported.</p>
             * </li>
             * <li><p>false: Not supported.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder capable(Boolean capable) {
                this.capable = capable;
                return this;
            }

            /**
             * <p>Specifies whether the log feature is enabled. Valid values:</p>
             * <ul>
             * <li><p>true: Enabled.</p>
             * </li>
             * <li><p>false: Disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The Log Service project used by the add-on log feature.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-log-c02b3e03be10643e8a644a843ffcb****</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The Logstore used by the add-on log feature.</p>
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
