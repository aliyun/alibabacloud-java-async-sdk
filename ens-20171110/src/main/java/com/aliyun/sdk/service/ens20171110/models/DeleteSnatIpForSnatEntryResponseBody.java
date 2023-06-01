// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnatIpForSnatEntryResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSnatIpForSnatEntryResponseBody</p>
 */
public class DeleteSnatIpForSnatEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteSnatIpForSnatEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnatIpForSnatEntryResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteSnatIpForSnatEntryResponseBody build() {
            return new DeleteSnatIpForSnatEntryResponseBody(this);
        } 

    } 

}
