// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelLifecycleRetrieveJobResponseBody} extends {@link TeaModel}
 *
 * <p>CancelLifecycleRetrieveJobResponseBody</p>
 */
public class CancelLifecycleRetrieveJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelLifecycleRetrieveJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelLifecycleRetrieveJobResponseBody create() {
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

        public CancelLifecycleRetrieveJobResponseBody build() {
            return new CancelLifecycleRetrieveJobResponseBody(this);
        } 

    } 

}
