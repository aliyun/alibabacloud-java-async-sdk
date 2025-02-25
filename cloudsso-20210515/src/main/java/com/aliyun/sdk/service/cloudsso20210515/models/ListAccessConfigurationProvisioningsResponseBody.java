// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAccessConfigurationProvisioningsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccessConfigurationProvisioningsResponseBody</p>
 */
public class ListAccessConfigurationProvisioningsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessConfigurationProvisionings")
    private java.util.List < AccessConfigurationProvisionings> accessConfigurationProvisionings;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
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
         * <p>The accounts for which the access configuration is provisioned.</p>
         */
        public Builder accessConfigurationProvisionings(java.util.List < AccessConfigurationProvisionings> accessConfigurationProvisionings) {
            this.accessConfigurationProvisionings = accessConfigurationProvisionings;
            return this;
        }

        /**
         * <p>Indicates whether the queried entries are truncated. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of <code>IsTruncated</code> is <code>true</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>K1c3o9K7pFxoTtxH1Nm7MMLb7zrDGvftYBQBPDVv7AD3a8yhRb3Mk8L9ivmN6bFSjfkZNTAg3h4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6BA1BDF1-D845-5D2C-B742-74BE2970E4C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListAccessConfigurationProvisioningsResponseBody build() {
            return new ListAccessConfigurationProvisioningsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccessConfigurationProvisioningsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccessConfigurationProvisioningsResponseBody</p>
     */
    public static class AccessConfigurationProvisionings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessConfigurationId")
        private String accessConfigurationId;

        @com.aliyun.core.annotation.NameInMap("AccessConfigurationName")
        private String accessConfigurationName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("RAMPolicyNames")
        private java.util.List < String > RAMPolicyNames;

        @com.aliyun.core.annotation.NameInMap("RAMRoleName")
        private String RAMRoleName;

        @com.aliyun.core.annotation.NameInMap("SAMLProviderName")
        private String SAMLProviderName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetPathName")
        private String targetPathName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The ID of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ac-00ccule7tadaijxc****</p>
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * <p>The name of the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC-Admin</p>
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

            /**
             * <p>The first time when the access configuration was provisioned.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-26T08:54:14Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the custom policy that is created for an account in the resource directory.</p>
             */
            public Builder RAMPolicyNames(java.util.List < String > RAMPolicyNames) {
                this.RAMPolicyNames = RAMPolicyNames;
                return this;
            }

            /**
             * <p>The name of the RAM role that is created for an account in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunReservedSSO-VPC-Admin</p>
             */
            public Builder RAMRoleName(String RAMRoleName) {
                this.RAMRoleName = RAMRoleName;
                return this;
            }

            /**
             * <p>The name of the Security Assertion Markup Language (SAML) identity provider (IdP) that is created within an account in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunReservedSSO-d-00fc2p61****</p>
             */
            public Builder SAMLProviderName(String SAMLProviderName) {
                this.SAMLProviderName = SAMLProviderName;
                return this;
            }

            /**
             * <p>The status of the access configuration. Valid values:</p>
             * <ul>
             * <li>Provisioned: The access configuration is provisioned.</li>
             * <li>ReprovisionRequired: The access configuration needs to be re-provisioned.</li>
             * <li>DeprovisionFailed: The access configuration failed to be provisioned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Provisioned</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the task object.</p>
             * <p>If the value of TargetType is <code>RD-Account</code>, the value of this parameter is the UID of an account in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>101522521960****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the task object.</p>
             * 
             * <strong>example:</strong>
             * <p>SharedServices_5009****</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The path ID of the task object in the resource directory.</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>The path name of the task object in the resource directory.</p>
             */
            public Builder targetPathName(String targetPathName) {
                this.targetPathName = targetPathName;
                return this;
            }

            /**
             * <p>The type of the task object.</p>
             * <p>Set the value to RD-Account, which specifies the accounts in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>RD-Account</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The last time when the access configuration was provisioned.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-26T08:54:18Z</p>
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
