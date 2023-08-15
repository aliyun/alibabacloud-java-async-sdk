// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceRequest</p>
 */
public class UpdateResourceRequest extends Request {
    @Path
    @NameInMap("requestPath")
    private String requestPath;

    @Body
    @NameInMap("body")
    private java.util.Map < String, ? > body;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("regionId")
    private String regionId;

    private UpdateResourceRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceRequest create() {
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
     * @return body
     */
    public java.util.Map < String, ? > getBody() {
        return this.body;
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

    public static final class Builder extends Request.Builder<UpdateResourceRequest, Builder> {
        private String requestPath; 
        private java.util.Map < String, ? > body; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.body = request.body;
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
         * body.
         */
        public Builder body(java.util.Map < String, ? > body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
        public UpdateResourceRequest build() {
            return new UpdateResourceRequest(this);
        } 

    } 

}
