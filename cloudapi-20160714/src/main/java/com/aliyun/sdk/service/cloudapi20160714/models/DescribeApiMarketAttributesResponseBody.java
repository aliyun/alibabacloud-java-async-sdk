// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeApiMarketAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiMarketAttributesResponseBody</p>
 */
public class DescribeApiMarketAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiId")
    private String apiId;

    @com.aliyun.core.annotation.NameInMap("MarketChargingMode")
    private String marketChargingMode;

    @com.aliyun.core.annotation.NameInMap("NeedCharging")
    private String needCharging;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>6318cd8f6a304cac9318dea8d9a78f7a</p>
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The billing method used by the Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAID_BY_USAGE</p>
         */
        public Builder marketChargingMode(String marketChargingMode) {
            this.marketChargingMode = marketChargingMode;
            return this;
        }

        /**
         * <p>Indicates whether fees are charged.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needCharging(String needCharging) {
            this.needCharging = needCharging;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>545D4E52-4F77-5EC4-BB7E-7344CEC7B5E6</p>
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
