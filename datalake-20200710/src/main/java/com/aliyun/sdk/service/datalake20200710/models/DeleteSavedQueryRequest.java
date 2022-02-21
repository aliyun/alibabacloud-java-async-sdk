// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSavedQueryRequest} extends {@link RequestModel}
 *
 * <p>DeleteSavedQueryRequest</p>
 */
public class DeleteSavedQueryRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SavedQueryId")
    private String savedQueryId;

    private DeleteSavedQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.savedQueryId = builder.savedQueryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSavedQueryRequest create() {
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
     * @return savedQueryId
     */
    public String getSavedQueryId() {
        return this.savedQueryId;
    }

    public static final class Builder extends Request.Builder<DeleteSavedQueryRequest, Builder> {
        private String regionId; 
        private String savedQueryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSavedQueryRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.savedQueryId = response.savedQueryId;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SavedQueryId.
         */
        public Builder savedQueryId(String savedQueryId) {
            this.putQueryParameter("SavedQueryId", savedQueryId);
            this.savedQueryId = savedQueryId;
            return this;
        }

        @Override
        public DeleteSavedQueryRequest build() {
            return new DeleteSavedQueryRequest(this);
        } 

    } 

}
