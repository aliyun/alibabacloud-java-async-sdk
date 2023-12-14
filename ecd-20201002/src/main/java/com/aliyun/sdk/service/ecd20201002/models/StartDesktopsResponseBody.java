// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>StartDesktopsResponseBody</p>
 */
public class StartDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StartDesktopsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartDesktopsResponseBody create() {
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

        public StartDesktopsResponseBody build() {
            return new StartDesktopsResponseBody(this);
        } 

    } 

}
