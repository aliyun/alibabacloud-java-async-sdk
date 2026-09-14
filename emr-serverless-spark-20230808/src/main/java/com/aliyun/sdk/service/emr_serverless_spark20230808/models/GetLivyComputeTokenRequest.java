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
 * {@link GetLivyComputeTokenRequest} extends {@link RequestModel}
 *
 * <p>GetLivyComputeTokenRequest</p>
 */
public class GetLivyComputeTokenRequest extends Request {
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

    private GetLivyComputeTokenRequest(Builder builder) {
        super(builder);
        this.workspaceBizId = builder.workspaceBizId;
        this.livyComputeId = builder.livyComputeId;
        this.tokenId = builder.tokenId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLivyComputeTokenRequest create() {
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

    public static final class Builder extends Request.Builder<GetLivyComputeTokenRequest, Builder> {
        private String workspaceBizId; 
        private String livyComputeId; 
        private String tokenId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLivyComputeTokenRequest request) {
            super(request);
            this.workspaceBizId = request.workspaceBizId;
            this.livyComputeId = request.livyComputeId;
            this.tokenId = request.tokenId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>w-8adde60aa809701f</p>
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.putPathParameter("workspaceBizId", workspaceBizId);
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        /**
         * <p>The ID of the Livy Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>lc-6mkvn01zrg8rqhhv</p>
         */
        public Builder livyComputeId(String livyComputeId) {
            this.putPathParameter("livyComputeId", livyComputeId);
            this.livyComputeId = livyComputeId;
            return this;
        }

        /**
         * <p>The ID of the token.</p>
         * 
         * <strong>example:</strong>
         * <p>lctk-xxxxxxxx</p>
         */
        public Builder tokenId(String tokenId) {
            this.putPathParameter("tokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetLivyComputeTokenRequest build() {
            return new GetLivyComputeTokenRequest(this);
        } 

    } 

}
