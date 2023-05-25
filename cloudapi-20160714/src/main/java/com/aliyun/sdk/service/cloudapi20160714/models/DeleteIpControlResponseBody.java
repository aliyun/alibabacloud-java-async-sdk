// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpControlResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIpControlResponseBody</p>
 */
public class DeleteIpControlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteIpControlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIpControlResponseBody create() {
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
         * Deletes an access control list (ACL).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteIpControlResponseBody build() {
            return new DeleteIpControlResponseBody(this);
        } 

    } 

}
