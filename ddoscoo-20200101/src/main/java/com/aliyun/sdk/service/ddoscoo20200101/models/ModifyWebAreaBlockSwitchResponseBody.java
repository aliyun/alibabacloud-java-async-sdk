// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebAreaBlockSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWebAreaBlockSwitchResponseBody</p>
 */
public class ModifyWebAreaBlockSwitchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyWebAreaBlockSwitchResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebAreaBlockSwitchResponseBody create() {
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

        public ModifyWebAreaBlockSwitchResponseBody build() {
            return new ModifyWebAreaBlockSwitchResponseBody(this);
        } 

    } 

}
