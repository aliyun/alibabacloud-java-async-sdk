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
    private java.util.List<List> list;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<List> getList() {
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
        private java.util.List<List> list; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeRiskCheckResultResponseBody model) {
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.list = model.list;
            this.pageCount = model.pageCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The check items.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AD271C07-4ACE-413D-AA9B-F14FD3B7717F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeRiskCheckResultResponseBody build() {
            return new DescribeRiskCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskCheckResultResponseBody</p>
     */
    public static class RiskItemResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentResource")
        private java.util.Map<String, ?> contentResource;

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
        public java.util.Map<String, ?> getContentResource() {
            return this.contentResource;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        public static final class Builder {
            private java.util.Map<String, ?> contentResource; 
            private String resourceName; 

            private Builder() {
            } 

            private Builder(RiskItemResources model) {
                this.contentResource = model.contentResource;
                this.resourceName = model.resourceName;
            } 

            /**
             * <p>The details about the check results.</p>
             */
            public Builder contentResource(java.util.Map<String, ?> contentResource) {
                this.contentResource = contentResource;
                return this;
            }

            /**
             * <p>The title in the details. Valid values:</p>
             * <ul>
             * <li><strong>bestPractice</strong>: description</li>
             * <li><strong>influence</strong>: risk</li>
             * <li><strong>suggestion</strong>: solution</li>
             * <li><strong>helpResource</strong>: reference</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bestPractice</p>
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
    /**
     * 
     * {@link DescribeRiskCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskCheckResultResponseBody</p>
     */
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
        private java.util.List<RiskItemResources> riskItemResources;

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
        public java.util.List<RiskItemResources> getRiskItemResources() {
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
            private java.util.List<RiskItemResources> riskItemResources; 
            private String riskLevel; 
            private Integer sort; 
            private String startStatus; 
            private String status; 
            private Long taskId; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(List model) {
                this.affectedCount = model.affectedCount;
                this.checkTime = model.checkTime;
                this.itemId = model.itemId;
                this.remainingTime = model.remainingTime;
                this.repairStatus = model.repairStatus;
                this.riskAssertType = model.riskAssertType;
                this.riskItemResources = model.riskItemResources;
                this.riskLevel = model.riskLevel;
                this.sort = model.sort;
                this.startStatus = model.startStatus;
                this.status = model.status;
                this.taskId = model.taskId;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>The number of affected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder affectedCount(Integer affectedCount) {
                this.affectedCount = affectedCount;
                return this;
            }

            /**
             * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1639429164000</p>
             */
            public Builder checkTime(Long checkTime) {
                this.checkTime = checkTime;
                return this;
            }

            /**
             * <p>The ID of the check item. For more information about the check item, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The time when the next check will be performed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * <p>Indicates whether the risks that are detected based on the check item can be fixed. Valid values:</p>
             * <ul>
             * <li><strong>enabled</strong>: yes</li>
             * <li><strong>disabled</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder repairStatus(String repairStatus) {
                this.repairStatus = repairStatus;
                return this;
            }

            /**
             * <p>The type of the affected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder riskAssertType(String riskAssertType) {
                this.riskAssertType = riskAssertType;
                return this;
            }

            /**
             * <p>An array that consists of the details about the check item.</p>
             */
            public Builder riskItemResources(java.util.List<RiskItemResources> riskItemResources) {
                this.riskItemResources = riskItemResources;
                return this;
            }

            /**
             * <p>The risk level of the check item. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The sequence number in the check results. The check items are sorted based on the sequence number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sort(Integer sort) {
                this.sort = sort;
                return this;
            }

            /**
             * <p>Indicates whether the check item is supported by the edition of Security Center that you purchase. Valid values:</p>
             * <ul>
             * <li><strong>enabled</strong>: yes</li>
             * <li><strong>disable</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder startStatus(String startStatus) {
                this.startStatus = startStatus;
                return this;
            }

            /**
             * <p>The status of the check results. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong></li>
             * <li><strong>failed</strong></li>
             * <li><strong>running</strong></li>
             * <li><strong>waiting</strong></li>
             * <li><strong>ignored</strong></li>
             * <li><strong>falsePositive</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the check task.</p>
             * 
             * <strong>example:</strong>
             * <p>15384933</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS - Whitelist Configuration</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The type of the check item. Valid values:</p>
             * <ul>
             * <li>Identity authentication and permissions</li>
             * <li>Network access control</li>
             * <li>Log audit</li>
             * <li>Data security</li>
             * <li>Monitoring and alerting</li>
             * <li>Basic security protection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Log audit</p>
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
