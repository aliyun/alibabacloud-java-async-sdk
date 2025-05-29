// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link QueryProductQuotaPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductQuotaPageResponseBody</p>
 */
public class QueryProductQuotaPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private QueryProductQuotaPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductQuotaPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(QueryProductQuotaPageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>32B81CD6-D583-5056-A6EB-3C1107AB26C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QueryProductQuotaPageResponseBody build() {
            return new QueryProductQuotaPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProductQuotaPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductQuotaPageResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("durationType")
        private Integer durationType;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ifUnsubscribe")
        private Integer ifUnsubscribe;

        @com.aliyun.core.annotation.NameInMap("ifUsed")
        private Integer ifUsed;

        @com.aliyun.core.annotation.NameInMap("licenseCount")
        private Long licenseCount;

        @com.aliyun.core.annotation.NameInMap("maxQps")
        private Integer maxQps;

        @com.aliyun.core.annotation.NameInMap("orderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("productKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("productName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("purchaseModel")
        private Integer purchaseModel;

        @com.aliyun.core.annotation.NameInMap("purchaseType")
        private Integer purchaseType;

        @com.aliyun.core.annotation.NameInMap("settlementFee")
        private Double settlementFee;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("tokenNumber")
        private Long tokenNumber;

        @com.aliyun.core.annotation.NameInMap("unitPrice")
        private Double unitPrice;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("userId")
        private String userId;

        private DataData(Builder builder) {
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.durationType = builder.durationType;
            this.expireTime = builder.expireTime;
            this.id = builder.id;
            this.ifUnsubscribe = builder.ifUnsubscribe;
            this.ifUsed = builder.ifUsed;
            this.licenseCount = builder.licenseCount;
            this.maxQps = builder.maxQps;
            this.orderId = builder.orderId;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.purchaseModel = builder.purchaseModel;
            this.purchaseType = builder.purchaseType;
            this.settlementFee = builder.settlementFee;
            this.tenantId = builder.tenantId;
            this.tokenNumber = builder.tokenNumber;
            this.unitPrice = builder.unitPrice;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return durationType
         */
        public Integer getDurationType() {
            return this.durationType;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ifUnsubscribe
         */
        public Integer getIfUnsubscribe() {
            return this.ifUnsubscribe;
        }

        /**
         * @return ifUsed
         */
        public Integer getIfUsed() {
            return this.ifUsed;
        }

        /**
         * @return licenseCount
         */
        public Long getLicenseCount() {
            return this.licenseCount;
        }

        /**
         * @return maxQps
         */
        public Integer getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return purchaseModel
         */
        public Integer getPurchaseModel() {
            return this.purchaseModel;
        }

        /**
         * @return purchaseType
         */
        public Integer getPurchaseType() {
            return this.purchaseType;
        }

        /**
         * @return settlementFee
         */
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tokenNumber
         */
        public Long getTokenNumber() {
            return this.tokenNumber;
        }

        /**
         * @return unitPrice
         */
        public Double getUnitPrice() {
            return this.unitPrice;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String createTime; 
            private Integer duration; 
            private Integer durationType; 
            private String expireTime; 
            private Long id; 
            private Integer ifUnsubscribe; 
            private Integer ifUsed; 
            private Long licenseCount; 
            private Integer maxQps; 
            private String orderId; 
            private String productKey; 
            private String productName; 
            private Integer purchaseModel; 
            private Integer purchaseType; 
            private Double settlementFee; 
            private String tenantId; 
            private Long tokenNumber; 
            private Double unitPrice; 
            private String updateTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.durationType = model.durationType;
                this.expireTime = model.expireTime;
                this.id = model.id;
                this.ifUnsubscribe = model.ifUnsubscribe;
                this.ifUsed = model.ifUsed;
                this.licenseCount = model.licenseCount;
                this.maxQps = model.maxQps;
                this.orderId = model.orderId;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.purchaseModel = model.purchaseModel;
                this.purchaseType = model.purchaseType;
                this.settlementFee = model.settlementFee;
                this.tenantId = model.tenantId;
                this.tokenNumber = model.tokenNumber;
                this.unitPrice = model.unitPrice;
                this.updateTime = model.updateTime;
                this.userId = model.userId;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * durationType.
             */
            public Builder durationType(Integer durationType) {
                this.durationType = durationType;
                return this;
            }

            /**
             * expireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>ID。</p>
             * 
             * <strong>example:</strong>
             * <p>67241348</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ifUnsubscribe.
             */
            public Builder ifUnsubscribe(Integer ifUnsubscribe) {
                this.ifUnsubscribe = ifUnsubscribe;
                return this;
            }

            /**
             * ifUsed.
             */
            public Builder ifUsed(Integer ifUsed) {
                this.ifUsed = ifUsed;
                return this;
            }

            /**
             * licenseCount.
             */
            public Builder licenseCount(Long licenseCount) {
                this.licenseCount = licenseCount;
                return this;
            }

            /**
             * maxQps.
             */
            public Builder maxQps(Integer maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * orderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * productKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * productName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * purchaseModel.
             */
            public Builder purchaseModel(Integer purchaseModel) {
                this.purchaseModel = purchaseModel;
                return this;
            }

            /**
             * purchaseType.
             */
            public Builder purchaseType(Integer purchaseType) {
                this.purchaseType = purchaseType;
                return this;
            }

            /**
             * settlementFee.
             */
            public Builder settlementFee(Double settlementFee) {
                this.settlementFee = settlementFee;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * tokenNumber.
             */
            public Builder tokenNumber(Long tokenNumber) {
                this.tokenNumber = tokenNumber;
                return this;
            }

            /**
             * unitPrice.
             */
            public Builder unitPrice(Double unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryProductQuotaPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductQuotaPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("pageIndex")
        private Integer pageIndex;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        private Data(Builder builder) {
            this.data = builder.data;
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return pageIndex
         */
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private Integer pageIndex; 
            private Integer pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.pageIndex = model.pageIndex;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * pageIndex.
             */
            public Builder pageIndex(Integer pageIndex) {
                this.pageIndex = pageIndex;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
