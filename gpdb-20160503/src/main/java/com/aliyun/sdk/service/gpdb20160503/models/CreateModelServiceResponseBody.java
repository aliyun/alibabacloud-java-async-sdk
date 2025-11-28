// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateModelServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelServiceResponseBody</p>
 */
public class CreateModelServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelServiceId")
    private String modelServiceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateModelServiceResponseBody(Builder builder) {
        this.modelServiceId = builder.modelServiceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateModelServiceResponseBody model) {
            this.modelServiceId = model.modelServiceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The model service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-xxxxxxxxx</p>
         */
        public Builder modelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateModelServiceResponseBody build() {
            return new CreateModelServiceResponseBody(this);
        } 

    } 

}
