// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedFilterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomizedFilterResponseBody</p>
 */
public class CreateCustomizedFilterResponseBody extends TeaModel {
    @NameInMap("CustomizedFilterId")
    private String customizedFilterId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCustomizedFilterResponseBody(Builder builder) {
        this.customizedFilterId = builder.customizedFilterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedFilterResponseBody create() {
        return builder().build();
    }

    /**
     * @return customizedFilterId
     */
    public String getCustomizedFilterId() {
        return this.customizedFilterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customizedFilterId; 
        private String requestId; 

        /**
         * CustomizedFilterId.
         */
        public Builder customizedFilterId(String customizedFilterId) {
            this.customizedFilterId = customizedFilterId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomizedFilterResponseBody build() {
            return new CreateCustomizedFilterResponseBody(this);
        } 

    } 

}
