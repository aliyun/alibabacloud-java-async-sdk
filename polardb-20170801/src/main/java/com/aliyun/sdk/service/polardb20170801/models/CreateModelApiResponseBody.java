// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateModelApiResponseBody} extends {@link TeaModel}
 *
 * <p>CreateModelApiResponseBody</p>
 */
public class CreateModelApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InvokeEndpoint")
    private String invokeEndpoint;

    @com.aliyun.core.annotation.NameInMap("ModelApiId")
    private String modelApiId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateModelApiResponseBody(Builder builder) {
        this.invokeEndpoint = builder.invokeEndpoint;
        this.modelApiId = builder.modelApiId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelApiResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return invokeEndpoint
     */
    public String getInvokeEndpoint() {
        return this.invokeEndpoint;
    }

    /**
     * @return modelApiId
     */
    public String getModelApiId() {
        return this.modelApiId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String invokeEndpoint; 
        private String modelApiId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateModelApiResponseBody model) {
            this.invokeEndpoint = model.invokeEndpoint;
            this.modelApiId = model.modelApiId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * InvokeEndpoint.
         */
        public Builder invokeEndpoint(String invokeEndpoint) {
            this.invokeEndpoint = invokeEndpoint;
            return this;
        }

        /**
         * ModelApiId.
         */
        public Builder modelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateModelApiResponseBody build() {
            return new CreateModelApiResponseBody(this);
        } 

    } 

}
