// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link UnbindAegisResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindAegisResponseBody</p>
 */
public class UnbindAegisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private UnbindAegisResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindAegisResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnbindAegisResponseBody build() {
            return new UnbindAegisResponseBody(this);
        } 

    } 

}
