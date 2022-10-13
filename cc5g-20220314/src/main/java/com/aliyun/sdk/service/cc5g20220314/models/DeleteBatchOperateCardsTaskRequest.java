// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBatchOperateCardsTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteBatchOperateCardsTaskRequest</p>
 */
public class DeleteBatchOperateCardsTaskRequest extends Request {
    @Query
    @NameInMap("BatchOperateCardsTaskId")
    @Validation(required = true)
    private String batchOperateCardsTaskId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteBatchOperateCardsTaskRequest(Builder builder) {
        super(builder);
        this.batchOperateCardsTaskId = builder.batchOperateCardsTaskId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBatchOperateCardsTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchOperateCardsTaskId
     */
    public String getBatchOperateCardsTaskId() {
        return this.batchOperateCardsTaskId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteBatchOperateCardsTaskRequest, Builder> {
        private String batchOperateCardsTaskId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBatchOperateCardsTaskRequest request) {
            super(request);
            this.batchOperateCardsTaskId = request.batchOperateCardsTaskId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
        } 

        /**
         * BatchOperateCardsTaskId.
         */
        public Builder batchOperateCardsTaskId(String batchOperateCardsTaskId) {
            this.putQueryParameter("BatchOperateCardsTaskId", batchOperateCardsTaskId);
            this.batchOperateCardsTaskId = batchOperateCardsTaskId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
        public DeleteBatchOperateCardsTaskRequest build() {
            return new DeleteBatchOperateCardsTaskRequest(this);
        } 

    } 

}
