// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNamespaceRequest} extends {@link RequestModel}
 *
 * <p>QueryNamespaceRequest</p>
 */
public class QueryNamespaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private QueryNamespaceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.name = builder.name;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<QueryNamespaceRequest, Builder> {
        private String acceptLanguage; 
        private String name; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(QueryNamespaceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.name = request.name;
            this.region = request.region;
        } 

        /**
         * The language of the response. Valid values: zh and en. Default value: zh. The value zh which indicates Chinese, and the value en indicates English.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public QueryNamespaceRequest build() {
            return new QueryNamespaceRequest(this);
        } 

    } 

}
