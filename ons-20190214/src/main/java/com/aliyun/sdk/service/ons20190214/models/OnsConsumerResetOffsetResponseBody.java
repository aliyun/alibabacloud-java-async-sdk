// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerResetOffsetResponseBody} extends {@link TeaModel}
 *
 * <p>OnsConsumerResetOffsetResponseBody</p>
 */
public class OnsConsumerResetOffsetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private OnsConsumerResetOffsetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerResetOffsetResponseBody create() {
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
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsConsumerResetOffsetResponseBody build() {
            return new OnsConsumerResetOffsetResponseBody(this);
        } 

    } 

}
