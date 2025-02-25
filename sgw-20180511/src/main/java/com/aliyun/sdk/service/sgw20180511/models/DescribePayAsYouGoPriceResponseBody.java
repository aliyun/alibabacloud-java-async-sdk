// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePayAsYouGoPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePayAsYouGoPriceResponseBody</p>
 */
public class DescribePayAsYouGoPriceResponseBody extends TeaModel {
    @NameInMap("CacheCloudEfficiencySizePrice")
    private Float cacheCloudEfficiencySizePrice;

    @NameInMap("CacheCloudSSDSizePrice")
    private Float cacheCloudSSDSizePrice;

    @NameInMap("CacheESSDPl1SizePrice")
    private Float cacheESSDPl1SizePrice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Currency")
    private String currency;

    @NameInMap("GatewayClassPrice")
    private Float gatewayClassPrice;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribePayAsYouGoPriceResponseBody(Builder builder) {
        this.cacheCloudEfficiencySizePrice = builder.cacheCloudEfficiencySizePrice;
        this.cacheCloudSSDSizePrice = builder.cacheCloudSSDSizePrice;
        this.cacheESSDPl1SizePrice = builder.cacheESSDPl1SizePrice;
        this.code = builder.code;
        this.currency = builder.currency;
        this.gatewayClassPrice = builder.gatewayClassPrice;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePayAsYouGoPriceResponseBody create() {
        return builder().build();
    }

    /**
     * @return cacheCloudEfficiencySizePrice
     */
    public Float getCacheCloudEfficiencySizePrice() {
        return this.cacheCloudEfficiencySizePrice;
    }

    /**
     * @return cacheCloudSSDSizePrice
     */
    public Float getCacheCloudSSDSizePrice() {
        return this.cacheCloudSSDSizePrice;
    }

    /**
     * @return cacheESSDPl1SizePrice
     */
    public Float getCacheESSDPl1SizePrice() {
        return this.cacheESSDPl1SizePrice;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return gatewayClassPrice
     */
    public Float getGatewayClassPrice() {
        return this.gatewayClassPrice;
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
        private Float cacheCloudEfficiencySizePrice; 
        private Float cacheCloudSSDSizePrice; 
        private Float cacheESSDPl1SizePrice; 
        private String code; 
        private String currency; 
        private Float gatewayClassPrice; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * CacheCloudEfficiencySizePrice.
         */
        public Builder cacheCloudEfficiencySizePrice(Float cacheCloudEfficiencySizePrice) {
            this.cacheCloudEfficiencySizePrice = cacheCloudEfficiencySizePrice;
            return this;
        }

        /**
         * CacheCloudSSDSizePrice.
         */
        public Builder cacheCloudSSDSizePrice(Float cacheCloudSSDSizePrice) {
            this.cacheCloudSSDSizePrice = cacheCloudSSDSizePrice;
            return this;
        }

        /**
         * CacheESSDPl1SizePrice.
         */
        public Builder cacheESSDPl1SizePrice(Float cacheESSDPl1SizePrice) {
            this.cacheESSDPl1SizePrice = cacheESSDPl1SizePrice;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Currency.
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * GatewayClassPrice.
         */
        public Builder gatewayClassPrice(Float gatewayClassPrice) {
            this.gatewayClassPrice = gatewayClassPrice;
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

        public DescribePayAsYouGoPriceResponseBody build() {
            return new DescribePayAsYouGoPriceResponseBody(this);
        } 

    } 

}
