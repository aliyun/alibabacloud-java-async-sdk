// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSpareIpResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSpareIpResponseBody</p>
 */
public class DeleteSpareIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteSpareIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSpareIpResponseBody create() {
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

        public DeleteSpareIpResponseBody build() {
            return new DeleteSpareIpResponseBody(this);
        } 

    } 

}
