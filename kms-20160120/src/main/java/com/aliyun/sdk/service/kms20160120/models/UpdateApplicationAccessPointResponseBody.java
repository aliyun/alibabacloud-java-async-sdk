// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationAccessPointResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationAccessPointResponseBody</p>
 */
public class UpdateApplicationAccessPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateApplicationAccessPointResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationAccessPointResponseBody create() {
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

        public UpdateApplicationAccessPointResponseBody build() {
            return new UpdateApplicationAccessPointResponseBody(this);
        } 

    } 

}
