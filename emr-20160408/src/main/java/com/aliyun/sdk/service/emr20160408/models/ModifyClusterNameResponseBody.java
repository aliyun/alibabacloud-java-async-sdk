// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterNameResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyClusterNameResponseBody</p>
 */
public class ModifyClusterNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyClusterNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterNameResponseBody create() {
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

        public ModifyClusterNameResponseBody build() {
            return new ModifyClusterNameResponseBody(this);
        } 

    } 

}
