// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateForwardEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateForwardEntryResponseBody</p>
 */
public class CreateForwardEntryResponseBody extends TeaModel {
    @NameInMap("ForwardEntryId")
    private String forwardEntryId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateForwardEntryResponseBody(Builder builder) {
        this.forwardEntryId = builder.forwardEntryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateForwardEntryResponseBody create() {
        return builder().build();
    }

    /**
     * @return forwardEntryId
     */
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String forwardEntryId; 
        private String requestId; 

        /**
         * ForwardEntryId.
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateForwardEntryResponseBody build() {
            return new CreateForwardEntryResponseBody(this);
        } 

    } 

}
