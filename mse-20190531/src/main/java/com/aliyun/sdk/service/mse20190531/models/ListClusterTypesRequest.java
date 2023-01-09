// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterTypesRequest} extends {@link RequestModel}
 *
 * <p>ListClusterTypesRequest</p>
 */
public class ListClusterTypesRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ConnectType")
    private String connectType;

    @Query
    @NameInMap("MseVersion")
    private String mseVersion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ListClusterTypesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.connectType = builder.connectType;
        this.mseVersion = builder.mseVersion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterTypesRequest create() {
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

    public static final class Builder extends Request.Builder<ListClusterTypesRequest, Builder> {
        private String acceptLanguage; 
        private String connectType; 
        private String mseVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterTypesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.connectType = request.connectType;
            this.mseVersion = request.mseVersion;
            this.regionId = request.regionId;
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
         * The network type. Valid values:
         * <p>
         * 
         * *   slb
         * *   eni
         */
        public Builder connectType(String connectType) {
            this.putQueryParameter("ConnectType", connectType);
            this.connectType = connectType;
            return this;
        }

        /**
         * The edition of the MSE instance that you want to purchase.
         * <p>
         * 
         * *   mse_pro: Professional Edition
         * *   mse_dev: Developer Edition
         */
        public Builder mseVersion(String mseVersion) {
            this.putQueryParameter("MseVersion", mseVersion);
            this.mseVersion = mseVersion;
            return this;
        }

        /**
         * The ID of the region in which the instance resides. The region is supported by MSE.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListClusterTypesRequest build() {
            return new ListClusterTypesRequest(this);
        } 

    } 

}
