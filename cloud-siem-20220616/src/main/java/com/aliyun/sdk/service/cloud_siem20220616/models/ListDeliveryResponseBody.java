// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeliveryResponseBody</p>
 */
public class ListDeliveryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDeliveryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeliveryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeliveryResponseBody build() {
            return new ListDeliveryResponseBody(this);
        } 

    } 

    public static class ExtraParameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ExtraParameters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraParameters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The ID of the extended parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the extended parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExtraParameters build() {
                return new ExtraParameters(this);
            } 

        } 

    }
    public static class LogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanOperateOrNot")
        private Boolean canOperateOrNot;

        @com.aliyun.core.annotation.NameInMap("ExtraParameters")
        private java.util.List < ExtraParameters> extraParameters;

        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        @com.aliyun.core.annotation.NameInMap("LogName")
        private String logName;

        @com.aliyun.core.annotation.NameInMap("LogNameEn")
        private String logNameEn;

        @com.aliyun.core.annotation.NameInMap("LogNameKey")
        private String logNameKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private LogList(Builder builder) {
            this.canOperateOrNot = builder.canOperateOrNot;
            this.extraParameters = builder.extraParameters;
            this.logCode = builder.logCode;
            this.logName = builder.logName;
            this.logNameEn = builder.logNameEn;
            this.logNameKey = builder.logNameKey;
            this.status = builder.status;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogList create() {
            return builder().build();
        }

        /**
         * @return canOperateOrNot
         */
        public Boolean getCanOperateOrNot() {
            return this.canOperateOrNot;
        }

        /**
         * @return extraParameters
         */
        public java.util.List < ExtraParameters> getExtraParameters() {
            return this.extraParameters;
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return logName
         */
        public String getLogName() {
            return this.logName;
        }

        /**
         * @return logNameEn
         */
        public String getLogNameEn() {
            return this.logNameEn;
        }

        /**
         * @return logNameKey
         */
        public String getLogNameKey() {
            return this.logNameKey;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private Boolean canOperateOrNot; 
            private java.util.List < ExtraParameters> extraParameters; 
            private String logCode; 
            private String logName; 
            private String logNameEn; 
            private String logNameKey; 
            private Boolean status; 
            private String topic; 

            /**
             * Indicates whether the log delivery feature can be enabled or disabled. The feature can be enabled or disabled only by the administrator of the threat analysis feature. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder canOperateOrNot(Boolean canOperateOrNot) {
                this.canOperateOrNot = canOperateOrNot;
                return this;
            }

            /**
             * The extended parameter.
             */
            public Builder extraParameters(java.util.List < ExtraParameters> extraParameters) {
                this.extraParameters = extraParameters;
                return this;
            }

            /**
             * The code of the log.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder logNameEn(String logNameEn) {
                this.logNameEn = logNameEn;
                return this;
            }

            /**
             * The language code of the log that is used to indicate the language in which the log is displayed.
             */
            public Builder logNameKey(String logNameKey) {
                this.logNameKey = logNameKey;
                return this;
            }

            /**
             * The status of the log delivery. Valid values:
             * <p>
             * 
             * *   true: The logs are being delivered.
             * *   false: The log delivery feature is disabled.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * The topic of the log in the Logstore. The value is an index field in the Logstore that can be used to distinguish different logs.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public LogList build() {
                return new LogList(this);
            } 

        } 

    }
    public static class ProductList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogList")
        private java.util.List < LogList> logList;

        @com.aliyun.core.annotation.NameInMap("LogMap")
        private java.util.Map < String, java.util.List<DataProductListLogMapValue>> logMap;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        private ProductList(Builder builder) {
            this.logList = builder.logList;
            this.logMap = builder.logMap;
            this.productCode = builder.productCode;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductList create() {
            return builder().build();
        }

        /**
         * @return logList
         */
        public java.util.List < LogList> getLogList() {
            return this.logList;
        }

        /**
         * @return logMap
         */
        public java.util.Map < String, java.util.List<DataProductListLogMapValue>> getLogMap() {
            return this.logMap;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private java.util.List < LogList> logList; 
            private java.util.Map < String, java.util.List<DataProductListLogMapValue>> logMap; 
            private String productCode; 
            private String productName; 

            /**
             * The logs of the cloud services.
             */
            public Builder logList(java.util.List < LogList> logList) {
                this.logList = logList;
                return this;
            }

            /**
             * The log group. For example, in Security Center, the logs of hosts and networks are stored in different groups. Key indicates the group information, and value indicates the logs in the group.
             */
            public Builder logMap(java.util.Map < String, java.util.List<DataProductListLogMapValue>> logMap) {
                this.logMap = logMap;
                return this;
            }

            /**
             * The code of the cloud service. Valid values:
             * <p>
             * 
             * *   qcloud_waf
             * *   qlcoud_cfw
             * *   hcloud_waf
             * *   hcloud_cfw
             * *   ddos
             * *   sas
             * *   cfw
             * *   config
             * *   csk
             * *   fc
             * *   rds
             * *   nas
             * *   apigateway
             * *   cdn
             * *   mongodb
             * *   eip
             * *   slb
             * *   vpc
             * *   actiontrail
             * *   waf
             * *   bastionhost
             * *   oss
             * *   polardb
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public ProductList build() {
                return new ProductList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardUrl")
        private String dashboardUrl;

        @com.aliyun.core.annotation.NameInMap("DisplaySwitchOrNot")
        private Boolean displaySwitchOrNot;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProductList")
        private java.util.List < ProductList> productList;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SearchUrl")
        private String searchUrl;

        private Data(Builder builder) {
            this.dashboardUrl = builder.dashboardUrl;
            this.displaySwitchOrNot = builder.displaySwitchOrNot;
            this.logStoreName = builder.logStoreName;
            this.productList = builder.productList;
            this.projectName = builder.projectName;
            this.searchUrl = builder.searchUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dashboardUrl
         */
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        /**
         * @return displaySwitchOrNot
         */
        public Boolean getDisplaySwitchOrNot() {
            return this.displaySwitchOrNot;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return productList
         */
        public java.util.List < ProductList> getProductList() {
            return this.productList;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return searchUrl
         */
        public String getSearchUrl() {
            return this.searchUrl;
        }

        public static final class Builder {
            private String dashboardUrl; 
            private Boolean displaySwitchOrNot; 
            private String logStoreName; 
            private java.util.List < ProductList> productList; 
            private String projectName; 
            private String searchUrl; 

            /**
             * The URL that is displayed in charts.
             */
            public Builder dashboardUrl(String dashboardUrl) {
                this.dashboardUrl = dashboardUrl;
                return this;
            }

            /**
             * Indicates whether the log delivery switch is displayed. Default value: true. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder displaySwitchOrNot(Boolean displaySwitchOrNot) {
                this.displaySwitchOrNot = displaySwitchOrNot;
                return this;
            }

            /**
             * The name of the Logstore for the threat analysis feature on the user side. The value is in the cloud_siem format.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * The cloud services.
             */
            public Builder productList(java.util.List < ProductList> productList) {
                this.productList = productList;
                return this;
            }

            /**
             * The name of the project for the threat analysis feature in Simple Log service on the user side. The value is in the aliyun-cloudsiem-data-${aliUid}-${region} format.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The URL that is used for log analysis.
             */
            public Builder searchUrl(String searchUrl) {
                this.searchUrl = searchUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
