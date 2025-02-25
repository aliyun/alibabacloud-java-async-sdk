// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableCheckProductResponseBody} extends {@link TeaModel}
 *
 * <p>DisableCheckProductResponseBody</p>
 */
public class DisableCheckProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisableCheckProductResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableCheckProductResponseBody create() {
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

        public DisableCheckProductResponseBody build() {
            return new DisableCheckProductResponseBody(this);
        } 

    } 

}
