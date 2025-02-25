// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetBizEntityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetBizEntityInfoResponseBody</p>
 */
public class GetBizEntityInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizEntityInfo")
    private BizEntityInfo bizEntityInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBizEntityInfoResponseBody(Builder builder) {
        this.bizEntityInfo = builder.bizEntityInfo;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBizEntityInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizEntityInfo
     */
    public BizEntityInfo getBizEntityInfo() {
        return this.bizEntityInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private BizEntityInfo bizEntityInfo; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * BizEntityInfo.
         */
        public Builder bizEntityInfo(BizEntityInfo bizEntityInfo) {
            this.bizEntityInfo = bizEntityInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBizEntityInfoResponseBody build() {
            return new GetBizEntityInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBizEntityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizEntityInfoResponseBody</p>
     */
    public static class BizObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
        private String approvalStatus;

        @com.aliyun.core.annotation.NameInMap("ChildBizEntityIdList")
        private java.util.List<Long> childBizEntityIdList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OnlineStatus")
        private String onlineStatus;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("RefBizEntityIdList")
        private java.util.List<Long> refBizEntityIdList;

        @com.aliyun.core.annotation.NameInMap("RefDimTableCount")
        private Integer refDimTableCount;

        @com.aliyun.core.annotation.NameInMap("RefSummaryTableCount")
        private Integer refSummaryTableCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BizObject(Builder builder) {
            this.approvalId = builder.approvalId;
            this.approvalStatus = builder.approvalStatus;
            this.childBizEntityIdList = builder.childBizEntityIdList;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.name = builder.name;
            this.onlineStatus = builder.onlineStatus;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.parentId = builder.parentId;
            this.refBizEntityIdList = builder.refBizEntityIdList;
            this.refDimTableCount = builder.refDimTableCount;
            this.refSummaryTableCount = builder.refSummaryTableCount;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizObject create() {
            return builder().build();
        }

        /**
         * @return approvalId
         */
        public String getApprovalId() {
            return this.approvalId;
        }

        /**
         * @return approvalStatus
         */
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        /**
         * @return childBizEntityIdList
         */
        public java.util.List<Long> getChildBizEntityIdList() {
            return this.childBizEntityIdList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlineStatus
         */
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return refBizEntityIdList
         */
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        /**
         * @return refDimTableCount
         */
        public Integer getRefDimTableCount() {
            return this.refDimTableCount;
        }

        /**
         * @return refSummaryTableCount
         */
        public Integer getRefSummaryTableCount() {
            return this.refSummaryTableCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String approvalId; 
            private String approvalStatus; 
            private java.util.List<Long> childBizEntityIdList; 
            private String description; 
            private String displayName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String lastModifier; 
            private String lastModifierName; 
            private String name; 
            private String onlineStatus; 
            private String ownerName; 
            private String ownerUserId; 
            private Long parentId; 
            private java.util.List<Long> refBizEntityIdList; 
            private Integer refDimTableCount; 
            private Integer refSummaryTableCount; 
            private String status; 
            private String type; 

            /**
             * ApprovalId.
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * ApprovalStatus.
             */
            public Builder approvalStatus(String approvalStatus) {
                this.approvalStatus = approvalStatus;
                return this;
            }

            /**
             * ChildBizEntityIdList.
             */
            public Builder childBizEntityIdList(java.util.List<Long> childBizEntityIdList) {
                this.childBizEntityIdList = childBizEntityIdList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LastModifierName.
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(String onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * RefBizEntityIdList.
             */
            public Builder refBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
                this.refBizEntityIdList = refBizEntityIdList;
                return this;
            }

            /**
             * RefDimTableCount.
             */
            public Builder refDimTableCount(Integer refDimTableCount) {
                this.refDimTableCount = refDimTableCount;
                return this;
            }

            /**
             * RefSummaryTableCount.
             */
            public Builder refSummaryTableCount(Integer refSummaryTableCount) {
                this.refSummaryTableCount = refSummaryTableCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BizObject build() {
                return new BizObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizEntityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizEntityInfoResponseBody</p>
     */
    public static class BizProcess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalId")
        private String approvalId;

        @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
        private String approvalStatus;

        @com.aliyun.core.annotation.NameInMap("BizEventEntityIdList")
        private java.util.List<Long> bizEventEntityIdList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HasDependent")
        private Boolean hasDependent;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastModifier")
        private String lastModifier;

        @com.aliyun.core.annotation.NameInMap("LastModifierName")
        private String lastModifierName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OnlineStatus")
        private String onlineStatus;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("PreBizProcessIdList")
        private java.util.List<Long> preBizProcessIdList;

        @com.aliyun.core.annotation.NameInMap("RefBizEntityIdList")
        private java.util.List<Long> refBizEntityIdList;

        @com.aliyun.core.annotation.NameInMap("RefFactTableCount")
        private Integer refFactTableCount;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BizProcess(Builder builder) {
            this.approvalId = builder.approvalId;
            this.approvalStatus = builder.approvalStatus;
            this.bizEventEntityIdList = builder.bizEventEntityIdList;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.hasDependent = builder.hasDependent;
            this.id = builder.id;
            this.lastModifier = builder.lastModifier;
            this.lastModifierName = builder.lastModifierName;
            this.name = builder.name;
            this.onlineStatus = builder.onlineStatus;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.preBizProcessIdList = builder.preBizProcessIdList;
            this.refBizEntityIdList = builder.refBizEntityIdList;
            this.refFactTableCount = builder.refFactTableCount;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizProcess create() {
            return builder().build();
        }

        /**
         * @return approvalId
         */
        public String getApprovalId() {
            return this.approvalId;
        }

        /**
         * @return approvalStatus
         */
        public String getApprovalStatus() {
            return this.approvalStatus;
        }

        /**
         * @return bizEventEntityIdList
         */
        public java.util.List<Long> getBizEventEntityIdList() {
            return this.bizEventEntityIdList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasDependent
         */
        public Boolean getHasDependent() {
            return this.hasDependent;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastModifier
         */
        public String getLastModifier() {
            return this.lastModifier;
        }

        /**
         * @return lastModifierName
         */
        public String getLastModifierName() {
            return this.lastModifierName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlineStatus
         */
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return preBizProcessIdList
         */
        public java.util.List<Long> getPreBizProcessIdList() {
            return this.preBizProcessIdList;
        }

        /**
         * @return refBizEntityIdList
         */
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        /**
         * @return refFactTableCount
         */
        public Integer getRefFactTableCount() {
            return this.refFactTableCount;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String approvalId; 
            private String approvalStatus; 
            private java.util.List<Long> bizEventEntityIdList; 
            private String description; 
            private String displayName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean hasDependent; 
            private Long id; 
            private String lastModifier; 
            private String lastModifierName; 
            private String name; 
            private String onlineStatus; 
            private String ownerName; 
            private String ownerUserId; 
            private java.util.List<Long> preBizProcessIdList; 
            private java.util.List<Long> refBizEntityIdList; 
            private Integer refFactTableCount; 
            private String status; 
            private String type; 

            /**
             * ApprovalId.
             */
            public Builder approvalId(String approvalId) {
                this.approvalId = approvalId;
                return this;
            }

            /**
             * ApprovalStatus.
             */
            public Builder approvalStatus(String approvalStatus) {
                this.approvalStatus = approvalStatus;
                return this;
            }

            /**
             * BizEventEntityIdList.
             */
            public Builder bizEventEntityIdList(java.util.List<Long> bizEventEntityIdList) {
                this.bizEventEntityIdList = bizEventEntityIdList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HasDependent.
             */
            public Builder hasDependent(Boolean hasDependent) {
                this.hasDependent = hasDependent;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastModifier.
             */
            public Builder lastModifier(String lastModifier) {
                this.lastModifier = lastModifier;
                return this;
            }

            /**
             * LastModifierName.
             */
            public Builder lastModifierName(String lastModifierName) {
                this.lastModifierName = lastModifierName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(String onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * PreBizProcessIdList.
             */
            public Builder preBizProcessIdList(java.util.List<Long> preBizProcessIdList) {
                this.preBizProcessIdList = preBizProcessIdList;
                return this;
            }

            /**
             * RefBizEntityIdList.
             */
            public Builder refBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
                this.refBizEntityIdList = refBizEntityIdList;
                return this;
            }

            /**
             * RefFactTableCount.
             */
            public Builder refFactTableCount(Integer refFactTableCount) {
                this.refFactTableCount = refFactTableCount;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BizProcess build() {
                return new BizProcess(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBizEntityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetBizEntityInfoResponseBody</p>
     */
    public static class BizEntityInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizObject")
        private BizObject bizObject;

        @com.aliyun.core.annotation.NameInMap("BizProcess")
        private BizProcess bizProcess;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("DataDomainId")
        private Long dataDomainId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BizEntityInfo(Builder builder) {
            this.bizObject = builder.bizObject;
            this.bizProcess = builder.bizProcess;
            this.bizUnitId = builder.bizUnitId;
            this.dataDomainId = builder.dataDomainId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizEntityInfo create() {
            return builder().build();
        }

        /**
         * @return bizObject
         */
        public BizObject getBizObject() {
            return this.bizObject;
        }

        /**
         * @return bizProcess
         */
        public BizProcess getBizProcess() {
            return this.bizProcess;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return dataDomainId
         */
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private BizObject bizObject; 
            private BizProcess bizProcess; 
            private Long bizUnitId; 
            private Long dataDomainId; 
            private String type; 

            /**
             * BizObject.
             */
            public Builder bizObject(BizObject bizObject) {
                this.bizObject = bizObject;
                return this;
            }

            /**
             * BizProcess.
             */
            public Builder bizProcess(BizProcess bizProcess) {
                this.bizProcess = bizProcess;
                return this;
            }

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * DataDomainId.
             */
            public Builder dataDomainId(Long dataDomainId) {
                this.dataDomainId = dataDomainId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BizEntityInfo build() {
                return new BizEntityInfo(this);
            } 

        } 

    }
}
