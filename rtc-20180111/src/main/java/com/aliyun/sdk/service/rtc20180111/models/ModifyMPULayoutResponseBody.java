// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMPULayoutResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyMPULayoutResponseBody</p>
 */
public class ModifyMPULayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyMPULayoutResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMPULayoutResponseBody create() {
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

        public ModifyMPULayoutResponseBody build() {
            return new ModifyMPULayoutResponseBody(this);
        } 

    } 

}
