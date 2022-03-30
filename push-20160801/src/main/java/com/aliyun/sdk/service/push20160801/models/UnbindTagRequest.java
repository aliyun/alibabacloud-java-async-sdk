// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindTagRequest} extends {@link RequestModel}
 *
 * <p>UnbindTagRequest</p>
 */
public class UnbindTagRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("ClientKey")
    @Validation(required = true)
    private String clientKey;

    @Query
    @NameInMap("KeyType")
    @Validation(required = true)
    private String keyType;

    @Query
    @NameInMap("TagName")
    @Validation(required = true)
    private String tagName;

    private UnbindTagRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.clientKey = builder.clientKey;
        this.keyType = builder.keyType;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return clientKey
     */
    public String getClientKey() {
        return this.clientKey;
    }

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<UnbindTagRequest, Builder> {
        private Long appKey; 
        private String clientKey; 
        private String keyType; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(UnbindTagRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.clientKey = request.clientKey;
            this.keyType = request.keyType;
            this.tagName = request.tagName;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * ClientKey.
         */
        public Builder clientKey(String clientKey) {
            this.putQueryParameter("ClientKey", clientKey);
            this.clientKey = clientKey;
            return this;
        }

        /**
         * KeyType.
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public UnbindTagRequest build() {
            return new UnbindTagRequest(this);
        } 

    } 

}
