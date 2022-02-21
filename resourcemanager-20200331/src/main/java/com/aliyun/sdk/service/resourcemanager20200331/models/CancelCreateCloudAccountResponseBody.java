// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCreateCloudAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CancelCreateCloudAccountResponseBody</p>
 */
public class CancelCreateCloudAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelCreateCloudAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelCreateCloudAccountResponseBody create() {
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

        public CancelCreateCloudAccountResponseBody build() {
            return new CancelCreateCloudAccountResponseBody(this);
        } 

    } 

}
