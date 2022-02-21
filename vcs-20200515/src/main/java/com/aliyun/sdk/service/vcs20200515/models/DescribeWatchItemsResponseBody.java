// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWatchItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWatchItemsResponseBody</p>
 */
public class DescribeWatchItemsResponseBody extends TeaModel {
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

    private DescribeWatchItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWatchItemsResponseBody create() {
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
         * Code.
         */
        public Builder code(String code) {
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
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

        public DescribeWatchItemsResponseBody build() {
            return new DescribeWatchItemsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("ItemAttributes")
        private String itemAttributes;

        @NameInMap("ItemImageUrl")
        private String itemImageUrl;

        @NameInMap("WatchItemId")
        private String watchItemId;

        @NameInMap("WatchItemName")
        private String watchItemName;

        private Records(Builder builder) {
            this.itemAttributes = builder.itemAttributes;
            this.itemImageUrl = builder.itemImageUrl;
            this.watchItemId = builder.watchItemId;
            this.watchItemName = builder.watchItemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return itemAttributes
         */
        public String getItemAttributes() {
            return this.itemAttributes;
        }

        /**
         * @return itemImageUrl
         */
        public String getItemImageUrl() {
            return this.itemImageUrl;
        }

        /**
         * @return watchItemId
         */
        public String getWatchItemId() {
            return this.watchItemId;
        }

        /**
         * @return watchItemName
         */
        public String getWatchItemName() {
            return this.watchItemName;
        }

        public static final class Builder {
            private String itemAttributes; 
            private String itemImageUrl; 
            private String watchItemId; 
            private String watchItemName; 

            /**
             * ItemAttributes.
             */
            public Builder itemAttributes(String itemAttributes) {
                this.itemAttributes = itemAttributes;
                return this;
            }

            /**
             * ItemImageUrl.
             */
            public Builder itemImageUrl(String itemImageUrl) {
                this.itemImageUrl = itemImageUrl;
                return this;
            }

            /**
             * WatchItemId.
             */
            public Builder watchItemId(String watchItemId) {
                this.watchItemId = watchItemId;
                return this;
            }

            /**
             * WatchItemName.
             */
            public Builder watchItemName(String watchItemName) {
                this.watchItemName = watchItemName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
