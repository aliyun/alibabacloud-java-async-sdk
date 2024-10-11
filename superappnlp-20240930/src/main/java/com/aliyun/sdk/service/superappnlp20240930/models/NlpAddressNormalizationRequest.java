// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.superappnlp20240930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NlpAddressNormalizationRequest} extends {@link RequestModel}
 *
 * <p>NlpAddressNormalizationRequest</p>
 */
public class NlpAddressNormalizationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CityStdManual")
    private String cityStdManual;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CityStr")
    private String cityStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DistrictStdManual")
    private String districtStdManual;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvinceStdManual")
    private String provinceStdManual;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvinceStr")
    private String provinceStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryStr")
    private String queryStr;

    private NlpAddressNormalizationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cityStdManual = builder.cityStdManual;
        this.cityStr = builder.cityStr;
        this.clientToken = builder.clientToken;
        this.districtStdManual = builder.districtStdManual;
        this.instanceId = builder.instanceId;
        this.provinceStdManual = builder.provinceStdManual;
        this.provinceStr = builder.provinceStr;
        this.queryStr = builder.queryStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NlpAddressNormalizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return cityStdManual
     */
    public String getCityStdManual() {
        return this.cityStdManual;
    }

    /**
     * @return cityStr
     */
    public String getCityStr() {
        return this.cityStr;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return districtStdManual
     */
    public String getDistrictStdManual() {
        return this.districtStdManual;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return provinceStdManual
     */
    public String getProvinceStdManual() {
        return this.provinceStdManual;
    }

    /**
     * @return provinceStr
     */
    public String getProvinceStr() {
        return this.provinceStr;
    }

    /**
     * @return queryStr
     */
    public String getQueryStr() {
        return this.queryStr;
    }

    public static final class Builder extends Request.Builder<NlpAddressNormalizationRequest, Builder> {
        private String regionId; 
        private String cityStdManual; 
        private String cityStr; 
        private String clientToken; 
        private String districtStdManual; 
        private String instanceId; 
        private String provinceStdManual; 
        private String provinceStr; 
        private String queryStr; 

        private Builder() {
            super();
        } 

        private Builder(NlpAddressNormalizationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cityStdManual = request.cityStdManual;
            this.cityStr = request.cityStr;
            this.clientToken = request.clientToken;
            this.districtStdManual = request.districtStdManual;
            this.instanceId = request.instanceId;
            this.provinceStdManual = request.provinceStdManual;
            this.provinceStr = request.provinceStr;
            this.queryStr = request.queryStr;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CityStdManual.
         */
        public Builder cityStdManual(String cityStdManual) {
            this.putQueryParameter("CityStdManual", cityStdManual);
            this.cityStdManual = cityStdManual;
            return this;
        }

        /**
         * CityStr.
         */
        public Builder cityStr(String cityStr) {
            this.putQueryParameter("CityStr", cityStr);
            this.cityStr = cityStr;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DistrictStdManual.
         */
        public Builder districtStdManual(String districtStdManual) {
            this.putQueryParameter("DistrictStdManual", districtStdManual);
            this.districtStdManual = districtStdManual;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProvinceStdManual.
         */
        public Builder provinceStdManual(String provinceStdManual) {
            this.putQueryParameter("ProvinceStdManual", provinceStdManual);
            this.provinceStdManual = provinceStdManual;
            return this;
        }

        /**
         * ProvinceStr.
         */
        public Builder provinceStr(String provinceStr) {
            this.putQueryParameter("ProvinceStr", provinceStr);
            this.provinceStr = provinceStr;
            return this;
        }

        /**
         * QueryStr.
         */
        public Builder queryStr(String queryStr) {
            this.putQueryParameter("QueryStr", queryStr);
            this.queryStr = queryStr;
            return this;
        }

        @Override
        public NlpAddressNormalizationRequest build() {
            return new NlpAddressNormalizationRequest(this);
        } 

    } 

}
