// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartHiTSDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RestartHiTSDBInstanceResponseBody</p>
 */
public class RestartHiTSDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RestartHiTSDBInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartHiTSDBInstanceResponseBody create() {
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

        public RestartHiTSDBInstanceResponseBody build() {
            return new RestartHiTSDBInstanceResponseBody(this);
        } 

    } 

}
