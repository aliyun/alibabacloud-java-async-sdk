// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetSpotPriceHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpotPriceHistoryResponseBody</p>
 */
public class GetSpotPriceHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SpotPriceHistory")
    private java.util.List<SpotPriceItem> spotPriceHistory;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetSpotPriceHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.spotPriceHistory = builder.spotPriceHistory;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpotPriceHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spotPriceHistory
     */
    public java.util.List<SpotPriceItem> getSpotPriceHistory() {
        return this.spotPriceHistory;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SpotPriceItem> spotPriceHistory; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpotPriceHistory.
         */
        public Builder spotPriceHistory(java.util.List<SpotPriceItem> spotPriceHistory) {
            this.spotPriceHistory = spotPriceHistory;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetSpotPriceHistoryResponseBody build() {
            return new GetSpotPriceHistoryResponseBody(this);
        } 

    } 

}
