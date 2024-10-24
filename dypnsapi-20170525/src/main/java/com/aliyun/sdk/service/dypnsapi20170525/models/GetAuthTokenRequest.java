// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>GetAuthTokenRequest</p>
 */
public class GetAuthTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private Integer bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CmApiCode")
    private Integer cmApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CtApiCode")
    private Integer ctApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CuApiCode")
    private Integer cuApiCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    @com.aliyun.core.annotation.Validation(required = true)
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneCode")
    private String sceneCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private GetAuthTokenRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.cmApiCode = builder.cmApiCode;
        this.ctApiCode = builder.ctApiCode;
        this.cuApiCode = builder.cuApiCode;
        this.origin = builder.origin;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sceneCode = builder.sceneCode;
        this.url = builder.url;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public Integer getBizType() {
        return this.bizType;
    }

    /**
     * @return cmApiCode
     */
    public Integer getCmApiCode() {
        return this.cmApiCode;
    }

    /**
     * @return ctApiCode
     */
    public Integer getCtApiCode() {
        return this.ctApiCode;
    }

    /**
     * @return cuApiCode
     */
    public Integer getCuApiCode() {
        return this.cuApiCode;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sceneCode
     */
    public String getSceneCode() {
        return this.sceneCode;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetAuthTokenRequest, Builder> {
        private Integer bizType; 
        private Integer cmApiCode; 
        private Integer ctApiCode; 
        private Integer cuApiCode; 
        private String origin; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sceneCode; 
        private String url; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthTokenRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.cmApiCode = request.cmApiCode;
            this.ctApiCode = request.ctApiCode;
            this.cuApiCode = request.cuApiCode;
            this.origin = request.origin;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sceneCode = request.sceneCode;
            this.url = request.url;
            this.version = request.version;
        } 

        /**
         * BizType.
         */
        public Builder bizType(Integer bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CmApiCode.
         */
        public Builder cmApiCode(Integer cmApiCode) {
            this.putQueryParameter("CmApiCode", cmApiCode);
            this.cmApiCode = cmApiCode;
            return this;
        }

        /**
         * CtApiCode.
         */
        public Builder ctApiCode(Integer ctApiCode) {
            this.putQueryParameter("CtApiCode", ctApiCode);
            this.ctApiCode = ctApiCode;
            return this;
        }

        /**
         * CuApiCode.
         */
        public Builder cuApiCode(Integer cuApiCode) {
            this.putQueryParameter("CuApiCode", cuApiCode);
            this.cuApiCode = cuApiCode;
            return this;
        }

        /**
         * <p>The requested domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyundoc.com">https://www.aliyundoc.com</a></p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SceneCode.
         */
        public Builder sceneCode(String sceneCode) {
            this.putQueryParameter("SceneCode", sceneCode);
            this.sceneCode = sceneCode;
            return this;
        }

        /**
         * <p>The URL of the requested web page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyundoc.com/">https://www.aliyundoc.com/</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetAuthTokenRequest build() {
            return new GetAuthTokenRequest(this);
        } 

    } 

}
