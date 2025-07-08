// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryWorkOrdAuditListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryWorkOrdAuditListNewResponseBody</p>
 */
public class QueryWorkOrdAuditListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QueryWorkOrdAuditListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryWorkOrdAuditListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QueryWorkOrdAuditListNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryWorkOrdAuditListNewResponseBody build() {
            return new QueryWorkOrdAuditListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryWorkOrdAuditListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkOrdAuditListNewResponseBody</p>
     */
    public static class AuditRemarkInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RejectDate")
        private String rejectDate;

        @com.aliyun.core.annotation.NameInMap("RejectInfo")
        private String rejectInfo;

        @com.aliyun.core.annotation.NameInMap("RejectSubInfo")
        private String rejectSubInfo;

        private AuditRemarkInfo(Builder builder) {
            this.rejectDate = builder.rejectDate;
            this.rejectInfo = builder.rejectInfo;
            this.rejectSubInfo = builder.rejectSubInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditRemarkInfo create() {
            return builder().build();
        }

        /**
         * @return rejectDate
         */
        public String getRejectDate() {
            return this.rejectDate;
        }

        /**
         * @return rejectInfo
         */
        public String getRejectInfo() {
            return this.rejectInfo;
        }

        /**
         * @return rejectSubInfo
         */
        public String getRejectSubInfo() {
            return this.rejectSubInfo;
        }

        public static final class Builder {
            private String rejectDate; 
            private String rejectInfo; 
            private String rejectSubInfo; 

            private Builder() {
            } 

            private Builder(AuditRemarkInfo model) {
                this.rejectDate = model.rejectDate;
                this.rejectInfo = model.rejectInfo;
                this.rejectSubInfo = model.rejectSubInfo;
            } 

            /**
             * RejectDate.
             */
            public Builder rejectDate(String rejectDate) {
                this.rejectDate = rejectDate;
                return this;
            }

            /**
             * RejectInfo.
             */
            public Builder rejectInfo(String rejectInfo) {
                this.rejectInfo = rejectInfo;
                return this;
            }

            /**
             * RejectSubInfo.
             */
            public Builder rejectSubInfo(String rejectSubInfo) {
                this.rejectSubInfo = rejectSubInfo;
                return this;
            }

            public AuditRemarkInfo build() {
                return new AuditRemarkInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryWorkOrdAuditListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkOrdAuditListNewResponseBody</p>
     */
    public static class AuditState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Integer value;

        private AuditState(Builder builder) {
            this.key = builder.key;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditState create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String name; 
            private Integer value; 

            private Builder() {
            } 

            private Builder(AuditState model) {
                this.key = model.key;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
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
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public AuditState build() {
                return new AuditState(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryWorkOrdAuditListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkOrdAuditListNewResponseBody</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditInfo")
        private String auditInfo;

        @com.aliyun.core.annotation.NameInMap("AuditRemarkInfo")
        private AuditRemarkInfo auditRemarkInfo;

        @com.aliyun.core.annotation.NameInMap("AuditState")
        private AuditState auditState;

        @com.aliyun.core.annotation.NameInMap("BusinessType")
        private Integer businessType;

        @com.aliyun.core.annotation.NameInMap("ExtendMessage")
        private String extendMessage;

        @com.aliyun.core.annotation.NameInMap("FileIds")
        private java.util.List<Long> fileIds;

        @com.aliyun.core.annotation.NameInMap("FileUrlList")
        private java.util.List<String> fileUrlList;

        @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private Long partnerId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private Integer sceneType;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("SignType")
        private Integer signType;

        private Param(Builder builder) {
            this.auditInfo = builder.auditInfo;
            this.auditRemarkInfo = builder.auditRemarkInfo;
            this.auditState = builder.auditState;
            this.businessType = builder.businessType;
            this.extendMessage = builder.extendMessage;
            this.fileIds = builder.fileIds;
            this.fileUrlList = builder.fileUrlList;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.id = builder.id;
            this.orderId = builder.orderId;
            this.partnerId = builder.partnerId;
            this.remark = builder.remark;
            this.sceneType = builder.sceneType;
            this.signName = builder.signName;
            this.signType = builder.signType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return auditInfo
         */
        public String getAuditInfo() {
            return this.auditInfo;
        }

        /**
         * @return auditRemarkInfo
         */
        public AuditRemarkInfo getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        /**
         * @return auditState
         */
        public AuditState getAuditState() {
            return this.auditState;
        }

        /**
         * @return businessType
         */
        public Integer getBusinessType() {
            return this.businessType;
        }

        /**
         * @return extendMessage
         */
        public String getExtendMessage() {
            return this.extendMessage;
        }

        /**
         * @return fileIds
         */
        public java.util.List<Long> getFileIds() {
            return this.fileIds;
        }

        /**
         * @return fileUrlList
         */
        public java.util.List<String> getFileUrlList() {
            return this.fileUrlList;
        }

        /**
         * @return gmtCreateStr
         */
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return partnerId
         */
        public Long getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return sceneType
         */
        public Integer getSceneType() {
            return this.sceneType;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return signType
         */
        public Integer getSignType() {
            return this.signType;
        }

        public static final class Builder {
            private String auditInfo; 
            private AuditRemarkInfo auditRemarkInfo; 
            private AuditState auditState; 
            private Integer businessType; 
            private String extendMessage; 
            private java.util.List<Long> fileIds; 
            private java.util.List<String> fileUrlList; 
            private String gmtCreateStr; 
            private Long id; 
            private String orderId; 
            private Long partnerId; 
            private String remark; 
            private Integer sceneType; 
            private String signName; 
            private Integer signType; 

            private Builder() {
            } 

            private Builder(Param model) {
                this.auditInfo = model.auditInfo;
                this.auditRemarkInfo = model.auditRemarkInfo;
                this.auditState = model.auditState;
                this.businessType = model.businessType;
                this.extendMessage = model.extendMessage;
                this.fileIds = model.fileIds;
                this.fileUrlList = model.fileUrlList;
                this.gmtCreateStr = model.gmtCreateStr;
                this.id = model.id;
                this.orderId = model.orderId;
                this.partnerId = model.partnerId;
                this.remark = model.remark;
                this.sceneType = model.sceneType;
                this.signName = model.signName;
                this.signType = model.signType;
            } 

            /**
             * AuditInfo.
             */
            public Builder auditInfo(String auditInfo) {
                this.auditInfo = auditInfo;
                return this;
            }

            /**
             * AuditRemarkInfo.
             */
            public Builder auditRemarkInfo(AuditRemarkInfo auditRemarkInfo) {
                this.auditRemarkInfo = auditRemarkInfo;
                return this;
            }

            /**
             * AuditState.
             */
            public Builder auditState(AuditState auditState) {
                this.auditState = auditState;
                return this;
            }

            /**
             * BusinessType.
             */
            public Builder businessType(Integer businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * ExtendMessage.
             */
            public Builder extendMessage(String extendMessage) {
                this.extendMessage = extendMessage;
                return this;
            }

            /**
             * FileIds.
             */
            public Builder fileIds(java.util.List<Long> fileIds) {
                this.fileIds = fileIds;
                return this;
            }

            /**
             * FileUrlList.
             */
            public Builder fileUrlList(java.util.List<String> fileUrlList) {
                this.fileUrlList = fileUrlList;
                return this;
            }

            /**
             * GmtCreateStr.
             */
            public Builder gmtCreateStr(String gmtCreateStr) {
                this.gmtCreateStr = gmtCreateStr;
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
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SceneType.
             */
            public Builder sceneType(Integer sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * SignType.
             */
            public Builder signType(Integer signType) {
                this.signType = signType;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryWorkOrdAuditListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryWorkOrdAuditListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditRemark")
        private String auditRemark;

        @com.aliyun.core.annotation.NameInMap("AuditResult")
        private String auditResult;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("OrdId")
        private String ordId;

        @com.aliyun.core.annotation.NameInMap("OrdStatus")
        private String ordStatus;

        @com.aliyun.core.annotation.NameInMap("Param")
        private Param param;

        private List(Builder builder) {
            this.auditRemark = builder.auditRemark;
            this.auditResult = builder.auditResult;
            this.bizType = builder.bizType;
            this.createDate = builder.createDate;
            this.ordId = builder.ordId;
            this.ordStatus = builder.ordStatus;
            this.param = builder.param;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return auditRemark
         */
        public String getAuditRemark() {
            return this.auditRemark;
        }

        /**
         * @return auditResult
         */
        public String getAuditResult() {
            return this.auditResult;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return ordId
         */
        public String getOrdId() {
            return this.ordId;
        }

        /**
         * @return ordStatus
         */
        public String getOrdStatus() {
            return this.ordStatus;
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        public static final class Builder {
            private String auditRemark; 
            private String auditResult; 
            private String bizType; 
            private String createDate; 
            private String ordId; 
            private String ordStatus; 
            private Param param; 

            private Builder() {
            } 

            private Builder(List model) {
                this.auditRemark = model.auditRemark;
                this.auditResult = model.auditResult;
                this.bizType = model.bizType;
                this.createDate = model.createDate;
                this.ordId = model.ordId;
                this.ordStatus = model.ordStatus;
                this.param = model.param;
            } 

            /**
             * AuditRemark.
             */
            public Builder auditRemark(String auditRemark) {
                this.auditRemark = auditRemark;
                return this;
            }

            /**
             * AuditResult.
             */
            public Builder auditResult(String auditResult) {
                this.auditResult = auditResult;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * OrdId.
             */
            public Builder ordId(String ordId) {
                this.ordId = ordId;
                return this;
            }

            /**
             * OrdStatus.
             */
            public Builder ordStatus(String ordStatus) {
                this.ordStatus = ordStatus;
                return this;
            }

            /**
             * Param.
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
