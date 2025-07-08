// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateMessageCallbackTestNewResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMessageCallbackTestNewResponseBody</p>
 */
public class CreateMessageCallbackTestNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TestFailCode")
    private String testFailCode;

    @com.aliyun.core.annotation.NameInMap("TestResponse")
    private String testResponse;

    @com.aliyun.core.annotation.NameInMap("TestSuccess")
    private Boolean testSuccess;

    private CreateMessageCallbackTestNewResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.testFailCode = builder.testFailCode;
        this.testResponse = builder.testResponse;
        this.testSuccess = builder.testSuccess;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMessageCallbackTestNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return testFailCode
     */
    public String getTestFailCode() {
        return this.testFailCode;
    }

    /**
     * @return testResponse
     */
    public String getTestResponse() {
        return this.testResponse;
    }

    /**
     * @return testSuccess
     */
    public Boolean getTestSuccess() {
        return this.testSuccess;
    }

    public static final class Builder {
        private String requestId; 
        private String testFailCode; 
        private String testResponse; 
        private Boolean testSuccess; 

        private Builder() {
        } 

        private Builder(CreateMessageCallbackTestNewResponseBody model) {
            this.requestId = model.requestId;
            this.testFailCode = model.testFailCode;
            this.testResponse = model.testResponse;
            this.testSuccess = model.testSuccess;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TestFailCode.
         */
        public Builder testFailCode(String testFailCode) {
            this.testFailCode = testFailCode;
            return this;
        }

        /**
         * TestResponse.
         */
        public Builder testResponse(String testResponse) {
            this.testResponse = testResponse;
            return this;
        }

        /**
         * TestSuccess.
         */
        public Builder testSuccess(Boolean testSuccess) {
            this.testSuccess = testSuccess;
            return this;
        }

        public CreateMessageCallbackTestNewResponseBody build() {
            return new CreateMessageCallbackTestNewResponseBody(this);
        } 

    } 

}
