// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetClusterDnatResponseBody} extends {@link TeaModel}
 *
 * <p>SetClusterDnatResponseBody</p>
 */
public class SetClusterDnatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private SetClusterDnatResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetClusterDnatResponseBody create() {
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

        public SetClusterDnatResponseBody build() {
            return new SetClusterDnatResponseBody(this);
        } 

    } 

}
