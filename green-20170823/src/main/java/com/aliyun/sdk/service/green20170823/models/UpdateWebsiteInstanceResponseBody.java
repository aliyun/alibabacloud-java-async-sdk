// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWebsiteInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWebsiteInstanceResponseBody</p>
 */
public class UpdateWebsiteInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateWebsiteInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWebsiteInstanceResponseBody create() {
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

        public UpdateWebsiteInstanceResponseBody build() {
            return new UpdateWebsiteInstanceResponseBody(this);
        } 

    } 

}
