// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribePostgresExtensionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostgresExtensionsResponseBody</p>
 */
public class DescribePostgresExtensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstalledExtensions")
    private java.util.List<InstalledExtensions> installedExtensions;

    @com.aliyun.core.annotation.NameInMap("Overview")
    private java.util.Map<String, ?> overview;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UninstalledExtensions")
    private java.util.List<UninstalledExtensions> uninstalledExtensions;

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
    public java.util.List<InstalledExtensions> getInstalledExtensions() {
        return this.installedExtensions;
    }

    /**
     * @return overview
     */
    public java.util.Map<String, ?> getOverview() {
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
        private java.util.Map<String, ?> overview; 
        private String requestId; 
        private java.util.List<UninstalledExtensions> uninstalledExtensions; 

        /**
         * <p>The list of extensions that are installed on the specified database.</p>
         */
        public Builder installedExtensions(java.util.List<InstalledExtensions> installedExtensions) {
            this.installedExtensions = installedExtensions;
            return this;
        }

        /**
         * <p>The overview of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder overview(java.util.Map<String, ?> overview) {
            this.overview = overview;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7E4448A6-9FE6-4474-A0C1-AA7CFC772CAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of extensions that are not installed on the specified database.</p>
         */
        public Builder uninstalledExtensions(java.util.List<UninstalledExtensions> uninstalledExtensions) {
            this.uninstalledExtensions = uninstalledExtensions;
            return this;
        }

        public DescribePostgresExtensionsResponseBody build() {
            return new DescribePostgresExtensionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePostgresExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePostgresExtensionsResponseBody</p>
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
             * <p>The category of the extension.</p>
             * <ul>
             * <li><strong>external_access</strong></li>
             * <li><strong>index_support</strong></li>
             * <li><strong>information_stat</strong></li>
             * <li><strong>geography_space</strong></li>
             * <li><strong>vector_engine</strong></li>
             * <li><strong>timing_engine</strong></li>
             * <li><strong>data_type</strong></li>
             * <li><strong>encrypt_secure</strong></li>
             * <li><strong>text_process</strong></li>
             * <li><strong>operation_maintenance</strong></li>
             * <li><strong>self_develop</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>information_stat</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The purpose of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>PostgreSQL load profile repository and report builder</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>4.1</p>
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The current version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>4.1</p>
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * <p>The name of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>pg_profile</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the extension.</p>
             * <ul>
             * <li><strong>0</strong>: The extension is displayed by default.</li>
             * <li><strong>1</strong>: The extension is preferentially displayed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The extensions on which the current extension depends when it is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>{dblink,plpgsql}</p>
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * <blockquote>
             * <p> This parameter is returned only for self-developed exclusive extensions. You can view exclusive extensions only within your Alibaba Cloud account.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>181578148294****</p>
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
    /**
     * 
     * {@link DescribePostgresExtensionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePostgresExtensionsResponseBody</p>
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
             * <p>The category of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>information_stat</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The purpose of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>PostgreSQL load profile repository and report builder</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The default version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>4.1</p>
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The current version of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>4.1</p>
             */
            public Builder installedVersion(String installedVersion) {
                this.installedVersion = installedVersion;
                return this;
            }

            /**
             * <p>The name of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>pg_cron</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the extension.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The extensions on which the current extension depends when it is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>{dblink,plpgsql}</p>
             */
            public Builder requires(String requires) {
                this.requires = requires;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * <blockquote>
             * <p> This parameter is returned only for self-developed exclusive extensions. You can view exclusive extensions only within your Alibaba Cloud account.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>181578148294****</p>
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
