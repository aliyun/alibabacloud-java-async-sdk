// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.layerId = layerId;
            return this;
        }

        /**
         * RequestId.
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
