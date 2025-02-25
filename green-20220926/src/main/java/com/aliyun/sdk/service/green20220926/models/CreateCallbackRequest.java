// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCallbackRequest} extends {@link RequestModel}
 *
 * <p>CreateCallbackRequest</p>
 */
public class CreateCallbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CryptType")
    private String cryptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private CreateCallbackRequest(Builder builder) {
        super(builder);
        this.cryptType = builder.cryptType;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cryptType
     */
    public String getCryptType() {
        return this.cryptType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateCallbackRequest, Builder> {
        private String cryptType; 
        private String name; 
        private String regionId; 
        private String scope; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateCallbackRequest request) {
            super(request);
            this.cryptType = request.cryptType;
            this.name = request.name;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.url = request.url;
        } 

        /**
         * CryptType.
         */
        public Builder cryptType(String cryptType) {
            this.putBodyParameter("CryptType", cryptType);
            this.cryptType = cryptType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateCallbackRequest build() {
            return new CreateCallbackRequest(this);
        } 

    } 

}
