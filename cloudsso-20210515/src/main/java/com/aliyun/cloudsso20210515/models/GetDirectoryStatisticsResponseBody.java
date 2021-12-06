// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
         * <p>DirectoryStatistics.</p>
         */
        public Builder directoryStatistics(DirectoryStatistics directoryStatistics) {
            this.directoryStatistics = directoryStatistics;
            return this;
        }

        /**
         * <p>RequestId.</p>
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

        @NameInMap("Region")
        private String region;

        @NameInMap("SCIMServerCredentialCount")
        private Integer SCIMServerCredentialCount;

        @NameInMap("SCIMSyncEnabled")
        private Boolean SCIMSyncEnabled;

        @NameInMap("SSOEnabled")
        private Boolean SSOEnabled;

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
            this.region = builder.region;
            this.SCIMServerCredentialCount = builder.SCIMServerCredentialCount;
            this.SCIMSyncEnabled = builder.SCIMSyncEnabled;
            this.SSOEnabled = builder.SSOEnabled;
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
            private String region; 
            private Integer SCIMServerCredentialCount; 
            private Boolean SCIMSyncEnabled; 
            private Boolean SSOEnabled; 
            private Integer userCount; 
            private Integer userQuota; 

            /**
             * <p>AccessAssignmentCount.</p>
             */
            public Builder accessAssignmentCount(Integer accessAssignmentCount) {
                this.accessAssignmentCount = accessAssignmentCount;
                return this;
            }

            /**
             * <p>AccessConfigurationCount.</p>
             */
            public Builder accessConfigurationCount(Integer accessConfigurationCount) {
                this.accessConfigurationCount = accessConfigurationCount;
                return this;
            }

            /**
             * <p>AccessConfigurationQuota.</p>
             */
            public Builder accessConfigurationQuota(Integer accessConfigurationQuota) {
                this.accessConfigurationQuota = accessConfigurationQuota;
                return this;
            }

            /**
             * <p>DirectoryId.</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>DirectoryName.</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>GroupCount.</p>
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * <p>GroupQuota.</p>
             */
            public Builder groupQuota(Integer groupQuota) {
                this.groupQuota = groupQuota;
                return this;
            }

            /**
             * <p>InProgressTaskCount.</p>
             */
            public Builder inProgressTaskCount(Integer inProgressTaskCount) {
                this.inProgressTaskCount = inProgressTaskCount;
                return this;
            }

            /**
             * <p>Region.</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>SCIMServerCredentialCount.</p>
             */
            public Builder SCIMServerCredentialCount(Integer SCIMServerCredentialCount) {
                this.SCIMServerCredentialCount = SCIMServerCredentialCount;
                return this;
            }

            /**
             * <p>SCIMSyncEnabled.</p>
             */
            public Builder SCIMSyncEnabled(Boolean SCIMSyncEnabled) {
                this.SCIMSyncEnabled = SCIMSyncEnabled;
                return this;
            }

            /**
             * <p>SSOEnabled.</p>
             */
            public Builder SSOEnabled(Boolean SSOEnabled) {
                this.SSOEnabled = SSOEnabled;
                return this;
            }

            /**
             * <p>UserCount.</p>
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * <p>UserQuota.</p>
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
