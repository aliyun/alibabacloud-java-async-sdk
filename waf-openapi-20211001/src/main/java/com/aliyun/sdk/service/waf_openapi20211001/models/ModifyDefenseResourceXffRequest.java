// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDefenseResourceXffRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseResourceXffRequest</p>
 */
public class ModifyDefenseResourceXffRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcwCookieStatus")
    private Integer acwCookieStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcwSecureStatus")
    private Integer acwSecureStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcwV3SecureStatus")
    private Integer acwV3SecureStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomHeaders")
    private java.util.List < String > customHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XffStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer xffStatus;

    private ModifyDefenseResourceXffRequest(Builder builder) {
        super(builder);
        this.acwCookieStatus = builder.acwCookieStatus;
        this.acwSecureStatus = builder.acwSecureStatus;
        this.acwV3SecureStatus = builder.acwV3SecureStatus;
        this.customHeaders = builder.customHeaders;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.xffStatus = builder.xffStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseResourceXffRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acwCookieStatus
     */
    public Integer getAcwCookieStatus() {
        return this.acwCookieStatus;
    }

    /**
     * @return acwSecureStatus
     */
    public Integer getAcwSecureStatus() {
        return this.acwSecureStatus;
    }

    /**
     * @return acwV3SecureStatus
     */
    public Integer getAcwV3SecureStatus() {
        return this.acwV3SecureStatus;
    }

    /**
     * @return customHeaders
     */
    public java.util.List < String > getCustomHeaders() {
        return this.customHeaders;
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
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return xffStatus
     */
    public Integer getXffStatus() {
        return this.xffStatus;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseResourceXffRequest, Builder> {
        private Integer acwCookieStatus; 
        private Integer acwSecureStatus; 
        private Integer acwV3SecureStatus; 
        private java.util.List < String > customHeaders; 
        private String instanceId; 
        private String regionId; 
        private String resource; 
        private String resourceManagerResourceGroupId; 
        private Integer xffStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseResourceXffRequest request) {
            super(request);
            this.acwCookieStatus = request.acwCookieStatus;
            this.acwSecureStatus = request.acwSecureStatus;
            this.acwV3SecureStatus = request.acwV3SecureStatus;
            this.customHeaders = request.customHeaders;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.xffStatus = request.xffStatus;
        } 

        /**
         * <p>The status of the tracking cookie.</p>
         * <ul>
         * <li><strong>0</strong>: disabled</li>
         * <li><strong>1</strong>: enabled. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder acwCookieStatus(Integer acwCookieStatus) {
            this.putQueryParameter("AcwCookieStatus", acwCookieStatus);
            this.acwCookieStatus = acwCookieStatus;
            return this;
        }

        /**
         * <p>The status of the secure attribute of the tracking cookie.</p>
         * <ul>
         * <li><strong>0</strong>: disabled. This is the default value.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder acwSecureStatus(Integer acwSecureStatus) {
            this.putQueryParameter("AcwSecureStatus", acwSecureStatus);
            this.acwSecureStatus = acwSecureStatus;
            return this;
        }

        /**
         * <p>The status of the secure attribute of the slider CAPTCHA cookie.</p>
         * <ul>
         * <li><strong>0</strong>: disabled. This is the default value.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder acwV3SecureStatus(Integer acwV3SecureStatus) {
            this.putQueryParameter("AcwV3SecureStatus", acwV3SecureStatus);
            this.acwV3SecureStatus = acwV3SecureStatus;
            return this;
        }

        /**
         * <p>The custom header fields.</p>
         * <blockquote>
         * <p> The first IP address in the specified custom header field is used as the originating IP address of the client to prevent X-Forwarded-For forgery. If you specify multiple header fields, WAF reads the values of the header fields in sequence until the originating IP address is obtained. If the originating IP address cannot be obtained, the first IP address in the X-Forwarded-For header is used as the originating IP address of the client.</p>
         * </blockquote>
         */
        public Builder customHeaders(java.util.List < String > customHeaders) {
            this.putQueryParameter("CustomHeaders", customHeaders);
            this.customHeaders = customHeaders;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-wwo3c****07</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region in which the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
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
         * <p>The name of the protected object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-4pxu81fgagx3****mz-alb</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2kie2****wq</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether a Layer 7 proxy is deployed in front of WAF. Layer 7 proxies include Anti-DDoS Proxy and Alibaba Cloud CDN. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No Layer 7 proxies are deployed. This is the default value.</li>
         * <li><strong>1</strong>: A Layer 7 proxy is deployed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder xffStatus(Integer xffStatus) {
            this.putQueryParameter("XffStatus", xffStatus);
            this.xffStatus = xffStatus;
            return this;
        }

        @Override
        public ModifyDefenseResourceXffRequest build() {
            return new ModifyDefenseResourceXffRequest(this);
        } 

    } 

}
