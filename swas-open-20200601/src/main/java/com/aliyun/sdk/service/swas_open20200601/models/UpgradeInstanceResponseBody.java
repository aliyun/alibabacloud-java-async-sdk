// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeInstanceResponseBody</p>
 */
public class UpgradeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpgradeInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeInstanceResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpgradeInstanceResponseBody build() {
            return new UpgradeInstanceResponseBody(this);
        } 

    } 

}
