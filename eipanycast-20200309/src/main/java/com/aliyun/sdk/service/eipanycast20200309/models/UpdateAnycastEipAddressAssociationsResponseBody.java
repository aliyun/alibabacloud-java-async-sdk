// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAnycastEipAddressAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAnycastEipAddressAssociationsResponseBody</p>
 */
public class UpdateAnycastEipAddressAssociationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateAnycastEipAddressAssociationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAnycastEipAddressAssociationsResponseBody create() {
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

        public UpdateAnycastEipAddressAssociationsResponseBody build() {
            return new UpdateAnycastEipAddressAssociationsResponseBody(this);
        } 

    } 

}
