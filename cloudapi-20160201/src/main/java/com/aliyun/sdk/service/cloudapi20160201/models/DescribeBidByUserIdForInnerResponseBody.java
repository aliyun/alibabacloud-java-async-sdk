// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBidByUserIdForInnerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBidByUserIdForInnerResponseBody</p>
 */
public class DescribeBidByUserIdForInnerResponseBody extends TeaModel {
    @NameInMap("Bid")
    private String bid;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBidByUserIdForInnerResponseBody(Builder builder) {
        this.bid = builder.bid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBidByUserIdForInnerResponseBody create() {
        return builder().build();
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bid; 
        private String requestId; 

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBidByUserIdForInnerResponseBody build() {
            return new DescribeBidByUserIdForInnerResponseBody(this);
        } 

    } 

}
