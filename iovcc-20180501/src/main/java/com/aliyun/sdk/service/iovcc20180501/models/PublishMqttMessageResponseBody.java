// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishMqttMessageResponseBody} extends {@link TeaModel}
 *
 * <p>PublishMqttMessageResponseBody</p>
 */
public class PublishMqttMessageResponseBody extends TeaModel {
    @NameInMap("Mid")
    private String mid;

    @NameInMap("RequestId")
    private String requestId;

    private PublishMqttMessageResponseBody(Builder builder) {
        this.mid = builder.mid;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishMqttMessageResponseBody create() {
        return builder().build();
    }

    /**
     * @return mid
     */
    public String getMid() {
        return this.mid;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mid; 
        private String requestId; 

        /**
         * Mid.
         */
        public Builder mid(String mid) {
            this.mid = mid;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishMqttMessageResponseBody build() {
            return new PublishMqttMessageResponseBody(this);
        } 

    } 

}
