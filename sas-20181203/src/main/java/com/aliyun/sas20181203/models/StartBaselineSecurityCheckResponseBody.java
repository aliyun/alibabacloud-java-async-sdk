// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBaselineSecurityCheckResponseBody} extends {@link TeaModel}
 *
 * <p>StartBaselineSecurityCheckResponseBody</p>
 */
public class StartBaselineSecurityCheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StartBaselineSecurityCheckResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBaselineSecurityCheckResponseBody create() {
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

        public StartBaselineSecurityCheckResponseBody build() {
            return new StartBaselineSecurityCheckResponseBody(this);
        } 

    } 

}
