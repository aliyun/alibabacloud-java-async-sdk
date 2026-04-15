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
 * {@link VirtualDeliveryToMsceneResponseBody} extends {@link TeaModel}
 *
 * <p>VirtualDeliveryToMsceneResponseBody</p>
 */
public class VirtualDeliveryToMsceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MpaasUserGamecenterPaymentVirtualdeliveryResponse")
    private MpaasUserGamecenterPaymentVirtualdeliveryResponse mpaasUserGamecenterPaymentVirtualdeliveryResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private VirtualDeliveryToMsceneResponseBody(Builder builder) {
        this.mpaasUserGamecenterPaymentVirtualdeliveryResponse = builder.mpaasUserGamecenterPaymentVirtualdeliveryResponse;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VirtualDeliveryToMsceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpaasUserGamecenterPaymentVirtualdeliveryResponse
     */
    public MpaasUserGamecenterPaymentVirtualdeliveryResponse getMpaasUserGamecenterPaymentVirtualdeliveryResponse() {
        return this.mpaasUserGamecenterPaymentVirtualdeliveryResponse;
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
        private MpaasUserGamecenterPaymentVirtualdeliveryResponse mpaasUserGamecenterPaymentVirtualdeliveryResponse; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VirtualDeliveryToMsceneResponseBody model) {
            this.mpaasUserGamecenterPaymentVirtualdeliveryResponse = model.mpaasUserGamecenterPaymentVirtualdeliveryResponse;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * MpaasUserGamecenterPaymentVirtualdeliveryResponse.
         */
        public Builder mpaasUserGamecenterPaymentVirtualdeliveryResponse(MpaasUserGamecenterPaymentVirtualdeliveryResponse mpaasUserGamecenterPaymentVirtualdeliveryResponse) {
            this.mpaasUserGamecenterPaymentVirtualdeliveryResponse = mpaasUserGamecenterPaymentVirtualdeliveryResponse;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>ac1f0083177615939018778261913</p>
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

        public VirtualDeliveryToMsceneResponseBody build() {
            return new VirtualDeliveryToMsceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VirtualDeliveryToMsceneResponseBody} extends {@link TeaModel}
     *
     * <p>VirtualDeliveryToMsceneResponseBody</p>
     */
    public static class MpaasUserGamecenterPaymentVirtualdeliveryResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private MpaasUserGamecenterPaymentVirtualdeliveryResponse(Builder builder) {
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MpaasUserGamecenterPaymentVirtualdeliveryResponse create() {
            return builder().build();
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Boolean success; 

            private Builder() {
            } 

            private Builder(MpaasUserGamecenterPaymentVirtualdeliveryResponse model) {
                this.success = model.success;
            } 

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public MpaasUserGamecenterPaymentVirtualdeliveryResponse build() {
                return new MpaasUserGamecenterPaymentVirtualdeliveryResponse(this);
            } 

        } 

    }
}
