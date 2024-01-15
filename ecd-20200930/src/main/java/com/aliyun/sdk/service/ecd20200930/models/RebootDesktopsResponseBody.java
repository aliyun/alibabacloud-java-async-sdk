// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>RebootDesktopsResponseBody</p>
 */
public class RebootDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RebootDesktopsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootDesktopsResponseBody create() {
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

        public RebootDesktopsResponseBody build() {
            return new RebootDesktopsResponseBody(this);
        } 

    } 

}
