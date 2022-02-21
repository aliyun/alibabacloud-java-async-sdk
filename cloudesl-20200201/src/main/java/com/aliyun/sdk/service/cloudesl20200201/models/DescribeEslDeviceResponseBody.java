// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEslDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEslDeviceResponseBody</p>
 */
public class DescribeEslDeviceResponseBody extends TeaModel {
    @NameInMap("EslDetails")
    private java.util.List < EslDetails> eslDetails;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeEslDeviceResponseBody(Builder builder) {
        this.eslDetails = builder.eslDetails;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEslDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return eslDetails
     */
    public java.util.List < EslDetails> getEslDetails() {
        return this.eslDetails;
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
        private java.util.List < EslDetails> eslDetails; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * EslDetails.
         */
        public Builder eslDetails(java.util.List < EslDetails> eslDetails) {
            this.eslDetails = eslDetails;
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
         * PageSize.
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

        public DescribeEslDeviceResponseBody build() {
            return new DescribeEslDeviceResponseBody(this);
        } 

    } 

    public static class EslDetails extends TeaModel {
        @NameInMap("EslBarCode")
        private String eslBarCode;

        @NameInMap("ItemBarCode")
        private Long itemBarCode;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ItemShortTitle")
        private String itemShortTitle;

        @NameInMap("LastUpdateTime")
        private String lastUpdateTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("StoreId")
        private String storeId;

        private EslDetails(Builder builder) {
            this.eslBarCode = builder.eslBarCode;
            this.itemBarCode = builder.itemBarCode;
            this.itemId = builder.itemId;
            this.itemShortTitle = builder.itemShortTitle;
            this.lastUpdateTime = builder.lastUpdateTime;
            this.status = builder.status;
            this.storeId = builder.storeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EslDetails create() {
            return builder().build();
        }

        /**
         * @return eslBarCode
         */
        public String getEslBarCode() {
            return this.eslBarCode;
        }

        /**
         * @return itemBarCode
         */
        public Long getItemBarCode() {
            return this.itemBarCode;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemShortTitle
         */
        public String getItemShortTitle() {
            return this.itemShortTitle;
        }

        /**
         * @return lastUpdateTime
         */
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        public static final class Builder {
            private String eslBarCode; 
            private Long itemBarCode; 
            private Long itemId; 
            private String itemShortTitle; 
            private String lastUpdateTime; 
            private String status; 
            private String storeId; 

            /**
             * EslBarCode.
             */
            public Builder eslBarCode(String eslBarCode) {
                this.eslBarCode = eslBarCode;
                return this;
            }

            /**
             * ItemBarCode.
             */
            public Builder itemBarCode(Long itemBarCode) {
                this.itemBarCode = itemBarCode;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ItemShortTitle.
             */
            public Builder itemShortTitle(String itemShortTitle) {
                this.itemShortTitle = itemShortTitle;
                return this;
            }

            /**
             * LastUpdateTime.
             */
            public Builder lastUpdateTime(String lastUpdateTime) {
                this.lastUpdateTime = lastUpdateTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            public EslDetails build() {
                return new EslDetails(this);
            } 

        } 

    }
}
