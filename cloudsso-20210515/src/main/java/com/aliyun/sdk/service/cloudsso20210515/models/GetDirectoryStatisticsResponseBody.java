// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectoryStatisticsResponseBody</p>
 */
public class GetDirectoryStatisticsResponseBody extends TeaModel {
    @NameInMap("DirectoryStatistics")
    private DirectoryStatistics directoryStatistics;

    @NameInMap("RequestId")
    private String requestId;

    private GetDirectoryStatisticsResponseBody(Builder builder) {
        this.directoryStatistics = builder.directoryStatistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectoryStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return directoryStatistics
     */
    public DirectoryStatistics getDirectoryStatistics() {
        return this.directoryStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DirectoryStatistics directoryStatistics; 
        private String requestId; 

        /**
         * The statistics of the directory.
         */
        public Builder directoryStatistics(DirectoryStatistics directoryStatistics) {
            this.directoryStatistics = directoryStatistics;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDirectoryStatisticsResponseBody build() {
            return new GetDirectoryStatisticsResponseBody(this);
        } 

    } 

    public static class DirectoryStatistics extends TeaModel {
        @NameInMap("AccessAssignmentCount")
        private Integer accessAssignmentCount;

        @NameInMap("AccessConfigurationCount")
        private Integer accessConfigurationCount;

        @NameInMap("AccessConfigurationQuota")
        private Integer accessConfigurationQuota;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DirectoryName")
        private String directoryName;

        @NameInMap("GroupCount")
        private Integer groupCount;

        @NameInMap("GroupQuota")
        private Integer groupQuota;

        @NameInMap("InProgressTaskCount")
        private Integer inProgressTaskCount;

        @NameInMap("InlinePolicyPerAccessConfigurationQuota")
        private Integer inlinePolicyPerAccessConfigurationQuota;

        @NameInMap("Region")
        private String region;

        @NameInMap("SCIMServerCredentialCount")
        private Integer SCIMServerCredentialCount;

        @NameInMap("SCIMSyncEnabled")
        private Boolean SCIMSyncEnabled;

        @NameInMap("SSOEnabled")
        private Boolean SSOEnabled;

        @NameInMap("SystemPolicyPerAccessConfigurationQuota")
        private Integer systemPolicyPerAccessConfigurationQuota;

        @NameInMap("UserCount")
        private Integer userCount;

        @NameInMap("UserQuota")
        private Integer userQuota;

        private DirectoryStatistics(Builder builder) {
            this.accessAssignmentCount = builder.accessAssignmentCount;
            this.accessConfigurationCount = builder.accessConfigurationCount;
            this.accessConfigurationQuota = builder.accessConfigurationQuota;
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.groupCount = builder.groupCount;
            this.groupQuota = builder.groupQuota;
            this.inProgressTaskCount = builder.inProgressTaskCount;
            this.inlinePolicyPerAccessConfigurationQuota = builder.inlinePolicyPerAccessConfigurationQuota;
            this.region = builder.region;
            this.SCIMServerCredentialCount = builder.SCIMServerCredentialCount;
            this.SCIMSyncEnabled = builder.SCIMSyncEnabled;
            this.SSOEnabled = builder.SSOEnabled;
            this.systemPolicyPerAccessConfigurationQuota = builder.systemPolicyPerAccessConfigurationQuota;
            this.userCount = builder.userCount;
            this.userQuota = builder.userQuota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectoryStatistics create() {
            return builder().build();
        }

        /**
         * @return accessAssignmentCount
         */
        public Integer getAccessAssignmentCount() {
            return this.accessAssignmentCount;
        }

        /**
         * @return accessConfigurationCount
         */
        public Integer getAccessConfigurationCount() {
            return this.accessConfigurationCount;
        }

        /**
         * @return accessConfigurationQuota
         */
        public Integer getAccessConfigurationQuota() {
            return this.accessConfigurationQuota;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryName
         */
        public String getDirectoryName() {
            return this.directoryName;
        }

        /**
         * @return groupCount
         */
        public Integer getGroupCount() {
            return this.groupCount;
        }

        /**
         * @return groupQuota
         */
        public Integer getGroupQuota() {
            return this.groupQuota;
        }

        /**
         * @return inProgressTaskCount
         */
        public Integer getInProgressTaskCount() {
            return this.inProgressTaskCount;
        }

        /**
         * @return inlinePolicyPerAccessConfigurationQuota
         */
        public Integer getInlinePolicyPerAccessConfigurationQuota() {
            return this.inlinePolicyPerAccessConfigurationQuota;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return SCIMServerCredentialCount
         */
        public Integer getSCIMServerCredentialCount() {
            return this.SCIMServerCredentialCount;
        }

        /**
         * @return SCIMSyncEnabled
         */
        public Boolean getSCIMSyncEnabled() {
            return this.SCIMSyncEnabled;
        }

        /**
         * @return SSOEnabled
         */
        public Boolean getSSOEnabled() {
            return this.SSOEnabled;
        }

        /**
         * @return systemPolicyPerAccessConfigurationQuota
         */
        public Integer getSystemPolicyPerAccessConfigurationQuota() {
            return this.systemPolicyPerAccessConfigurationQuota;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        /**
         * @return userQuota
         */
        public Integer getUserQuota() {
            return this.userQuota;
        }

        public static final class Builder {
            private Integer accessAssignmentCount; 
            private Integer accessConfigurationCount; 
            private Integer accessConfigurationQuota; 
            private String directoryId; 
            private String directoryName; 
            private Integer groupCount; 
            private Integer groupQuota; 
            private Integer inProgressTaskCount; 
            private Integer inlinePolicyPerAccessConfigurationQuota; 
            private String region; 
            private Integer SCIMServerCredentialCount; 
            private Boolean SCIMSyncEnabled; 
            private Boolean SSOEnabled; 
            private Integer systemPolicyPerAccessConfigurationQuota; 
            private Integer userCount; 
            private Integer userQuota; 

            /**
             * The number of access permissions that are assigned.
             */
            public Builder accessAssignmentCount(Integer accessAssignmentCount) {
                this.accessAssignmentCount = accessAssignmentCount;
                return this;
            }

            /**
             * The number of access configurations.
             */
            public Builder accessConfigurationCount(Integer accessConfigurationCount) {
                this.accessConfigurationCount = accessConfigurationCount;
                return this;
            }

            /**
             * The quota for access configurations.
             */
            public Builder accessConfigurationQuota(Integer accessConfigurationQuota) {
                this.accessConfigurationQuota = accessConfigurationQuota;
                return this;
            }

            /**
             * The ID of the directory.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * The name of the directory.
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * The number of user groups.
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * The quota for user groups.
             */
            public Builder groupQuota(Integer groupQuota) {
                this.groupQuota = groupQuota;
                return this;
            }

            /**
             * The number of tasks that are being performed.
             */
            public Builder inProgressTaskCount(Integer inProgressTaskCount) {
                this.inProgressTaskCount = inProgressTaskCount;
                return this;
            }

            /**
             * InlinePolicyPerAccessConfigurationQuota.
             */
            public Builder inlinePolicyPerAccessConfigurationQuota(Integer inlinePolicyPerAccessConfigurationQuota) {
                this.inlinePolicyPerAccessConfigurationQuota = inlinePolicyPerAccessConfigurationQuota;
                return this;
            }

            /**
             * The region ID of the directory.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The number of SCIM credentials.
             */
            public Builder SCIMServerCredentialCount(Integer SCIMServerCredentialCount) {
                this.SCIMServerCredentialCount = SCIMServerCredentialCount;
                return this;
            }

            /**
             * Indicates whether SCIM synchronization is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder SCIMSyncEnabled(Boolean SCIMSyncEnabled) {
                this.SCIMSyncEnabled = SCIMSyncEnabled;
                return this;
            }

            /**
             * Indicates whether SSO is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder SSOEnabled(Boolean SSOEnabled) {
                this.SSOEnabled = SSOEnabled;
                return this;
            }

            /**
             * The quota for system policies that can be configured for an access configuration.
             */
            public Builder systemPolicyPerAccessConfigurationQuota(Integer systemPolicyPerAccessConfigurationQuota) {
                this.systemPolicyPerAccessConfigurationQuota = systemPolicyPerAccessConfigurationQuota;
                return this;
            }

            /**
             * The number of users.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * The quota for users.
             */
            public Builder userQuota(Integer userQuota) {
                this.userQuota = userQuota;
                return this;
            }

            public DirectoryStatistics build() {
                return new DirectoryStatistics(this);
            } 

        } 

    }
}
