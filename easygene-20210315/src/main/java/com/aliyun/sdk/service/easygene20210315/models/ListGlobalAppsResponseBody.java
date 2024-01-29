// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGlobalAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGlobalAppsResponseBody</p>
 */
public class ListGlobalAppsResponseBody extends TeaModel {
    @NameInMap("GlobalApps")
    private java.util.List < GlobalApps> globalApps;

    @NameInMap("HostId")
    private String hostId;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListGlobalAppsResponseBody(Builder builder) {
        this.globalApps = builder.globalApps;
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGlobalAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalApps
     */
    public java.util.List < GlobalApps> getGlobalApps() {
        return this.globalApps;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < GlobalApps> globalApps; 
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * GlobalApps.
         */
        public Builder globalApps(java.util.List < GlobalApps> globalApps) {
            this.globalApps = globalApps;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListGlobalAppsResponseBody build() {
            return new ListGlobalAppsResponseBody(this);
        } 

    } 

    public static class GlobalApps extends TeaModel {
        @NameInMap("AppDefaultVersion")
        private String appDefaultVersion;

        @NameInMap("AppDescription")
        private String appDescription;

        @NameInMap("AppFee")
        private String appFee;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppScope")
        private String appScope;

        @NameInMap("Categories")
        private java.util.List < String > categories;

        @NameInMap("LastModified")
        private String lastModified;

        @NameInMap("Locations")
        private java.util.List < String > locations;

        @NameInMap("NamespaceName")
        private String namespaceName;

        @NameInMap("Pinned")
        private Boolean pinned;

        @NameInMap("Toolkit")
        private String toolkit;

        private GlobalApps(Builder builder) {
            this.appDefaultVersion = builder.appDefaultVersion;
            this.appDescription = builder.appDescription;
            this.appFee = builder.appFee;
            this.appName = builder.appName;
            this.appScope = builder.appScope;
            this.categories = builder.categories;
            this.lastModified = builder.lastModified;
            this.locations = builder.locations;
            this.namespaceName = builder.namespaceName;
            this.pinned = builder.pinned;
            this.toolkit = builder.toolkit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalApps create() {
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
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
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
         * @return toolkit
         */
        public String getToolkit() {
            return this.toolkit;
        }

        public static final class Builder {
            private String appDefaultVersion; 
            private String appDescription; 
            private String appFee; 
            private String appName; 
            private String appScope; 
            private java.util.List < String > categories; 
            private String lastModified; 
            private java.util.List < String > locations; 
            private String namespaceName; 
            private Boolean pinned; 
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
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
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
             * Toolkit.
             */
            public Builder toolkit(String toolkit) {
                this.toolkit = toolkit;
                return this;
            }

            public GlobalApps build() {
                return new GlobalApps(this);
            } 

        } 

    }
}
