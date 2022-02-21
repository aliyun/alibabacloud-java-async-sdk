// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePkgVersionRequest} extends {@link RequestModel}
 *
 * <p>DeletePkgVersionRequest</p>
 */
public class DeletePkgVersionRequest extends Request {
    @Query
    @NameInMap("PkgVersionId")
    @Validation(required = true)
    private String pkgVersionId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeletePkgVersionRequest(Builder builder) {
        super(builder);
        this.pkgVersionId = builder.pkgVersionId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePkgVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pkgVersionId
     */
    public String getPkgVersionId() {
        return this.pkgVersionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeletePkgVersionRequest, Builder> {
        private String pkgVersionId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePkgVersionRequest response) {
            super(response);
            this.pkgVersionId = response.pkgVersionId;
            this.regionId = response.regionId;
        } 

        /**
         * PkgVersionId.
         */
        public Builder pkgVersionId(String pkgVersionId) {
            this.putQueryParameter("PkgVersionId", pkgVersionId);
            this.pkgVersionId = pkgVersionId;
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
        public DeletePkgVersionRequest build() {
            return new DeletePkgVersionRequest(this);
        } 

    } 

}
