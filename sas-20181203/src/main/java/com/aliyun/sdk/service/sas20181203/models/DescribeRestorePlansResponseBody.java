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
 * {@link DescribeRestorePlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestorePlansResponseBody</p>
 */
public class DescribeRestorePlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RestorePlans")
    private java.util.List<RestorePlans> restorePlans;

    private DescribeRestorePlansResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.restorePlans = builder.restorePlans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestorePlansResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return restorePlans
     */
    public java.util.List<RestorePlans> getRestorePlans() {
        return this.restorePlans;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<RestorePlans> restorePlans; 

        private Builder() {
        } 

        private Builder(DescribeRestorePlansResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.restorePlans = model.restorePlans;
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
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the restoration tasks.</p>
         */
        public Builder restorePlans(java.util.List<RestorePlans> restorePlans) {
            this.restorePlans = restorePlans;
            return this;
        }

        public DescribeRestorePlansResponseBody build() {
            return new DescribeRestorePlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestorePlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestorePlansResponseBody</p>
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
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
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
             * <p>33</p>
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
    /**
     * 
     * {@link DescribeRestorePlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRestorePlansResponseBody</p>
     */
    public static class RestorePlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("DatabaseName")
        private String databaseName;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("RestorePoint")
        private Long restorePoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetDatabaseName")
        private String targetDatabaseName;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private RestorePlans(Builder builder) {
            this.createdTime = builder.createdTime;
            this.databaseName = builder.databaseName;
            this.instanceName = builder.instanceName;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.restorePoint = builder.restorePoint;
            this.status = builder.status;
            this.targetDatabaseName = builder.targetDatabaseName;
            this.targetInstanceId = builder.targetInstanceId;
            this.targetInstanceName = builder.targetInstanceName;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestorePlans create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return restorePoint
         */
        public Long getRestorePoint() {
            return this.restorePoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetDatabaseName
         */
        public String getTargetDatabaseName() {
            return this.targetDatabaseName;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return targetInstanceName
         */
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private Long createdTime; 
            private String databaseName; 
            private String instanceName; 
            private Long policyId; 
            private String policyName; 
            private Long restorePoint; 
            private String status; 
            private String targetDatabaseName; 
            private String targetInstanceId; 
            private String targetInstanceName; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(RestorePlans model) {
                this.createdTime = model.createdTime;
                this.databaseName = model.databaseName;
                this.instanceName = model.instanceName;
                this.policyId = model.policyId;
                this.policyName = model.policyName;
                this.restorePoint = model.restorePoint;
                this.status = model.status;
                this.targetDatabaseName = model.targetDatabaseName;
                this.targetInstanceId = model.targetInstanceId;
                this.targetInstanceName = model.targetInstanceName;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * <p>The timestamp when the restoration task was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1655174753****</p>
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>Bankup****</p>
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * <p>The name of the server on which the database resides.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The ID of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>KtDataBase</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The point in time to which data is restored.</p>
             * 
             * <strong>example:</strong>
             * <p>165875100****</p>
             */
            public Builder restorePoint(Long restorePoint) {
                this.restorePoint = restorePoint;
                return this;
            }

            /**
             * <p>The status of the restoration task. Valid values:</p>
             * <ul>
             * <li><strong>init</strong>: initializing</li>
             * <li><strong>created</strong>: creating</li>
             * <li><strong>running</strong>: running</li>
             * <li><strong>completed</strong>: complete</li>
             * <li><strong>error</strong>: failed</li>
             * <li><strong>restoring</strong>: restoring</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the destination database.</p>
             * 
             * <strong>example:</strong>
             * <p>OABak</p>
             */
            public Builder targetDatabaseName(String targetDatabaseName) {
                this.targetDatabaseName = targetDatabaseName;
                return this;
            }

            /**
             * <p>The ID of the destination server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-2zehqflgbl9ep2he****</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The name of the destination server.</p>
             * 
             * <strong>example:</strong>
             * <p>hbr-detection-hh</p>
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * <p>The timestamp when the restoration task was last updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>166849080****</p>
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public RestorePlans build() {
                return new RestorePlans(this);
            } 

        } 

    }
}
