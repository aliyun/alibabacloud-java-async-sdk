// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisterCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegisterCodeResponseBody</p>
 */
public class GetRegisterCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegisterCode")
    private String registerCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRegisterCodeResponseBody(Builder builder) {
        this.registerCode = builder.registerCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegisterCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return registerCode
     */
    public String getRegisterCode() {
        return this.registerCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String registerCode; 
        private String requestId; 

        /**
         * RegisterCode.
         */
        public Builder registerCode(String registerCode) {
            this.registerCode = registerCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRegisterCodeResponseBody build() {
            return new GetRegisterCodeResponseBody(this);
        } 

    } 

}
