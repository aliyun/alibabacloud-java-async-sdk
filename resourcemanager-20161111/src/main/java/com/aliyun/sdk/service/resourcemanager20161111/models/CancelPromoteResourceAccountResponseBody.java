// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPromoteResourceAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CancelPromoteResourceAccountResponseBody</p>
 */
public class CancelPromoteResourceAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelPromoteResourceAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelPromoteResourceAccountResponseBody create() {
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

        public CancelPromoteResourceAccountResponseBody build() {
            return new CancelPromoteResourceAccountResponseBody(this);
        } 

    } 

}
