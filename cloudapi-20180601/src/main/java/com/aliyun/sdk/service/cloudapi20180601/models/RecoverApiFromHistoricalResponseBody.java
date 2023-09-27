// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverApiFromHistoricalResponseBody} extends {@link TeaModel}
 *
 * <p>RecoverApiFromHistoricalResponseBody</p>
 */
public class RecoverApiFromHistoricalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RecoverApiFromHistoricalResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverApiFromHistoricalResponseBody create() {
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

        public RecoverApiFromHistoricalResponseBody build() {
            return new RecoverApiFromHistoricalResponseBody(this);
        } 

    } 

}
