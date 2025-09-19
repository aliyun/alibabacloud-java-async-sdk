// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGroupedInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedInstancesResponseBody</p>
 */
public class DescribeGroupedInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
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
        private java.util.List<Instances> instances; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGroupedInstancesResponseBody model) {
            this.instances = model.instances;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the assets.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>52A3AEE6-114A-499D-8990-4BA9B27FE0AA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupedInstancesResponseBody build() {
            return new DescribeGroupedInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupedInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsapVulInstanceCount")
        private Long asapVulInstanceCount;

        @com.aliyun.core.annotation.NameInMap("AuthVersionCheckCount")
        private Integer authVersionCheckCount;

        @com.aliyun.core.annotation.NameInMap("FieldAliasName")
        private String fieldAliasName;

        @com.aliyun.core.annotation.NameInMap("GroupFlag")
        private Integer groupFlag;

        @com.aliyun.core.annotation.NameInMap("InstanceCoreCount")
        private Long instanceCoreCount;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private String instanceCount;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("RiskInstanceCount")
        private String riskInstanceCount;

        @com.aliyun.core.annotation.NameInMap("UnProtectedInstanceCount")
        private String unProtectedInstanceCount;

        private Instances(Builder builder) {
            this.asapVulInstanceCount = builder.asapVulInstanceCount;
            this.authVersionCheckCount = builder.authVersionCheckCount;
            this.fieldAliasName = builder.fieldAliasName;
            this.groupFlag = builder.groupFlag;
            this.instanceCoreCount = builder.instanceCoreCount;
            this.instanceCount = builder.instanceCount;
            this.os = builder.os;
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
         * @return authVersionCheckCount
         */
        public Integer getAuthVersionCheckCount() {
            return this.authVersionCheckCount;
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
         * @return instanceCoreCount
         */
        public Long getInstanceCoreCount() {
            return this.instanceCoreCount;
        }

        /**
         * @return instanceCount
         */
        public String getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
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
            private Integer authVersionCheckCount; 
            private String fieldAliasName; 
            private Integer groupFlag; 
            private Long instanceCoreCount; 
            private String instanceCount; 
            private String os; 
            private String riskInstanceCount; 
            private String unProtectedInstanceCount; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.asapVulInstanceCount = model.asapVulInstanceCount;
                this.authVersionCheckCount = model.authVersionCheckCount;
                this.fieldAliasName = model.fieldAliasName;
                this.groupFlag = model.groupFlag;
                this.instanceCoreCount = model.instanceCoreCount;
                this.instanceCount = model.instanceCount;
                this.os = model.os;
                this.riskInstanceCount = model.riskInstanceCount;
                this.unProtectedInstanceCount = model.unProtectedInstanceCount;
            } 

            /**
             * <p>The number of assets on which high-risk vulnerabilities are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder asapVulInstanceCount(Long asapVulInstanceCount) {
                this.asapVulInstanceCount = asapVulInstanceCount;
                return this;
            }

            /**
             * <p>The number of assets that are protected by the specified edition.</p>
             * 
             * <strong>example:</strong>
             * <p>205</p>
             */
            public Builder authVersionCheckCount(Integer authVersionCheckCount) {
                this.authVersionCheckCount = authVersionCheckCount;
                return this;
            }

            /**
             * <p>The name of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>testA</p>
             */
            public Builder fieldAliasName(String fieldAliasName) {
                this.fieldAliasName = fieldAliasName;
                return this;
            }

            /**
             * <p>The type of the server group. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: the default group</li>
             * <li><strong>1</strong>: other group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder groupFlag(Integer groupFlag) {
                this.groupFlag = groupFlag;
                return this;
            }

            /**
             * <p>The number of cores of assets in the specified asset type.</p>
             * <blockquote>
             * <p> If the <strong>MachineTypes</strong> request parameter is not specified, the value of the InstanceCoreCount parameter indicates the total number of cores of assets within your account.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>610</p>
             */
            public Builder instanceCoreCount(Long instanceCoreCount) {
                this.instanceCoreCount = instanceCoreCount;
                return this;
            }

            /**
             * <p>The total number of assets that belong to the specified type.</p>
             * <blockquote>
             * <p> If the <strong>MachineTypes</strong> request parameter is not specified, the value of the InstanceCount parameter is the total number of your assets.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>205</p>
             */
            public Builder instanceCount(String instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The operating system type of the asset. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong></li>
             * <li><strong>linux</strong></li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only when Lang is set to zh.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>windows</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>The number of assets that are at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>172</p>
             */
            public Builder riskInstanceCount(String riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            /**
             * <p>The number of assets that are not protected by Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
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
    /**
     * 
     * {@link DescribeGroupedInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupedInstancesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
