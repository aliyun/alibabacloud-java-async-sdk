// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ModifyCallbackRequest} extends {@link RequestModel}
 *
 * <p>ModifyCallbackRequest</p>
 */
public class ModifyCallbackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CryptType")
    private String cryptType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

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

    private ModifyCallbackRequest(Builder builder) {
        super(builder);
        this.cryptType = builder.cryptType;
        this.id = builder.id;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.scope = builder.scope;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCallbackRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<ModifyCallbackRequest, Builder> {
        private String cryptType; 
        private Long id; 
        private String name; 
        private String regionId; 
        private String scope; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCallbackRequest request) {
            super(request);
            this.cryptType = request.cryptType;
            this.id = request.id;
            this.name = request.name;
            this.regionId = request.regionId;
            this.scope = request.scope;
            this.url = request.url;
        } 

        /**
         * <p>Encryption algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA256</p>
         */
        public Builder cryptType(String cryptType) {
            this.putBodyParameter("CryptType", cryptType);
            this.cryptType = cryptType;
            return this;
        }

        /**
         * <p>Primary key ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>回调通知</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Result scope.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder scope(String scope) {
            this.putBodyParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>Callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyuncs.com">https://www.aliyuncs.com</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public ModifyCallbackRequest build() {
            return new ModifyCallbackRequest(this);
        } 

    } 

}
