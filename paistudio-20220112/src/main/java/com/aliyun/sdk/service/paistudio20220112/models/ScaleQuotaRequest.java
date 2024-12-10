// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScaleQuotaRequest} extends {@link RequestModel}
 *
 * <p>ScaleQuotaRequest</p>
 */
public class ScaleQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Min")
    private ResourceSpec min;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupIds")
    private java.util.List < String > resourceGroupIds;

    private ScaleQuotaRequest(Builder builder) {
        super(builder);
        this.quotaId = builder.quotaId;
        this.min = builder.min;
        this.resourceGroupIds = builder.resourceGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return min
     */
    public ResourceSpec getMin() {
        return this.min;
    }

    /**
     * @return resourceGroupIds
     */
    public java.util.List < String > getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public static final class Builder extends Request.Builder<ScaleQuotaRequest, Builder> {
        private String quotaId; 
        private ResourceSpec min; 
        private java.util.List < String > resourceGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ScaleQuotaRequest request) {
            super(request);
            this.quotaId = request.quotaId;
            this.min = request.min;
            this.resourceGroupIds = request.resourceGroupIds;
        } 

        /**
         * <p>Quota ID</p>
         * 
         * <strong>example:</strong>
         * <p>quotamtl37ge7gkvdz</p>
         */
        public Builder quotaId(String quotaId) {
            this.putPathParameter("QuotaId", quotaId);
            this.quotaId = quotaId;
            return this;
        }

        /**
         * Min.
         */
        public Builder min(ResourceSpec min) {
            this.putBodyParameter("Min", min);
            this.min = min;
            return this;
        }

        /**
         * ResourceGroupIds.
         */
        public Builder resourceGroupIds(java.util.List < String > resourceGroupIds) {
            this.putBodyParameter("ResourceGroupIds", resourceGroupIds);
            this.resourceGroupIds = resourceGroupIds;
            return this;
        }

        @Override
        public ScaleQuotaRequest build() {
            return new ScaleQuotaRequest(this);
        } 

    } 

}
