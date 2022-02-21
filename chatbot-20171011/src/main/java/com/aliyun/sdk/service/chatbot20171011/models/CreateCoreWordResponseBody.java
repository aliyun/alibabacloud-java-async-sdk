// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCoreWordResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCoreWordResponseBody</p>
 */
public class CreateCoreWordResponseBody extends TeaModel {
    @NameInMap("CoreWordCode")
    private String coreWordCode;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCoreWordResponseBody(Builder builder) {
        this.coreWordCode = builder.coreWordCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCoreWordResponseBody create() {
        return builder().build();
    }

    /**
     * @return coreWordCode
     */
    public String getCoreWordCode() {
        return this.coreWordCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String coreWordCode; 
        private String requestId; 

        /**
         * CoreWordCode.
         */
        public Builder coreWordCode(String coreWordCode) {
            this.coreWordCode = coreWordCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCoreWordResponseBody build() {
            return new CreateCoreWordResponseBody(this);
        } 

    } 

}
