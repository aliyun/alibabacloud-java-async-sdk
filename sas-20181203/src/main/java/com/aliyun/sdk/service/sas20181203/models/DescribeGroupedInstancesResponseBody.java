// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedInstancesResponseBody</p>
 */
public class DescribeGroupedInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGroupedInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
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
        private java.util.List < Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupedInstancesResponseBody build() {
            return new DescribeGroupedInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("AsapVulInstanceCount")
        private Long asapVulInstanceCount;

        @NameInMap("FieldAliasName")
        private String fieldAliasName;

        @NameInMap("GroupFlag")
        private Integer groupFlag;

        @NameInMap("InstanceCount")
        private String instanceCount;

        @NameInMap("RiskInstanceCount")
        private String riskInstanceCount;

        @NameInMap("UnProtectedInstanceCount")
        private String unProtectedInstanceCount;

        private Instances(Builder builder) {
            this.asapVulInstanceCount = builder.asapVulInstanceCount;
            this.fieldAliasName = builder.fieldAliasName;
            this.groupFlag = builder.groupFlag;
            this.instanceCount = builder.instanceCount;
            this.riskInstanceCount = builder.riskInstanceCount;
            this.unProtectedInstanceCount = builder.unProtectedInstanceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return asapVulInstanceCount
         */
        public Long getAsapVulInstanceCount() {
            return this.asapVulInstanceCount;
        }

        /**
         * @return fieldAliasName
         */
        public String getFieldAliasName() {
            return this.fieldAliasName;
        }

        /**
         * @return groupFlag
         */
        public Integer getGroupFlag() {
            return this.groupFlag;
        }

        /**
         * @return instanceCount
         */
        public String getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return riskInstanceCount
         */
        public String getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        /**
         * @return unProtectedInstanceCount
         */
        public String getUnProtectedInstanceCount() {
            return this.unProtectedInstanceCount;
        }

        public static final class Builder {
            private Long asapVulInstanceCount; 
            private String fieldAliasName; 
            private Integer groupFlag; 
            private String instanceCount; 
            private String riskInstanceCount; 
            private String unProtectedInstanceCount; 

            /**
             * AsapVulInstanceCount.
             */
            public Builder asapVulInstanceCount(Long asapVulInstanceCount) {
                this.asapVulInstanceCount = asapVulInstanceCount;
                return this;
            }

            /**
             * FieldAliasName.
             */
            public Builder fieldAliasName(String fieldAliasName) {
                this.fieldAliasName = fieldAliasName;
                return this;
            }

            /**
             * GroupFlag.
             */
            public Builder groupFlag(Integer groupFlag) {
                this.groupFlag = groupFlag;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(String instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * RiskInstanceCount.
             */
            public Builder riskInstanceCount(String riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            /**
             * UnProtectedInstanceCount.
             */
            public Builder unProtectedInstanceCount(String unProtectedInstanceCount) {
                this.unProtectedInstanceCount = unProtectedInstanceCount;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

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
}
