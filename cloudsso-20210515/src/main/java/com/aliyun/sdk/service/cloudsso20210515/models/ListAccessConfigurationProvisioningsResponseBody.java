// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessConfigurationProvisioningsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessConfigurationProvisioningsResponseBody</p>
 */
public class ListAccessConfigurationProvisioningsResponseBody extends TeaModel {
    @NameInMap("AccessConfigurationProvisionings")
    private java.util.List < AccessConfigurationProvisionings> accessConfigurationProvisionings;

    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListAccessConfigurationProvisioningsResponseBody(Builder builder) {
        this.accessConfigurationProvisionings = builder.accessConfigurationProvisionings;
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessConfigurationProvisioningsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessConfigurationProvisionings
     */
    public java.util.List < AccessConfigurationProvisionings> getAccessConfigurationProvisionings() {
        return this.accessConfigurationProvisionings;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
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
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List < AccessConfigurationProvisionings> accessConfigurationProvisionings; 
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCounts; 

        /**
         * The accounts for which the access configuration is provisioned.
         */
        public Builder accessConfigurationProvisionings(java.util.List < AccessConfigurationProvisionings> accessConfigurationProvisionings) {
            this.accessConfigurationProvisionings = accessConfigurationProvisionings;
            return this;
        }

        /**
         * Indicates whether the queried entries are truncated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         * <p>
         * 
         * >  This parameter is returned only when the value of `IsTruncated` is `true`.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListAccessConfigurationProvisioningsResponseBody build() {
            return new ListAccessConfigurationProvisioningsResponseBody(this);
        } 

    } 

    public static class AccessConfigurationProvisionings extends TeaModel {
        @NameInMap("AccessConfigurationId")
        private String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        private String accessConfigurationName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("RAMPolicyNames")
        private java.util.List < String > RAMPolicyNames;

        @NameInMap("RAMRoleName")
        private String RAMRoleName;

        @NameInMap("SAMLProviderName")
        private String SAMLProviderName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TargetPathName")
        private String targetPathName;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private AccessConfigurationProvisionings(Builder builder) {
            this.accessConfigurationId = builder.accessConfigurationId;
            this.accessConfigurationName = builder.accessConfigurationName;
            this.createTime = builder.createTime;
            this.RAMPolicyNames = builder.RAMPolicyNames;
            this.RAMRoleName = builder.RAMRoleName;
            this.SAMLProviderName = builder.SAMLProviderName;
            this.status = builder.status;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetPath = builder.targetPath;
            this.targetPathName = builder.targetPathName;
            this.targetType = builder.targetType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessConfigurationProvisionings create() {
            return builder().build();
        }

        /**
         * @return accessConfigurationId
         */
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        /**
         * @return accessConfigurationName
         */
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return RAMPolicyNames
         */
        public java.util.List < String > getRAMPolicyNames() {
            return this.RAMPolicyNames;
        }

        /**
         * @return RAMRoleName
         */
        public String getRAMRoleName() {
            return this.RAMRoleName;
        }

        /**
         * @return SAMLProviderName
         */
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetPathName
         */
        public String getTargetPathName() {
            return this.targetPathName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String accessConfigurationId; 
            private String accessConfigurationName; 
            private String createTime; 
            private java.util.List < String > RAMPolicyNames; 
            private String RAMRoleName; 
            private String SAMLProviderName; 
            private String status; 
            private String targetId; 
            private String targetName; 
            private String targetPath; 
            private String targetPathName; 
            private String targetType; 
            private String updateTime; 

            /**
             * The ID of the access configuration.
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * The name of the access configuration.
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

            /**
             * The first time when the access configuration was provisioned.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The name of the custom policy that is created for an account in the resource directory.
             */
            public Builder RAMPolicyNames(java.util.List < String > RAMPolicyNames) {
                this.RAMPolicyNames = RAMPolicyNames;
                return this;
            }

            /**
             * The name of the RAM role that is created for an account in the resource directory.
             */
            public Builder RAMRoleName(String RAMRoleName) {
                this.RAMRoleName = RAMRoleName;
                return this;
            }

            /**
             * The name of the Security Assertion Markup Language (SAML) identity provider (IdP) that is created within an account in the resource directory.
             */
            public Builder SAMLProviderName(String SAMLProviderName) {
                this.SAMLProviderName = SAMLProviderName;
                return this;
            }

            /**
             * The status of the access configuration. Valid values:
             * <p>
             * 
             * *   Provisioned: The access configuration is provisioned.
             * *   ReprovisionRequired: The access configuration needs to be re-provisioned.
             * *   DeprovisionFailed: The access configuration failed to be provisioned.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the task object.
             * <p>
             * 
             * If the value of TargetType is `RD-Account`, the value of this parameter is the UID of an account in the resource directory.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the task object.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The path ID of the task object in the resource directory.
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * The path name of the task object in the resource directory.
             */
            public Builder targetPathName(String targetPathName) {
                this.targetPathName = targetPathName;
                return this;
            }

            /**
             * The type of the task object.
             * <p>
             * 
             * Set the value to RD-Account, which specifies the accounts in the resource directory.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The last time when the access configuration was provisioned.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AccessConfigurationProvisionings build() {
                return new AccessConfigurationProvisionings(this);
            } 

        } 

    }
}
