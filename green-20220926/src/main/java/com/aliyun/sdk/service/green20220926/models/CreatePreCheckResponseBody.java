// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePreCheckResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePreCheckResponseBody</p>
 */
public class CreatePreCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map < String, Boolean > data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePreCheckResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePreCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.Map < String, Boolean > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map < String, Boolean > data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.Map < String, Boolean > data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePreCheckResponseBody build() {
            return new CreatePreCheckResponseBody(this);
        } 

    } 

}
