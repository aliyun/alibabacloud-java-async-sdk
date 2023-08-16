// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReserveDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ReserveDomainResponseBody</p>
 */
public class ReserveDomainResponseBody extends TeaModel {
    @NameInMap("AuctionId")
    private String auctionId;

    @NameInMap("RequestId")
    private String requestId;

    private ReserveDomainResponseBody(Builder builder) {
        this.auctionId = builder.auctionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReserveDomainResponseBody create() {
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

        public ReserveDomainResponseBody build() {
            return new ReserveDomainResponseBody(this);
        } 

    } 

}
