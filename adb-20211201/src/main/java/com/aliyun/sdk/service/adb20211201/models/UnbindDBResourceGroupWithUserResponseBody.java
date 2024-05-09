// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindDBResourceGroupWithUserResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindDBResourceGroupWithUserResponseBody</p>
 */
public class UnbindDBResourceGroupWithUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UnbindDBResourceGroupWithUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindDBResourceGroupWithUserResponseBody create() {
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

        public UnbindDBResourceGroupWithUserResponseBody build() {
            return new UnbindDBResourceGroupWithUserResponseBody(this);
        } 

    } 

}
