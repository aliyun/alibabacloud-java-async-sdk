// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDeploymentResponseBody</p>
 */
public class CreateDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDeploymentResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String id; 
        private String requestId; 

        /**
         * <p>The ID of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7C352CB7-CD88-50CF-9D0D-E81BDF02XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDeploymentResponseBody build() {
            return new CreateDeploymentResponseBody(this);
        } 

    } 

}
