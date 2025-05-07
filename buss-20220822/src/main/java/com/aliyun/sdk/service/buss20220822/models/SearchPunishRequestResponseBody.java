// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link SearchPunishRequestResponseBody} extends {@link TeaModel}
 *
 * <p>SearchPunishRequestResponseBody</p>
 */
public class SearchPunishRequestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Class")
    private String _class;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("ViewCount")
    private Long viewCount;

    private SearchPunishRequestResponseBody(Builder builder) {
        this._class = builder._class;
        this.code = builder.code;
        this.count = builder.count;
        this.dataList = builder.dataList;
        this.message = builder.message;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.viewCount = builder.viewCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPunishRequestResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _class
     */
    public String get_class() {
        return this._class;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return viewCount
     */
    public Long getViewCount() {
        return this.viewCount;
    }

    public static final class Builder {
        private String _class; 
        private String code; 
        private Long count; 
        private java.util.List<DataList> dataList; 
        private String message; 
        private Boolean success; 
        private Long totalCount; 
        private Long viewCount; 

        private Builder() {
        } 

        private Builder(SearchPunishRequestResponseBody model) {
            this._class = model._class;
            this.code = model.code;
            this.count = model.count;
            this.dataList = model.dataList;
            this.message = model.message;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.viewCount = model.viewCount;
        } 

        /**
         * Class.
         */
        public Builder _class(String _class) {
            this._class = _class;
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
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * ViewCount.
         */
        public Builder viewCount(Long viewCount) {
            this.viewCount = viewCount;
            return this;
        }

        public SearchPunishRequestResponseBody build() {
            return new SearchPunishRequestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchPunishRequestResponseBody} extends {@link TeaModel}
     *
     * <p>SearchPunishRequestResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntiPunishRespTime")
        private String antiPunishRespTime;

        @com.aliyun.core.annotation.NameInMap("AntiPunishTime")
        private String antiPunishTime;

        @com.aliyun.core.annotation.NameInMap("AntiResult")
        private String antiResult;

        @com.aliyun.core.annotation.NameInMap("AntiStatus")
        private String antiStatus;

        @com.aliyun.core.annotation.NameInMap("BussinessCode")
        private String bussinessCode;

        @com.aliyun.core.annotation.NameInMap("CaseCode")
        private String caseCode;

        @com.aliyun.core.annotation.NameInMap("CaseExtendCode")
        private String caseExtendCode;

        @com.aliyun.core.annotation.NameInMap("CaseSubCode")
        private String caseSubCode;

        @com.aliyun.core.annotation.NameInMap("Class")
        private String _class;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("ExpectedRemoveTime")
        private String expectedRemoveTime;

        @com.aliyun.core.annotation.NameInMap("ExtRequestId")
        private String extRequestId;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        private String idType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpString")
        private String ipString;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("OperatorNum")
        private String operatorNum;

        @com.aliyun.core.annotation.NameInMap("PunishDomain")
        private String punishDomain;

        @com.aliyun.core.annotation.NameInMap("PunishIp")
        private String punishIp;

        @com.aliyun.core.annotation.NameInMap("PunishOfficer")
        private String punishOfficer;

        @com.aliyun.core.annotation.NameInMap("PunishOfficerNum")
        private String punishOfficerNum;

        @com.aliyun.core.annotation.NameInMap("PunishRequest")
        private String punishRequest;

        @com.aliyun.core.annotation.NameInMap("PunishRespTime")
        private String punishRespTime;

        @com.aliyun.core.annotation.NameInMap("PunishResult")
        private String punishResult;

        @com.aliyun.core.annotation.NameInMap("PunishStatus")
        private String punishStatus;

        @com.aliyun.core.annotation.NameInMap("PunishTime")
        private String punishTime;

        @com.aliyun.core.annotation.NameInMap("PunishUrl")
        private String punishUrl;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("SourceCode")
        private String sourceCode;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private DataList(Builder builder) {
            this.antiPunishRespTime = builder.antiPunishRespTime;
            this.antiPunishTime = builder.antiPunishTime;
            this.antiResult = builder.antiResult;
            this.antiStatus = builder.antiStatus;
            this.bussinessCode = builder.bussinessCode;
            this.caseCode = builder.caseCode;
            this.caseExtendCode = builder.caseExtendCode;
            this.caseSubCode = builder.caseSubCode;
            this._class = builder._class;
            this.creator = builder.creator;
            this.deleted = builder.deleted;
            this.eventCode = builder.eventCode;
            this.expectedRemoveTime = builder.expectedRemoveTime;
            this.extRequestId = builder.extRequestId;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.idType = builder.idType;
            this.instanceId = builder.instanceId;
            this.ipString = builder.ipString;
            this.modifier = builder.modifier;
            this.operator = builder.operator;
            this.operatorNum = builder.operatorNum;
            this.punishDomain = builder.punishDomain;
            this.punishIp = builder.punishIp;
            this.punishOfficer = builder.punishOfficer;
            this.punishOfficerNum = builder.punishOfficerNum;
            this.punishRequest = builder.punishRequest;
            this.punishRespTime = builder.punishRespTime;
            this.punishResult = builder.punishResult;
            this.punishStatus = builder.punishStatus;
            this.punishTime = builder.punishTime;
            this.punishUrl = builder.punishUrl;
            this.reason = builder.reason;
            this.sourceCode = builder.sourceCode;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return antiPunishRespTime
         */
        public String getAntiPunishRespTime() {
            return this.antiPunishRespTime;
        }

        /**
         * @return antiPunishTime
         */
        public String getAntiPunishTime() {
            return this.antiPunishTime;
        }

        /**
         * @return antiResult
         */
        public String getAntiResult() {
            return this.antiResult;
        }

        /**
         * @return antiStatus
         */
        public String getAntiStatus() {
            return this.antiStatus;
        }

        /**
         * @return bussinessCode
         */
        public String getBussinessCode() {
            return this.bussinessCode;
        }

        /**
         * @return caseCode
         */
        public String getCaseCode() {
            return this.caseCode;
        }

        /**
         * @return caseExtendCode
         */
        public String getCaseExtendCode() {
            return this.caseExtendCode;
        }

        /**
         * @return caseSubCode
         */
        public String getCaseSubCode() {
            return this.caseSubCode;
        }

        /**
         * @return _class
         */
        public String get_class() {
            return this._class;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return expectedRemoveTime
         */
        public String getExpectedRemoveTime() {
            return this.expectedRemoveTime;
        }

        /**
         * @return extRequestId
         */
        public String getExtRequestId() {
            return this.extRequestId;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
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
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipString
         */
        public String getIpString() {
            return this.ipString;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return operatorNum
         */
        public String getOperatorNum() {
            return this.operatorNum;
        }

        /**
         * @return punishDomain
         */
        public String getPunishDomain() {
            return this.punishDomain;
        }

        /**
         * @return punishIp
         */
        public String getPunishIp() {
            return this.punishIp;
        }

        /**
         * @return punishOfficer
         */
        public String getPunishOfficer() {
            return this.punishOfficer;
        }

        /**
         * @return punishOfficerNum
         */
        public String getPunishOfficerNum() {
            return this.punishOfficerNum;
        }

        /**
         * @return punishRequest
         */
        public String getPunishRequest() {
            return this.punishRequest;
        }

        /**
         * @return punishRespTime
         */
        public String getPunishRespTime() {
            return this.punishRespTime;
        }

        /**
         * @return punishResult
         */
        public String getPunishResult() {
            return this.punishResult;
        }

        /**
         * @return punishStatus
         */
        public String getPunishStatus() {
            return this.punishStatus;
        }

        /**
         * @return punishTime
         */
        public String getPunishTime() {
            return this.punishTime;
        }

        /**
         * @return punishUrl
         */
        public String getPunishUrl() {
            return this.punishUrl;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return sourceCode
         */
        public String getSourceCode() {
            return this.sourceCode;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String antiPunishRespTime; 
            private String antiPunishTime; 
            private String antiResult; 
            private String antiStatus; 
            private String bussinessCode; 
            private String caseCode; 
            private String caseExtendCode; 
            private String caseSubCode; 
            private String _class; 
            private String creator; 
            private Boolean deleted; 
            private String eventCode; 
            private String expectedRemoveTime; 
            private String extRequestId; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String idType; 
            private String instanceId; 
            private String ipString; 
            private String modifier; 
            private String operator; 
            private String operatorNum; 
            private String punishDomain; 
            private String punishIp; 
            private String punishOfficer; 
            private String punishOfficerNum; 
            private String punishRequest; 
            private String punishRespTime; 
            private String punishResult; 
            private String punishStatus; 
            private String punishTime; 
            private String punishUrl; 
            private String reason; 
            private String sourceCode; 
            private String userId; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.antiPunishRespTime = model.antiPunishRespTime;
                this.antiPunishTime = model.antiPunishTime;
                this.antiResult = model.antiResult;
                this.antiStatus = model.antiStatus;
                this.bussinessCode = model.bussinessCode;
                this.caseCode = model.caseCode;
                this.caseExtendCode = model.caseExtendCode;
                this.caseSubCode = model.caseSubCode;
                this._class = model._class;
                this.creator = model.creator;
                this.deleted = model.deleted;
                this.eventCode = model.eventCode;
                this.expectedRemoveTime = model.expectedRemoveTime;
                this.extRequestId = model.extRequestId;
                this.gmtCreated = model.gmtCreated;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.idType = model.idType;
                this.instanceId = model.instanceId;
                this.ipString = model.ipString;
                this.modifier = model.modifier;
                this.operator = model.operator;
                this.operatorNum = model.operatorNum;
                this.punishDomain = model.punishDomain;
                this.punishIp = model.punishIp;
                this.punishOfficer = model.punishOfficer;
                this.punishOfficerNum = model.punishOfficerNum;
                this.punishRequest = model.punishRequest;
                this.punishRespTime = model.punishRespTime;
                this.punishResult = model.punishResult;
                this.punishStatus = model.punishStatus;
                this.punishTime = model.punishTime;
                this.punishUrl = model.punishUrl;
                this.reason = model.reason;
                this.sourceCode = model.sourceCode;
                this.userId = model.userId;
            } 

            /**
             * AntiPunishRespTime.
             */
            public Builder antiPunishRespTime(String antiPunishRespTime) {
                this.antiPunishRespTime = antiPunishRespTime;
                return this;
            }

            /**
             * AntiPunishTime.
             */
            public Builder antiPunishTime(String antiPunishTime) {
                this.antiPunishTime = antiPunishTime;
                return this;
            }

            /**
             * AntiResult.
             */
            public Builder antiResult(String antiResult) {
                this.antiResult = antiResult;
                return this;
            }

            /**
             * AntiStatus.
             */
            public Builder antiStatus(String antiStatus) {
                this.antiStatus = antiStatus;
                return this;
            }

            /**
             * BussinessCode.
             */
            public Builder bussinessCode(String bussinessCode) {
                this.bussinessCode = bussinessCode;
                return this;
            }

            /**
             * CaseCode.
             */
            public Builder caseCode(String caseCode) {
                this.caseCode = caseCode;
                return this;
            }

            /**
             * CaseExtendCode.
             */
            public Builder caseExtendCode(String caseExtendCode) {
                this.caseExtendCode = caseExtendCode;
                return this;
            }

            /**
             * CaseSubCode.
             */
            public Builder caseSubCode(String caseSubCode) {
                this.caseSubCode = caseSubCode;
                return this;
            }

            /**
             * Class.
             */
            public Builder _class(String _class) {
                this._class = _class;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * ExpectedRemoveTime.
             */
            public Builder expectedRemoveTime(String expectedRemoveTime) {
                this.expectedRemoveTime = expectedRemoveTime;
                return this;
            }

            /**
             * ExtRequestId.
             */
            public Builder extRequestId(String extRequestId) {
                this.extRequestId = extRequestId;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
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
             * IdType.
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IpString.
             */
            public Builder ipString(String ipString) {
                this.ipString = ipString;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorNum.
             */
            public Builder operatorNum(String operatorNum) {
                this.operatorNum = operatorNum;
                return this;
            }

            /**
             * PunishDomain.
             */
            public Builder punishDomain(String punishDomain) {
                this.punishDomain = punishDomain;
                return this;
            }

            /**
             * PunishIp.
             */
            public Builder punishIp(String punishIp) {
                this.punishIp = punishIp;
                return this;
            }

            /**
             * PunishOfficer.
             */
            public Builder punishOfficer(String punishOfficer) {
                this.punishOfficer = punishOfficer;
                return this;
            }

            /**
             * PunishOfficerNum.
             */
            public Builder punishOfficerNum(String punishOfficerNum) {
                this.punishOfficerNum = punishOfficerNum;
                return this;
            }

            /**
             * PunishRequest.
             */
            public Builder punishRequest(String punishRequest) {
                this.punishRequest = punishRequest;
                return this;
            }

            /**
             * PunishRespTime.
             */
            public Builder punishRespTime(String punishRespTime) {
                this.punishRespTime = punishRespTime;
                return this;
            }

            /**
             * PunishResult.
             */
            public Builder punishResult(String punishResult) {
                this.punishResult = punishResult;
                return this;
            }

            /**
             * PunishStatus.
             */
            public Builder punishStatus(String punishStatus) {
                this.punishStatus = punishStatus;
                return this;
            }

            /**
             * PunishTime.
             */
            public Builder punishTime(String punishTime) {
                this.punishTime = punishTime;
                return this;
            }

            /**
             * PunishUrl.
             */
            public Builder punishUrl(String punishUrl) {
                this.punishUrl = punishUrl;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * SourceCode.
             */
            public Builder sourceCode(String sourceCode) {
                this.sourceCode = sourceCode;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
