// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDoCheckQualityResponseBody} extends {@link TeaModel}
 *
 * <p>StartDoCheckQualityResponseBody</p>
 */
public class StartDoCheckQualityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReturnCode")
    private String returnCode;

    @com.aliyun.core.annotation.NameInMap("ReturnValue")
    private Boolean returnValue;

    private StartDoCheckQualityResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.returnCode = builder.returnCode;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDoCheckQualityResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return returnCode
     */
    public String getReturnCode() {
        return this.returnCode;
    }

    /**
     * @return returnValue
     */
    public Boolean getReturnValue() {
        return this.returnValue;
    }

    public static final class Builder {
        private String requestId; 
        private String returnCode; 
        private Boolean returnValue; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ReturnCode.
         */
        public Builder returnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }

        /**
         * ReturnValue.
         */
        public Builder returnValue(Boolean returnValue) {
            this.returnValue = returnValue;
            return this;
        }

        public StartDoCheckQualityResponseBody build() {
            return new StartDoCheckQualityResponseBody(this);
        } 

    } 

}
