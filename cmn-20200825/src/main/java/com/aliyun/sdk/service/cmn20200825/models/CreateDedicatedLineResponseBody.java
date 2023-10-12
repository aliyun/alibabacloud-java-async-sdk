// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedLineResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDedicatedLineResponseBody</p>
 */
public class CreateDedicatedLineResponseBody extends TeaModel {
    @NameInMap("DedicatedLineId")
    private String dedicatedLineId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDedicatedLineResponseBody(Builder builder) {
        this.dedicatedLineId = builder.dedicatedLineId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedLineResponseBody create() {
        return builder().build();
    }

    /**
     * @return dedicatedLineId
     */
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dedicatedLineId; 
        private String requestId; 

        /**
         * DedicatedLineId.
         */
        public Builder dedicatedLineId(String dedicatedLineId) {
            this.dedicatedLineId = dedicatedLineId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDedicatedLineResponseBody build() {
            return new CreateDedicatedLineResponseBody(this);
        } 

    } 

}
