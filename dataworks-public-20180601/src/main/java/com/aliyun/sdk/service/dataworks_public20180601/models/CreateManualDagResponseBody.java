// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link CreateManualDagResponseBody} extends {@link TeaModel}
 *
 * <p>CreateManualDagResponseBody</p>
 */
public class CreateManualDagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReturnCode")
    private String returnCode;

    @com.aliyun.core.annotation.NameInMap("ReturnErrorSolution")
    private String returnErrorSolution;

    @com.aliyun.core.annotation.NameInMap("ReturnMessage")
    private String returnMessage;

    @com.aliyun.core.annotation.NameInMap("ReturnValue")
    private Long returnValue;

    private CreateManualDagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.returnCode = builder.returnCode;
        this.returnErrorSolution = builder.returnErrorSolution;
        this.returnMessage = builder.returnMessage;
        this.returnValue = builder.returnValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateManualDagResponseBody create() {
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
     * @return returnErrorSolution
     */
    public String getReturnErrorSolution() {
        return this.returnErrorSolution;
    }

    /**
     * @return returnMessage
     */
    public String getReturnMessage() {
        return this.returnMessage;
    }

    /**
     * @return returnValue
     */
    public Long getReturnValue() {
        return this.returnValue;
    }

    public static final class Builder {
        private String requestId; 
        private String returnCode; 
        private String returnErrorSolution; 
        private String returnMessage; 
        private Long returnValue; 

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
         * ReturnErrorSolution.
         */
        public Builder returnErrorSolution(String returnErrorSolution) {
            this.returnErrorSolution = returnErrorSolution;
            return this;
        }

        /**
         * ReturnMessage.
         */
        public Builder returnMessage(String returnMessage) {
            this.returnMessage = returnMessage;
            return this;
        }

        /**
         * ReturnValue.
         */
        public Builder returnValue(Long returnValue) {
            this.returnValue = returnValue;
            return this;
        }

        public CreateManualDagResponseBody build() {
            return new CreateManualDagResponseBody(this);
        } 

    } 

}
