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
 * {@link DescribeComfyProductionDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeComfyProductionDownloadUrlRequest</p>
 */
public class DescribeComfyProductionDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productionId;

    private DescribeComfyProductionDownloadUrlRequest(Builder builder) {
        super(builder);
        this.productionId = builder.productionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComfyProductionDownloadUrlRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeComfyProductionDownloadUrlRequest, Builder> {
        private String productionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeComfyProductionDownloadUrlRequest request) {
            super(request);
            this.productionId = request.productionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3e5bda20-5cd4-4d55-8d23-88d624a18caa</p>
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        @Override
        public DescribeComfyProductionDownloadUrlRequest build() {
            return new DescribeComfyProductionDownloadUrlRequest(this);
        } 

    } 

}
