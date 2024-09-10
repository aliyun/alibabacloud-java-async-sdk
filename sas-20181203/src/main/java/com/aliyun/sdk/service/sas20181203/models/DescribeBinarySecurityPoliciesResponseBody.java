// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBinarySecurityPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBinarySecurityPoliciesResponseBody</p>
 */
public class DescribeBinarySecurityPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BinarySecurityPolicies")
    private java.util.List < BinarySecurityPolicies> binarySecurityPolicies;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBinarySecurityPoliciesResponseBody(Builder builder) {
        this.binarySecurityPolicies = builder.binarySecurityPolicies;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBinarySecurityPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return binarySecurityPolicies
     */
    public java.util.List < BinarySecurityPolicies> getBinarySecurityPolicies() {
        return this.binarySecurityPolicies;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < BinarySecurityPolicies> binarySecurityPolicies; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The information about security policies.
         */
        public Builder binarySecurityPolicies(java.util.List < BinarySecurityPolicies> binarySecurityPolicies) {
            this.binarySecurityPolicies = binarySecurityPolicies;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBinarySecurityPoliciesResponseBody build() {
            return new DescribeBinarySecurityPoliciesResponseBody(this);
        } 

    } 

    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List < String > namespaces;

        private Clusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.namespaces = builder.namespaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return namespaces
         */
        public java.util.List < String > getNamespaces() {
            return this.namespaces;
        }

        public static final class Builder {
            private String clusterId; 
            private java.util.List < String > namespaces; 

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The namespaces.
             */
            public Builder namespaces(java.util.List < String > namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
    public static class BinarySecurityPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Clusters")
        private java.util.List < Clusters> clusters;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private java.util.Map < String, ? > policy;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private BinarySecurityPolicies(Builder builder) {
            this.clusters = builder.clusters;
            this.name = builder.name;
            this.policy = builder.policy;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BinarySecurityPolicies create() {
            return builder().build();
        }

        /**
         * @return clusters
         */
        public java.util.List < Clusters> getClusters() {
            return this.clusters;
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
        public java.util.Map < String, ? > getPolicy() {
            return this.policy;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Clusters> clusters; 
            private String name; 
            private java.util.Map < String, ? > policy; 
            private String remark; 
            private String status; 

            /**
             * The information about clusters.
             */
            public Builder clusters(java.util.List < Clusters> clusters) {
                this.clusters = clusters;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The content of the policy. The value is in the JSON format. A key supports the following values:
             * <p>
             * 
             * *   **policyMode**: the type of the policy. Default value: requireAttestor.
             * *   **requiredAttestors**: the required witnesses.
             */
            public Builder policy(java.util.Map < String, ? > policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The description.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the policy. Valid values:
             * <p>
             * 
             * *   **enabled**
             * *   **disabled**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BinarySecurityPolicies build() {
                return new BinarySecurityPolicies(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * The number of entries returned on each page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
}
