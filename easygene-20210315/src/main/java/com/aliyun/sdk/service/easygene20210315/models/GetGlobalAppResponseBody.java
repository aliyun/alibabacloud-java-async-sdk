// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGlobalAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetGlobalAppResponseBody</p>
 */
public class GetGlobalAppResponseBody extends TeaModel {
    @NameInMap("AppDefaultVersion")
    private String appDefaultVersion;

    @NameInMap("AppDescription")
    private String appDescription;

    @NameInMap("AppDescriptorFiles")
    private java.util.List < AppDescriptorFiles> appDescriptorFiles;

    @NameInMap("AppDescriptorType")
    private String appDescriptorType;

    @NameInMap("AppFee")
    private String appFee;

    @NameInMap("AppName")
    private String appName;

    @NameInMap("AppScope")
    private String appScope;

    @NameInMap("AppType")
    private String appType;

    @NameInMap("AppVersion")
    private String appVersion;

    @NameInMap("AppVersions")
    private java.util.List < AppVersions> appVersions;

    @NameInMap("Categories")
    private java.util.List < String > categories;

    @NameInMap("Comment")
    private String comment;

    @NameInMap("Contact")
    private String contact;

    @NameInMap("DAG")
    private String DAG;

    @NameInMap("Document")
    private String document;

    @NameInMap("HostId")
    private String hostId;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("Links")
    private java.util.List < String > links;

    @NameInMap("Locations")
    private java.util.List < String > locations;

    @NameInMap("NamespaceName")
    private String namespaceName;

    @NameInMap("Pinned")
    private Boolean pinned;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Toolkit")
    private String toolkit;

    private GetGlobalAppResponseBody(Builder builder) {
        this.appDefaultVersion = builder.appDefaultVersion;
        this.appDescription = builder.appDescription;
        this.appDescriptorFiles = builder.appDescriptorFiles;
        this.appDescriptorType = builder.appDescriptorType;
        this.appFee = builder.appFee;
        this.appName = builder.appName;
        this.appScope = builder.appScope;
        this.appType = builder.appType;
        this.appVersion = builder.appVersion;
        this.appVersions = builder.appVersions;
        this.categories = builder.categories;
        this.comment = builder.comment;
        this.contact = builder.contact;
        this.DAG = builder.DAG;
        this.document = builder.document;
        this.hostId = builder.hostId;
        this.lastModified = builder.lastModified;
        this.links = builder.links;
        this.locations = builder.locations;
        this.namespaceName = builder.namespaceName;
        this.pinned = builder.pinned;
        this.requestId = builder.requestId;
        this.toolkit = builder.toolkit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGlobalAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appDefaultVersion
     */
    public String getAppDefaultVersion() {
        return this.appDefaultVersion;
    }

    /**
     * @return appDescription
     */
    public String getAppDescription() {
        return this.appDescription;
    }

    /**
     * @return appDescriptorFiles
     */
    public java.util.List < AppDescriptorFiles> getAppDescriptorFiles() {
        return this.appDescriptorFiles;
    }

    /**
     * @return appDescriptorType
     */
    public String getAppDescriptorType() {
        return this.appDescriptorType;
    }

    /**
     * @return appFee
     */
    public String getAppFee() {
        return this.appFee;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appScope
     */
    public String getAppScope() {
        return this.appScope;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return appVersions
     */
    public java.util.List < AppVersions> getAppVersions() {
        return this.appVersions;
    }

    /**
     * @return categories
     */
    public java.util.List < String > getCategories() {
        return this.categories;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * @return DAG
     */
    public String getDAG() {
        return this.DAG;
    }

    /**
     * @return document
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * @return links
     */
    public java.util.List < String > getLinks() {
        return this.links;
    }

    /**
     * @return locations
     */
    public java.util.List < String > getLocations() {
        return this.locations;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return pinned
     */
    public Boolean getPinned() {
        return this.pinned;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return toolkit
     */
    public String getToolkit() {
        return this.toolkit;
    }

    public static final class Builder {
        private String appDefaultVersion; 
        private String appDescription; 
        private java.util.List < AppDescriptorFiles> appDescriptorFiles; 
        private String appDescriptorType; 
        private String appFee; 
        private String appName; 
        private String appScope; 
        private String appType; 
        private String appVersion; 
        private java.util.List < AppVersions> appVersions; 
        private java.util.List < String > categories; 
        private String comment; 
        private String contact; 
        private String DAG; 
        private String document; 
        private String hostId; 
        private String lastModified; 
        private java.util.List < String > links; 
        private java.util.List < String > locations; 
        private String namespaceName; 
        private Boolean pinned; 
        private String requestId; 
        private String toolkit; 

        /**
         * AppDefaultVersion.
         */
        public Builder appDefaultVersion(String appDefaultVersion) {
            this.appDefaultVersion = appDefaultVersion;
            return this;
        }

        /**
         * AppDescription.
         */
        public Builder appDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }

        /**
         * AppDescriptorFiles.
         */
        public Builder appDescriptorFiles(java.util.List < AppDescriptorFiles> appDescriptorFiles) {
            this.appDescriptorFiles = appDescriptorFiles;
            return this;
        }

        /**
         * AppDescriptorType.
         */
        public Builder appDescriptorType(String appDescriptorType) {
            this.appDescriptorType = appDescriptorType;
            return this;
        }

        /**
         * AppFee.
         */
        public Builder appFee(String appFee) {
            this.appFee = appFee;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * AppScope.
         */
        public Builder appScope(String appScope) {
            this.appScope = appScope;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * AppVersions.
         */
        public Builder appVersions(java.util.List < AppVersions> appVersions) {
            this.appVersions = appVersions;
            return this;
        }

        /**
         * Categories.
         */
        public Builder categories(java.util.List < String > categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Contact.
         */
        public Builder contact(String contact) {
            this.contact = contact;
            return this;
        }

        /**
         * DAG.
         */
        public Builder DAG(String DAG) {
            this.DAG = DAG;
            return this;
        }

        /**
         * Document.
         */
        public Builder document(String document) {
            this.document = document;
            return this;
        }

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * LastModified.
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * Links.
         */
        public Builder links(java.util.List < String > links) {
            this.links = links;
            return this;
        }

        /**
         * Locations.
         */
        public Builder locations(java.util.List < String > locations) {
            this.locations = locations;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * Pinned.
         */
        public Builder pinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Toolkit.
         */
        public Builder toolkit(String toolkit) {
            this.toolkit = toolkit;
            return this;
        }

        public GetGlobalAppResponseBody build() {
            return new GetGlobalAppResponseBody(this);
        } 

    } 

    public static class AppDescriptorFiles extends TeaModel {
        @NameInMap("Checksum")
        private String checksum;

        @NameInMap("Content")
        private String content;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("Path")
        private String path;

        @NameInMap("Url")
        private String url;

        private AppDescriptorFiles(Builder builder) {
            this.checksum = builder.checksum;
            this.content = builder.content;
            this.fileType = builder.fileType;
            this.path = builder.path;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppDescriptorFiles create() {
            return builder().build();
        }

        /**
         * @return checksum
         */
        public String getChecksum() {
            return this.checksum;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String checksum; 
            private String content; 
            private String fileType; 
            private String path; 
            private String url; 

            /**
             * Checksum.
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public AppDescriptorFiles build() {
                return new AppDescriptorFiles(this);
            } 

        } 

    }
    public static class AppVersions extends TeaModel {
        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("LastModified")
        private String lastModified;

        private AppVersions(Builder builder) {
            this.appVersion = builder.appVersion;
            this.comment = builder.comment;
            this.lastModified = builder.lastModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppVersions create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        public static final class Builder {
            private String appVersion; 
            private String comment; 
            private String lastModified; 

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            public AppVersions build() {
                return new AppVersions(this);
            } 

        } 

    }
}
