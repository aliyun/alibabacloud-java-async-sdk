// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostgresExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostgresExtensionsResponseBody</p>
 */
public class DescribePostgresExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstalledExtensions")
    private java.util.List < InstalledExtensions> installedExtensions;

    @com.aliyun.core.annotation.NameInMap("Overview")
    private java.util.Map < String, ? > overview;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UninstalledExtensions")
    private java.util.List < UninstalledExtensions> uninstalledExtensions;

    private DescribePostgresExtensionsResponseBody(Builder builder) {
        this.installedExtensions = builder.installedExtensions;
        this.overview = builder.overview;
        this.requestId = builder.requestId;
        this.uninstalledExtensions = builder.uninstalledExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostgresExtensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return installedExtensions
     */
    public java.util.List < InstalledExtensions> getInstalledExtensions() {
        return this.installedExtensions;
    }

    /**
     * @return overview
     */
    public java.util.Map < String, ? > getOverview() {
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
    public java.util.List < UninstalledExtensions> getUninstalledExtensions() {
        return this.uninstalledExtensions;
    }

    public static final class Builder {
        private java.util.List < InstalledExtensions> installedExtensions; 
        private java.util.Map < String, ? > overview; 
        private String requestId; 
        private java.util.List < UninstalledExtensions> uninstalledExtensions; 

        /**
         * The list of extensions that are installed on the specified database.
         */
        public Builder installedExtensions(java.util.List < InstalledExtensions> installedExtensions) {
            this.installedExtensions = installedExtensions;
            return this;
        }

        /**
         * The overview of the extension.
         */
        public Builder overview(java.util.Map < String, ? > overview) {
            this.overview = overview;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of extensions that are not installed on the specified database.
         */
        public Builder uninstalledExtensions(java.util.List < UninstalledExtensions> uninstalledExtensions) {
            this.uninstalledExtensions = uninstalledExtensions;
            return this;
        }

        public DescribePostgresExtensionsResponseBody build() {
            return new DescribePostgresExtensionsResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private InstalledExtensions(Builder builder) {
            this.category = builder.category;
            this.comment = builder.comment;
            this.defaultVersion = builder.defaultVersion;
            this.installedVersion = builder.installedVersion;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.requires = builder.requires;
            this.uid = builder.uid;
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
         * @return uid
         */
        public String getUid() {
            return this.uid;
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
            private String uid; 

            /**
             * The category of the extension.
             * <p>
             * 
             * *   **external_access**
             * *   **index_support**
             * *   **information_stat**
             * *   **geography_space**
             * *   **vector_engine**
             * *   **timing_engine**
             * *   **data_type**
             * *   **encrypt_secure**
             * *   **text_process**
             * *   **operation_maintenance**
             * *   **self_develop**
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The purpose of the extension.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The default version of the extension.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The current version of the extension.
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * The name of the extension.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The user of the extension.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The priority of the extension.
             * <p>
             * 
             * *   **0**: The extension is displayed by default.
             * *   **1**: The extension is preferentially displayed.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The extensions on which the current extension depends when it is installed.
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public InstalledExtensions build() {
                return new InstalledExtensions(this);
            } 

        } 

    }
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

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private UninstalledExtensions(Builder builder) {
            this.category = builder.category;
            this.comment = builder.comment;
            this.defaultVersion = builder.defaultVersion;
            this.installedVersion = builder.installedVersion;
            this.name = builder.name;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.requires = builder.requires;
            this.uid = builder.uid;
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
         * @return uid
         */
        public String getUid() {
            return this.uid;
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
            private String uid; 

            /**
             * The category of the extension.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The purpose of the extension.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The default version of the extension.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The current version of the extension.
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * The name of the extension.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The user of the extension.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The priority of the extension.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The extensions on which the current extension depends when it is installed.
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public UninstalledExtensions build() {
                return new UninstalledExtensions(this);
            } 

        } 

    }
}
