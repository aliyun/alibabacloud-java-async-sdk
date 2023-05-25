// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiMarketAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiMarketAttributesResponseBody</p>
 */
public class DescribeApiMarketAttributesResponseBody extends TeaModel {
    @NameInMap("ApiId")
    private String apiId;

    @NameInMap("MarketChargingMode")
    private String marketChargingMode;

    @NameInMap("NeedCharging")
    private String needCharging;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeApiMarketAttributesResponseBody(Builder builder) {
        this.apiId = builder.apiId;
        this.marketChargingMode = builder.marketChargingMode;
        this.needCharging = builder.needCharging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiMarketAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return marketChargingMode
     */
    public String getMarketChargingMode() {
        return this.marketChargingMode;
    }

    /**
     * @return needCharging
     */
    public String getNeedCharging() {
        return this.needCharging;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String apiId; 
        private String marketChargingMode; 
        private String needCharging; 
        private String requestId; 

        /**
         * ApiId.
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * MarketChargingMode.
         */
        public Builder marketChargingMode(String marketChargingMode) {
            this.marketChargingMode = marketChargingMode;
            return this;
        }

        /**
         * NeedCharging.
         */
        public Builder needCharging(String needCharging) {
            this.needCharging = needCharging;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiMarketAttributesResponseBody build() {
            return new DescribeApiMarketAttributesResponseBody(this);
        } 

    } 

}
