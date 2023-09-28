// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchProductResponseBody} extends {@link TeaModel}
 *
 * <p>LaunchProductResponseBody</p>
 */
public class LaunchProductResponseBody extends TeaModel {
    @NameInMap("ProvisionedProductId")
    private String provisionedProductId;

    @NameInMap("RequestId")
    private String requestId;

    private LaunchProductResponseBody(Builder builder) {
        this.provisionedProductId = builder.provisionedProductId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchProductResponseBody create() {
        return builder().build();
    }

    /**
     * @return provisionedProductId
     */
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String provisionedProductId; 
        private String requestId; 

        /**
         * The ID of the instance
         */
        public Builder provisionedProductId(String provisionedProductId) {
            this.provisionedProductId = provisionedProductId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LaunchProductResponseBody build() {
            return new LaunchProductResponseBody(this);
        } 

    } 

}
