// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppModulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppModulesResponseBody</p>
 */
public class ListAppModulesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListAppModulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppModulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAppModulesResponseBody build() {
            return new ListAppModulesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CommitId")
        private String commitId;

        @NameInMap("Description")
        private String description;

        @NameInMap("DirectDependency")
        private Boolean directDependency;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("MinimumPlatformVersion")
        private String minimumPlatformVersion;

        @NameInMap("ModuleId")
        private String moduleId;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("OwnerUserId")
        private String ownerUserId;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("Version")
        private String version;

        private Items(Builder builder) {
            this.commitId = builder.commitId;
            this.description = builder.description;
            this.directDependency = builder.directDependency;
            this.icon = builder.icon;
            this.minimumPlatformVersion = builder.minimumPlatformVersion;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.ownerUserId = builder.ownerUserId;
            this.platform = builder.platform;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return commitId
         */
        public String getCommitId() {
            return this.commitId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directDependency
         */
        public Boolean getDirectDependency() {
            return this.directDependency;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return minimumPlatformVersion
         */
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String commitId; 
            private String description; 
            private Boolean directDependency; 
            private String icon; 
            private String minimumPlatformVersion; 
            private String moduleId; 
            private String moduleName; 
            private String ownerUserId; 
            private String platform; 
            private String version; 

            /**
             * CommitId.
             */
            public Builder commitId(String commitId) {
                this.commitId = commitId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DirectDependency.
             */
            public Builder directDependency(Boolean directDependency) {
                this.directDependency = directDependency;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * MinimumPlatformVersion.
             */
            public Builder minimumPlatformVersion(String minimumPlatformVersion) {
                this.minimumPlatformVersion = minimumPlatformVersion;
                return this;
            }

            /**
             * ModuleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < Items> items; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
