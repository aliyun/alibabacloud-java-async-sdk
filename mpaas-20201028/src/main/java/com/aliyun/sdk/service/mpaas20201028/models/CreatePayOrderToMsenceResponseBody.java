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
 * {@link CreatePayOrderToMsenceResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePayOrderToMsenceResponseBody</p>
 */
public class CreatePayOrderToMsenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MpaasOrderCreateResponse")
    private MpaasOrderCreateResponse mpaasOrderCreateResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMsg")
    private String resultMsg;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreatePayOrderToMsenceResponseBody(Builder builder) {
        this.mpaasOrderCreateResponse = builder.mpaasOrderCreateResponse;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMsg = builder.resultMsg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePayOrderToMsenceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpaasOrderCreateResponse
     */
    public MpaasOrderCreateResponse getMpaasOrderCreateResponse() {
        return this.mpaasOrderCreateResponse;
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
        private MpaasOrderCreateResponse mpaasOrderCreateResponse; 
        private String requestId; 
        private String resultCode; 
        private String resultMsg; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreatePayOrderToMsenceResponseBody model) {
            this.mpaasOrderCreateResponse = model.mpaasOrderCreateResponse;
            this.requestId = model.requestId;
            this.resultCode = model.resultCode;
            this.resultMsg = model.resultMsg;
            this.success = model.success;
        } 

        /**
         * MpaasOrderCreateResponse.
         */
        public Builder mpaasOrderCreateResponse(MpaasOrderCreateResponse mpaasOrderCreateResponse) {
            this.mpaasOrderCreateResponse = mpaasOrderCreateResponse;
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

        public CreatePayOrderToMsenceResponseBody build() {
            return new CreatePayOrderToMsenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePayOrderToMsenceResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePayOrderToMsenceResponseBody</p>
     */
    public static class MpaasOrderCreateResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizOrderId")
        private String bizOrderId;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private MpaasOrderCreateResponse(Builder builder) {
            this.bizOrderId = builder.bizOrderId;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MpaasOrderCreateResponse create() {
            return builder().build();
        }

        /**
         * @return bizOrderId
         */
        public String getBizOrderId() {
            return this.bizOrderId;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String bizOrderId; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(MpaasOrderCreateResponse model) {
                this.bizOrderId = model.bizOrderId;
                this.success = model.success;
            } 

            /**
             * BizOrderId.
             */
            public Builder bizOrderId(String bizOrderId) {
                this.bizOrderId = bizOrderId;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public MpaasOrderCreateResponse build() {
                return new MpaasOrderCreateResponse(this);
            } 

        } 

    }
}
