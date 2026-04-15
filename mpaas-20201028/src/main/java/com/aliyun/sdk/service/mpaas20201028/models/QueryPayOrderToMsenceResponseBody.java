// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link QueryPayOrderToMsenceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryPayOrderToMsenceResponseBody</p>
 */
public class QueryPayOrderToMsenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MpaasUserGamecenterPaymentQuerystatusResponse")
    private MpaasUserGamecenterPaymentQuerystatusResponse mpaasUserGamecenterPaymentQuerystatusResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryPayOrderToMsenceResponseBody(Builder builder) {
        this.mpaasUserGamecenterPaymentQuerystatusResponse = builder.mpaasUserGamecenterPaymentQuerystatusResponse;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPayOrderToMsenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpaasUserGamecenterPaymentQuerystatusResponse
     */
    public MpaasUserGamecenterPaymentQuerystatusResponse getMpaasUserGamecenterPaymentQuerystatusResponse() {
        return this.mpaasUserGamecenterPaymentQuerystatusResponse;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMsg
     */
    public String getResultMsg() {
        return this.resultMsg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private MpaasUserGamecenterPaymentQuerystatusResponse mpaasUserGamecenterPaymentQuerystatusResponse; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryPayOrderToMsenceResponseBody model) {
            this.mpaasUserGamecenterPaymentQuerystatusResponse = model.mpaasUserGamecenterPaymentQuerystatusResponse;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * MpaasUserGamecenterPaymentQuerystatusResponse.
         */
        public Builder mpaasUserGamecenterPaymentQuerystatusResponse(MpaasUserGamecenterPaymentQuerystatusResponse mpaasUserGamecenterPaymentQuerystatusResponse) {
            this.mpaasUserGamecenterPaymentQuerystatusResponse = mpaasUserGamecenterPaymentQuerystatusResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMsg.
         */
        public Builder resultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryPayOrderToMsenceResponseBody build() {
            return new QueryPayOrderToMsenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryPayOrderToMsenceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryPayOrderToMsenceResponseBody</p>
     */
    public static class MpaasUserGamecenterPaymentQuerystatusResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderStatus")
        private String orderStatus;

        private MpaasUserGamecenterPaymentQuerystatusResponse(Builder builder) {
            this.orderStatus = builder.orderStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MpaasUserGamecenterPaymentQuerystatusResponse create() {
            return builder().build();
        }

        /**
         * @return orderStatus
         */
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public static final class Builder {
            private String orderStatus; 

            private Builder() {
            } 

            private Builder(MpaasUserGamecenterPaymentQuerystatusResponse model) {
                this.orderStatus = model.orderStatus;
            } 

            /**
             * OrderStatus.
             */
            public Builder orderStatus(String orderStatus) {
                this.orderStatus = orderStatus;
                return this;
            }

            public MpaasUserGamecenterPaymentQuerystatusResponse build() {
                return new MpaasUserGamecenterPaymentQuerystatusResponse(this);
            } 

        } 

    }
}
