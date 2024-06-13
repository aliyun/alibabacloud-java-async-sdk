// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackendModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackendModelRequest</p>
 */
public class DeleteBackendModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendId")
    private String backendId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backendModelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    private String stageName;

    private DeleteBackendModelRequest(Builder builder) {
        super(builder);
        this.backendId = builder.backendId;
        this.backendModelId = builder.backendModelId;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackendModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendId
     */
    public String getBackendId() {
        return this.backendId;
    }

    /**
     * @return backendModelId
     */
    public String getBackendModelId() {
        return this.backendModelId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder extends Request.Builder<DeleteBackendModelRequest, Builder> {
        private String backendId; 
        private String backendModelId; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackendModelRequest request) {
            super(request);
            this.backendId = request.backendId;
            this.backendModelId = request.backendModelId;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * The ID of the backend service.
         */
        public Builder backendId(String backendId) {
            this.putQueryParameter("BackendId", backendId);
            this.backendId = backendId;
            return this;
        }

        /**
         * The ID of the backend model.
         */
        public Builder backendModelId(String backendModelId) {
            this.putQueryParameter("BackendModelId", backendModelId);
            this.backendModelId = backendModelId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The environment to which the API is published. Valid values:
         * <p>
         * 
         * *   **RELEASE**
         * *   **PRE**
         * *   **TEST**
         * 
         * If you do not specify this parameter, APIs in the draft state are returned.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public DeleteBackendModelRequest build() {
            return new DeleteBackendModelRequest(this);
        } 

    } 

}
