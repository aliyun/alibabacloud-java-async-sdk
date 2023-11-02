// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeliveryResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeliveryResponseBody</p>
 */
public class ListDeliveryResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DyCode")
    private String dyCode;

    @NameInMap("DyMessage")
    private String dyMessage;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDeliveryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dyCode = builder.dyCode;
        this.dyMessage = builder.dyMessage;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeliveryResponseBody create() {
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
     * @return dyCode
     */
    public String getDyCode() {
        return this.dyCode;
    }

    /**
     * @return dyMessage
     */
    public String getDyMessage() {
        return this.dyMessage;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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
        private String dyCode; 
        private String dyMessage; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * DyCode.
         */
        public Builder dyCode(String dyCode) {
            this.dyCode = dyCode;
            return this;
        }

        /**
         * DyMessage.
         */
        public Builder dyMessage(String dyMessage) {
            this.dyMessage = dyMessage;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
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

        public ListDeliveryResponseBody build() {
            return new ListDeliveryResponseBody(this);
        } 

    } 

    public static class ExtraParameters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("CanOperateOrNot")
        private Boolean canOperateOrNot;

        @NameInMap("ExtraParameters")
        private java.util.List < ExtraParameters> extraParameters;

        @NameInMap("LogCode")
        private String logCode;

        @NameInMap("LogName")
        private String logName;

        @NameInMap("LogNameEn")
        private String logNameEn;

        @NameInMap("LogNameKey")
        private String logNameKey;

        @NameInMap("Status")
        private Boolean status;

        @NameInMap("Topic")
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
             * CanOperateOrNot.
             */
            public Builder canOperateOrNot(Boolean canOperateOrNot) {
                this.canOperateOrNot = canOperateOrNot;
                return this;
            }

            /**
             * ExtraParameters.
             */
            public Builder extraParameters(java.util.List < ExtraParameters> extraParameters) {
                this.extraParameters = extraParameters;
                return this;
            }

            /**
             * LogCode.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * LogName.
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * LogNameEn.
             */
            public Builder logNameEn(String logNameEn) {
                this.logNameEn = logNameEn;
                return this;
            }

            /**
             * LogNameKey.
             */
            public Builder logNameKey(String logNameKey) {
                this.logNameKey = logNameKey;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * Topic.
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
        @NameInMap("LogList")
        private java.util.List < LogList> logList;

        @NameInMap("LogMap")
        private java.util.Map < String, java.util.List<DataProductListLogMapValue>> logMap;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductName")
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
             * LogList.
             */
            public Builder logList(java.util.List < LogList> logList) {
                this.logList = logList;
                return this;
            }

            /**
             * LogMap.
             */
            public Builder logMap(java.util.Map < String, java.util.List<DataProductListLogMapValue>> logMap) {
                this.logMap = logMap;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * ProductName.
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
        @NameInMap("DashboardUrl")
        private String dashboardUrl;

        @NameInMap("DisplaySwitchOrNot")
        private Boolean displaySwitchOrNot;

        @NameInMap("LogStoreName")
        private String logStoreName;

        @NameInMap("ProductList")
        private java.util.List < ProductList> productList;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("SearchUrl")
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
             * DashboardUrl.
             */
            public Builder dashboardUrl(String dashboardUrl) {
                this.dashboardUrl = dashboardUrl;
                return this;
            }

            /**
             * DisplaySwitchOrNot.
             */
            public Builder displaySwitchOrNot(Boolean displaySwitchOrNot) {
                this.displaySwitchOrNot = displaySwitchOrNot;
                return this;
            }

            /**
             * LogStoreName.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * ProductList.
             */
            public Builder productList(java.util.List < ProductList> productList) {
                this.productList = productList;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * SearchUrl.
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
