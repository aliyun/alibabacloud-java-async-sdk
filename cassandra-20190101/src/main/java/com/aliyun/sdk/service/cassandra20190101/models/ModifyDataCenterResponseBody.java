// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataCenterResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDataCenterResponseBody</p>
 */
public class ModifyDataCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDataCenterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataCenterResponseBody create() {
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

        public ModifyDataCenterResponseBody build() {
            return new ModifyDataCenterResponseBody(this);
        } 

    } 

}
