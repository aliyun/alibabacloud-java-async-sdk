// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterRequest</p>
 */
public class CreateClusterRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterInfo")
    @Validation(required = true)
    private String clusterInfo;

    private CreateClusterRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.clusterInfo = builder.clusterInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterInfo
     */
    public String getClusterInfo() {
        return this.clusterInfo;
    }

    public static final class Builder extends Request.Builder<CreateClusterRequest, Builder> {
        private String clientToken; 
        private String clusterInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.clusterInfo = request.clusterInfo;
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
         * ClusterInfo.
         */
        public Builder clusterInfo(String clusterInfo) {
            this.putQueryParameter("ClusterInfo", clusterInfo);
            this.clusterInfo = clusterInfo;
            return this;
        }

        @Override
        public CreateClusterRequest build() {
            return new CreateClusterRequest(this);
        } 

    } 

}
