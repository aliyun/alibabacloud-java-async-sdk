// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceResponseBody</p>
 */
public class CreateServiceResponseBody extends TeaModel {
    @NameInMap("ModelServiceId")
    private String modelServiceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateServiceResponseBody(Builder builder) {
        this.modelServiceId = builder.modelServiceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String modelServiceId; 
        private String requestId; 

        /**
         * ModelServiceId.
         */
        public Builder modelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateServiceResponseBody build() {
            return new CreateServiceResponseBody(this);
        } 

    } 

}
