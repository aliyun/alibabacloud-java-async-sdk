// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreateCustomerInfomationResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreateCustomerInfomationResponseBody</p>
 */
public class GetCreateCustomerInfomationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanBuyCard")
    private String canBuyCard;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("URL")
    private String URL;

    private GetCreateCustomerInfomationResponseBody(Builder builder) {
        this.canBuyCard = builder.canBuyCard;
        this.requestId = builder.requestId;
        this.URL = builder.URL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateCustomerInfomationResponseBody create() {
        return builder().build();
    }

    /**
     * @return canBuyCard
     */
    public String getCanBuyCard() {
        return this.canBuyCard;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return URL
     */
    public String getURL() {
        return this.URL;
    }

    public static final class Builder {
        private String canBuyCard; 
        private String requestId; 
        private String URL; 

        /**
         * CanBuyCard.
         */
        public Builder canBuyCard(String canBuyCard) {
            this.canBuyCard = canBuyCard;
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
         * URL.
         */
        public Builder URL(String URL) {
            this.URL = URL;
            return this;
        }

        public GetCreateCustomerInfomationResponseBody build() {
            return new GetCreateCustomerInfomationResponseBody(this);
        } 

    } 

}
