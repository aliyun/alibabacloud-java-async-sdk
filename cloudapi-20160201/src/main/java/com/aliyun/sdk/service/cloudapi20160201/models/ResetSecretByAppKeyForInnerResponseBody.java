// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetSecretByAppKeyForInnerResponseBody} extends {@link TeaModel}
 *
 * <p>ResetSecretByAppKeyForInnerResponseBody</p>
 */
public class ResetSecretByAppKeyForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResetSecretByAppKeyForInnerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetSecretByAppKeyForInnerResponseBody create() {
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

        public ResetSecretByAppKeyForInnerResponseBody build() {
            return new ResetSecretByAppKeyForInnerResponseBody(this);
        } 

    } 

}
