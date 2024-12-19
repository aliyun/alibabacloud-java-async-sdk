// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link CreateBackendModelRequest} extends {@link RequestModel}
 *
 * <p>CreateBackendModelRequest</p>
 */
public class CreateBackendModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendId")
    private String backendId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendModelData")
    private String backendModelData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendType")
    private String backendType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StageName")
    private String stageName;

    private CreateBackendModelRequest(Builder builder) {
        super(builder);
        this.backendId = builder.backendId;
        this.backendModelData = builder.backendModelData;
        this.backendType = builder.backendType;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBackendModelRequest create() {
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
     * @return backendModelData
     */
    public String getBackendModelData() {
        return this.backendModelData;
    }

    /**
     * @return backendType
     */
    public String getBackendType() {
        return this.backendType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<CreateBackendModelRequest, Builder> {
        private String backendId; 
        private String backendModelData; 
        private String backendType; 
        private String description; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(CreateBackendModelRequest request) {
            super(request);
            this.backendId = request.backendId;
            this.backendModelData = request.backendModelData;
            this.backendType = request.backendType;
            this.description = request.description;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
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
         * BackendModelData.
         */
        public Builder backendModelData(String backendModelData) {
            this.putQueryParameter("BackendModelData", backendModelData);
            this.backendModelData = backendModelData;
            return this;
        }

        /**
         * BackendType.
         */
        public Builder backendType(String backendType) {
            this.putQueryParameter("BackendType", backendType);
            this.backendType = backendType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
        public CreateBackendModelRequest build() {
            return new CreateBackendModelRequest(this);
        } 

    } 

}
