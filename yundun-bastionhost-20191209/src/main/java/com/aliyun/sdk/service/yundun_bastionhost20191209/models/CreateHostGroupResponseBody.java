// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHostGroupResponseBody</p>
 */
public class CreateHostGroupResponseBody extends TeaModel {
    @NameInMap("HostGroupId")
    private String hostGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateHostGroupResponseBody(Builder builder) {
        this.hostGroupId = builder.hostGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHostGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hostGroupId; 
        private String requestId; 

        /**
         * The ID of the host group.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHostGroupResponseBody build() {
            return new CreateHostGroupResponseBody(this);
        } 

    } 

}
