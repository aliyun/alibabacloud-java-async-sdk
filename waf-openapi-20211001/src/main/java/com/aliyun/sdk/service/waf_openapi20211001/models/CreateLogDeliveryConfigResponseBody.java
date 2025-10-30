// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateLogDeliveryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLogDeliveryConfigResponseBody</p>
 */
public class CreateLogDeliveryConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryName")
    private String deliveryName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLogDeliveryConfigResponseBody(Builder builder) {
        this.deliveryName = builder.deliveryName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLogDeliveryConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryName
     */
    public String getDeliveryName() {
        return this.deliveryName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deliveryName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateLogDeliveryConfigResponseBody model) {
            this.deliveryName = model.deliveryName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The name of the log delivery configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder deliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26E46541-7AAB-5565-801D-F14DBDC5****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLogDeliveryConfigResponseBody build() {
            return new CreateLogDeliveryConfigResponseBody(this);
        } 

    } 

}
