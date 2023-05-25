// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTrafficControlApisResponseBody} extends {@link TeaModel}
 *
 * <p>SetTrafficControlApisResponseBody</p>
 */
public class SetTrafficControlApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetTrafficControlApisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTrafficControlApisResponseBody create() {
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
         * Binds a throttling policy to APIs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetTrafficControlApisResponseBody build() {
            return new SetTrafficControlApisResponseBody(this);
        } 

    } 

}
