// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostShareKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostShareKeyResponseBody</p>
 */
public class CreateHostShareKeyResponseBody extends TeaModel {
    @NameInMap("HostShareKeyId")
    private Long hostShareKeyId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateHostShareKeyResponseBody(Builder builder) {
        this.hostShareKeyId = builder.hostShareKeyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostShareKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostShareKeyId
     */
    public Long getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long hostShareKeyId; 
        private String requestId; 

        /**
         * The ID of the shared key.
         */
        public Builder hostShareKeyId(Long hostShareKeyId) {
            this.hostShareKeyId = hostShareKeyId;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHostShareKeyResponseBody build() {
            return new CreateHostShareKeyResponseBody(this);
        } 

    } 

}
