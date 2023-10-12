// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteEventDefinitionResponseBody</p>
 */
public class DeleteEventDefinitionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteEventDefinitionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEventDefinitionResponseBody create() {
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

        public DeleteEventDefinitionResponseBody build() {
            return new DeleteEventDefinitionResponseBody(this);
        } 

    } 

}
