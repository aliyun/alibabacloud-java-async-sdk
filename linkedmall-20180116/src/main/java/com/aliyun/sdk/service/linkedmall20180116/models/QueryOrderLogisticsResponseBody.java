// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link QueryOrderLogisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderLogisticsResponseBody</p>
 */
public class QueryOrderLogisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OrderLogistics")
    private OrderLogistics orderLogistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryOrderLogisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.orderLogistics = builder.orderLogistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderLogisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return orderLogistics
     */
    public OrderLogistics getOrderLogistics() {
        return this.orderLogistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private OrderLogistics orderLogistics; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * OrderLogistics.
         */
        public Builder orderLogistics(OrderLogistics orderLogistics) {
            this.orderLogistics = orderLogistics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryOrderLogisticsResponseBody build() {
            return new QueryOrderLogisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOrderLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderLogisticsResponseBody</p>
     */
    public static class Fetcher extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ZipCode")
        private String zipCode;

        private Fetcher(Builder builder) {
            this.address = builder.address;
            this.name = builder.name;
            this.phoneNumber = builder.phoneNumber;
            this.zipCode = builder.zipCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fetcher create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return zipCode
         */
        public String getZipCode() {
            return this.zipCode;
        }

        public static final class Builder {
            private String address; 
            private String name; 
            private String phoneNumber; 
            private String zipCode; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
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
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * ZipCode.
             */
            public Builder zipCode(String zipCode) {
                this.zipCode = zipCode;
                return this;
            }

            public Fetcher build() {
                return new Fetcher(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderLogisticsResponseBody</p>
     */
    public static class LogisticsDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OcurrTimeStr")
        private String ocurrTimeStr;

        @com.aliyun.core.annotation.NameInMap("StanderdDesc")
        private String standerdDesc;

        @com.aliyun.core.annotation.NameInMap("StatusIcon")
        private String statusIcon;

        private LogisticsDetailList(Builder builder) {
            this.ocurrTimeStr = builder.ocurrTimeStr;
            this.standerdDesc = builder.standerdDesc;
            this.statusIcon = builder.statusIcon;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogisticsDetailList create() {
            return builder().build();
        }

        /**
         * @return ocurrTimeStr
         */
        public String getOcurrTimeStr() {
            return this.ocurrTimeStr;
        }

        /**
         * @return standerdDesc
         */
        public String getStanderdDesc() {
            return this.standerdDesc;
        }

        /**
         * @return statusIcon
         */
        public String getStatusIcon() {
            return this.statusIcon;
        }

        public static final class Builder {
            private String ocurrTimeStr; 
            private String standerdDesc; 
            private String statusIcon; 

            /**
             * OcurrTimeStr.
             */
            public Builder ocurrTimeStr(String ocurrTimeStr) {
                this.ocurrTimeStr = ocurrTimeStr;
                return this;
            }

            /**
             * StanderdDesc.
             */
            public Builder standerdDesc(String standerdDesc) {
                this.standerdDesc = standerdDesc;
                return this;
            }

            /**
             * StatusIcon.
             */
            public Builder statusIcon(String statusIcon) {
                this.statusIcon = statusIcon;
                return this;
            }

            public LogisticsDetailList build() {
                return new LogisticsDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderLogisticsResponseBody</p>
     */
    public static class OrderLogisticsLogisticsDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogisticsDetailList")
        private java.util.List<LogisticsDetailList> logisticsDetailList;

        private OrderLogisticsLogisticsDetailList(Builder builder) {
            this.logisticsDetailList = builder.logisticsDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderLogisticsLogisticsDetailList create() {
            return builder().build();
        }

        /**
         * @return logisticsDetailList
         */
        public java.util.List<LogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        public static final class Builder {
            private java.util.List<LogisticsDetailList> logisticsDetailList; 

            /**
             * LogisticsDetailList.
             */
            public Builder logisticsDetailList(java.util.List<LogisticsDetailList> logisticsDetailList) {
                this.logisticsDetailList = logisticsDetailList;
                return this;
            }

            public OrderLogisticsLogisticsDetailList build() {
                return new OrderLogisticsLogisticsDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderLogisticsResponseBody</p>
     */
    public static class Receiver extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("ZipCode")
        private String zipCode;

        private Receiver(Builder builder) {
            this.address = builder.address;
            this.name = builder.name;
            this.phoneNumber = builder.phoneNumber;
            this.zipCode = builder.zipCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receiver create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return zipCode
         */
        public String getZipCode() {
            return this.zipCode;
        }

        public static final class Builder {
            private String address; 
            private String name; 
            private String phoneNumber; 
            private String zipCode; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
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
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * ZipCode.
             */
            public Builder zipCode(String zipCode) {
                this.zipCode = zipCode;
                return this;
            }

            public Receiver build() {
                return new Receiver(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOrderLogisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOrderLogisticsResponseBody</p>
     */
    public static class OrderLogistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataProvider")
        private String dataProvider;

        @com.aliyun.core.annotation.NameInMap("DataProviderTitle")
        private String dataProviderTitle;

        @com.aliyun.core.annotation.NameInMap("Fetcher")
        private Fetcher fetcher;

        @com.aliyun.core.annotation.NameInMap("LogisticsCompanyCode")
        private String logisticsCompanyCode;

        @com.aliyun.core.annotation.NameInMap("LogisticsCompanyName")
        private String logisticsCompanyName;

        @com.aliyun.core.annotation.NameInMap("LogisticsDetailList")
        private OrderLogisticsLogisticsDetailList logisticsDetailList;

        @com.aliyun.core.annotation.NameInMap("Receiver")
        private Receiver receiver;

        private OrderLogistics(Builder builder) {
            this.dataProvider = builder.dataProvider;
            this.dataProviderTitle = builder.dataProviderTitle;
            this.fetcher = builder.fetcher;
            this.logisticsCompanyCode = builder.logisticsCompanyCode;
            this.logisticsCompanyName = builder.logisticsCompanyName;
            this.logisticsDetailList = builder.logisticsDetailList;
            this.receiver = builder.receiver;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderLogistics create() {
            return builder().build();
        }

        /**
         * @return dataProvider
         */
        public String getDataProvider() {
            return this.dataProvider;
        }

        /**
         * @return dataProviderTitle
         */
        public String getDataProviderTitle() {
            return this.dataProviderTitle;
        }

        /**
         * @return fetcher
         */
        public Fetcher getFetcher() {
            return this.fetcher;
        }

        /**
         * @return logisticsCompanyCode
         */
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        /**
         * @return logisticsCompanyName
         */
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        /**
         * @return logisticsDetailList
         */
        public OrderLogisticsLogisticsDetailList getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        /**
         * @return receiver
         */
        public Receiver getReceiver() {
            return this.receiver;
        }

        public static final class Builder {
            private String dataProvider; 
            private String dataProviderTitle; 
            private Fetcher fetcher; 
            private String logisticsCompanyCode; 
            private String logisticsCompanyName; 
            private OrderLogisticsLogisticsDetailList logisticsDetailList; 
            private Receiver receiver; 

            /**
             * DataProvider.
             */
            public Builder dataProvider(String dataProvider) {
                this.dataProvider = dataProvider;
                return this;
            }

            /**
             * DataProviderTitle.
             */
            public Builder dataProviderTitle(String dataProviderTitle) {
                this.dataProviderTitle = dataProviderTitle;
                return this;
            }

            /**
             * Fetcher.
             */
            public Builder fetcher(Fetcher fetcher) {
                this.fetcher = fetcher;
                return this;
            }

            /**
             * LogisticsCompanyCode.
             */
            public Builder logisticsCompanyCode(String logisticsCompanyCode) {
                this.logisticsCompanyCode = logisticsCompanyCode;
                return this;
            }

            /**
             * LogisticsCompanyName.
             */
            public Builder logisticsCompanyName(String logisticsCompanyName) {
                this.logisticsCompanyName = logisticsCompanyName;
                return this;
            }

            /**
             * LogisticsDetailList.
             */
            public Builder logisticsDetailList(OrderLogisticsLogisticsDetailList logisticsDetailList) {
                this.logisticsDetailList = logisticsDetailList;
                return this;
            }

            /**
             * Receiver.
             */
            public Builder receiver(Receiver receiver) {
                this.receiver = receiver;
                return this;
            }

            public OrderLogistics build() {
                return new OrderLogistics(this);
            } 

        } 

    }
}
