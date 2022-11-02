// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMajorProtectionBlackIpResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMajorProtectionBlackIpResponseBody</p>
 */
public class DeleteMajorProtectionBlackIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteMajorProtectionBlackIpResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMajorProtectionBlackIpResponseBody create() {
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

        public DeleteMajorProtectionBlackIpResponseBody build() {
            return new DeleteMajorProtectionBlackIpResponseBody(this);
        } 

    } 

}
