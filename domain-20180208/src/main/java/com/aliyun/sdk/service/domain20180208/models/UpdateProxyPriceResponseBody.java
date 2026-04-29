// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link UpdateProxyPriceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProxyPriceResponseBody</p>
 */
public class UpdateProxyPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuctionId")
    private String auctionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateProxyPriceResponseBody(Builder builder) {
        this.auctionId = builder.auctionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProxyPriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateProxyPriceResponseBody model) {
            this.auctionId = model.auctionId;
            this.requestId = model.requestId;
        } 

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

        public UpdateProxyPriceResponseBody build() {
            return new UpdateProxyPriceResponseBody(this);
        } 

    } 

}
