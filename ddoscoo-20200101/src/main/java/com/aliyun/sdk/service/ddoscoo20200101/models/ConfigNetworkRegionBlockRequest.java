// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details of the configurations of blocked locations. This parameter is a JSON string. The value consists of the following fields:</p>
         * <ul>
         * <li><p><strong>RegionBlockSwitch</strong>: the status of the location blacklist feature. This field is required and must be of the string type. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>Countries</strong>: the codes of the countries and areas from which you want to block requests. This field is optional and must be of the array type.</p>
         * <p>**</p>
         * <p><strong>Note</strong> For more information about the codes of countries and areas, see <a href="https://help.aliyun.com/document_detail/167926.html">Location parameters</a>.</p>
         * </li>
         * <li><p><strong>Provinces</strong>: the codes of the administrative regions in China from which you want to block requests. This field is optional and must be of the array type.</p>
         * <p>**</p>
         * <p><strong>Note</strong> For more information about the codes of administrative regions in China, see <a href="https://help.aliyun.com/document_detail/167926.html">Location parameters</a>.</p>
         * <p>For example, <code>[11,12]</code> specifies Beijing and Tianjin.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RegionBlockSwitch&quot;:&quot;off&quot;,&quot;Countries&quot;:[],&quot;Provinces&quot;:[11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65,71,81,82]}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
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
