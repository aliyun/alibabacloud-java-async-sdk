// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link CreateLayerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLayerResponseBody</p>
 */
public class CreateLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LayerId")
    private String layerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLayerResponseBody(Builder builder) {
        this.layerId = builder.layerId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String layerId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateLayerResponseBody model) {
            this.layerId = model.layerId;
            this.requestId = model.requestId;
        } 

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.layerId = layerId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLayerResponseBody build() {
            return new CreateLayerResponseBody(this);
        } 

    } 

}
