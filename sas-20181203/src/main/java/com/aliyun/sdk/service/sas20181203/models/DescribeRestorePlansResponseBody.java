// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestorePlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRestorePlansResponseBody</p>
 */
public class DescribeRestorePlansResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestorePlans")
    private java.util.List < RestorePlans> restorePlans;

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
    public java.util.List < RestorePlans> getRestorePlans() {
        return this.restorePlans;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < RestorePlans> restorePlans; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the restoration tasks.
         */
        public Builder restorePlans(java.util.List < RestorePlans> restorePlans) {
            this.restorePlans = restorePlans;
            return this;
        }

        public DescribeRestorePlansResponseBody build() {
            return new DescribeRestorePlansResponseBody(this);
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
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
    public static class RestorePlans extends TeaModel {
        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("PolicyId")
        private Long policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("RestorePoint")
        private Long restorePoint;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetDatabaseName")
        private String targetDatabaseName;

        @NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @NameInMap("UpdatedTime")
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

            /**
             * The timestamp when the restoration task was created. Unit: milliseconds.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The name of the server on which the database resides.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The ID of the anti-ransomware policy.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the anti-ransomware policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The point in time to which data is restored.
             */
            public Builder restorePoint(Long restorePoint) {
                this.restorePoint = restorePoint;
                return this;
            }

            /**
             * The status of the restoration task. Valid values:
             * <p>
             * 
             * *   **init**: initializing
             * *   **created**: creating
             * *   **running**: running
             * *   **completed**: complete
             * *   **error**: failed
             * *   **restoring**: restoring
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the destination database.
             */
            public Builder targetDatabaseName(String targetDatabaseName) {
                this.targetDatabaseName = targetDatabaseName;
                return this;
            }

            /**
             * The ID of the destination server.
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * The name of the destination server.
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * The timestamp when the restoration task was last updated. Unit: milliseconds.
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
