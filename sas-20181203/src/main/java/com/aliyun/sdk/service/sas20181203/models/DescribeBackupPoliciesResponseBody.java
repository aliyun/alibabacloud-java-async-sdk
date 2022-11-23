// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPoliciesResponseBody</p>
 */
public class DescribeBackupPoliciesResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPoliciesResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List < Policies> policies; 
        private String requestId; 

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * Policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPoliciesResponseBody build() {
            return new DescribeBackupPoliciesResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @NameInMap("ClientErrorCount")
        private Integer clientErrorCount;

        @NameInMap("ClientErrorUuidList")
        private java.util.List < String > clientErrorUuidList;

        @NameInMap("ClientStatus")
        private String clientStatus;

        @NameInMap("HealthClientCount")
        private Integer healthClientCount;

        @NameInMap("HealthClientUuidList")
        private java.util.List < String > healthClientUuidList;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PolicyRegionId")
        private String policyRegionId;

        @NameInMap("PolicyVersion")
        private String policyVersion;

        @NameInMap("RemarkedUuidList")
        private java.util.List < String > remarkedUuidList;

        @NameInMap("ServerType")
        private String serverType;

        @NameInMap("ServiceErrorCount")
        private Integer serviceErrorCount;

        @NameInMap("ServiceErrorUuidList")
        private java.util.List < String > serviceErrorUuidList;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpgradeStatus")
        private String upgradeStatus;

        @NameInMap("UuidList")
        private java.util.List < String > uuidList;

        private Policies(Builder builder) {
            this.clientErrorCount = builder.clientErrorCount;
            this.clientErrorUuidList = builder.clientErrorUuidList;
            this.clientStatus = builder.clientStatus;
            this.healthClientCount = builder.healthClientCount;
            this.healthClientUuidList = builder.healthClientUuidList;
            this.id = builder.id;
            this.name = builder.name;
            this.policy = builder.policy;
            this.policyRegionId = builder.policyRegionId;
            this.policyVersion = builder.policyVersion;
            this.remarkedUuidList = builder.remarkedUuidList;
            this.serverType = builder.serverType;
            this.serviceErrorCount = builder.serviceErrorCount;
            this.serviceErrorUuidList = builder.serviceErrorUuidList;
            this.status = builder.status;
            this.upgradeStatus = builder.upgradeStatus;
            this.uuidList = builder.uuidList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return clientErrorCount
         */
        public Integer getClientErrorCount() {
            return this.clientErrorCount;
        }

        /**
         * @return clientErrorUuidList
         */
        public java.util.List < String > getClientErrorUuidList() {
            return this.clientErrorUuidList;
        }

        /**
         * @return clientStatus
         */
        public String getClientStatus() {
            return this.clientStatus;
        }

        /**
         * @return healthClientCount
         */
        public Integer getHealthClientCount() {
            return this.healthClientCount;
        }

        /**
         * @return healthClientUuidList
         */
        public java.util.List < String > getHealthClientUuidList() {
            return this.healthClientUuidList;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return policyRegionId
         */
        public String getPolicyRegionId() {
            return this.policyRegionId;
        }

        /**
         * @return policyVersion
         */
        public String getPolicyVersion() {
            return this.policyVersion;
        }

        /**
         * @return remarkedUuidList
         */
        public java.util.List < String > getRemarkedUuidList() {
            return this.remarkedUuidList;
        }

        /**
         * @return serverType
         */
        public String getServerType() {
            return this.serverType;
        }

        /**
         * @return serviceErrorCount
         */
        public Integer getServiceErrorCount() {
            return this.serviceErrorCount;
        }

        /**
         * @return serviceErrorUuidList
         */
        public java.util.List < String > getServiceErrorUuidList() {
            return this.serviceErrorUuidList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return upgradeStatus
         */
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

        /**
         * @return uuidList
         */
        public java.util.List < String > getUuidList() {
            return this.uuidList;
        }

        public static final class Builder {
            private Integer clientErrorCount; 
            private java.util.List < String > clientErrorUuidList; 
            private String clientStatus; 
            private Integer healthClientCount; 
            private java.util.List < String > healthClientUuidList; 
            private Long id; 
            private String name; 
            private String policy; 
            private String policyRegionId; 
            private String policyVersion; 
            private java.util.List < String > remarkedUuidList; 
            private String serverType; 
            private Integer serviceErrorCount; 
            private java.util.List < String > serviceErrorUuidList; 
            private String status; 
            private String upgradeStatus; 
            private java.util.List < String > uuidList; 

            /**
             * ClientErrorCount.
             */
            public Builder clientErrorCount(Integer clientErrorCount) {
                this.clientErrorCount = clientErrorCount;
                return this;
            }

            /**
             * ClientErrorUuidList.
             */
            public Builder clientErrorUuidList(java.util.List < String > clientErrorUuidList) {
                this.clientErrorUuidList = clientErrorUuidList;
                return this;
            }

            /**
             * ClientStatus.
             */
            public Builder clientStatus(String clientStatus) {
                this.clientStatus = clientStatus;
                return this;
            }

            /**
             * HealthClientCount.
             */
            public Builder healthClientCount(Integer healthClientCount) {
                this.healthClientCount = healthClientCount;
                return this;
            }

            /**
             * HealthClientUuidList.
             */
            public Builder healthClientUuidList(java.util.List < String > healthClientUuidList) {
                this.healthClientUuidList = healthClientUuidList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PolicyRegionId.
             */
            public Builder policyRegionId(String policyRegionId) {
                this.policyRegionId = policyRegionId;
                return this;
            }

            /**
             * PolicyVersion.
             */
            public Builder policyVersion(String policyVersion) {
                this.policyVersion = policyVersion;
                return this;
            }

            /**
             * RemarkedUuidList.
             */
            public Builder remarkedUuidList(java.util.List < String > remarkedUuidList) {
                this.remarkedUuidList = remarkedUuidList;
                return this;
            }

            /**
             * ServerType.
             */
            public Builder serverType(String serverType) {
                this.serverType = serverType;
                return this;
            }

            /**
             * ServiceErrorCount.
             */
            public Builder serviceErrorCount(Integer serviceErrorCount) {
                this.serviceErrorCount = serviceErrorCount;
                return this;
            }

            /**
             * ServiceErrorUuidList.
             */
            public Builder serviceErrorUuidList(java.util.List < String > serviceErrorUuidList) {
                this.serviceErrorUuidList = serviceErrorUuidList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpgradeStatus.
             */
            public Builder upgradeStatus(String upgradeStatus) {
                this.upgradeStatus = upgradeStatus;
                return this;
            }

            /**
             * UuidList.
             */
            public Builder uuidList(java.util.List < String > uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
