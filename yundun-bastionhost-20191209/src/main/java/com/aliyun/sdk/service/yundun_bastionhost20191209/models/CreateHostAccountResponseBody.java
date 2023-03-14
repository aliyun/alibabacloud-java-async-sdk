// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostAccountResponseBody</p>
 */
public class CreateHostAccountResponseBody extends TeaModel {
    @NameInMap("HostAccountId")
    private String hostAccountId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateHostAccountResponseBody(Builder builder) {
        this.hostAccountId = builder.hostAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostAccountId
     */
    public String getHostAccountId() {
        return this.hostAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hostAccountId; 
        private String requestId; 

        /**
         * The ID of the host account.
         */
        public Builder hostAccountId(String hostAccountId) {
            this.hostAccountId = hostAccountId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHostAccountResponseBody build() {
            return new CreateHostAccountResponseBody(this);
        } 

    } 

}
