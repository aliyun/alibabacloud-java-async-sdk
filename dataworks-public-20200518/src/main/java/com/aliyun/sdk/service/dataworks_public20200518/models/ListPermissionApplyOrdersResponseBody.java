// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The query results returned by page.</p>
         */
        public Builder applyOrders(ApplyOrders applyOrders) {
            this.applyOrders = applyOrders;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPermissionApplyOrdersResponseBody build() {
            return new ListPermissionApplyOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPermissionApplyOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionApplyOrdersResponseBody</p>
     */
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
             * <p>The name of the table on which you requested permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>aTableName</p>
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
    /**
     * 
     * {@link ListPermissionApplyOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionApplyOrdersResponseBody</p>
     */
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
             * <p>The information about the object on which you requested permissions.</p>
             */
            public Builder objectMetaList(java.util.List < ObjectMetaList> objectMetaList) {
                this.objectMetaList = objectMetaList;
                return this;
            }

            /**
             * <p>The name of the DataWorks workspace that is associated with the MaxCompute project in which you requested permissions on a table.</p>
             * 
             * <strong>example:</strong>
             * <p>aWorkspaceName</p>
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
    /**
     * 
     * {@link ListPermissionApplyOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionApplyOrdersResponseBody</p>
     */
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
             * <p>The reason for your request. The administrator determines whether to approve the request based on the reason.</p>
             * 
             * <strong>example:</strong>
             * <p>I need to use this table</p>
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * <p>The type of the permission request order. The parameter value is 1 and cannot be changed. This value indicates ACL-based authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The content of the object on which you requested permissions.</p>
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
    /**
     * 
     * {@link ListPermissionApplyOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionApplyOrdersResponseBody</p>
     */
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
             * <p>The ID of the Alibaba Cloud account that was used to submit the permission request order.</p>
             * 
             * <strong>example:</strong>
             * <p>267842600408993176</p>
             */
            public Builder applyBaseId(String applyBaseId) {
                this.applyBaseId = applyBaseId;
                return this;
            }

            /**
             * <p>The time when the permission request order was submitted. The parameter value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1615284086000</p>
             */
            public Builder applyTimestamp(Long applyTimestamp) {
                this.applyTimestamp = applyTimestamp;
                return this;
            }

            /**
             * <p>The content of the permission request order.</p>
             */
            public Builder approveContent(ApproveContent approveContent) {
                this.approveContent = approveContent;
                return this;
            }

            /**
             * <p>The ID of the permission request order.</p>
             * 
             * <strong>example:</strong>
             * <p>ad8da78d-8135-455e-9486-27cf213fc140</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The status of the permission request order. Valid values:</p>
             * <ul>
             * <li>1: to be processed</li>
             * <li>2: approved and authorized</li>
             * <li>3: approved but authorization failed</li>
             * <li>4: rejected</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListPermissionApplyOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionApplyOrdersResponseBody</p>
     */
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
             * <p>The list of the permission request orders.</p>
             */
            public Builder applyOrder(java.util.List < ApplyOrder> applyOrder) {
                this.applyOrder = applyOrder;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>150</p>
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
