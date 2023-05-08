// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IgnoreHcCheckWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>IgnoreHcCheckWarningsResponseBody</p>
 */
public class IgnoreHcCheckWarningsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private IgnoreHcCheckWarningsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreHcCheckWarningsResponseBody create() {
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

        public IgnoreHcCheckWarningsResponseBody build() {
            return new IgnoreHcCheckWarningsResponseBody(this);
        } 

    } 

}
