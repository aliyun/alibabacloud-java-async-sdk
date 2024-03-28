// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseResourceXffRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseResourceXffRequest</p>
 */
public class ModifyDefenseResourceXffRequest extends Request {
    @Query
    @NameInMap("AcwCookieStatus")
    private Integer acwCookieStatus;

    @Query
    @NameInMap("AcwSecureStatus")
    private Integer acwSecureStatus;

    @Query
    @NameInMap("AcwV3SecureStatus")
    private Integer acwV3SecureStatus;

    @Query
    @NameInMap("CustomHeaders")
    private java.util.List < String > customHeaders;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private String resource;

    @Query
    @NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @Query
    @NameInMap("XffStatus")
    @Validation(required = true)
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
         * The status of the tracking cookie.
         * <p>
         * 
         * *   **0**: disabled
         * *   **1**: enabled. This is the default value.
         */
        public Builder acwCookieStatus(Integer acwCookieStatus) {
            this.putQueryParameter("AcwCookieStatus", acwCookieStatus);
            this.acwCookieStatus = acwCookieStatus;
            return this;
        }

        /**
         * The status of the secure attribute of the tracking cookie.
         * <p>
         * 
         * *   **0**: disabled. This is the default value.
         * *   **1**: enabled.
         */
        public Builder acwSecureStatus(Integer acwSecureStatus) {
            this.putQueryParameter("AcwSecureStatus", acwSecureStatus);
            this.acwSecureStatus = acwSecureStatus;
            return this;
        }

        /**
         * The status of the secure attribute of the slider CAPTCHA cookie.
         * <p>
         * 
         * *   **0**: disabled. This is the default value.
         * *   **1**: enabled.
         */
        public Builder acwV3SecureStatus(Integer acwV3SecureStatus) {
            this.putQueryParameter("AcwV3SecureStatus", acwV3SecureStatus);
            this.acwV3SecureStatus = acwV3SecureStatus;
            return this;
        }

        /**
         * The custom header fields.
         * <p>
         * 
         * >  The first IP address in the specified custom header field is used as the originating IP address of the client to prevent X-Forwarded-For forgery. If you specify multiple header fields, WAF reads the values of the header fields in sequence until the originating IP address is obtained. If the originating IP address cannot be obtained, the first IP address in the X-Forwarded-For header is used as the originating IP address of the client.
         */
        public Builder customHeaders(java.util.List < String > customHeaders) {
            this.putQueryParameter("CustomHeaders", customHeaders);
            this.customHeaders = customHeaders;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region in which the WAF instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the protected object.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * Specifies whether a Layer 7 proxy is deployed in front of WAF. Layer 7 proxies include Anti-DDoS Proxy and Alibaba Cloud CDN. Valid values:
         * <p>
         * 
         * *   **0**: No Layer 7 proxies are deployed. This is the default value.
         * *   **1**: A Layer 7 proxy is deployed.
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
