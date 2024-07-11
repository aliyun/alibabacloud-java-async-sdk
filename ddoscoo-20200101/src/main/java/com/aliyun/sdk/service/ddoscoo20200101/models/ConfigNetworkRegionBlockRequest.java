// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetworkRegionBlockRequest} extends {@link RequestModel}
 *
 * <p>ConfigNetworkRegionBlockRequest</p>
 */
public class ConfigNetworkRegionBlockRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ConfigNetworkRegionBlockRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigNetworkRegionBlockRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ConfigNetworkRegionBlockRequest, Builder> {
        private String regionId; 
        private String config; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigNetworkRegionBlockRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.instanceId = request.instanceId;
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
         * The details of the configurations of blocked locations. This parameter is a JSON string. The value consists of the following fields:
         * <p>
         * 
         * *   **RegionBlockSwitch**: the status of the location blacklist feature. This field is required and must be of the string type. Valid values:
         * 
         *     *   **on**
         *     *   **off**
         * 
         * *   **Countries**: the codes of the countries and areas from which you want to block requests. This field is optional and must be of the array type.
         * 
         *     **
         * 
         *     **Note** For more information about the codes of countries and areas, see [Location parameters](~~167926~~).
         * 
         * *   **Provinces**: the codes of the administrative regions in China from which you want to block requests. This field is optional and must be of the array type.
         * 
         *     **
         * 
         *     **Note** For more information about the codes of administrative regions in China, see [Location parameters](~~167926~~).
         * 
         *     For example, `[11,12]` specifies Beijing and Tianjin.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ConfigNetworkRegionBlockRequest build() {
            return new ConfigNetworkRegionBlockRequest(this);
        } 

    } 

}
