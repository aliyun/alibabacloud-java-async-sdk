// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLiveIndexResponseBody} extends {@link TeaModel}
 *
 * <p>StopLiveIndexResponseBody</p>
 */
public class StopLiveIndexResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StopLiveIndexResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopLiveIndexResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StopLiveIndexResponseBody build() {
            return new StopLiveIndexResponseBody(this);
        } 

    } 

}
