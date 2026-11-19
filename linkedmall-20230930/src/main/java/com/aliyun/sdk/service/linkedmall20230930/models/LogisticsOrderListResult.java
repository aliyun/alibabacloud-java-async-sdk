// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link LogisticsOrderListResult} extends {@link TeaModel}
 *
 * <p>LogisticsOrderListResult</p>
 */
public class LogisticsOrderListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logisticsOrderList")
    private java.util.List<LogisticsOrderResult> logisticsOrderList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logisticsOrderList
     */
    public java.util.List<LogisticsOrderResult> getLogisticsOrderList() {
        return this.logisticsOrderList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LogisticsOrderResult> logisticsOrderList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(LogisticsOrderListResult model) {
            this.logisticsOrderList = model.logisticsOrderList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The logistics order list.</p>
         */
        public Builder logisticsOrderList(java.util.List<LogisticsOrderResult> logisticsOrderList) {
            this.logisticsOrderList = logisticsOrderList;
            return this;
        }

        /**
         * <p>The API request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>841471F6-5D61-1331-8C38-2****B55</p>
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
