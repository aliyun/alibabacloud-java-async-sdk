// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootARMServerInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RebootARMServerInstanceResponseBody</p>
 */
public class RebootARMServerInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RebootARMServerInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootARMServerInstanceResponseBody create() {
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

        public RebootARMServerInstanceResponseBody build() {
            return new RebootARMServerInstanceResponseBody(this);
        } 

    } 

}
