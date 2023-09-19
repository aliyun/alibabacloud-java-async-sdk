// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretParameterRequest} extends {@link RequestModel}
 *
 * <p>DeleteSecretParameterRequest</p>
 */
public class DeleteSecretParameterRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteSecretParameterRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteSecretParameterRequest, Builder> {
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSecretParameterRequest request) {
            super(request);
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the encryption parameter. The name must be 1 to 180 characters in length and can contain letters, digits, hyphens (-), and underscores (\_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteSecretParameterRequest build() {
            return new DeleteSecretParameterRequest(this);
        } 

    } 

}
