// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTagsRequest} extends {@link RequestModel}
 *
 * <p>QueryTagsRequest</p>
 */
public class QueryTagsRequest extends Request {
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

        private Builder(QueryTagsRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.clientKey = response.clientKey;
            this.keyType = response.keyType;
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

        @Override
        public QueryTagsRequest build() {
            return new QueryTagsRequest(this);
        } 

    } 

}
