// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckResultResponseBody</p>
 */
public class DescribeRiskCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeRiskCheckResultResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.list = builder.list;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskCheckResultResponseBody create() {
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
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.List < List> list; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
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
         * The check items.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRiskCheckResultResponseBody build() {
            return new DescribeRiskCheckResultResponseBody(this);
        } 

    } 

    public static class RiskItemResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentResource")
        private java.util.Map < String, ? > contentResource;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        private RiskItemResources(Builder builder) {
            this.contentResource = builder.contentResource;
            this.resourceName = builder.resourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskItemResources create() {
            return builder().build();
        }

        /**
         * @return contentResource
         */
        public java.util.Map < String, ? > getContentResource() {
            return this.contentResource;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        public static final class Builder {
            private java.util.Map < String, ? > contentResource; 
            private String resourceName; 

            /**
             * The details about the check results.
             */
            public Builder contentResource(java.util.Map < String, ? > contentResource) {
                this.contentResource = contentResource;
                return this;
            }

            /**
             * The title in the details. Valid values:
             * <p>
             * 
             * *   **bestPractice**: description
             * *   **influence**: risk
             * *   **suggestion**: solution
             * *   **helpResource**: reference
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            public RiskItemResources build() {
                return new RiskItemResources(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedCount")
        private Integer affectedCount;

        @com.aliyun.core.annotation.NameInMap("CheckTime")
        private Long checkTime;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private Integer remainingTime;

        @com.aliyun.core.annotation.NameInMap("RepairStatus")
        private String repairStatus;

        @com.aliyun.core.annotation.NameInMap("RiskAssertType")
        private String riskAssertType;

        @com.aliyun.core.annotation.NameInMap("RiskItemResources")
        private java.util.List < RiskItemResources> riskItemResources;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Sort")
        private Integer sort;

        @com.aliyun.core.annotation.NameInMap("StartStatus")
        private String startStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.affectedCount = builder.affectedCount;
            this.checkTime = builder.checkTime;
            this.itemId = builder.itemId;
            this.remainingTime = builder.remainingTime;
            this.repairStatus = builder.repairStatus;
            this.riskAssertType = builder.riskAssertType;
            this.riskItemResources = builder.riskItemResources;
            this.riskLevel = builder.riskLevel;
            this.sort = builder.sort;
            this.startStatus = builder.startStatus;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return affectedCount
         */
        public Integer getAffectedCount() {
            return this.affectedCount;
        }

        /**
         * @return checkTime
         */
        public Long getCheckTime() {
            return this.checkTime;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return remainingTime
         */
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        /**
         * @return repairStatus
         */
        public String getRepairStatus() {
            return this.repairStatus;
        }

        /**
         * @return riskAssertType
         */
        public String getRiskAssertType() {
            return this.riskAssertType;
        }

        /**
         * @return riskItemResources
         */
        public java.util.List < RiskItemResources> getRiskItemResources() {
            return this.riskItemResources;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sort
         */
        public Integer getSort() {
            return this.sort;
        }

        /**
         * @return startStatus
         */
        public String getStartStatus() {
            return this.startStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer affectedCount; 
            private Long checkTime; 
            private Long itemId; 
            private Integer remainingTime; 
            private String repairStatus; 
            private String riskAssertType; 
            private java.util.List < RiskItemResources> riskItemResources; 
            private String riskLevel; 
            private Integer sort; 
            private String startStatus; 
            private String status; 
            private Long taskId; 
            private String title; 
            private String type; 

            /**
             * The number of affected assets.
             */
            public Builder affectedCount(Integer affectedCount) {
                this.affectedCount = affectedCount;
                return this;
            }

            /**
             * The timestamp when the last check was performed. Unit: milliseconds.
             */
            public Builder checkTime(Long checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * The ID of the check item. For more information about the check item, see the check item table in the "Response parameters" section of this topic.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * The time when the next check will be performed.
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * Indicates whether the risks that are detected based on the check item can be fixed. Valid values:
             * <p>
             * 
             * *   **enabled**: yes
             * *   **disabled**: no
             */
            public Builder repairStatus(String repairStatus) {
                this.repairStatus = repairStatus;
                return this;
            }

            /**
             * The type of the affected assets.
             */
            public Builder riskAssertType(String riskAssertType) {
                this.riskAssertType = riskAssertType;
                return this;
            }

            /**
             * An array that consists of the details about the check item.
             */
            public Builder riskItemResources(java.util.List < RiskItemResources> riskItemResources) {
                this.riskItemResources = riskItemResources;
                return this;
            }

            /**
             * The risk level of the check item. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The sequence number in the check results. The check items are sorted based on the sequence number.
             */
            public Builder sort(Integer sort) {
                this.sort = sort;
                return this;
            }

            /**
             * Indicates whether the check item is supported by the edition of Security Center that you purchase. Valid values:
             * <p>
             * 
             * *   **enabled**: yes
             * *   **disable**: no
             */
            public Builder startStatus(String startStatus) {
                this.startStatus = startStatus;
                return this;
            }

            /**
             * The status of the check results. Valid values:
             * <p>
             * 
             * *   **pass**
             * *   **failed**
             * *   **running**
             * *   **waiting**
             * *   **ignored**
             * *   **falsePositive**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the check task.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The type of the check item. Valid values:
             * <p>
             * 
             * *   Identity authentication and permissions
             * *   Network access control
             * *   Log audit
             * *   Data security
             * *   Monitoring and alerting
             * *   Basic security protection
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
