// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopDeleteMaterialRequest} extends {@link RequestModel}
 *
 * <p>PopDeleteMaterialRequest</p>
 */
public class PopDeleteMaterialRequest extends Request {
    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Query
    @NameInMap("MaterialId")
    @Validation(required = true)
    private String materialId;

    private PopDeleteMaterialRequest(Builder builder) {
        super(builder);
        this.jwtToken = builder.jwtToken;
        this.materialId = builder.materialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopDeleteMaterialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return materialId
     */
    public String getMaterialId() {
        return this.materialId;
    }

    public static final class Builder extends Request.Builder<PopDeleteMaterialRequest, Builder> {
        private String jwtToken; 
        private String materialId; 

        private Builder() {
            super();
        } 

        private Builder(PopDeleteMaterialRequest request) {
            super(request);
            this.jwtToken = request.jwtToken;
            this.materialId = request.materialId;
        } 

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * MaterialId.
         */
        public Builder materialId(String materialId) {
            this.putQueryParameter("MaterialId", materialId);
            this.materialId = materialId;
            return this;
        }

        @Override
        public PopDeleteMaterialRequest build() {
            return new PopDeleteMaterialRequest(this);
        } 

    } 

}
