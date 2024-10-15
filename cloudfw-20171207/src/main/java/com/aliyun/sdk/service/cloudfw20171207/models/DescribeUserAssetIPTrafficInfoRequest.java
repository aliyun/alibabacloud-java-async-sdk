// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserAssetIPTrafficInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserAssetIPTrafficInfoRequest</p>
 */
public class DescribeUserAssetIPTrafficInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetIP")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficTime;

    private DescribeUserAssetIPTrafficInfoRequest(Builder builder) {
        super(builder);
        this.assetIP = builder.assetIP;
        this.lang = builder.lang;
        this.trafficTime = builder.trafficTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAssetIPTrafficInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetIP
     */
    public String getAssetIP() {
        return this.assetIP;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return trafficTime
     */
    public String getTrafficTime() {
        return this.trafficTime;
    }

    public static final class Builder extends Request.Builder<DescribeUserAssetIPTrafficInfoRequest, Builder> {
        private String assetIP; 
        private String lang; 
        private String trafficTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserAssetIPTrafficInfoRequest request) {
            super(request);
            this.assetIP = request.assetIP;
            this.lang = request.lang;
            this.trafficTime = request.trafficTime;
        } 

        /**
         * <p>The IP address of the asset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder assetIP(String assetIP) {
            this.putQueryParameter("AssetIP", assetIP);
            this.assetIP = assetIP;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656923760</p>
         */
        public Builder trafficTime(String trafficTime) {
            this.putQueryParameter("TrafficTime", trafficTime);
            this.trafficTime = trafficTime;
            return this;
        }

        @Override
        public DescribeUserAssetIPTrafficInfoRequest build() {
            return new DescribeUserAssetIPTrafficInfoRequest(this);
        } 

    } 

}
