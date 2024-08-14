// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionApplyOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionApplyOrdersResponseBody</p>
 */
public class ListPermissionApplyOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplyOrders")
    private ApplyOrders applyOrders;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPermissionApplyOrdersResponseBody(Builder builder) {
        this.applyOrders = builder.applyOrders;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionApplyOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return applyOrders
     */
    public ApplyOrders getApplyOrders() {
        return this.applyOrders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplyOrders applyOrders; 
        private String requestId; 

        /**
         * The query results returned by page.
         */
        public Builder applyOrders(ApplyOrders applyOrders) {
            this.applyOrders = applyOrders;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPermissionApplyOrdersResponseBody build() {
            return new ListPermissionApplyOrdersResponseBody(this);
        } 

    } 

    public static class ObjectMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        private ObjectMetaList(Builder builder) {
            this.actions = builder.actions;
            this.objectName = builder.objectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectMetaList create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private String objectName; 

            /**
             * Actions.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * The name of the table on which you requested permissions.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            public ObjectMetaList build() {
                return new ObjectMetaList(this);
            } 

        } 

    }
    public static class ProjectMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectMetaList")
        private java.util.List < ObjectMetaList> objectMetaList;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
        private String workspaceName;

        private ProjectMeta(Builder builder) {
            this.objectMetaList = builder.objectMetaList;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectMeta create() {
            return builder().build();
        }

        /**
         * @return objectMetaList
         */
        public java.util.List < ObjectMetaList> getObjectMetaList() {
            return this.objectMetaList;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private java.util.List < ObjectMetaList> objectMetaList; 
            private String workspaceName; 

            /**
             * The information about the object on which you requested permissions.
             */
            public Builder objectMetaList(java.util.List < ObjectMetaList> objectMetaList) {
                this.objectMetaList = objectMetaList;
                return this;
            }

            /**
             * The name of the DataWorks workspace that is associated with the MaxCompute project in which you requested permissions on a table.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public ProjectMeta build() {
                return new ProjectMeta(this);
            } 

        } 

    }
    public static class ApproveContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyReason")
        private String applyReason;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("ProjectMeta")
        private ProjectMeta projectMeta;

        private ApproveContent(Builder builder) {
            this.applyReason = builder.applyReason;
            this.orderType = builder.orderType;
            this.projectMeta = builder.projectMeta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproveContent create() {
            return builder().build();
        }

        /**
         * @return applyReason
         */
        public String getApplyReason() {
            return this.applyReason;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return projectMeta
         */
        public ProjectMeta getProjectMeta() {
            return this.projectMeta;
        }

        public static final class Builder {
            private String applyReason; 
            private Integer orderType; 
            private ProjectMeta projectMeta; 

            /**
             * The reason for your request. The administrator determines whether to approve the request based on the reason.
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * The type of the permission request order. The parameter value is 1 and cannot be changed. This value indicates ACL-based authorization.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The content of the object on which you requested permissions.
             */
            public Builder projectMeta(ProjectMeta projectMeta) {
                this.projectMeta = projectMeta;
                return this;
            }

            public ApproveContent build() {
                return new ApproveContent(this);
            } 

        } 

    }
    public static class ApplyOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyBaseId")
        private String applyBaseId;

        @com.aliyun.core.annotation.NameInMap("ApplyTimestamp")
        private Long applyTimestamp;

        @com.aliyun.core.annotation.NameInMap("ApproveContent")
        private ApproveContent approveContent;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowStatus")
        private Integer flowStatus;

        private ApplyOrder(Builder builder) {
            this.applyBaseId = builder.applyBaseId;
            this.applyTimestamp = builder.applyTimestamp;
            this.approveContent = builder.approveContent;
            this.flowId = builder.flowId;
            this.flowStatus = builder.flowStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyOrder create() {
            return builder().build();
        }

        /**
         * @return applyBaseId
         */
        public String getApplyBaseId() {
            return this.applyBaseId;
        }

        /**
         * @return applyTimestamp
         */
        public Long getApplyTimestamp() {
            return this.applyTimestamp;
        }

        /**
         * @return approveContent
         */
        public ApproveContent getApproveContent() {
            return this.approveContent;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowStatus
         */
        public Integer getFlowStatus() {
            return this.flowStatus;
        }

        public static final class Builder {
            private String applyBaseId; 
            private Long applyTimestamp; 
            private ApproveContent approveContent; 
            private String flowId; 
            private Integer flowStatus; 

            /**
             * The ID of the Alibaba Cloud account that was used to submit the permission request order.
             */
            public Builder applyBaseId(String applyBaseId) {
                this.applyBaseId = applyBaseId;
                return this;
            }

            /**
             * The time when the permission request order was submitted. The parameter value is a UNIX timestamp.
             */
            public Builder applyTimestamp(Long applyTimestamp) {
                this.applyTimestamp = applyTimestamp;
                return this;
            }

            /**
             * The content of the permission request order.
             */
            public Builder approveContent(ApproveContent approveContent) {
                this.approveContent = approveContent;
                return this;
            }

            /**
             * The ID of the permission request order.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * The status of the permission request order. Valid values:
             * <p>
             * 
             * *   1: to be processed
             * *   2: approved and authorized
             * *   3: approved but authorization failed
             * *   4: rejected
             */
            public Builder flowStatus(Integer flowStatus) {
                this.flowStatus = flowStatus;
                return this;
            }

            public ApplyOrder build() {
                return new ApplyOrder(this);
            } 

        } 

    }
    public static class ApplyOrders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyOrder")
        private java.util.List < ApplyOrder> applyOrder;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ApplyOrders(Builder builder) {
            this.applyOrder = builder.applyOrder;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyOrders create() {
            return builder().build();
        }

        /**
         * @return applyOrder
         */
        public java.util.List < ApplyOrder> getApplyOrder() {
            return this.applyOrder;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private java.util.List < ApplyOrder> applyOrder; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The list of the permission request orders.
             */
            public Builder applyOrder(java.util.List < ApplyOrder> applyOrder) {
                this.applyOrder = applyOrder;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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

            public ApplyOrders build() {
                return new ApplyOrders(this);
            } 

        } 

    }
}
