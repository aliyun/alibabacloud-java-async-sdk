// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBasicIpSetResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateBasicIpSetResponseBody</p>
 */
public class UpdateBasicIpSetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateBasicIpSetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBasicIpSetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateBasicIpSetResponseBody build() {
            return new UpdateBasicIpSetResponseBody(this);
        } 

    } 

}
