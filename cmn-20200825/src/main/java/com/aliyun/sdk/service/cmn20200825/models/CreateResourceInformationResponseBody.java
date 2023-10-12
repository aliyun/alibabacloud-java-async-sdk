// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceInformationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceInformationResponseBody</p>
 */
public class CreateResourceInformationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceInformationId")
    private String resourceInformationId;

    private CreateResourceInformationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceInformationId = builder.resourceInformationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceInformationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceInformationId
     */
    public String getResourceInformationId() {
        return this.resourceInformationId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceInformationId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceInformationId.
         */
        public Builder resourceInformationId(String resourceInformationId) {
            this.resourceInformationId = resourceInformationId;
            return this;
        }

        public CreateResourceInformationResponseBody build() {
            return new CreateResourceInformationResponseBody(this);
        } 

    } 

}
