// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnIpaSpecificConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDcdnIpaSpecificConfigResponseBody</p>
 */
public class DeleteDcdnIpaSpecificConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteDcdnIpaSpecificConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDcdnIpaSpecificConfigResponseBody create() {
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

        public DeleteDcdnIpaSpecificConfigResponseBody build() {
            return new DeleteDcdnIpaSpecificConfigResponseBody(this);
        } 

    } 

}
