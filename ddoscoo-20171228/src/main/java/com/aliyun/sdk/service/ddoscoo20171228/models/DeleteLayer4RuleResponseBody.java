// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLayer4RuleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLayer4RuleResponseBody</p>
 */
public class DeleteLayer4RuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteLayer4RuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLayer4RuleResponseBody create() {
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

        public DeleteLayer4RuleResponseBody build() {
            return new DeleteLayer4RuleResponseBody(this);
        } 

    } 

}
