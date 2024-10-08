// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertsWithEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertsWithEventResponseBody</p>
 */
public class DescribeAlertsWithEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAlertsWithEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertsWithEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAlertsWithEventResponseBody build() {
            return new DescribeAlertsWithEventResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The current page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class AlertInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private AlertInfoList(Builder builder) {
            this.key = builder.key;
            this.keyName = builder.keyName;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertInfoList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String keyName; 
            private String values; 

            /**
             * The attribute key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The name of the key.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * The value of the key.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public AlertInfoList build() {
                return new AlertInfoList(this);
            } 

        } 

    }
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertDesc")
        private String alertDesc;

        @com.aliyun.core.annotation.NameInMap("AlertDescCode")
        private String alertDescCode;

        @com.aliyun.core.annotation.NameInMap("AlertDescEn")
        private String alertDescEn;

        @com.aliyun.core.annotation.NameInMap("AlertDetail")
        private String alertDetail;

        @com.aliyun.core.annotation.NameInMap("AlertInfoList")
        private java.util.List < AlertInfoList> alertInfoList;

        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private String alertLevel;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertNameCode")
        private String alertNameCode;

        @com.aliyun.core.annotation.NameInMap("AlertNameEn")
        private String alertNameEn;

        @com.aliyun.core.annotation.NameInMap("AlertSrcProd")
        private String alertSrcProd;

        @com.aliyun.core.annotation.NameInMap("AlertSrcProdModule")
        private String alertSrcProdModule;

        @com.aliyun.core.annotation.NameInMap("AlertTitle")
        private String alertTitle;

        @com.aliyun.core.annotation.NameInMap("AlertTitleEn")
        private String alertTitleEn;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("AlertTypeCode")
        private String alertTypeCode;

        @com.aliyun.core.annotation.NameInMap("AlertTypeEn")
        private String alertTypeEn;

        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        @com.aliyun.core.annotation.NameInMap("AssetList")
        private String assetList;

        @com.aliyun.core.annotation.NameInMap("AttCk")
        private String attCk;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EntityList")
        private String entityList;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("IsDefend")
        private String isDefend;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private String logTime;

        @com.aliyun.core.annotation.NameInMap("LogUuid")
        private String logUuid;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private Long mainUserId;

        @com.aliyun.core.annotation.NameInMap("OccurTime")
        private String occurTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        private ResponseData(Builder builder) {
            this.alertDesc = builder.alertDesc;
            this.alertDescCode = builder.alertDescCode;
            this.alertDescEn = builder.alertDescEn;
            this.alertDetail = builder.alertDetail;
            this.alertInfoList = builder.alertInfoList;
            this.alertLevel = builder.alertLevel;
            this.alertName = builder.alertName;
            this.alertNameCode = builder.alertNameCode;
            this.alertNameEn = builder.alertNameEn;
            this.alertSrcProd = builder.alertSrcProd;
            this.alertSrcProdModule = builder.alertSrcProdModule;
            this.alertTitle = builder.alertTitle;
            this.alertTitleEn = builder.alertTitleEn;
            this.alertType = builder.alertType;
            this.alertTypeCode = builder.alertTypeCode;
            this.alertTypeEn = builder.alertTypeEn;
            this.alertUuid = builder.alertUuid;
            this.assetList = builder.assetList;
            this.attCk = builder.attCk;
            this.cloudCode = builder.cloudCode;
            this.endTime = builder.endTime;
            this.entityList = builder.entityList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.incidentUuid = builder.incidentUuid;
            this.isDefend = builder.isDefend;
            this.logTime = builder.logTime;
            this.logUuid = builder.logUuid;
            this.mainUserId = builder.mainUserId;
            this.occurTime = builder.occurTime;
            this.startTime = builder.startTime;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertDesc
         */
        public String getAlertDesc() {
            return this.alertDesc;
        }

        /**
         * @return alertDescCode
         */
        public String getAlertDescCode() {
            return this.alertDescCode;
        }

        /**
         * @return alertDescEn
         */
        public String getAlertDescEn() {
            return this.alertDescEn;
        }

        /**
         * @return alertDetail
         */
        public String getAlertDetail() {
            return this.alertDetail;
        }

        /**
         * @return alertInfoList
         */
        public java.util.List < AlertInfoList> getAlertInfoList() {
            return this.alertInfoList;
        }

        /**
         * @return alertLevel
         */
        public String getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertNameCode
         */
        public String getAlertNameCode() {
            return this.alertNameCode;
        }

        /**
         * @return alertNameEn
         */
        public String getAlertNameEn() {
            return this.alertNameEn;
        }

        /**
         * @return alertSrcProd
         */
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        /**
         * @return alertSrcProdModule
         */
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        /**
         * @return alertTitle
         */
        public String getAlertTitle() {
            return this.alertTitle;
        }

        /**
         * @return alertTitleEn
         */
        public String getAlertTitleEn() {
            return this.alertTitleEn;
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return alertTypeCode
         */
        public String getAlertTypeCode() {
            return this.alertTypeCode;
        }

        /**
         * @return alertTypeEn
         */
        public String getAlertTypeEn() {
            return this.alertTypeEn;
        }

        /**
         * @return alertUuid
         */
        public String getAlertUuid() {
            return this.alertUuid;
        }

        /**
         * @return assetList
         */
        public String getAssetList() {
            return this.assetList;
        }

        /**
         * @return attCk
         */
        public String getAttCk() {
            return this.attCk;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return entityList
         */
        public String getEntityList() {
            return this.entityList;
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
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return isDefend
         */
        public String getIsDefend() {
            return this.isDefend;
        }

        /**
         * @return logTime
         */
        public String getLogTime() {
            return this.logTime;
        }

        /**
         * @return logUuid
         */
        public String getLogUuid() {
            return this.logUuid;
        }

        /**
         * @return mainUserId
         */
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return occurTime
         */
        public String getOccurTime() {
            return this.occurTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String alertDesc; 
            private String alertDescCode; 
            private String alertDescEn; 
            private String alertDetail; 
            private java.util.List < AlertInfoList> alertInfoList; 
            private String alertLevel; 
            private String alertName; 
            private String alertNameCode; 
            private String alertNameEn; 
            private String alertSrcProd; 
            private String alertSrcProdModule; 
            private String alertTitle; 
            private String alertTitleEn; 
            private String alertType; 
            private String alertTypeCode; 
            private String alertTypeEn; 
            private String alertUuid; 
            private String assetList; 
            private String attCk; 
            private String cloudCode; 
            private String endTime; 
            private String entityList; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String incidentUuid; 
            private String isDefend; 
            private String logTime; 
            private String logUuid; 
            private Long mainUserId; 
            private String occurTime; 
            private String startTime; 
            private Long subUserId; 

            /**
             * The description of the alert.
             */
            public Builder alertDesc(String alertDesc) {
                this.alertDesc = alertDesc;
                return this;
            }

            /**
             * The internal code of the alert description.
             */
            public Builder alertDescCode(String alertDescCode) {
                this.alertDescCode = alertDescCode;
                return this;
            }

            /**
             * The alert description in English.
             */
            public Builder alertDescEn(String alertDescEn) {
                this.alertDescEn = alertDescEn;
                return this;
            }

            /**
             * The details of the alert.
             */
            public Builder alertDetail(String alertDetail) {
                this.alertDetail = alertDetail;
                return this;
            }

            /**
             * The displayed details of the alert.
             */
            public Builder alertInfoList(java.util.List < AlertInfoList> alertInfoList) {
                this.alertInfoList = alertInfoList;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   serious: high.
             * *   suspicious: medium.
             * *   remind: low.
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * The name of the alert.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The internal code of the alert name.
             */
            public Builder alertNameCode(String alertNameCode) {
                this.alertNameCode = alertNameCode;
                return this;
            }

            /**
             * The alert name in English.
             */
            public Builder alertNameEn(String alertNameEn) {
                this.alertNameEn = alertNameEn;
                return this;
            }

            /**
             * The source of the alert.
             */
            public Builder alertSrcProd(String alertSrcProd) {
                this.alertSrcProd = alertSrcProd;
                return this;
            }

            /**
             * The sub-module of the alert source.
             */
            public Builder alertSrcProdModule(String alertSrcProdModule) {
                this.alertSrcProdModule = alertSrcProdModule;
                return this;
            }

            /**
             * The title of the alert.
             */
            public Builder alertTitle(String alertTitle) {
                this.alertTitle = alertTitle;
                return this;
            }

            /**
             * The alert title in English.
             */
            public Builder alertTitleEn(String alertTitleEn) {
                this.alertTitleEn = alertTitleEn;
                return this;
            }

            /**
             * The type of the alert.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The internal code of the alert type.
             */
            public Builder alertTypeCode(String alertTypeCode) {
                this.alertTypeCode = alertTypeCode;
                return this;
            }

            /**
             * The alert type in English.
             */
            public Builder alertTypeEn(String alertTypeEn) {
                this.alertTypeEn = alertTypeEn;
                return this;
            }

            /**
             * The UUID of the alert.
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * The details of the asset.
             */
            public Builder assetList(String assetList) {
                this.assetList = assetList;
                return this;
            }

            /**
             * The tag of the ATT\&CK technique.
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * The code of the cloud service provider. Valid values:
             * <p>
             * 
             * *   aliyun: Alibaba Cloud.
             * *   qcloud: Tencent Cloud.
             * *   hcloud: Huawei Cloud.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * The time when the alert was closed.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The details of the entity.
             */
            public Builder entityList(String entityList) {
                this.entityList = entityList;
                return this;
            }

            /**
             * The time when the alert was received.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the alert was last updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The unique ID of the alert.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The UUID of the event.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * Indicates whether an attack is defended against. Valid values:
             * <p>
             * 
             * *   0: detected.
             * *   1: blocked.
             */
            public Builder isDefend(String isDefend) {
                this.isDefend = isDefend;
                return this;
            }

            /**
             * The time when the alert was recorded.
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * The UUID of the alert log.
             */
            public Builder logUuid(String logUuid) {
                this.logUuid = logUuid;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is associated with the alert in SIEM.
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * The time when the alert was triggered.
             */
            public Builder occurTime(String occurTime) {
                this.occurTime = occurTime;
                return this;
            }

            /**
             * The time at which the alert was first generated.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account within which the alert is generated.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List < ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List < ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List < ResponseData> responseData; 

            /**
             * The pagination information.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * The detailed data.
             */
            public Builder responseData(java.util.List < ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
