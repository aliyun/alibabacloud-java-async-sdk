// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateApiExportRequest} extends {@link RequestModel}
 *
 * <p>CreateApiExportRequest</p>
 */
public class CreateApiExportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateApiExportRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
        this.param = builder.param;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.type = builder.type;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiExportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateApiExportRequest, Builder> {
        private String clusterId; 
        private String instanceId; 
        private String param; 
        private String region; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String type; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiExportRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
            this.param = request.param;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.type = request.type;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The hybrid cloud cluster ID.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. You can call <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> to obtain hybrid cloud cluster information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>993</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-zxu3***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The extended parameters of the export task. You can filter the exported content by specifying conditions. The value is a JSON string constructed from a series of parameters.</p>
         * <blockquote>
         * <p>The specific parameters vary depending on the specified <strong>export task type</strong> (<strong>Type</strong>). For more information, refer to <strong>Export task parameter description</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;startTime&quot;: 1741449600,
         *     &quot;endTime&quot;: 1744079820,
         *     &quot;sensitiveLevel&quot;: &quot;L1&quot;
         * }</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The language type. Valid values:</p>
         * <ul>
         * <li><strong>cn</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The type of the export task. Valid values:</p>
         * <ul>
         * <li><p><strong>apisec_api</strong> (default): API asset task.</p>
         * </li>
         * <li><p><strong>apisec_abnormal</strong>: API risk task.</p>
         * </li>
         * <li><p><strong>apisec_event</strong>: API security event task.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apisec_api</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The time zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateApiExportRequest build() {
            return new CreateApiExportRequest(this);
        } 

    } 

}
