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
 * {@link ModifyHybridCloudClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudClusterRequest</p>
 */
public class ModifyHybridCloudClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessRegion")
    private String accessRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpPorts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpPorts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsPorts")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpsPorts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogFieldsNotReturned")
    private String logFieldsNotReturned;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectionServerCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer protectionServerCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyStatus")
    private String proxyStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyType")
    private String proxyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    private String ruleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleStatus")
    private String ruleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    private ModifyHybridCloudClusterRequest(Builder builder) {
        super(builder);
        this.accessMode = builder.accessMode;
        this.accessRegion = builder.accessRegion;
        this.clusterName = builder.clusterName;
        this.httpPorts = builder.httpPorts;
        this.httpsPorts = builder.httpsPorts;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.logFieldsNotReturned = builder.logFieldsNotReturned;
        this.protectionServerCount = builder.protectionServerCount;
        this.proxyStatus = builder.proxyStatus;
        this.proxyType = builder.proxyType;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.ruleConfig = builder.ruleConfig;
        this.ruleStatus = builder.ruleStatus;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessMode
     */
    public String getAccessMode() {
        return this.accessMode;
    }

    /**
     * @return accessRegion
     */
    public String getAccessRegion() {
        return this.accessRegion;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return httpPorts
     */
    public String getHttpPorts() {
        return this.httpPorts;
    }

    /**
     * @return httpsPorts
     */
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logFieldsNotReturned
     */
    public String getLogFieldsNotReturned() {
        return this.logFieldsNotReturned;
    }

    /**
     * @return protectionServerCount
     */
    public Integer getProtectionServerCount() {
        return this.protectionServerCount;
    }

    /**
     * @return proxyStatus
     */
    public String getProxyStatus() {
        return this.proxyStatus;
    }

    /**
     * @return proxyType
     */
    public String getProxyType() {
        return this.proxyType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<ModifyHybridCloudClusterRequest, Builder> {
        private String accessMode; 
        private String accessRegion; 
        private String clusterName; 
        private String httpPorts; 
        private String httpsPorts; 
        private Long id; 
        private String instanceId; 
        private String logFieldsNotReturned; 
        private Integer protectionServerCount; 
        private String proxyStatus; 
        private String proxyType; 
        private String regionId; 
        private String remark; 
        private String resourceManagerResourceGroupId; 
        private String ruleConfig; 
        private String ruleStatus; 
        private String ruleType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudClusterRequest request) {
            super(request);
            this.accessMode = request.accessMode;
            this.accessRegion = request.accessRegion;
            this.clusterName = request.clusterName;
            this.httpPorts = request.httpPorts;
            this.httpsPorts = request.httpsPorts;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.logFieldsNotReturned = request.logFieldsNotReturned;
            this.protectionServerCount = request.protectionServerCount;
            this.proxyStatus = request.proxyStatus;
            this.proxyType = request.proxyType;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.ruleConfig = request.ruleConfig;
            this.ruleStatus = request.ruleStatus;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accessMode(String accessMode) {
            this.putQueryParameter("AccessMode", accessMode);
            this.accessMode = accessMode;
            return this;
        }

        /**
         * AccessRegion.
         */
        public Builder accessRegion(String accessRegion) {
            this.putQueryParameter("AccessRegion", accessRegion);
            this.accessRegion = accessRegion;
            return this;
        }

        /**
         * <p>The name of the cluster.</p>
         * <p>This parameter is required.</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The HTTP ports that are supported. Set this parameter to a string. Specify multiple ports in the <strong>port1,port2,port3</strong> format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80,8080</p>
         */
        public Builder httpPorts(String httpPorts) {
            this.putQueryParameter("HttpPorts", httpPorts);
            this.httpPorts = httpPorts;
            return this;
        }

        /**
         * <p>The HTTPS ports that are supported. Set this parameter to a string. Specify multiple ports in the <strong>port1,port2,port3</strong> format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>443,8443</p>
         */
        public Builder httpsPorts(String httpsPorts) {
            this.putQueryParameter("HttpsPorts", httpsPorts);
            this.httpsPorts = httpsPorts;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
         * <p>waf-cn-mp9153****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LogFieldsNotReturned.
         */
        public Builder logFieldsNotReturned(String logFieldsNotReturned) {
            this.putQueryParameter("LogFieldsNotReturned", logFieldsNotReturned);
            this.logFieldsNotReturned = logFieldsNotReturned;
            return this;
        }

        /**
         * <p>The number of protection nodes that can be added to the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder protectionServerCount(Integer protectionServerCount) {
            this.putQueryParameter("ProtectionServerCount", protectionServerCount);
            this.protectionServerCount = protectionServerCount;
            return this;
        }

        /**
         * ProxyStatus.
         */
        public Builder proxyStatus(String proxyStatus) {
            this.putQueryParameter("ProxyStatus", proxyStatus);
            this.proxyStatus = proxyStatus;
            return this;
        }

        /**
         * ProxyType.
         */
        public Builder proxyType(String proxyType) {
            this.putQueryParameter("ProxyType", proxyType);
            this.proxyType = proxyType;
            return this;
        }

        /**
         * <p>The region ID of the WAF instance. Valid values:</p>
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
         * <p>The remarks about the cluster.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceManagerResourceGroupId.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * RuleConfig.
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putQueryParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * RuleStatus.
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public ModifyHybridCloudClusterRequest build() {
            return new ModifyHybridCloudClusterRequest(this);
        } 

    } 

}
