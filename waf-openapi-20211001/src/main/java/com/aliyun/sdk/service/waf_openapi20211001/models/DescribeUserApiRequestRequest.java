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
 * {@link DescribeUserApiRequestRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserApiRequestRequest</p>
 */
public class DescribeUserApiRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiFormat")
    @Deprecated
    private String apiFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @Deprecated
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeUserApiRequestRequest(Builder builder) {
        super(builder);
        this.apiFormat = builder.apiFormat;
        this.apiId = builder.apiId;
        this.clusterId = builder.clusterId;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserApiRequestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiFormat
     */
    public String getApiFormat() {
        return this.apiFormat;
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<DescribeUserApiRequestRequest, Builder> {
        private String apiFormat; 
        private String apiId; 
        private String clusterId; 
        private String domain; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserApiRequestRequest request) {
            super(request);
            this.apiFormat = request.apiFormat;
            this.apiId = request.apiId;
            this.clusterId = request.clusterId;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.type = request.type;
        } 

        /**
         * <p>The API operation.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is deprecated. Use the ApiId parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/know</p>
         */
        public Builder apiFormat(String apiFormat) {
            this.putQueryParameter("ApiFormat", apiFormat);
            this.apiFormat = apiFormat;
            return this;
        }

        /**
         * <p>The ID of the API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3799f0695c0d687f3295d132fe49bc14</p>
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * <p>The ID of the hybrid cloud cluster.</p>
         * <blockquote>
         * <p>This parameter applies only to hybrid cloud scenarios. Call the <a href="https://help.aliyun.com/document_detail/2849376.html">DescribeHybridCloudClusters</a> operation to obtain information about hybrid cloud clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>428</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The domain name or IP address of the API operation.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is deprecated. Use the ApiId parameter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>c.***.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_public_cn-zxu38***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
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
         * <p>The type of statistics. Valid values:</p>
         * <ul>
         * <li><p><strong>api_ip</strong>: total traffic.</p>
         * </li>
         * <li><p><strong>api_cross_border_ip</strong>: cross-border traffic.</p>
         * </li>
         * <li><p><strong>api_bot_ip</strong>: bot traffic.</p>
         * </li>
         * <li><p><strong>remote_region</strong>: geographic location statistics.</p>
         * </li>
         * <li><p><strong>client_id</strong>: client type statistics.</p>
         * </li>
         * <li><p><strong>http_referer</strong>: Referer statistics.</p>
         * </li>
         * <li><p><strong>api_cnt</strong>: total number of calls.</p>
         * </li>
         * <li><p><strong>bot_cnt</strong>: number of bot requests.</p>
         * </li>
         * <li><p><strong>cross_border_cnt</strong>: number of cross-border requests.</p>
         * </li>
         * <li><p><strong>api_freq</strong>: call frequency.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>api_ip</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeUserApiRequestRequest build() {
            return new DescribeUserApiRequestRequest(this);
        } 

    } 

}
