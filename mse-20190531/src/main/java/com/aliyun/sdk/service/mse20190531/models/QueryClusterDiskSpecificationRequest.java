// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryClusterDiskSpecificationRequest} extends {@link RequestModel}
 *
 * <p>QueryClusterDiskSpecificationRequest</p>
 */
public class QueryClusterDiskSpecificationRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    private QueryClusterDiskSpecificationRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterType = builder.clusterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryClusterDiskSpecificationRequest create() {
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
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    public static final class Builder extends Request.Builder<QueryClusterDiskSpecificationRequest, Builder> {
        private String acceptLanguage; 
        private String clusterType; 

        private Builder() {
            super();
        } 

        private Builder(QueryClusterDiskSpecificationRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.clusterType = response.clusterType;
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
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        @Override
        public QueryClusterDiskSpecificationRequest build() {
            return new QueryClusterDiskSpecificationRequest(this);
        } 

    } 

}
