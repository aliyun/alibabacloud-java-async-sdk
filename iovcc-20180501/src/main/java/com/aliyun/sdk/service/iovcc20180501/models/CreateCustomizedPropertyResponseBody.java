// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedPropertyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomizedPropertyResponseBody</p>
 */
public class CreateCustomizedPropertyResponseBody extends TeaModel {
    @NameInMap("CustomizedPropertyId")
    private String customizedPropertyId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCustomizedPropertyResponseBody(Builder builder) {
        this.customizedPropertyId = builder.customizedPropertyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedPropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return customizedPropertyId
     */
    public String getCustomizedPropertyId() {
        return this.customizedPropertyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String customizedPropertyId; 
        private String requestId; 

        /**
         * CustomizedPropertyId.
         */
        public Builder customizedPropertyId(String customizedPropertyId) {
            this.customizedPropertyId = customizedPropertyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCustomizedPropertyResponseBody build() {
            return new CreateCustomizedPropertyResponseBody(this);
        } 

    } 

}
