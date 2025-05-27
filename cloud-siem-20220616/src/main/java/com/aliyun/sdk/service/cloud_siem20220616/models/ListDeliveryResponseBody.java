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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDeliveryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-58D4-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeliveryResponseBody build() {
            return new ListDeliveryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeliveryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ExtraParameters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the extended parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>flag</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the extended parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
    /**
     * 
     * {@link ListDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeliveryResponseBody</p>
     */
    public static class LogList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanOperateOrNot")
        private Boolean canOperateOrNot;

        @com.aliyun.core.annotation.NameInMap("ExtraParameters")
        private java.util.List<ExtraParameters> extraParameters;

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
        public java.util.List<ExtraParameters> getExtraParameters() {
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
            private java.util.List<ExtraParameters> extraParameters; 
            private String logCode; 
            private String logName; 
            private String logNameEn; 
            private String logNameKey; 
            private Boolean status; 
            private String topic; 

            private Builder() {
            } 

            private Builder(LogList model) {
                this.canOperateOrNot = model.canOperateOrNot;
                this.extraParameters = model.extraParameters;
                this.logCode = model.logCode;
                this.logName = model.logName;
                this.logNameEn = model.logNameEn;
                this.logNameKey = model.logNameKey;
                this.status = model.status;
                this.topic = model.topic;
            } 

            /**
             * <p>Indicates whether the log delivery feature can be enabled or disabled. The feature can be enabled or disabled only by the administrator of the threat analysis feature. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canOperateOrNot(Boolean canOperateOrNot) {
                this.canOperateOrNot = canOperateOrNot;
                return this;
            }

            /**
             * <p>The extended parameter.</p>
             */
            public Builder extraParameters(java.util.List<ExtraParameters> extraParameters) {
                this.extraParameters = extraParameters;
                return this;
            }

            /**
             * <p>The code of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_config_log</p>
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>audit log</p>
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>audit log</p>
             */
            public Builder logNameEn(String logNameEn) {
                this.logNameEn = logNameEn;
                return this;
            }

            /**
             * <p>The language code of the log that is used to indicate the language in which the log is displayed.</p>
             * 
             * <strong>example:</strong>
             * <p>${sas.cloudsiem.prod.cloud_siem_aegis_crack_from_beaver}</p>
             */
            public Builder logNameKey(String logNameKey) {
                this.logNameKey = logNameKey;
                return this;
            }

            /**
             * <p>The status of the log delivery. Valid values:</p>
             * <ul>
             * <li>true: The logs are being delivered.</li>
             * <li>false: The log delivery feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The topic of the log in the Logstore. The value is an index field in the Logstore that can be used to distinguish different logs.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_login_event</p>
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
    /**
     * 
     * {@link ListDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeliveryResponseBody</p>
     */
    public static class ProductList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogList")
        private java.util.List<LogList> logList;

        @com.aliyun.core.annotation.NameInMap("LogMap")
        private java.util.Map<String, java.util.List<DataProductListLogMapValue>> logMap;

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
        public java.util.List<LogList> getLogList() {
            return this.logList;
        }

        /**
         * @return logMap
         */
        public java.util.Map<String, java.util.List<DataProductListLogMapValue>> getLogMap() {
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
            private java.util.List<LogList> logList; 
            private java.util.Map<String, java.util.List<DataProductListLogMapValue>> logMap; 
            private String productCode; 
            private String productName; 

            private Builder() {
            } 

            private Builder(ProductList model) {
                this.logList = model.logList;
                this.logMap = model.logMap;
                this.productCode = model.productCode;
                this.productName = model.productName;
            } 

            /**
             * <p>The logs of the cloud services.</p>
             */
            public Builder logList(java.util.List<LogList> logList) {
                this.logList = logList;
                return this;
            }

            /**
             * <p>The log group. For example, in Security Center, the logs of hosts and networks are stored in different groups. Key indicates the group information, and value indicates the logs in the group.</p>
             */
            public Builder logMap(java.util.Map<String, java.util.List<DataProductListLogMapValue>> logMap) {
                this.logMap = logMap;
                return this;
            }

            /**
             * <p>The code of the cloud service. Valid values:</p>
             * <ul>
             * <li>qcloud_waf</li>
             * <li>qlcoud_cfw</li>
             * <li>hcloud_waf</li>
             * <li>hcloud_cfw</li>
             * <li>ddos</li>
             * <li>sas</li>
             * <li>cfw</li>
             * <li>config</li>
             * <li>csk</li>
             * <li>fc</li>
             * <li>rds</li>
             * <li>nas</li>
             * <li>apigateway</li>
             * <li>cdn</li>
             * <li>mongodb</li>
             * <li>eip</li>
             * <li>slb</li>
             * <li>vpc</li>
             * <li>actiontrail</li>
             * <li>waf</li>
             * <li>bastionhost</li>
             * <li>oss</li>
             * <li>polardb</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Security Center</p>
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
    /**
     * 
     * {@link ListDeliveryResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeliveryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DashboardUrl")
        private String dashboardUrl;

        @com.aliyun.core.annotation.NameInMap("DisplaySwitchOrNot")
        private Boolean displaySwitchOrNot;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProductList")
        private java.util.List<ProductList> productList;

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
        public java.util.List<ProductList> getProductList() {
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
            private java.util.List<ProductList> productList; 
            private String projectName; 
            private String searchUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dashboardUrl = model.dashboardUrl;
                this.displaySwitchOrNot = model.displaySwitchOrNot;
                this.logStoreName = model.logStoreName;
                this.productList = model.productList;
                this.projectName = model.projectName;
                this.searchUrl = model.searchUrl;
            } 

            /**
             * <p>The URL that is displayed in charts.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai">https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai</a>
             * /dashboard/cloud-siem?isShare=true&amp;hideTopbar=true&amp;hideSidebar=true&amp;ignoreTabLocalStorage=true</p>
             */
            public Builder dashboardUrl(String dashboardUrl) {
                this.dashboardUrl = dashboardUrl;
                return this;
            }

            /**
             * <p>Indicates whether the log delivery switch is displayed. Default value: true. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder displaySwitchOrNot(Boolean displaySwitchOrNot) {
                this.displaySwitchOrNot = displaySwitchOrNot;
                return this;
            }

            /**
             * <p>The name of the Logstore for the threat analysis feature on the user side. The value is in the cloud_siem format.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud-siem</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The cloud services.</p>
             */
            public Builder productList(java.util.List<ProductList> productList) {
                this.productList = productList;
                return this;
            }

            /**
             * <p>The name of the project for the threat analysis feature in Simple Log service on the user side. The value is in the aliyun-cloudsiem-data-${aliUid}-${region} format.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-cloudsiem-data-127608589417****-cn-shanghai</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The URL that is used for log analysis.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai">https://sls4service.console.aliyun.com/lognext/project/aliyun-cloudsiem-data-127608589417****-cn-shanghai</a>
             * /logsearch/cloud-siem?isShare=true&amp;hideTopbar=true&amp;hideSidebar=true&amp;ignoreTabLocalStorage=true</p>
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
