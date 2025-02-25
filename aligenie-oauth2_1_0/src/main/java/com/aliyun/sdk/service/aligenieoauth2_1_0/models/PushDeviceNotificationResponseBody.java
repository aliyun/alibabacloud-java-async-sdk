// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PushDeviceNotificationResponseBody} extends {@link TeaModel}
 *
 * <p>PushDeviceNotificationResponseBody</p>
 */
public class PushDeviceNotificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PushDeviceNotificationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushDeviceNotificationResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PushDeviceNotificationResponseBody build() {
            return new PushDeviceNotificationResponseBody(this);
        } 

    } 

}
