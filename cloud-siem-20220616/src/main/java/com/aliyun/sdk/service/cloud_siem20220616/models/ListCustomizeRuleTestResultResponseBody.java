// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link ListCustomizeRuleTestResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomizeRuleTestResultResponseBody</p>
 */
public class ListCustomizeRuleTestResultResponseBody extends TeaModel {
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

    private ListCustomizeRuleTestResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomizeRuleTestResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListCustomizeRuleTestResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCustomizeRuleTestResultResponseBody build() {
            return new ListCustomizeRuleTestResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomizeRuleTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomizeRuleTestResultResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("VerifiedCount")
        private Long verifiedCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.verifiedCount = builder.verifiedCount;
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

        /**
         * @return verifiedCount
         */
        public Long getVerifiedCount() {
            return this.verifiedCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 
            private Long verifiedCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
                this.verifiedCount = model.verifiedCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * VerifiedCount.
             */
            public Builder verifiedCount(Long verifiedCount) {
                this.verifiedCount = verifiedCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomizeRuleTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomizeRuleTestResultResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertDesc")
        private String alertDesc;

        @com.aliyun.core.annotation.NameInMap("AlertDetail")
        private String alertDetail;

        @com.aliyun.core.annotation.NameInMap("AlertSrcProd")
        private String alertSrcProd;

        @com.aliyun.core.annotation.NameInMap("AlertSrcProdModule")
        private String alertSrcProdModule;

        @com.aliyun.core.annotation.NameInMap("AttCk")
        private String attCk;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LogSource")
        private String logSource;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private String logTime;

        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private String mainUserId;

        @com.aliyun.core.annotation.NameInMap("OnlineStatus")
        private String onlineStatus;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private String subUserId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("VerifyType")
        private String verifyType;

        private ResponseData(Builder builder) {
            this.alertDesc = builder.alertDesc;
            this.alertDetail = builder.alertDetail;
            this.alertSrcProd = builder.alertSrcProd;
            this.alertSrcProdModule = builder.alertSrcProdModule;
            this.attCk = builder.attCk;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.level = builder.level;
            this.logSource = builder.logSource;
            this.logTime = builder.logTime;
            this.logType = builder.logType;
            this.mainUserId = builder.mainUserId;
            this.onlineStatus = builder.onlineStatus;
            this.subUserId = builder.subUserId;
            this.uuid = builder.uuid;
            this.verifyType = builder.verifyType;
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
         * @return alertDetail
         */
        public String getAlertDetail() {
            return this.alertDetail;
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
         * @return attCk
         */
        public String getAttCk() {
            return this.attCk;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return logSource
         */
        public String getLogSource() {
            return this.logSource;
        }

        /**
         * @return logTime
         */
        public String getLogTime() {
            return this.logTime;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return mainUserId
         */
        public String getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return onlineStatus
         */
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return subUserId
         */
        public String getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return verifyType
         */
        public String getVerifyType() {
            return this.verifyType;
        }

        public static final class Builder {
            private String alertDesc; 
            private String alertDetail; 
            private String alertSrcProd; 
            private String alertSrcProdModule; 
            private String attCk; 
            private String eventName; 
            private String eventType; 
            private String level; 
            private String logSource; 
            private String logTime; 
            private String logType; 
            private String mainUserId; 
            private String onlineStatus; 
            private String subUserId; 
            private String uuid; 
            private String verifyType; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.alertDesc = model.alertDesc;
                this.alertDetail = model.alertDetail;
                this.alertSrcProd = model.alertSrcProd;
                this.alertSrcProdModule = model.alertSrcProdModule;
                this.attCk = model.attCk;
                this.eventName = model.eventName;
                this.eventType = model.eventType;
                this.level = model.level;
                this.logSource = model.logSource;
                this.logTime = model.logTime;
                this.logType = model.logType;
                this.mainUserId = model.mainUserId;
                this.onlineStatus = model.onlineStatus;
                this.subUserId = model.subUserId;
                this.uuid = model.uuid;
                this.verifyType = model.verifyType;
            } 

            /**
             * <p>The description of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>The account you logged in this time is not in the legal account category defined by you. Please confirm the legality of the login behavior.</p>
             */
            public Builder alertDesc(String alertDesc) {
                this.alertDesc = alertDesc;
                return this;
            }

            /**
             * <p>The alert details in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;main_user_id&quot;: &quot;165295629792****&quot;;&quot;log_uuid_count&quot;: &quot;99&quot;;&quot;attack_ip&quot;: &quot;218.92.XX.XX&quot;}</p>
             */
            public Builder alertDetail(String alertDetail) {
                this.alertDetail = alertDetail;
                return this;
            }

            /**
             * <p>The source of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder alertSrcProd(String alertSrcProd) {
                this.alertSrcProd = alertSrcProd;
                return this;
            }

            /**
             * <p>The sub-module of the source.</p>
             * 
             * <strong>example:</strong>
             * <p>waf</p>
             */
            public Builder alertSrcProdModule(String alertSrcProdModule) {
                this.alertSrcProdModule = alertSrcProdModule;
                return this;
            }

            /**
             * <p>The tag of the ATT&amp;CK attack.</p>
             * 
             * <strong>example:</strong>
             * <p>T1595.002 Vulnerability Scanning</p>
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * <p>The name of the alert, which corresponds to the name of the custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_scan</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The threat type, which indicates the alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>WEBSHELL</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The threat level. Valid values:</p>
             * <ul>
             * <li>serious: high.</li>
             * <li>suspicious: medium.</li>
             * <li>remind: low.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The log source of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_aegis_sas_alert</p>
             */
            public Builder logSource(String logSource) {
                this.logSource = logSource;
                return this;
            }

            /**
             * <p>The time when the alert was recorded.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * <p>The log type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ALERT_ACTIVITY</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is associated with the alert in SIEM.</p>
             * 
             * <strong>example:</strong>
             * <p>127608589417****</p>
             */
            public Builder mainUserId(String mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The status of the alert data. Valid values:</p>
             * <ul>
             * <li>test: business test data.</li>
             * <li>online: online data.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder onlineStatus(String onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account within which the alert is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>176555323***</p>
             */
            public Builder subUserId(String subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * <p>The UUID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_71e24437d2797ce8fc59692905a4****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * VerifyType.
             */
            public Builder verifyType(String verifyType) {
                this.verifyType = verifyType;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomizeRuleTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomizeRuleTestResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List<ResponseData> responseData;

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
        public java.util.List<ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List<ResponseData> responseData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageInfo = model.pageInfo;
                this.responseData = model.responseData;
            } 

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The detailed data.</p>
             */
            public Builder responseData(java.util.List<ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
