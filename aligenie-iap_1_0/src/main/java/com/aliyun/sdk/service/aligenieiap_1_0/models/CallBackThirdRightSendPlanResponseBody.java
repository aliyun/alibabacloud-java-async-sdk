// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallBackThirdRightSendPlanResponseBody} extends {@link TeaModel}
 *
 * <p>CallBackThirdRightSendPlanResponseBody</p>
 */
public class CallBackThirdRightSendPlanResponseBody extends TeaModel {
    @NameInMap("RetCode")
    private String retCode;

    @NameInMap("RetMsg")
    private String retMsg;

    @NameInMap("RetValue")
    private Boolean retValue;

    @NameInMap("requestId")
    private String requestId;

    private CallBackThirdRightSendPlanResponseBody(Builder builder) {
        this.retCode = builder.retCode;
        this.retMsg = builder.retMsg;
        this.retValue = builder.retValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CallBackThirdRightSendPlanResponseBody create() {
        return builder().build();
    }

    /**
     * @return retCode
     */
    public String getRetCode() {
        return this.retCode;
    }

    /**
     * @return retMsg
     */
    public String getRetMsg() {
        return this.retMsg;
    }

    /**
     * @return retValue
     */
    public Boolean getRetValue() {
        return this.retValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String retCode; 
        private String retMsg; 
        private Boolean retValue; 
        private String requestId; 

        /**
         * RetCode.
         */
        public Builder retCode(String retCode) {
            this.retCode = retCode;
            return this;
        }

        /**
         * RetMsg.
         */
        public Builder retMsg(String retMsg) {
            this.retMsg = retMsg;
            return this;
        }

        /**
         * RetValue.
         */
        public Builder retValue(Boolean retValue) {
            this.retValue = retValue;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CallBackThirdRightSendPlanResponseBody build() {
            return new CallBackThirdRightSendPlanResponseBody(this);
        } 

    } 

}
