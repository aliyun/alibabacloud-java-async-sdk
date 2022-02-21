// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDBNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDBNameResponseBody</p>
 */
public class CheckDBNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CheckDBNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDBNameResponseBody create() {
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

        public CheckDBNameResponseBody build() {
            return new CheckDBNameResponseBody(this);
        } 

    } 

}
