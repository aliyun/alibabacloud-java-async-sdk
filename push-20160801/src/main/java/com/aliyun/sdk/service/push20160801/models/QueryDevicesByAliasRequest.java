// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesByAliasRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicesByAliasRequest</p>
 */
public class QueryDevicesByAliasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Alias")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    private QueryDevicesByAliasRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.appKey = builder.appKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesByAliasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    public static final class Builder extends Request.Builder<QueryDevicesByAliasRequest, Builder> {
        private String alias; 
        private Long appKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicesByAliasRequest request) {
            super(request);
            this.alias = request.alias;
            this.appKey = request.appKey;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putQueryParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        @Override
        public QueryDevicesByAliasRequest build() {
            return new QueryDevicesByAliasRequest(this);
        } 

    } 

}
