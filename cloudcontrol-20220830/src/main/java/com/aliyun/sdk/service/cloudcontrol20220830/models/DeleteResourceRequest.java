// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceRequest</p>
 */
public class DeleteResourceRequest extends Request {
    @Path
    @NameInMap("requestPath")
    private String requestPath;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("regionId")
    private String regionId;

    private DeleteResourceRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPath
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteResourceRequest, Builder> {
        private String requestPath; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * requestPath.
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
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
        public DeleteResourceRequest build() {
            return new DeleteResourceRequest(this);
        } 

    } 

}
