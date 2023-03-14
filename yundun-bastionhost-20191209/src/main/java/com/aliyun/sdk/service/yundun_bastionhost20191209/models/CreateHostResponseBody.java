// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostResponseBody</p>
 */
public class CreateHostResponseBody extends TeaModel {
    @NameInMap("HostId")
    private String hostId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateHostResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hostId; 
        private String requestId; 

        /**
         * The ID of the host that was created.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHostResponseBody build() {
            return new CreateHostResponseBody(this);
        } 

    } 

}
