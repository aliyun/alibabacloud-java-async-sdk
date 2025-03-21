// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link UnbindTagRequest} extends {@link RequestModel}
 *
 * <p>UnbindTagRequest</p>
 */
public class UnbindTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e2ba19de97604f55b16557673****</p>
         */
        public Builder clientKey(String clientKey) {
            this.putQueryParameter("ClientKey", clientKey);
            this.clientKey = clientKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tag1,test_tag2</p>
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
