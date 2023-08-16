// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BidDomainResponseBody} extends {@link TeaModel}
 *
 * <p>BidDomainResponseBody</p>
 */
public class BidDomainResponseBody extends TeaModel {
    @NameInMap("AuctionId")
    private String auctionId;

    @NameInMap("RequestId")
    private String requestId;

    private BidDomainResponseBody(Builder builder) {
        this.auctionId = builder.auctionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BidDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return auctionId
     */
    public String getAuctionId() {
        return this.auctionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String auctionId; 
        private String requestId; 

        /**
         * AuctionId.
         */
        public Builder auctionId(String auctionId) {
            this.auctionId = auctionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BidDomainResponseBody build() {
            return new BidDomainResponseBody(this);
        } 

    } 

}
