// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplenishTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReplenishTaskResponseBody</p>
 */
public class CreateReplenishTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("data")
    private Boolean data;

    private CreateReplenishTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReplenishTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean data; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        public CreateReplenishTaskResponseBody build() {
            return new CreateReplenishTaskResponseBody(this);
        } 

    } 

}
