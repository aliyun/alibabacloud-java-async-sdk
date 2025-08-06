// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ValidateCdnUrlAuthRequest} extends {@link RequestModel}
 *
 * <p>ValidateCdnUrlAuthRequest</p>
 */
public class ValidateCdnUrlAuthRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    private Long resourceRealOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ValidateCdnUrlAuthRequest(Builder builder) {
        super(builder);
        this.inputUrl = builder.inputUrl;
        this.ownerId = builder.ownerId;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateCdnUrlAuthRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputUrl
     */
    public String getInputUrl() {
        return this.inputUrl;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceRealOwnerId
     */
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ValidateCdnUrlAuthRequest, Builder> {
        private String inputUrl; 
        private String ownerId; 
        private Long resourceRealOwnerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ValidateCdnUrlAuthRequest request) {
            super(request);
            this.inputUrl = request.inputUrl;
            this.ownerId = request.ownerId;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputUrl(String inputUrl) {
            this.putQueryParameter("InputUrl", inputUrl);
            this.inputUrl = inputUrl;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceRealOwnerId.
         */
        public Builder resourceRealOwnerId(Long resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ValidateCdnUrlAuthRequest build() {
            return new ValidateCdnUrlAuthRequest(this);
        } 

    } 

}
