// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryBillToOSSSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryBillToOSSSubscriptionResponseBody</p>
 */
public class QueryBillToOSSSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful!</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9EEAE43F-1E4D-4734-AE93-5049878AC103</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryBillToOSSSubscriptionResponseBody build() {
            return new QueryBillToOSSSubscriptionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryBillToOSSSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBillToOSSSubscriptionResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketOwnerId")
        private Long bucketOwnerId;

        @com.aliyun.core.annotation.NameInMap("BucketPath")
        private String bucketPath;

        @com.aliyun.core.annotation.NameInMap("RowLimitPerFile")
        private Integer rowLimitPerFile;

        @com.aliyun.core.annotation.NameInMap("SubscribeBucket")
        private String subscribeBucket;

        @com.aliyun.core.annotation.NameInMap("SubscribeLanguage")
        private String subscribeLanguage;

        @com.aliyun.core.annotation.NameInMap("SubscribeTime")
        private String subscribeTime;

        @com.aliyun.core.annotation.NameInMap("SubscribeType")
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
             * <p>The owner ID of the Object Storage Service (OSS) bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>1369168081849304</p>
             */
            public Builder bucketOwnerId(Long bucketOwnerId) {
                this.bucketOwnerId = bucketOwnerId;
                return this;
            }

            /**
             * <p>The path in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>Billing/BillingItemDetailMonthly/</p>
             */
            public Builder bucketPath(String bucketPath) {
                this.bucketPath = bucketPath;
                return this;
            }

            /**
             * <p>The maximum number of data rows in a single file. If the number of data rows in a bill exceeds the upper limit, the bill is split into multiple files. Then, multiple files are merged and compressed into a package.</p>
             * 
             * <strong>example:</strong>
             * <p>300000</p>
             */
            public Builder rowLimitPerFile(Integer rowLimitPerFile) {
                this.rowLimitPerFile = rowLimitPerFile;
                return this;
            }

            /**
             * <p>The ID of the OSS bucket that stores the subscribed bill.</p>
             * 
             * <strong>example:</strong>
             * <p>billingtestbucket</p>
             */
            public Builder subscribeBucket(String subscribeBucket) {
                this.subscribeBucket = subscribeBucket;
                return this;
            }

            /**
             * <p>The code of the language.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>en: English</li>
             * <li>zh: Chinese</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder subscribeLanguage(String subscribeLanguage) {
                this.subscribeLanguage = subscribeLanguage;
                return this;
            }

            /**
             * <p>The time when the subscribed bill was stored in the OSS bucket. The time is displayed in the YYYY-MM-DD hh:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-30 15:40:11</p>
             */
            public Builder subscribeTime(String subscribeTime) {
                this.subscribeTime = subscribeTime;
                return this;
            }

            /**
             * <p>The type of the subscribed bill. Valid values:</p>
             * <ul>
             * <li>BillingItemDetailForBillingPeriod: the bill of a billable item.</li>
             * <li>InstanceDetailForBillingPeriod: the bill of an instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BillingItemDetailForBillingPeriod</p>
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
    /**
     * 
     * {@link QueryBillToOSSSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBillToOSSSubscriptionResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
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
    /**
     * 
     * {@link QueryBillToOSSSubscriptionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryBillToOSSSubscriptionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountID")
        private String accountID;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Items")
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
             * <p>The ID of the account used to perform the query.</p>
             * 
             * <strong>example:</strong>
             * <p>185xxxxx03489</p>
             */
            public Builder accountID(String accountID) {
                this.accountID = accountID;
                return this;
            }

            /**
             * <p>The name of the account used to perform the query.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyunid.com">test@test.aliyunid.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The details of the subscribed bill.</p>
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
