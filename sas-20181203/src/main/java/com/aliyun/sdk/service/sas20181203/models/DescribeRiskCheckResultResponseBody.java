// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskCheckResultResponseBody</p>
 */
public class DescribeRiskCheckResultResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageCount")
    private Integer pageCount;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * An array that consists of the check items.
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
        @NameInMap("ContentResource")
        private java.util.Map < String, ? > contentResource;

        @NameInMap("ResourceName")
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
             * The details about the check result.
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
        @NameInMap("AffectedCount")
        private Integer affectedCount;

        @NameInMap("CheckTime")
        private Long checkTime;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("RemainingTime")
        private Integer remainingTime;

        @NameInMap("RepairStatus")
        private String repairStatus;

        @NameInMap("RiskAssertType")
        private String riskAssertType;

        @NameInMap("RiskItemResources")
        private java.util.List < RiskItemResources> riskItemResources;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("Sort")
        private Integer sort;

        @NameInMap("StartStatus")
        private String startStatus;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
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
             * The ID of the check item. For more information about the description of the check item ID, see the check item table in the "Response parameters" section of this topic.
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
             * Indicates whether the risks that are detected for the check item can be fixed. Valid values:
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
             * The sequence number of the check result. The check items are sorted based on the sequence number.
             */
            public Builder sort(Integer sort) {
                this.sort = sort;
                return this;
            }

            /**
             * Indicates whether the check item is supported by the cloud service. Valid values:
             * <p>
             * 
             * *   **enabled**: The check item is supported by the cloud service.
             * *   **disable**: The check item is not supported by the cloud service.
             */
            public Builder startStatus(String startStatus) {
                this.startStatus = startStatus;
                return this;
            }

            /**
             * The status of the check result. Valid values:
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
