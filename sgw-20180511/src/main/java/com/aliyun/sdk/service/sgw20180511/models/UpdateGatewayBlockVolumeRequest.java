// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayBlockVolumeRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayBlockVolumeRequest</p>
 */
public class UpdateGatewayBlockVolumeRequest extends Request {
    @Query
    @NameInMap("ChapEnabled")
    private Boolean chapEnabled;

    @Query
    @NameInMap("ChapInPassword")
    private String chapInPassword;

    @Query
    @NameInMap("ChapInUser")
    private String chapInUser;

    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("IndexId")
    @Validation(required = true)
    private String indexId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Size")
    private Long size;

    private UpdateGatewayBlockVolumeRequest(Builder builder) {
        super(builder);
        this.chapEnabled = builder.chapEnabled;
        this.chapInPassword = builder.chapInPassword;
        this.chapInUser = builder.chapInUser;
        this.gatewayId = builder.gatewayId;
        this.indexId = builder.indexId;
        this.securityToken = builder.securityToken;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayBlockVolumeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chapEnabled
     */
    public Boolean getChapEnabled() {
        return this.chapEnabled;
    }

    /**
     * @return chapInPassword
     */
    public String getChapInPassword() {
        return this.chapInPassword;
    }

    /**
     * @return chapInUser
     */
    public String getChapInUser() {
        return this.chapInUser;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayBlockVolumeRequest, Builder> {
        private Boolean chapEnabled; 
        private String chapInPassword; 
        private String chapInUser; 
        private String gatewayId; 
        private String indexId; 
        private String securityToken; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayBlockVolumeRequest request) {
            super(request);
            this.chapEnabled = request.chapEnabled;
            this.chapInPassword = request.chapInPassword;
            this.chapInUser = request.chapInUser;
            this.gatewayId = request.gatewayId;
            this.indexId = request.indexId;
            this.securityToken = request.securityToken;
            this.size = request.size;
        } 

        /**
         * ChapEnabled.
         */
        public Builder chapEnabled(Boolean chapEnabled) {
            this.putQueryParameter("ChapEnabled", chapEnabled);
            this.chapEnabled = chapEnabled;
            return this;
        }

        /**
         * ChapInPassword.
         */
        public Builder chapInPassword(String chapInPassword) {
            this.putQueryParameter("ChapInPassword", chapInPassword);
            this.chapInPassword = chapInPassword;
            return this;
        }

        /**
         * ChapInUser.
         */
        public Builder chapInUser(String chapInUser) {
            this.putQueryParameter("ChapInUser", chapInUser);
            this.chapInUser = chapInUser;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
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
         * Size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public UpdateGatewayBlockVolumeRequest build() {
            return new UpdateGatewayBlockVolumeRequest(this);
        } 

    } 

}
