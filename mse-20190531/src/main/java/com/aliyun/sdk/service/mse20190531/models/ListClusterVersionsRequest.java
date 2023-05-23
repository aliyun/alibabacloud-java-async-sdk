// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListClusterVersionsRequest</p>
 */
public class ListClusterVersionsRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("MseVersion")
    private String mseVersion;

    private ListClusterVersionsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterType = builder.clusterType;
        this.mseVersion = builder.mseVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterVersionsRequest create() {
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

    /**
     * @return mseVersion
     */
    public String getMseVersion() {
        return this.mseVersion;
    }

    public static final class Builder extends Request.Builder<ListClusterVersionsRequest, Builder> {
        private String acceptLanguage; 
        private String clusterType; 
        private String mseVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterVersionsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterType = request.clusterType;
            this.mseVersion = request.mseVersion;
        } 

        /**
         * duplicated cluster alias name
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * mse-200-105
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * duplicatedClusterAliasName
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        @Override
        public ListClusterVersionsRequest build() {
            return new ListClusterVersionsRequest(this);
        } 

    } 

}
