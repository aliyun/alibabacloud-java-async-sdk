// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartBEClusterResponseBody} extends {@link TeaModel}
 *
 * <p>StartBEClusterResponseBody</p>
 */
public class StartBEClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StartBEClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartBEClusterResponseBody create() {
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

        public StartBEClusterResponseBody build() {
            return new StartBEClusterResponseBody(this);
        } 

    } 

}
