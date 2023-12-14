// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>OperateApplicationResponseBody</p>
 */
public class OperateApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private OperateApplicationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateApplicationResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OperateApplicationResponseBody build() {
            return new OperateApplicationResponseBody(this);
        } 

    } 

}
