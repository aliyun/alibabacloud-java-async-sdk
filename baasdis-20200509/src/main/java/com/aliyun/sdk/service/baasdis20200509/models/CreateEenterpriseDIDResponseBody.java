// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEenterpriseDIDResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEenterpriseDIDResponseBody</p>
 */
public class CreateEenterpriseDIDResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DID")
    private String DID;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateEenterpriseDIDResponseBody(Builder builder) {
        this.DID = builder.DID;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEenterpriseDIDResponseBody create() {
        return builder().build();
    }

    /**
     * @return DID
     */
    public String getDID() {
        return this.DID;
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
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String DID; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 

        /**
         * DID.
         */
        public Builder DID(String DID) {
            this.DID = DID;
            return this;
        }

        /**
         * RequestId.
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
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEenterpriseDIDResponseBody build() {
            return new CreateEenterpriseDIDResponseBody(this);
        } 

    } 

}
