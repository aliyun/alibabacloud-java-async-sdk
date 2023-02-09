// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetPermissionApplyOrderDetailResponseBody</p>
 */
public class GetPermissionApplyOrderDetailResponseBody extends TeaModel {
    @NameInMap("ApplyOrderDetail")
    private ApplyOrderDetail applyOrderDetail;

    @NameInMap("RequestId")
    private String requestId;

    private GetPermissionApplyOrderDetailResponseBody(Builder builder) {
        this.applyOrderDetail = builder.applyOrderDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionApplyOrderDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return applyOrderDetail
     */
    public ApplyOrderDetail getApplyOrderDetail() {
        return this.applyOrderDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplyOrderDetail applyOrderDetail; 
        private String requestId; 

        /**
         * ApplyOrderDetail.
         */
        public Builder applyOrderDetail(ApplyOrderDetail applyOrderDetail) {
            this.applyOrderDetail = applyOrderDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPermissionApplyOrderDetailResponseBody build() {
            return new GetPermissionApplyOrderDetailResponseBody(this);
        } 

    } 

    public static class ApproveAccountList extends TeaModel {
        @NameInMap("BaseId")
        private String baseId;

        private ApproveAccountList(Builder builder) {
            this.baseId = builder.baseId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApproveAccountList create() {
            return builder().build();
        }

        /**
         * @return baseId
         */
        public String getBaseId() {
            return this.baseId;
        }

        public static final class Builder {
            private String baseId; 

            /**
             * BaseId.
             */
            public Builder baseId(String baseId) {
                this.baseId = baseId;
                return this;
            }

            public ApproveAccountList build() {
                return new ApproveAccountList(this);
            } 

        } 

    }
    public static class ColumnMetaList extends TeaModel {
        @NameInMap("ColumnComment")
        private String columnComment;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("SecurityLevel")
        private String securityLevel;

        private ColumnMetaList(Builder builder) {
            this.columnComment = builder.columnComment;
            this.columnName = builder.columnName;
            this.securityLevel = builder.securityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnMetaList create() {
            return builder().build();
        }

        /**
         * @return columnComment
         */
        public String getColumnComment() {
            return this.columnComment;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        public static final class Builder {
            private String columnComment; 
            private String columnName; 
            private String securityLevel; 

            /**
             * ColumnComment.
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            public ColumnMetaList build() {
                return new ColumnMetaList(this);
            } 

        } 

    }
    public static class ObjectMetaList extends TeaModel {
        @NameInMap("ColumnMetaList")
        private java.util.List < ColumnMetaList> columnMetaList;

        @NameInMap("ObjectName")
        private String objectName;

        private ObjectMetaList(Builder builder) {
            this.columnMetaList = builder.columnMetaList;
            this.objectName = builder.objectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectMetaList create() {
            return builder().build();
        }

        /**
         * @return columnMetaList
         */
        public java.util.List < ColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        public static final class Builder {
            private java.util.List < ColumnMetaList> columnMetaList; 
            private String objectName; 

            /**
             * ColumnMetaList.
             */
            public Builder columnMetaList(java.util.List < ColumnMetaList> columnMetaList) {
                this.columnMetaList = columnMetaList;
                return this;
            }

            /**
             * ObjectName.
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
        @NameInMap("MaxComputeProjectName")
        private String maxComputeProjectName;

        @NameInMap("ObjectMetaList")
        private java.util.List < ObjectMetaList> objectMetaList;

        @NameInMap("WorkspaceId")
        private Integer workspaceId;

        private ProjectMeta(Builder builder) {
            this.maxComputeProjectName = builder.maxComputeProjectName;
            this.objectMetaList = builder.objectMetaList;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProjectMeta create() {
            return builder().build();
        }

        /**
         * @return maxComputeProjectName
         */
        public String getMaxComputeProjectName() {
            return this.maxComputeProjectName;
        }

        /**
         * @return objectMetaList
         */
        public java.util.List < ObjectMetaList> getObjectMetaList() {
            return this.objectMetaList;
        }

        /**
         * @return workspaceId
         */
        public Integer getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String maxComputeProjectName; 
            private java.util.List < ObjectMetaList> objectMetaList; 
            private Integer workspaceId; 

            /**
             * MaxComputeProjectName.
             */
            public Builder maxComputeProjectName(String maxComputeProjectName) {
                this.maxComputeProjectName = maxComputeProjectName;
                return this;
            }

            /**
             * ObjectMetaList.
             */
            public Builder objectMetaList(java.util.List < ObjectMetaList> objectMetaList) {
                this.objectMetaList = objectMetaList;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(Integer workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public ProjectMeta build() {
                return new ProjectMeta(this);
            } 

        } 

    }
    public static class ApproveContent extends TeaModel {
        @NameInMap("ApplyReason")
        private String applyReason;

        @NameInMap("Deadline")
        private Long deadline;

        @NameInMap("OrderType")
        private Integer orderType;

        @NameInMap("ProjectMeta")
        private ProjectMeta projectMeta;

        private ApproveContent(Builder builder) {
            this.applyReason = builder.applyReason;
            this.deadline = builder.deadline;
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
         * @return deadline
         */
        public Long getDeadline() {
            return this.deadline;
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
            private Long deadline; 
            private Integer orderType; 
            private ProjectMeta projectMeta; 

            /**
             * ApplyReason.
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * Deadline.
             */
            public Builder deadline(Long deadline) {
                this.deadline = deadline;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * ProjectMeta.
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
    public static class GranteeObjectList extends TeaModel {
        @NameInMap("GranteeId")
        private String granteeId;

        @NameInMap("GranteeName")
        private String granteeName;

        @NameInMap("GranteeType")
        private Integer granteeType;

        @NameInMap("GranteeTypeSub")
        private Integer granteeTypeSub;

        private GranteeObjectList(Builder builder) {
            this.granteeId = builder.granteeId;
            this.granteeName = builder.granteeName;
            this.granteeType = builder.granteeType;
            this.granteeTypeSub = builder.granteeTypeSub;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GranteeObjectList create() {
            return builder().build();
        }

        /**
         * @return granteeId
         */
        public String getGranteeId() {
            return this.granteeId;
        }

        /**
         * @return granteeName
         */
        public String getGranteeName() {
            return this.granteeName;
        }

        /**
         * @return granteeType
         */
        public Integer getGranteeType() {
            return this.granteeType;
        }

        /**
         * @return granteeTypeSub
         */
        public Integer getGranteeTypeSub() {
            return this.granteeTypeSub;
        }

        public static final class Builder {
            private String granteeId; 
            private String granteeName; 
            private Integer granteeType; 
            private Integer granteeTypeSub; 

            /**
             * GranteeId.
             */
            public Builder granteeId(String granteeId) {
                this.granteeId = granteeId;
                return this;
            }

            /**
             * GranteeName.
             */
            public Builder granteeName(String granteeName) {
                this.granteeName = granteeName;
                return this;
            }

            /**
             * GranteeType.
             */
            public Builder granteeType(Integer granteeType) {
                this.granteeType = granteeType;
                return this;
            }

            /**
             * GranteeTypeSub.
             */
            public Builder granteeTypeSub(Integer granteeTypeSub) {
                this.granteeTypeSub = granteeTypeSub;
                return this;
            }

            public GranteeObjectList build() {
                return new GranteeObjectList(this);
            } 

        } 

    }
    public static class ApplyOrderDetail extends TeaModel {
        @NameInMap("ApplyBaseId")
        private String applyBaseId;

        @NameInMap("ApplyTimestamp")
        private Long applyTimestamp;

        @NameInMap("ApproveAccountList")
        private java.util.List < ApproveAccountList> approveAccountList;

        @NameInMap("ApproveContent")
        private ApproveContent approveContent;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowStatus")
        private Integer flowStatus;

        @NameInMap("GranteeObjectList")
        private java.util.List < GranteeObjectList> granteeObjectList;

        private ApplyOrderDetail(Builder builder) {
            this.applyBaseId = builder.applyBaseId;
            this.applyTimestamp = builder.applyTimestamp;
            this.approveAccountList = builder.approveAccountList;
            this.approveContent = builder.approveContent;
            this.flowId = builder.flowId;
            this.flowStatus = builder.flowStatus;
            this.granteeObjectList = builder.granteeObjectList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyOrderDetail create() {
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
         * @return approveAccountList
         */
        public java.util.List < ApproveAccountList> getApproveAccountList() {
            return this.approveAccountList;
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

        /**
         * @return granteeObjectList
         */
        public java.util.List < GranteeObjectList> getGranteeObjectList() {
            return this.granteeObjectList;
        }

        public static final class Builder {
            private String applyBaseId; 
            private Long applyTimestamp; 
            private java.util.List < ApproveAccountList> approveAccountList; 
            private ApproveContent approveContent; 
            private String flowId; 
            private Integer flowStatus; 
            private java.util.List < GranteeObjectList> granteeObjectList; 

            /**
             * ApplyBaseId.
             */
            public Builder applyBaseId(String applyBaseId) {
                this.applyBaseId = applyBaseId;
                return this;
            }

            /**
             * ApplyTimestamp.
             */
            public Builder applyTimestamp(Long applyTimestamp) {
                this.applyTimestamp = applyTimestamp;
                return this;
            }

            /**
             * ApproveAccountList.
             */
            public Builder approveAccountList(java.util.List < ApproveAccountList> approveAccountList) {
                this.approveAccountList = approveAccountList;
                return this;
            }

            /**
             * ApproveContent.
             */
            public Builder approveContent(ApproveContent approveContent) {
                this.approveContent = approveContent;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowStatus.
             */
            public Builder flowStatus(Integer flowStatus) {
                this.flowStatus = flowStatus;
                return this;
            }

            /**
             * GranteeObjectList.
             */
            public Builder granteeObjectList(java.util.List < GranteeObjectList> granteeObjectList) {
                this.granteeObjectList = granteeObjectList;
                return this;
            }

            public ApplyOrderDetail build() {
                return new ApplyOrderDetail(this);
            } 

        } 

    }
}
