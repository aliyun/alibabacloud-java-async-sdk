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
 * {@link QuerySmsSignLastRangeNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSignLastRangeNewResponseBody</p>
 */
public class QuerySmsSignLastRangeNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySmsSignLastRangeNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSignLastRangeNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private List list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QuerySmsSignLastRangeNewResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySmsSignLastRangeNewResponseBody build() {
            return new QuerySmsSignLastRangeNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsSignLastRangeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignLastRangeNewResponseBody</p>
     */
    public static class FileIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private java.util.List<Long> fileId;

        private FileIds(Builder builder) {
            this.fileId = builder.fileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileIds create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public java.util.List<Long> getFileId() {
            return this.fileId;
        }

        public static final class Builder {
            private java.util.List<Long> fileId; 

            private Builder() {
            } 

            private Builder(FileIds model) {
                this.fileId = model.fileId;
            } 

            /**
             * FileId.
             */
            public Builder fileId(java.util.List<Long> fileId) {
                this.fileId = fileId;
                return this;
            }

            public FileIds build() {
                return new FileIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignLastRangeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignLastRangeNewResponseBody</p>
     */
    public static class FileUrlList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private java.util.List<String> fileUrl;

        private FileUrlList(Builder builder) {
            this.fileUrl = builder.fileUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileUrlList create() {
            return builder().build();
        }

        /**
         * @return fileUrl
         */
        public java.util.List<String> getFileUrl() {
            return this.fileUrl;
        }

        public static final class Builder {
            private java.util.List<String> fileUrl; 

            private Builder() {
            } 

            private Builder(FileUrlList model) {
                this.fileUrl = model.fileUrl;
            } 

            /**
             * FileUrl.
             */
            public Builder fileUrl(java.util.List<String> fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            public FileUrlList build() {
                return new FileUrlList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignLastRangeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignLastRangeNewResponseBody</p>
     */
    public static class SignSceneDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditState")
        private String auditState;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private Integer sceneType;

        private SignSceneDetail(Builder builder) {
            this.auditState = builder.auditState;
            this.sceneType = builder.sceneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignSceneDetail create() {
            return builder().build();
        }

        /**
         * @return auditState
         */
        public String getAuditState() {
            return this.auditState;
        }

        /**
         * @return sceneType
         */
        public Integer getSceneType() {
            return this.sceneType;
        }

        public static final class Builder {
            private String auditState; 
            private Integer sceneType; 

            private Builder() {
            } 

            private Builder(SignSceneDetail model) {
                this.auditState = model.auditState;
                this.sceneType = model.sceneType;
            } 

            /**
             * AuditState.
             */
            public Builder auditState(String auditState) {
                this.auditState = auditState;
                return this;
            }

            /**
             * SceneType.
             */
            public Builder sceneType(Integer sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            public SignSceneDetail build() {
                return new SignSceneDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignLastRangeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignLastRangeNewResponseBody</p>
     */
    public static class SignSceneDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SignSceneDetail")
        private java.util.List<SignSceneDetail> signSceneDetail;

        private SignSceneDetailList(Builder builder) {
            this.signSceneDetail = builder.signSceneDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SignSceneDetailList create() {
            return builder().build();
        }

        /**
         * @return signSceneDetail
         */
        public java.util.List<SignSceneDetail> getSignSceneDetail() {
            return this.signSceneDetail;
        }

        public static final class Builder {
            private java.util.List<SignSceneDetail> signSceneDetail; 

            private Builder() {
            } 

            private Builder(SignSceneDetailList model) {
                this.signSceneDetail = model.signSceneDetail;
            } 

            /**
             * SignSceneDetail.
             */
            public Builder signSceneDetail(java.util.List<SignSceneDetail> signSceneDetail) {
                this.signSceneDetail = signSceneDetail;
                return this;
            }

            public SignSceneDetailList build() {
                return new SignSceneDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignLastRangeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignLastRangeNewResponseBody</p>
     */
    public static class SmsSign extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditInfo")
        private String auditInfo;

        @com.aliyun.core.annotation.NameInMap("AuditRemarkInfo")
        private String auditRemarkInfo;

        @com.aliyun.core.annotation.NameInMap("AuditState")
        private String auditState;

        @com.aliyun.core.annotation.NameInMap("ExtendMessage")
        private String extendMessage;

        @com.aliyun.core.annotation.NameInMap("FileIds")
        private FileIds fileIds;

        @com.aliyun.core.annotation.NameInMap("FileUrlList")
        private FileUrlList fileUrlList;

        @com.aliyun.core.annotation.NameInMap("GmtCreateStr")
        private String gmtCreateStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsDefaultSign")
        private Boolean isDefaultSign;

        @com.aliyun.core.annotation.NameInMap("OperateDateStr")
        private String operateDateStr;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private Integer sceneType;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private Integer serviceType;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("SignSceneDetailList")
        private SignSceneDetailList signSceneDetailList;

        @com.aliyun.core.annotation.NameInMap("SignType")
        private Integer signType;

        @com.aliyun.core.annotation.NameInMap("SignUsageName")
        private String signUsageName;

        private SmsSign(Builder builder) {
            this.auditInfo = builder.auditInfo;
            this.auditRemarkInfo = builder.auditRemarkInfo;
            this.auditState = builder.auditState;
            this.extendMessage = builder.extendMessage;
            this.fileIds = builder.fileIds;
            this.fileUrlList = builder.fileUrlList;
            this.gmtCreateStr = builder.gmtCreateStr;
            this.id = builder.id;
            this.isDefaultSign = builder.isDefaultSign;
            this.operateDateStr = builder.operateDateStr;
            this.orderId = builder.orderId;
            this.remark = builder.remark;
            this.sceneType = builder.sceneType;
            this.serviceType = builder.serviceType;
            this.signName = builder.signName;
            this.signSceneDetailList = builder.signSceneDetailList;
            this.signType = builder.signType;
            this.signUsageName = builder.signUsageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsSign create() {
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
        public String getAuditRemarkInfo() {
            return this.auditRemarkInfo;
        }

        /**
         * @return auditState
         */
        public String getAuditState() {
            return this.auditState;
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
        public FileIds getFileIds() {
            return this.fileIds;
        }

        /**
         * @return fileUrlList
         */
        public FileUrlList getFileUrlList() {
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
        public String getId() {
            return this.id;
        }

        /**
         * @return isDefaultSign
         */
        public Boolean getIsDefaultSign() {
            return this.isDefaultSign;
        }

        /**
         * @return operateDateStr
         */
        public String getOperateDateStr() {
            return this.operateDateStr;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
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
         * @return serviceType
         */
        public Integer getServiceType() {
            return this.serviceType;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return signSceneDetailList
         */
        public SignSceneDetailList getSignSceneDetailList() {
            return this.signSceneDetailList;
        }

        /**
         * @return signType
         */
        public Integer getSignType() {
            return this.signType;
        }

        /**
         * @return signUsageName
         */
        public String getSignUsageName() {
            return this.signUsageName;
        }

        public static final class Builder {
            private String auditInfo; 
            private String auditRemarkInfo; 
            private String auditState; 
            private String extendMessage; 
            private FileIds fileIds; 
            private FileUrlList fileUrlList; 
            private String gmtCreateStr; 
            private String id; 
            private Boolean isDefaultSign; 
            private String operateDateStr; 
            private String orderId; 
            private String remark; 
            private Integer sceneType; 
            private Integer serviceType; 
            private String signName; 
            private SignSceneDetailList signSceneDetailList; 
            private Integer signType; 
            private String signUsageName; 

            private Builder() {
            } 

            private Builder(SmsSign model) {
                this.auditInfo = model.auditInfo;
                this.auditRemarkInfo = model.auditRemarkInfo;
                this.auditState = model.auditState;
                this.extendMessage = model.extendMessage;
                this.fileIds = model.fileIds;
                this.fileUrlList = model.fileUrlList;
                this.gmtCreateStr = model.gmtCreateStr;
                this.id = model.id;
                this.isDefaultSign = model.isDefaultSign;
                this.operateDateStr = model.operateDateStr;
                this.orderId = model.orderId;
                this.remark = model.remark;
                this.sceneType = model.sceneType;
                this.serviceType = model.serviceType;
                this.signName = model.signName;
                this.signSceneDetailList = model.signSceneDetailList;
                this.signType = model.signType;
                this.signUsageName = model.signUsageName;
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
            public Builder auditRemarkInfo(String auditRemarkInfo) {
                this.auditRemarkInfo = auditRemarkInfo;
                return this;
            }

            /**
             * AuditState.
             */
            public Builder auditState(String auditState) {
                this.auditState = auditState;
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
            public Builder fileIds(FileIds fileIds) {
                this.fileIds = fileIds;
                return this;
            }

            /**
             * FileUrlList.
             */
            public Builder fileUrlList(FileUrlList fileUrlList) {
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
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsDefaultSign.
             */
            public Builder isDefaultSign(Boolean isDefaultSign) {
                this.isDefaultSign = isDefaultSign;
                return this;
            }

            /**
             * OperateDateStr.
             */
            public Builder operateDateStr(String operateDateStr) {
                this.operateDateStr = operateDateStr;
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
             * ServiceType.
             */
            public Builder serviceType(Integer serviceType) {
                this.serviceType = serviceType;
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
             * SignSceneDetailList.
             */
            public Builder signSceneDetailList(SignSceneDetailList signSceneDetailList) {
                this.signSceneDetailList = signSceneDetailList;
                return this;
            }

            /**
             * SignType.
             */
            public Builder signType(Integer signType) {
                this.signType = signType;
                return this;
            }

            /**
             * SignUsageName.
             */
            public Builder signUsageName(String signUsageName) {
                this.signUsageName = signUsageName;
                return this;
            }

            public SmsSign build() {
                return new SmsSign(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSignLastRangeNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSignLastRangeNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsSign")
        private java.util.List<SmsSign> smsSign;

        private List(Builder builder) {
            this.smsSign = builder.smsSign;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return smsSign
         */
        public java.util.List<SmsSign> getSmsSign() {
            return this.smsSign;
        }

        public static final class Builder {
            private java.util.List<SmsSign> smsSign; 

            private Builder() {
            } 

            private Builder(List model) {
                this.smsSign = model.smsSign;
            } 

            /**
             * SmsSign.
             */
            public Builder smsSign(java.util.List<SmsSign> smsSign) {
                this.smsSign = smsSign;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
