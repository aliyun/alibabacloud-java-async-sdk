// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableInsightResponseBody} extends {@link TeaModel}
 *
 * <p>EnableInsightResponseBody</p>
 */
public class EnableInsightResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private EnableInsightResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInsightResponseBody create() {
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

        public EnableInsightResponseBody build() {
            return new EnableInsightResponseBody(this);
        } 

    } 

}
