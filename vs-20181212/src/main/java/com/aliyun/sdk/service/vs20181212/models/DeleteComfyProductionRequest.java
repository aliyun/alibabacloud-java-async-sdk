// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DeleteComfyProductionRequest} extends {@link RequestModel}
 *
 * <p>DeleteComfyProductionRequest</p>
 */
public class DeleteComfyProductionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    private String productionId;

    private DeleteComfyProductionRequest(Builder builder) {
        super(builder);
        this.productionId = builder.productionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteComfyProductionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    public static final class Builder extends Request.Builder<DeleteComfyProductionRequest, Builder> {
        private String productionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteComfyProductionRequest request) {
            super(request);
            this.productionId = request.productionId;
        } 

        /**
         * ProductionId.
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        @Override
        public DeleteComfyProductionRequest build() {
            return new DeleteComfyProductionRequest(this);
        } 

    } 

}
