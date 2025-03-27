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
 * {@link ModifyApisecModuleStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyApisecModuleStatusRequest</p>
 */
public class ModifyApisecModuleStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportStatus")
    private Long reportStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroups")
    private String resourceGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private String resources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceStatus")
    private Integer traceStatus;

    private ModifyApisecModuleStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.reportStatus = builder.reportStatus;
        this.resourceGroups = builder.resourceGroups;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resources = builder.resources;
        this.traceStatus = builder.traceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApisecModuleStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return reportStatus
     */
    public Long getReportStatus() {
        return this.reportStatus;
    }

    /**
     * @return resourceGroups
     */
    public String getResourceGroups() {
        return this.resourceGroups;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return traceStatus
     */
    public Integer getTraceStatus() {
        return this.traceStatus;
    }

    public static final class Builder extends Request.Builder<ModifyApisecModuleStatusRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private Long reportStatus; 
        private String resourceGroups; 
        private String resourceManagerResourceGroupId; 
        private String resources; 
        private Integer traceStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApisecModuleStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.reportStatus = request.reportStatus;
            this.resourceGroups = request.resourceGroups;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resources = request.resources;
            this.traceStatus = request.traceStatus;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbqtm**</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
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
         * <p>The status of the compliance check feature. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder reportStatus(Long reportStatus) {
            this.putQueryParameter("ReportStatus", reportStatus);
            this.reportStatus = reportStatus;
            return this;
        }

        /**
         * <p>The name of the protected object group to which the protected object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder resourceGroups(String resourceGroups) {
            this.putQueryParameter("ResourceGroups", resourceGroups);
            this.resourceGroups = resourceGroups;
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
         * <p>The name of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>cwaf-***-waf</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        /**
         * <p>The status of the tracing and auditing feature. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder traceStatus(Integer traceStatus) {
            this.putQueryParameter("TraceStatus", traceStatus);
            this.traceStatus = traceStatus;
            return this;
        }

        @Override
        public ModifyApisecModuleStatusRequest build() {
            return new ModifyApisecModuleStatusRequest(this);
        } 

    } 

}
