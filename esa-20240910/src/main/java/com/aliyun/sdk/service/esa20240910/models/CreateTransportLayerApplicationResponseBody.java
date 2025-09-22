// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateTransportLayerApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransportLayerApplicationResponseBody</p>
 */
public class CreateTransportLayerApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private Long applicationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateTransportLayerApplicationResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransportLayerApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public Long getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long applicationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateTransportLayerApplicationResponseBody model) {
            this.applicationId = model.applicationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Layer 4 application ID</p>
         * 
         * <strong>example:</strong>
         * <p>165503967****</p>
         */
        public Builder applicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9e5448c7-edaf-49aa-9887-0fcd0832306c</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateTransportLayerApplicationResponseBody build() {
            return new CreateTransportLayerApplicationResponseBody(this);
        } 

    } 

}
