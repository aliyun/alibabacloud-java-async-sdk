// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueDeployServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ContinueDeployServiceInstanceResponseBody</p>
 */
public class ContinueDeployServiceInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ContinueDeployServiceInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContinueDeployServiceInstanceResponseBody create() {
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

        public ContinueDeployServiceInstanceResponseBody build() {
            return new ContinueDeployServiceInstanceResponseBody(this);
        } 

    } 

}
