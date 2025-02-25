// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpandCacheDiskRequest} extends {@link RequestModel}
 *
 * <p>ExpandCacheDiskRequest</p>
 */
public class ExpandCacheDiskRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    @Query
    @NameInMap("LocalFilePath")
    @Validation(required = true)
    private String localFilePath;

    @Query
    @NameInMap("NewSizeInGB")
    @Validation(required = true)
    private Integer newSizeInGB;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ExpandCacheDiskRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.localFilePath = builder.localFilePath;
        this.newSizeInGB = builder.newSizeInGB;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpandCacheDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return localFilePath
     */
    public String getLocalFilePath() {
        return this.localFilePath;
    }

    /**
     * @return newSizeInGB
     */
    public Integer getNewSizeInGB() {
        return this.newSizeInGB;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ExpandCacheDiskRequest, Builder> {
        private String gatewayId; 
        private String localFilePath; 
        private Integer newSizeInGB; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ExpandCacheDiskRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.localFilePath = request.localFilePath;
            this.newSizeInGB = request.newSizeInGB;
            this.securityToken = request.securityToken;
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
         * LocalFilePath.
         */
        public Builder localFilePath(String localFilePath) {
            this.putQueryParameter("LocalFilePath", localFilePath);
            this.localFilePath = localFilePath;
            return this;
        }

        /**
         * NewSizeInGB.
         */
        public Builder newSizeInGB(Integer newSizeInGB) {
            this.putQueryParameter("NewSizeInGB", newSizeInGB);
            this.newSizeInGB = newSizeInGB;
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

        @Override
        public ExpandCacheDiskRequest build() {
            return new ExpandCacheDiskRequest(this);
        } 

    } 

}
