// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDeviceVersionDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceVersionDetailRequest</p>
 */
public class DescribeDeviceVersionDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private DescribeDeviceVersionDetailRequest(Builder builder) {
        super(builder);
        this.model = builder.model;
        this.networkType = builder.networkType;
        this.region = builder.region;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceVersionDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceVersionDetailRequest, Builder> {
        private String model; 
        private String networkType; 
        private String region; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceVersionDetailRequest request) {
            super(request);
            this.model = request.model;
            this.networkType = request.networkType;
            this.region = request.region;
            this.versionName = request.versionName;
        } 

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putBodyParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public DescribeDeviceVersionDetailRequest build() {
            return new DescribeDeviceVersionDetailRequest(this);
        } 

    } 

}
