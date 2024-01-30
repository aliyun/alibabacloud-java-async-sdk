// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRegistrantProfileResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRegistrantProfileResponseBody</p>
 */
public class DeleteRegistrantProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteRegistrantProfileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRegistrantProfileResponseBody create() {
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

        public DeleteRegistrantProfileResponseBody build() {
            return new DeleteRegistrantProfileResponseBody(this);
        } 

    } 

}
