// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBillToOSSSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBillToOSSSubscriptionResponseBody</p>
 */
public class QueryBillToOSSSubscriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryBillToOSSSubscriptionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBillToOSSSubscriptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryBillToOSSSubscriptionResponseBody build() {
            return new QueryBillToOSSSubscriptionResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("BucketOwnerId")
        private Long bucketOwnerId;

        @NameInMap("BucketPath")
        private String bucketPath;

        @NameInMap("RowLimitPerFile")
        private Integer rowLimitPerFile;

        @NameInMap("SubscribeBucket")
        private String subscribeBucket;

        @NameInMap("SubscribeLanguage")
        private String subscribeLanguage;

        @NameInMap("SubscribeTime")
        private String subscribeTime;

        @NameInMap("SubscribeType")
        private String subscribeType;

        private Item(Builder builder) {
            this.bucketOwnerId = builder.bucketOwnerId;
            this.bucketPath = builder.bucketPath;
            this.rowLimitPerFile = builder.rowLimitPerFile;
            this.subscribeBucket = builder.subscribeBucket;
            this.subscribeLanguage = builder.subscribeLanguage;
            this.subscribeTime = builder.subscribeTime;
            this.subscribeType = builder.subscribeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return bucketOwnerId
         */
        public Long getBucketOwnerId() {
            return this.bucketOwnerId;
        }

        /**
         * @return bucketPath
         */
        public String getBucketPath() {
            return this.bucketPath;
        }

        /**
         * @return rowLimitPerFile
         */
        public Integer getRowLimitPerFile() {
            return this.rowLimitPerFile;
        }

        /**
         * @return subscribeBucket
         */
        public String getSubscribeBucket() {
            return this.subscribeBucket;
        }

        /**
         * @return subscribeLanguage
         */
        public String getSubscribeLanguage() {
            return this.subscribeLanguage;
        }

        /**
         * @return subscribeTime
         */
        public String getSubscribeTime() {
            return this.subscribeTime;
        }

        /**
         * @return subscribeType
         */
        public String getSubscribeType() {
            return this.subscribeType;
        }

        public static final class Builder {
            private Long bucketOwnerId; 
            private String bucketPath; 
            private Integer rowLimitPerFile; 
            private String subscribeBucket; 
            private String subscribeLanguage; 
            private String subscribeTime; 
            private String subscribeType; 

            /**
             * The owner ID of the Object Storage Service (OSS) bucket.
             */
            public Builder bucketOwnerId(Long bucketOwnerId) {
                this.bucketOwnerId = bucketOwnerId;
                return this;
            }

            /**
             * The path in the OSS bucket.
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * The maximum number of data rows in a single file. If the number of data rows in a bill exceeds the upper limit, the bill is split into multiple files. Then, multiple files are merged and compressed into a package.
             */
            public Builder rowLimitPerFile(Integer rowLimitPerFile) {
                this.rowLimitPerFile = rowLimitPerFile;
                return this;
            }

            /**
             * The ID of the OSS bucket that stores the subscribed bill.
             */
            public Builder subscribeBucket(String subscribeBucket) {
                this.subscribeBucket = subscribeBucket;
                return this;
            }

            /**
             * The code of the language.
             * <p>
             * 
             * Valid values:
             * 
             * *   en: English
             * *   zh: Chinese
             */
            public Builder subscribeLanguage(String subscribeLanguage) {
                this.subscribeLanguage = subscribeLanguage;
                return this;
            }

            /**
             * The time when the subscribed bill was stored in the OSS bucket. The time is displayed in the YYYY-MM-DD hh:mm:ss format.
             */
            public Builder subscribeTime(String subscribeTime) {
                this.subscribeTime = subscribeTime;
                return this;
            }

            /**
             * The type of the subscribed bill. Valid values:
             * <p>
             * 
             * *   BillingItemDetailForBillingPeriod: the bill of a billable item.
             * *   InstanceDetailForBillingPeriod: the bill of an instance.
             */
            public Builder subscribeType(String subscribeType) {
                this.subscribeType = subscribeType;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AccountID")
        private String accountID;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("Items")
        private Items items;

        private Data(Builder builder) {
            this.accountID = builder.accountID;
            this.accountName = builder.accountName;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountID
         */
        public String getAccountID() {
            return this.accountID;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return items
         */
        public Items getItems() {
            return this.items;
        }

        public static final class Builder {
            private String accountID; 
            private String accountName; 
            private Items items; 

            /**
             * The ID of the account used to perform the query.
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * The name of the account used to perform the query.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The details of the subscribed bill.
             */
            public Builder items(Items items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
