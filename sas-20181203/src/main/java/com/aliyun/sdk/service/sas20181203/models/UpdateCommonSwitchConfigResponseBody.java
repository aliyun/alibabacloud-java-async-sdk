// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCommonSwitchConfigResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCommonSwitchConfigResponseBody</p>
 */
public class UpdateCommonSwitchConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateCommonSwitchConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCommonSwitchConfigResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCommonSwitchConfigResponseBody build() {
            return new UpdateCommonSwitchConfigResponseBody(this);
        } 

    } 

}
