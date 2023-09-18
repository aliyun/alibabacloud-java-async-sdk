// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDtsJobConfigResponseBody</p>
 */
public class ModifyDtsJobConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDtsJobConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobConfigResponseBody create() {
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

        public ModifyDtsJobConfigResponseBody build() {
            return new ModifyDtsJobConfigResponseBody(this);
        } 

    } 

}
