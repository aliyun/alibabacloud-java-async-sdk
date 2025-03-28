// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetPermissionApplyOrderDetailResponseBody</p>
 */
public class GetPermissionApplyOrderDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplyOrderDetail")
    private ApplyOrderDetail applyOrderDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetPermissionApplyOrderDetailResponseBody model) {
            this.applyOrderDetail = model.applyOrderDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the permission request order.</p>
         */
        public Builder applyOrderDetail(ApplyOrderDetail applyOrderDetail) {
            this.applyOrderDetail = applyOrderDetail;
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

        public GetPermissionApplyOrderDetailResponseBody build() {
            return new GetPermissionApplyOrderDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionApplyOrderDetailResponseBody</p>
     */
    public static class ApproveAccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseId")
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

            private Builder() {
            } 

            private Builder(ApproveAccountList model) {
                this.baseId = model.baseId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account that is used to process the permission request order.</p>
             * 
             * <strong>example:</strong>
             * <p>182293110403****</p>
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
    /**
     * 
     * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionApplyOrderDetailResponseBody</p>
     */
    public static class ColumnMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnActions")
        private java.util.List<String> columnActions;

        @com.aliyun.core.annotation.NameInMap("ColumnComment")
        private String columnComment;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("SecurityLevel")
        private String securityLevel;

        private ColumnMetaList(Builder builder) {
            this.columnActions = builder.columnActions;
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
         * @return columnActions
         */
        public java.util.List<String> getColumnActions() {
            return this.columnActions;
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
            private java.util.List<String> columnActions; 
            private String columnComment; 
            private String columnName; 
            private String securityLevel; 

            private Builder() {
            } 

            private Builder(ColumnMetaList model) {
                this.columnActions = model.columnActions;
                this.columnComment = model.columnComment;
                this.columnName = model.columnName;
                this.securityLevel = model.securityLevel;
            } 

            /**
             * ColumnActions.
             */
            public Builder columnActions(java.util.List<String> columnActions) {
                this.columnActions = columnActions;
                return this;
            }

            /**
             * <p>The description of the column on which you request permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>Field description</p>
             */
            public Builder columnComment(String columnComment) {
                this.columnComment = columnComment;
                return this;
            }

            /**
             * <p>The name of the column on which you request permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>aColumnName</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The security level of the column on which you request permissions. Valid values: 0 to 9.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
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
    /**
     * 
     * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionApplyOrderDetailResponseBody</p>
     */
    public static class ObjectMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List<String> actions;

        @com.aliyun.core.annotation.NameInMap("ColumnMetaList")
        private java.util.List<ColumnMetaList> columnMetaList;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        private ObjectMetaList(Builder builder) {
            this.actions = builder.actions;
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
         * @return actions
         */
        public java.util.List<String> getActions() {
            return this.actions;
        }

        /**
         * @return columnMetaList
         */
        public java.util.List<ColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        public static final class Builder {
            private java.util.List<String> actions; 
            private java.util.List<ColumnMetaList> columnMetaList; 
            private String objectName; 

            private Builder() {
            } 

            private Builder(ObjectMetaList model) {
                this.actions = model.actions;
                this.columnMetaList = model.columnMetaList;
                this.objectName = model.objectName;
            } 

            /**
             * Actions.
             */
            public Builder actions(java.util.List<String> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The information about the column fields in the object on which you request permissions.</p>
             */
            public Builder columnMetaList(java.util.List<ColumnMetaList> columnMetaList) {
                this.columnMetaList = columnMetaList;
                return this;
            }

            /**
             * <p>The name of the table on which you request permissions.</p>
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
     * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionApplyOrderDetailResponseBody</p>
     */
    public static class ProjectMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxComputeProjectName")
        private String maxComputeProjectName;

        @com.aliyun.core.annotation.NameInMap("ObjectMetaList")
        private java.util.List<ObjectMetaList> objectMetaList;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
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
        public java.util.List<ObjectMetaList> getObjectMetaList() {
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
            private java.util.List<ObjectMetaList> objectMetaList; 
            private Integer workspaceId; 

            private Builder() {
            } 

            private Builder(ProjectMeta model) {
                this.maxComputeProjectName = model.maxComputeProjectName;
                this.objectMetaList = model.objectMetaList;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The MaxCompute project to which the object on which you request permissions belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aMaxComputeProject</p>
             */
            public Builder maxComputeProjectName(String maxComputeProjectName) {
                this.maxComputeProjectName = maxComputeProjectName;
                return this;
            }

            /**
             * <p>The details about the object on which you request permissions.</p>
             */
            public Builder objectMetaList(java.util.List<ObjectMetaList> objectMetaList) {
                this.objectMetaList = objectMetaList;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace that is associated with the object on which you request permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
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
    /**
     * 
     * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionApplyOrderDetailResponseBody</p>
     */
    public static class ApproveContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyReason")
        private String applyReason;

        @com.aliyun.core.annotation.NameInMap("Deadline")
        private Long deadline;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("ProjectMeta")
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

            private Builder() {
            } 

            private Builder(ApproveContent model) {
                this.applyReason = model.applyReason;
                this.deadline = model.deadline;
                this.orderType = model.orderType;
                this.projectMeta = model.projectMeta;
            } 

            /**
             * <p>The reason of the permission request. The administrator processes the request based on the reason.</p>
             * 
             * <strong>example:</strong>
             * <p>I need to use this table</p>
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * <p>The expiration time of the permissions that you request. The value is a UNIX timestamp. If LabelSecurity is disabled for the MaxCompute project in which you want to request permissions on the fields of a table, or the security level of the fields is 0 or is lower than or equal to the security level of the Alibaba Cloud account for which you want to request permissions, you can request only permanent permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>1617115071885</p>
             */
            public Builder deadline(Long deadline) {
                this.deadline = deadline;
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
             * <p>The information about the project and workspace that are associated with the object on which you request permissions.</p>
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
     * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionApplyOrderDetailResponseBody</p>
     */
    public static class GranteeObjectList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GranteeId")
        private String granteeId;

        @com.aliyun.core.annotation.NameInMap("GranteeName")
        private String granteeName;

        @com.aliyun.core.annotation.NameInMap("GranteeType")
        private Integer granteeType;

        @com.aliyun.core.annotation.NameInMap("GranteeTypeSub")
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

            private Builder() {
            } 

            private Builder(GranteeObjectList model) {
                this.granteeId = model.granteeId;
                this.granteeName = model.granteeName;
                this.granteeType = model.granteeType;
                this.granteeTypeSub = model.granteeTypeSub;
            } 

            /**
             * <p>The ID of the account that is used to request permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>267842600408993176</p>
             */
            public Builder granteeId(String granteeId) {
                this.granteeId = granteeId;
                return this;
            }

            /**
             * <p>The name of the account that is used to request permissions. The name is in the same format as that of the account used to access the MaxCompute project.</p>
             * <ul>
             * <li>If the account is an Alibaba Cloud account, the value is in the ALIYUN$+Account name format.</li>
             * <li>If the account is a RAM user, the value is in the RAM$+Account name format.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RAM$dataworks_3h1_1:StsRamUser(StsRamUser)</p>
             */
            public Builder granteeName(String granteeName) {
                this.granteeName = granteeName;
                return this;
            }

            /**
             * <p>The type of the subject that requests permissions. The value is fixed as 1, which indicates users.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder granteeType(Integer granteeType) {
                this.granteeType = granteeType;
                return this;
            }

            /**
             * <p>The subtype of the subject that requests permissions. Valid values:</p>
             * <ul>
             * <li>101: production account</li>
             * <li>103: individual account</li>
             * <li>105: account that requests permissions for others</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>103</p>
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
    /**
     * 
     * {@link GetPermissionApplyOrderDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPermissionApplyOrderDetailResponseBody</p>
     */
    public static class ApplyOrderDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyBaseId")
        private String applyBaseId;

        @com.aliyun.core.annotation.NameInMap("ApplyTimestamp")
        private Long applyTimestamp;

        @com.aliyun.core.annotation.NameInMap("ApproveAccountList")
        private java.util.List<ApproveAccountList> approveAccountList;

        @com.aliyun.core.annotation.NameInMap("ApproveContent")
        private ApproveContent approveContent;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowStatus")
        private Integer flowStatus;

        @com.aliyun.core.annotation.NameInMap("GranteeObjectList")
        private java.util.List<GranteeObjectList> granteeObjectList;

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
        public java.util.List<ApproveAccountList> getApproveAccountList() {
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
        public java.util.List<GranteeObjectList> getGranteeObjectList() {
            return this.granteeObjectList;
        }

        public static final class Builder {
            private String applyBaseId; 
            private Long applyTimestamp; 
            private java.util.List<ApproveAccountList> approveAccountList; 
            private ApproveContent approveContent; 
            private String flowId; 
            private Integer flowStatus; 
            private java.util.List<GranteeObjectList> granteeObjectList; 

            private Builder() {
            } 

            private Builder(ApplyOrderDetail model) {
                this.applyBaseId = model.applyBaseId;
                this.applyTimestamp = model.applyTimestamp;
                this.approveAccountList = model.approveAccountList;
                this.approveContent = model.approveContent;
                this.flowId = model.flowId;
                this.flowStatus = model.flowStatus;
                this.granteeObjectList = model.granteeObjectList;
            } 

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
             * <p>The time when the permission request order was submitted. The value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1615284086000</p>
             */
            public Builder applyTimestamp(Long applyTimestamp) {
                this.applyTimestamp = applyTimestamp;
                return this;
            }

            /**
             * <p>The list of Alibaba Cloud accounts that are used to process the permission request order.</p>
             */
            public Builder approveAccountList(java.util.List<ApproveAccountList> approveAccountList) {
                this.approveAccountList = approveAccountList;
                return this;
            }

            /**
             * <p>The content of the permission request.</p>
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

            /**
             * <p>The information about the account that is used to request permissions.</p>
             */
            public Builder granteeObjectList(java.util.List<GranteeObjectList> granteeObjectList) {
                this.granteeObjectList = granteeObjectList;
                return this;
            }

            public ApplyOrderDetail build() {
                return new ApplyOrderDetail(this);
            } 

        } 

    }
}
