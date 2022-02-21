// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeDbfsResponseBody} extends {@link TeaModel}
 *
 * <p>ResizeDbfsResponseBody</p>
 */
public class ResizeDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResizeDbfsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeDbfsResponseBody create() {
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

        public ResizeDbfsResponseBody build() {
            return new ResizeDbfsResponseBody(this);
        } 

    } 

}
