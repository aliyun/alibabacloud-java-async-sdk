// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackendModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackendModelRequest</p>
 */
public class DeleteBackendModelRequest extends Request {
    @Query
    @NameInMap("BackendId")
    private String backendId;

    @Query
    @NameInMap("BackendModelId")
    private String backendModelId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
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

        private Builder(DeleteBackendModelRequest response) {
            super(response);
            this.backendId = response.backendId;
            this.backendModelId = response.backendModelId;
            this.securityToken = response.securityToken;
            this.stageName = response.stageName;
        } 

        /**
         * BackendId.
         */
        public Builder backendId(String backendId) {
            this.putQueryParameter("BackendId", backendId);
            this.backendId = backendId;
            return this;
        }

        /**
         * BackendModelId.
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
         * StageName.
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
