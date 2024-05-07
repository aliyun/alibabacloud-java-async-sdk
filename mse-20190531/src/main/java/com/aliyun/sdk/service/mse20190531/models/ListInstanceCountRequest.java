// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceCountRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceCountRequest</p>
 */
public class ListInstanceCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseVersion")
    private String mseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestPars")
    private String requestPars;

    private ListInstanceCountRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterType = builder.clusterType;
        this.mseVersion = builder.mseVersion;
        this.regionId = builder.regionId;
        this.requestPars = builder.requestPars;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceCountRequest create() {
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestPars
     */
    public String getRequestPars() {
        return this.requestPars;
    }

    public static final class Builder extends Request.Builder<ListInstanceCountRequest, Builder> {
        private String acceptLanguage; 
        private String clusterType; 
        private String mseVersion; 
        private String regionId; 
        private String requestPars; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceCountRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterType = request.clusterType;
            this.mseVersion = request.mseVersion;
            this.regionId = request.regionId;
            this.requestPars = request.requestPars;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The type of the instance. Valid values: ZooKeeper and Nacos-Ans.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The edition type of the instance. Valid values:
         * <p>
         * 
         * *   `mse_dev`: Developer Edition
         * *   `mse_pro`: Professional Edition
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * The ID of the region where the instance resides. Examples:
         * <p>
         * 
         * *   cn-hangzhou: China (Hangzhou)
         * *   cn-beijing: China (Beijing)
         * *   cn-shanghai: China (Shanghai)
         * *   cn-zhangjiakou: China (Zhangjiakou)
         * *   cn-shenzhen: China (Shenzhen)
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The extended request parameters in the JSON format.
         */
        public Builder requestPars(String requestPars) {
            this.putQueryParameter("RequestPars", requestPars);
            this.requestPars = requestPars;
            return this;
        }

        @Override
        public ListInstanceCountRequest build() {
            return new ListInstanceCountRequest(this);
        } 

    } 

}
