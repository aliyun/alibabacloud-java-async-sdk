// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderLogisticsWithDesignatedTbUidResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderLogisticsWithDesignatedTbUidResponseBody</p>
 */
public class QueryOrderLogisticsWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("LogsId")
    private String logsId;

    @NameInMap("Message")
    private String message;

    @NameInMap("Model")
    private java.util.List < Model> model;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubCode")
    private String subCode;

    @NameInMap("SubMessage")
    private String subMessage;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private QueryOrderLogisticsWithDesignatedTbUidResponseBody(Builder builder) {
        this.code = builder.code;
        this.logsId = builder.logsId;
        this.message = builder.message;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.subCode = builder.subCode;
        this.subMessage = builder.subMessage;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderLogisticsWithDesignatedTbUidResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return logsId
     */
    public String getLogsId() {
        return this.logsId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return model
     */
    public java.util.List < Model> getModel() {
        return this.model;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subCode
     */
    public String getSubCode() {
        return this.subCode;
    }

    /**
     * @return subMessage
     */
    public String getSubMessage() {
        return this.subMessage;
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

    public static final class Builder {
        private String code; 
        private String logsId; 
        private String message; 
        private java.util.List < Model> model; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private String subCode; 
        private String subMessage; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LogsId.
         */
        public Builder logsId(String logsId) {
            this.logsId = logsId;
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
         * Model.
         */
        public Builder model(java.util.List < Model> model) {
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Long pageSize) {
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
         * SubCode.
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * SubMessage.
         */
        public Builder subMessage(String subMessage) {
            this.subMessage = subMessage;
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

        public QueryOrderLogisticsWithDesignatedTbUidResponseBody build() {
            return new QueryOrderLogisticsWithDesignatedTbUidResponseBody(this);
        } 

    } 

    public static class Fetcher extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ZipCode")
        private String zipCode;

        private Fetcher(Builder builder) {
            this.address = builder.address;
            this.name = builder.name;
            this.phoneNumber = builder.phoneNumber;
            this.requestId = builder.requestId;
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
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
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
            private String requestId; 
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
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
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
    public static class LogisticsDetailList extends TeaModel {
        @NameInMap("OcurrTimeStr")
        private String ocurrTimeStr;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("StanderdDesc")
        private String standerdDesc;

        @NameInMap("StatusIcon")
        private String statusIcon;

        private LogisticsDetailList(Builder builder) {
            this.ocurrTimeStr = builder.ocurrTimeStr;
            this.requestId = builder.requestId;
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
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
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
            private String requestId; 
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
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
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
    public static class PackageGoodItems extends TeaModel {
        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("LmItemId")
        private String lmItemId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Quantity")
        private Integer quantity;

        private PackageGoodItems(Builder builder) {
            this.itemId = builder.itemId;
            this.lmItemId = builder.lmItemId;
            this.name = builder.name;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageGoodItems create() {
            return builder().build();
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return lmItemId
         */
        public String getLmItemId() {
            return this.lmItemId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private Long itemId; 
            private String lmItemId; 
            private String name; 
            private Integer quantity; 

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * LmItemId.
             */
            public Builder lmItemId(String lmItemId) {
                this.lmItemId = lmItemId;
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
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            public PackageGoodItems build() {
                return new PackageGoodItems(this);
            } 

        } 

    }
    public static class Receiver extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ZipCode")
        private String zipCode;

        private Receiver(Builder builder) {
            this.address = builder.address;
            this.name = builder.name;
            this.phoneNumber = builder.phoneNumber;
            this.requestId = builder.requestId;
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
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
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
            private String requestId; 
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
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
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
    public static class Model extends TeaModel {
        @NameInMap("DataProvider")
        private String dataProvider;

        @NameInMap("DataProviderTitle")
        private String dataProviderTitle;

        @NameInMap("Fetcher")
        private Fetcher fetcher;

        @NameInMap("LogisticsCompanyCode")
        private String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        private String logisticsCompanyName;

        @NameInMap("LogisticsDetailList")
        private java.util.List < LogisticsDetailList> logisticsDetailList;

        @NameInMap("MailNo")
        private String mailNo;

        @NameInMap("PackageGoodItems")
        private java.util.List < PackageGoodItems> packageGoodItems;

        @NameInMap("Receiver")
        private Receiver receiver;

        @NameInMap("RequestId")
        private String requestId;

        private Model(Builder builder) {
            this.dataProvider = builder.dataProvider;
            this.dataProviderTitle = builder.dataProviderTitle;
            this.fetcher = builder.fetcher;
            this.logisticsCompanyCode = builder.logisticsCompanyCode;
            this.logisticsCompanyName = builder.logisticsCompanyName;
            this.logisticsDetailList = builder.logisticsDetailList;
            this.mailNo = builder.mailNo;
            this.packageGoodItems = builder.packageGoodItems;
            this.receiver = builder.receiver;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
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
        public java.util.List < LogisticsDetailList> getLogisticsDetailList() {
            return this.logisticsDetailList;
        }

        /**
         * @return mailNo
         */
        public String getMailNo() {
            return this.mailNo;
        }

        /**
         * @return packageGoodItems
         */
        public java.util.List < PackageGoodItems> getPackageGoodItems() {
            return this.packageGoodItems;
        }

        /**
         * @return receiver
         */
        public Receiver getReceiver() {
            return this.receiver;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String dataProvider; 
            private String dataProviderTitle; 
            private Fetcher fetcher; 
            private String logisticsCompanyCode; 
            private String logisticsCompanyName; 
            private java.util.List < LogisticsDetailList> logisticsDetailList; 
            private String mailNo; 
            private java.util.List < PackageGoodItems> packageGoodItems; 
            private Receiver receiver; 
            private String requestId; 

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
            public Builder logisticsDetailList(java.util.List < LogisticsDetailList> logisticsDetailList) {
                this.logisticsDetailList = logisticsDetailList;
                return this;
            }

            /**
             * MailNo.
             */
            public Builder mailNo(String mailNo) {
                this.mailNo = mailNo;
                return this;
            }

            /**
             * PackageGoodItems.
             */
            public Builder packageGoodItems(java.util.List < PackageGoodItems> packageGoodItems) {
                this.packageGoodItems = packageGoodItems;
                return this;
            }

            /**
             * Receiver.
             */
            public Builder receiver(Receiver receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
