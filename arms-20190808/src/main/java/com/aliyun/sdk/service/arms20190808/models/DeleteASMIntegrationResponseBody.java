// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteASMIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteASMIntegrationResponseBody</p>
 */
public class DeleteASMIntegrationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
    private Boolean state;

    private DeleteASMIntegrationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteASMIntegrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public Boolean getState() {
        return this.state;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean state; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(Boolean state) {
            this.state = state;
            return this;
        }

        public DeleteASMIntegrationResponseBody build() {
            return new DeleteASMIntegrationResponseBody(this);
        } 

    } 

}
