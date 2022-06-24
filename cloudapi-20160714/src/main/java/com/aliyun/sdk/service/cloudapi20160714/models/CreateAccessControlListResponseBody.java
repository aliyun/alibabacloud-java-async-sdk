// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccessControlListResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAccessControlListResponseBody</p>
 */
public class CreateAccessControlListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateAccessControlListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessControlListResponseBody create() {
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

        public CreateAccessControlListResponseBody build() {
            return new CreateAccessControlListResponseBody(this);
        } 

    } 

}
