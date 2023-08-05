// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInterceptionTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInterceptionTargetResponseBody</p>
 */
public class DeleteInterceptionTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private DeleteInterceptionTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInterceptionTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the network objects are removed. Valid values:
         * <p>
         * 
         * *   **true**: The network objects are removed.
         * *   **false**: The network objects fail to be removed.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public DeleteInterceptionTargetResponseBody build() {
            return new DeleteInterceptionTargetResponseBody(this);
        } 

    } 

}
