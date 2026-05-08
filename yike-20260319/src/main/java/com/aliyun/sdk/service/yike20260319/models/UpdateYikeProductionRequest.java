// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link UpdateYikeProductionRequest} extends {@link RequestModel}
 *
 * <p>UpdateYikeProductionRequest</p>
 */
public class UpdateYikeProductionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private UpdateYikeProductionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.productionId = builder.productionId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateYikeProductionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateYikeProductionRequest, Builder> {
        private String regionId; 
        private String productionId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateYikeProductionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.productionId = request.productionId;
            this.title = request.title;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_12334**</p>
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateYikeProductionRequest build() {
            return new UpdateYikeProductionRequest(this);
        } 

    } 

}
