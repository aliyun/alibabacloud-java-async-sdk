// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreateCustomerInformationResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreateCustomerInformationResponseBody</p>
 */
public class GetCreateCustomerInformationResponseBody extends TeaModel {
    @NameInMap("CanBuyCard")
    private String canBuyCard;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("URL")
    private String URL;

    private GetCreateCustomerInformationResponseBody(Builder builder) {
        this.canBuyCard = builder.canBuyCard;
        this.requestId = builder.requestId;
        this.URL = builder.URL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateCustomerInformationResponseBody create() {
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
         * Id of the request
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

        public GetCreateCustomerInformationResponseBody build() {
            return new GetCreateCustomerInformationResponseBody(this);
        } 

    } 

}
