// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductInstanceConfigRequest</p>
 */
public class DeleteProductInstanceConfigRequest extends Request {
    @Path
    @NameInMap("configUID")
    @Validation(required = true)
    private String configUID;

    @Query
    @NameInMap("environmentUID")
    @Validation(required = true)
    private String environmentUID;

    @Query
    @NameInMap("productVersionUID")
    @Validation(required = true)
    private String productVersionUID;

    private DeleteProductInstanceConfigRequest(Builder builder) {
        super(builder);
        this.configUID = builder.configUID;
        this.environmentUID = builder.environmentUID;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configUID
     */
    public String getConfigUID() {
        return this.configUID;
    }

    /**
     * @return environmentUID
     */
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<DeleteProductInstanceConfigRequest, Builder> {
        private String configUID; 
        private String environmentUID; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductInstanceConfigRequest request) {
            super(request);
            this.configUID = request.configUID;
            this.environmentUID = request.environmentUID;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * configUID.
         */
        public Builder configUID(String configUID) {
            this.putPathParameter("configUID", configUID);
            this.configUID = configUID;
            return this;
        }

        /**
         * environmentUID.
         */
        public Builder environmentUID(String environmentUID) {
            this.putQueryParameter("environmentUID", environmentUID);
            this.environmentUID = environmentUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public DeleteProductInstanceConfigRequest build() {
            return new DeleteProductInstanceConfigRequest(this);
        } 

    } 

}
