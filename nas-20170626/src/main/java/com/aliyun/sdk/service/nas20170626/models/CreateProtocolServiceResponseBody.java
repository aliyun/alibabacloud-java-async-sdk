// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProtocolServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProtocolServiceResponseBody</p>
 */
public class CreateProtocolServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProtocolServiceId")
    private String protocolServiceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProtocolServiceResponseBody(Builder builder) {
        this.protocolServiceId = builder.protocolServiceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtocolServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return protocolServiceId
     */
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String protocolServiceId; 
        private String requestId; 

        /**
         * The ID of the protocol service.
         */
        public Builder protocolServiceId(String protocolServiceId) {
            this.protocolServiceId = protocolServiceId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProtocolServiceResponseBody build() {
            return new CreateProtocolServiceResponseBody(this);
        } 

    } 

}
