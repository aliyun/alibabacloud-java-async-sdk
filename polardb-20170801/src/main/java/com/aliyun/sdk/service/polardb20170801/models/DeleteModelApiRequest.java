// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteModelApiRequest} extends {@link RequestModel}
 *
 * <p>DeleteModelApiRequest</p>
 */
public class DeleteModelApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelApiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteModelApiRequest(Builder builder) {
        super(builder);
        this.gwClusterId = builder.gwClusterId;
        this.modelApiId = builder.modelApiId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModelApiRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return modelApiId
     */
    public String getModelApiId() {
        return this.modelApiId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteModelApiRequest, Builder> {
        private String gwClusterId; 
        private String modelApiId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModelApiRequest request) {
            super(request);
            this.gwClusterId = request.gwClusterId;
            this.modelApiId = request.modelApiId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mi-xxxxx</p>
         */
        public Builder modelApiId(String modelApiId) {
            this.putQueryParameter("ModelApiId", modelApiId);
            this.modelApiId = modelApiId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteModelApiRequest build() {
            return new DeleteModelApiRequest(this);
        } 

    } 

}
