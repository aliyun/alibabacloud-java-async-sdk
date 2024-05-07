// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogisticsOrderListResult} extends {@link TeaModel}
 *
 * <p>LogisticsOrderListResult</p>
 */
public class LogisticsOrderListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logisticsOrderList")
    private java.util.List < LogisticsOrderResult > logisticsOrderList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private LogisticsOrderListResult(Builder builder) {
        this.logisticsOrderList = builder.logisticsOrderList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogisticsOrderListResult create() {
        return builder().build();
    }

    /**
     * @return logisticsOrderList
     */
    public java.util.List < LogisticsOrderResult > getLogisticsOrderList() {
        return this.logisticsOrderList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < LogisticsOrderResult > logisticsOrderList; 
        private String requestId; 

        /**
         * logisticsOrderList.
         */
        public Builder logisticsOrderList(java.util.List < LogisticsOrderResult > logisticsOrderList) {
            this.logisticsOrderList = logisticsOrderList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LogisticsOrderListResult build() {
            return new LogisticsOrderListResult(this);
        } 

    } 

}
