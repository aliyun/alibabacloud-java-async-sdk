// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterSpecificationRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterSpecificationRequest</p>
 */
public class QueryClusterSpecificationRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConnectType")
    private String connectType;

    private QueryClusterSpecificationRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.connectType = builder.connectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterSpecificationRequest create() {
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
     * @return connectType
     */
    public String getConnectType() {
        return this.connectType;
    }

    public static final class Builder extends Request.Builder<QueryClusterSpecificationRequest, Builder> {
        private String acceptLanguage; 
        private String connectType; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterSpecificationRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.connectType = response.connectType;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * 网络连接类型
         */
        public Builder connectType(String connectType) {
            this.putQueryParameter("ConnectType", connectType);
            this.connectType = connectType;
            return this;
        }

        @Override
        public QueryClusterSpecificationRequest build() {
            return new QueryClusterSpecificationRequest(this);
        } 

    } 

}
