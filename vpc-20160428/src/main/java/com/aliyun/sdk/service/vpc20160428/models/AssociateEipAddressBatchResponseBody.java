// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateEipAddressBatchResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateEipAddressBatchResponseBody</p>
 */
public class AssociateEipAddressBatchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AssociateEipAddressBatchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateEipAddressBatchResponseBody create() {
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

        public AssociateEipAddressBatchResponseBody build() {
            return new AssociateEipAddressBatchResponseBody(this);
        } 

    } 

}
