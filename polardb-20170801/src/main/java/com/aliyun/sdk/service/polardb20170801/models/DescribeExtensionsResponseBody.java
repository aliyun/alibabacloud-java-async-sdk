// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExtensionsResponseBody</p>
 */
public class DescribeExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstalledExtensions")
    private java.util.List<InstalledExtensions> installedExtensions;

    @com.aliyun.core.annotation.NameInMap("Overview")
    private String overview;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UninstalledExtensions")
    private java.util.List<UninstalledExtensions> uninstalledExtensions;

    private DescribeExtensionsResponseBody(Builder builder) {
        this.installedExtensions = builder.installedExtensions;
        this.overview = builder.overview;
        this.requestId = builder.requestId;
        this.uninstalledExtensions = builder.uninstalledExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExtensionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return installedExtensions
     */
    public java.util.List<InstalledExtensions> getInstalledExtensions() {
        return this.installedExtensions;
    }

    /**
     * @return overview
     */
    public String getOverview() {
        return this.overview;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uninstalledExtensions
     */
    public java.util.List<UninstalledExtensions> getUninstalledExtensions() {
        return this.uninstalledExtensions;
    }

    public static final class Builder {
        private java.util.List<InstalledExtensions> installedExtensions; 
        private String overview; 
        private String requestId; 
        private java.util.List<UninstalledExtensions> uninstalledExtensions; 

        private Builder() {
        } 

        private Builder(DescribeExtensionsResponseBody model) {
            this.installedExtensions = model.installedExtensions;
            this.overview = model.overview;
            this.requestId = model.requestId;
            this.uninstalledExtensions = model.uninstalledExtensions;
        } 

        /**
         * <p>The extensions that are installed in the specified database.</p>
         */
        public Builder installedExtensions(java.util.List<InstalledExtensions> installedExtensions) {
            this.installedExtensions = installedExtensions;
            return this;
        }

        /**
         * <p>The overview of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>测试建单，请忽略</p>
         */
        public Builder overview(String overview) {
            this.overview = overview;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>309073D4-9C99-511C-AF84-0C67A6F52E67</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The extensions that are not installed in the specified database.</p>
         */
        public Builder uninstalledExtensions(java.util.List<UninstalledExtensions> uninstalledExtensions) {
            this.uninstalledExtensions = uninstalledExtensions;
            return this;
        }

        public DescribeExtensionsResponseBody build() {
            return new DescribeExtensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExtensionsResponseBody</p>
     */
    public static class InstalledExtensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("InstalledVersion")
        private String installedVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Requires")
        private String requires;

        @com.aliyun.core.annotation.NameInMap("Restart")
        private String restart;

        private InstalledExtensions(Builder builder) {
            this.category = builder.category;
            this.comment = builder.comment;
            this.defaultVersion = builder.defaultVersion;
            this.installedVersion = builder.installedVersion;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.requires = builder.requires;
            this.restart = builder.restart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstalledExtensions create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return installedVersion
         */
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return requires
         */
        public String getRequires() {
            return this.requires;
        }

        /**
         * @return restart
         */
        public String getRestart() {
            return this.restart;
        }

        public static final class Builder {
            private String category; 
            private String comment; 
            private String defaultVersion; 
            private String installedVersion; 
            private String name; 
            private String owner; 
            private String priority; 
            private String requires; 
            private String restart; 

            private Builder() {
            } 

            private Builder(InstalledExtensions model) {
                this.category = model.category;
                this.comment = model.comment;
                this.defaultVersion = model.defaultVersion;
                this.installedVersion = model.installedVersion;
                this.name = model.name;
                this.owner = model.owner;
                this.priority = model.priority;
                this.requires = model.requires;
                this.restart = model.restart;
            } 

            /**
             * <p>The extension type.</p>
             * 
             * <strong>example:</strong>
             * <p>geography_space, self_develop</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The description of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>7.7</p>
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The currently installed version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>7.7</p>
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * <p>The extension name.</p>
             * 
             * <strong>example:</strong>
             * <p>jueming</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>alton</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The extensions on which this extension depends.</p>
             * 
             * <strong>example:</strong>
             * <p>ganos_networking</p>
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            /**
             * <p>Specifies whether to restart the application. \<code>true\\</code>: The application is restarted. \<code>false\\</code>: The application is not restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder restart(String restart) {
                this.restart = restart;
                return this;
            }

            public InstalledExtensions build() {
                return new InstalledExtensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExtensionsResponseBody</p>
     */
    public static class UninstalledExtensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("InstalledVersion")
        private String installedVersion;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("Requires")
        private String requires;

        @com.aliyun.core.annotation.NameInMap("Restart")
        private String restart;

        private UninstalledExtensions(Builder builder) {
            this.category = builder.category;
            this.comment = builder.comment;
            this.defaultVersion = builder.defaultVersion;
            this.installedVersion = builder.installedVersion;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.requires = builder.requires;
            this.restart = builder.restart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UninstalledExtensions create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return installedVersion
         */
        public String getInstalledVersion() {
            return this.installedVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return requires
         */
        public String getRequires() {
            return this.requires;
        }

        /**
         * @return restart
         */
        public String getRestart() {
            return this.restart;
        }

        public static final class Builder {
            private String category; 
            private String comment; 
            private String defaultVersion; 
            private String installedVersion; 
            private String name; 
            private String owner; 
            private String priority; 
            private String requires; 
            private String restart; 

            private Builder() {
            } 

            private Builder(UninstalledExtensions model) {
                this.category = model.category;
                this.comment = model.comment;
                this.defaultVersion = model.defaultVersion;
                this.installedVersion = model.installedVersion;
                this.name = model.name;
                this.owner = model.owner;
                this.priority = model.priority;
                this.requires = model.requires;
                this.restart = model.restart;
            } 

            /**
             * <p>The extension type.</p>
             * 
             * <strong>example:</strong>
             * <p>geography_space, self_develop</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The purpose of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>7.7</p>
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The currently installed version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>7.7</p>
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * <p>The extension name.</p>
             * 
             * <strong>example:</strong>
             * <p>jueming</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>alton</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The extensions on which this extension depends.</p>
             * 
             * <strong>example:</strong>
             * <p>ganos_networking</p>
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            /**
             * <p>Specifies whether to restart the application. \<code>true\\</code>: The application is restarted. \<code>false\\</code>: The application is not restarted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder restart(String restart) {
                this.restart = restart;
                return this;
            }

            public UninstalledExtensions build() {
                return new UninstalledExtensions(this);
            } 

        } 

    }
}
