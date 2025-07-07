// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link DeleteLivyComputeTokenRequest} extends {@link RequestModel}
 *
 * <p>DeleteLivyComputeTokenRequest</p>
 */
public class DeleteLivyComputeTokenRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceBizId")
    private String workspaceBizId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("livyComputeId")
    private String livyComputeId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tokenId")
    private String tokenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private DeleteLivyComputeTokenRequest(Builder builder) {
        super(builder);
        this.workspaceBizId = builder.workspaceBizId;
        this.livyComputeId = builder.livyComputeId;
        this.tokenId = builder.tokenId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLivyComputeTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceBizId
     */
    public String getWorkspaceBizId() {
        return this.workspaceBizId;
    }

    /**
     * @return livyComputeId
     */
    public String getLivyComputeId() {
        return this.livyComputeId;
    }

    /**
     * @return tokenId
     */
    public String getTokenId() {
        return this.tokenId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteLivyComputeTokenRequest, Builder> {
        private String workspaceBizId; 
        private String livyComputeId; 
        private String tokenId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLivyComputeTokenRequest request) {
            super(request);
            this.workspaceBizId = request.workspaceBizId;
            this.livyComputeId = request.livyComputeId;
            this.tokenId = request.tokenId;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceBizId.
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.putPathParameter("workspaceBizId", workspaceBizId);
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        /**
         * livyComputeId.
         */
        public Builder livyComputeId(String livyComputeId) {
            this.putPathParameter("livyComputeId", livyComputeId);
            this.livyComputeId = livyComputeId;
            return this;
        }

        /**
         * <p>Token ID。</p>
         * 
         * <strong>example:</strong>
         * <p>lctk-xxxxxxxxxx</p>
         */
        public Builder tokenId(String tokenId) {
            this.putPathParameter("tokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteLivyComputeTokenRequest build() {
            return new DeleteLivyComputeTokenRequest(this);
        } 

    } 

}
