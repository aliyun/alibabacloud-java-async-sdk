// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExtensionProviderResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExtensionProviderResponseBody</p>
 */
public class UpdateExtensionProviderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateExtensionProviderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExtensionProviderResponseBody create() {
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

        public UpdateExtensionProviderResponseBody build() {
            return new UpdateExtensionProviderResponseBody(this);
        } 

    } 

}
