// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRequest</p>
 */
public class CreateResourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map < String, ? > body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private CreateResourceRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRequest create() {
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

    public static final class Builder extends Request.Builder<CreateResourceRequest, Builder> {
        private String requestPath; 
        private java.util.Map < String, ? > body; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceRequest request) {
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
        public CreateResourceRequest build() {
            return new CreateResourceRequest(this);
        } 

    } 

}
