// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttackTimeLineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttackTimeLineResponseBody</p>
 */
public class DescribeAttackTimeLineResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAttackTimeLineResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackTimeLineResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
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
        public Builder data(java.util.List < Data> data) {
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

        public DescribeAttackTimeLineResponseBody build() {
            return new DescribeAttackTimeLineResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlertLevel")
        private String alertLevel;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("AlertNameCode")
        private String alertNameCode;

        @NameInMap("AlertNameEn")
        private String alertNameEn;

        @NameInMap("AlertSrcProd")
        private String alertSrcProd;

        @NameInMap("AlertSrcProdModule")
        private String alertSrcProdModule;

        @NameInMap("AlertTime")
        private Long alertTime;

        @NameInMap("AlertTitle")
        private String alertTitle;

        @NameInMap("AlertTitleEn")
        private String alertTitleEn;

        @NameInMap("AlertType")
        private String alertType;

        @NameInMap("AlertTypeCode")
        private String alertTypeCode;

        @NameInMap("AlertTypeEn")
        private String alertTypeEn;

        @NameInMap("AlertUuid")
        private String alertUuid;

        @NameInMap("AssetId")
        private String assetId;

        @NameInMap("AssetList")
        private String assetList;

        @NameInMap("AssetName")
        private String assetName;

        @NameInMap("AttCk")
        private String attCk;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("IncidentUuid")
        private String incidentUuid;

        @NameInMap("LogTime")
        private String logTime;

        private Data(Builder builder) {
            this.alertLevel = builder.alertLevel;
            this.alertName = builder.alertName;
            this.alertNameCode = builder.alertNameCode;
            this.alertNameEn = builder.alertNameEn;
            this.alertSrcProd = builder.alertSrcProd;
            this.alertSrcProdModule = builder.alertSrcProdModule;
            this.alertTime = builder.alertTime;
            this.alertTitle = builder.alertTitle;
            this.alertTitleEn = builder.alertTitleEn;
            this.alertType = builder.alertType;
            this.alertTypeCode = builder.alertTypeCode;
            this.alertTypeEn = builder.alertTypeEn;
            this.alertUuid = builder.alertUuid;
            this.assetId = builder.assetId;
            this.assetList = builder.assetList;
            this.assetName = builder.assetName;
            this.attCk = builder.attCk;
            this.cloudCode = builder.cloudCode;
            this.incidentUuid = builder.incidentUuid;
            this.logTime = builder.logTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return alertTime
         */
        public Long getAlertTime() {
            return this.alertTime;
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
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return assetList
         */
        public String getAssetList() {
            return this.assetList;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
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
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return logTime
         */
        public String getLogTime() {
            return this.logTime;
        }

        public static final class Builder {
            private String alertLevel; 
            private String alertName; 
            private String alertNameCode; 
            private String alertNameEn; 
            private String alertSrcProd; 
            private String alertSrcProdModule; 
            private Long alertTime; 
            private String alertTitle; 
            private String alertTitleEn; 
            private String alertType; 
            private String alertTypeCode; 
            private String alertTypeEn; 
            private String alertUuid; 
            private String assetId; 
            private String assetList; 
            private String assetName; 
            private String attCk; 
            private String cloudCode; 
            private String incidentUuid; 
            private String logTime; 

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   serious: high
             * *   suspicious: medium
             * *   remind: low
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * The alert name in English.
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
             * The time when the alert was triggered.
             */
            public Builder alertTime(Long alertTime) {
                this.alertTime = alertTime;
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
             * The UUID of the alert
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * The logical ID of the asset.
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
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
             * The name of the asset.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * The tag of the ATT\&CK attack.
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * The cloud code. Valid values:
             * <p>
             * 
             * *   aliyun: Alibaba Cloud
             * *   qcloud: Tencent Cloud
             * *   hcloud: Huawei Cloud
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
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
             * The time when the alert was recorded.
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
