// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link PauseClientResponseBody} extends {@link TeaModel}
 *
 * <p>PauseClientResponseBody</p>
 */
public class PauseClientResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private PauseClientResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseClientResponseBody create() {
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

        public PauseClientResponseBody build() {
            return new PauseClientResponseBody(this);
        } 

    } 

}
