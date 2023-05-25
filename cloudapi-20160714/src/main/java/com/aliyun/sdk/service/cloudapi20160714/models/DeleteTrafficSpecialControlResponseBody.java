// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficSpecialControlResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTrafficSpecialControlResponseBody</p>
 */
public class DeleteTrafficSpecialControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteTrafficSpecialControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrafficSpecialControlResponseBody create() {
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
         * Deletes a custom special throttling policy.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTrafficSpecialControlResponseBody build() {
            return new DeleteTrafficSpecialControlResponseBody(this);
        } 

    } 

}
