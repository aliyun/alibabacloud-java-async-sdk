// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDirectoryStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectoryStatisticsResponseBody</p>
 */
public class GetDirectoryStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DirectoryStatistics")
    private DirectoryStatistics directoryStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The statistics of the directory.</p>
         */
        public Builder directoryStatistics(DirectoryStatistics directoryStatistics) {
            this.directoryStatistics = directoryStatistics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B7228B0-A435-5D27-A6B2-ED3571F0654B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDirectoryStatisticsResponseBody build() {
            return new GetDirectoryStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDirectoryStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectoryStatisticsResponseBody</p>
     */
    public static class DirectoryStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessAssignmentCount")
        private Integer accessAssignmentCount;

        @com.aliyun.core.annotation.NameInMap("AccessConfigurationCount")
        private Integer accessConfigurationCount;

        @com.aliyun.core.annotation.NameInMap("AccessConfigurationQuota")
        private Integer accessConfigurationQuota;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("GroupCount")
        private Integer groupCount;

        @com.aliyun.core.annotation.NameInMap("GroupQuota")
        private Integer groupQuota;

        @com.aliyun.core.annotation.NameInMap("InProgressTaskCount")
        private Integer inProgressTaskCount;

        @com.aliyun.core.annotation.NameInMap("InlinePolicyPerAccessConfigurationQuota")
        private Integer inlinePolicyPerAccessConfigurationQuota;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SCIMServerCredentialCount")
        private Integer SCIMServerCredentialCount;

        @com.aliyun.core.annotation.NameInMap("SCIMSyncEnabled")
        private Boolean SCIMSyncEnabled;

        @com.aliyun.core.annotation.NameInMap("SSOEnabled")
        private Boolean SSOEnabled;

        @com.aliyun.core.annotation.NameInMap("SystemPolicyPerAccessConfigurationQuota")
        private Integer systemPolicyPerAccessConfigurationQuota;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private Integer userCount;

        @com.aliyun.core.annotation.NameInMap("UserQuota")
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
             * <p>The number of access permissions that are assigned.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder accessAssignmentCount(Integer accessAssignmentCount) {
                this.accessAssignmentCount = accessAssignmentCount;
                return this;
            }

            /**
             * <p>The number of access configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder accessConfigurationCount(Integer accessConfigurationCount) {
                this.accessConfigurationCount = accessConfigurationCount;
                return this;
            }

            /**
             * <p>The quota for access configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder accessConfigurationQuota(Integer accessConfigurationQuota) {
                this.accessConfigurationQuota = accessConfigurationQuota;
                return this;
            }

            /**
             * <p>The ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>d-00fc2p61****</p>
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The name of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>new-example</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The number of user groups.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * <p>The quota for user groups.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder groupQuota(Integer groupQuota) {
                this.groupQuota = groupQuota;
                return this;
            }

            /**
             * <p>The number of tasks that are being performed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inProgressTaskCount(Integer inProgressTaskCount) {
                this.inProgressTaskCount = inProgressTaskCount;
                return this;
            }

            /**
             * <p>The number of inline policies that can be configured for an access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inlinePolicyPerAccessConfigurationQuota(Integer inlinePolicyPerAccessConfigurationQuota) {
                this.inlinePolicyPerAccessConfigurationQuota = inlinePolicyPerAccessConfigurationQuota;
                return this;
            }

            /**
             * <p>The region ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The number of SCIM credentials.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder SCIMServerCredentialCount(Integer SCIMServerCredentialCount) {
                this.SCIMServerCredentialCount = SCIMServerCredentialCount;
                return this;
            }

            /**
             * <p>Indicates whether SCIM synchronization is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder SCIMSyncEnabled(Boolean SCIMSyncEnabled) {
                this.SCIMSyncEnabled = SCIMSyncEnabled;
                return this;
            }

            /**
             * <p>Indicates whether SSO is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder SSOEnabled(Boolean SSOEnabled) {
                this.SSOEnabled = SSOEnabled;
                return this;
            }

            /**
             * <p>The quota for system policies that can be configured for an access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder systemPolicyPerAccessConfigurationQuota(Integer systemPolicyPerAccessConfigurationQuota) {
                this.systemPolicyPerAccessConfigurationQuota = systemPolicyPerAccessConfigurationQuota;
                return this;
            }

            /**
             * <p>The number of users.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * <p>The quota for users.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
