// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateProductVersionResponseBody</p>
 */
public class UpdateProductVersionResponseBody extends TeaModel {
    @NameInMap("ProductVersionId")
    private String productVersionId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateProductVersionResponseBody(Builder builder) {
        this.productVersionId = builder.productVersionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return productVersionId
     */
    public String getProductVersionId() {
        return this.productVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String productVersionId; 
        private String requestId; 

        /**
         * The ID of the product version.
         */
        public Builder productVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateProductVersionResponseBody build() {
            return new UpdateProductVersionResponseBody(this);
        } 

    } 

}
