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
 * {@link QueryTagsRequest} extends {@link RequestModel}
 *
 * <p>QueryTagsRequest</p>
 */
public class QueryTagsRequest extends Request {
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

    private QueryTagsRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.clientKey = builder.clientKey;
        this.keyType = builder.keyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTagsRequest create() {
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

    public static final class Builder extends Request.Builder<QueryTagsRequest, Builder> {
        private Long appKey; 
        private String clientKey; 
        private String keyType; 

        private Builder() {
            super();
        } 

        private Builder(QueryTagsRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.clientKey = request.clientKey;
            this.keyType = request.keyType;
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
         * <p>e2ba19de97604f55b165576****</p>
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

        @Override
        public QueryTagsRequest build() {
            return new QueryTagsRequest(this);
        } 

    } 

}
