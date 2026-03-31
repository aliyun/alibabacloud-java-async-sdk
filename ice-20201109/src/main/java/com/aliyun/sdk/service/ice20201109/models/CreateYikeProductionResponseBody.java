// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateYikeProductionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateYikeProductionResponseBody</p>
 */
public class CreateYikeProductionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    private String productionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateYikeProductionResponseBody(Builder builder) {
        this.productionId = builder.productionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYikeProductionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String productionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateYikeProductionResponseBody model) {
            this.productionId = model.productionId;
            this.requestId = model.requestId;
        } 

        /**
         * ProductionId.
         */
        public Builder productionId(String productionId) {
            this.productionId = productionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateYikeProductionResponseBody build() {
            return new CreateYikeProductionResponseBody(this);
        } 

    } 

}
