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
 * {@link ModifyResourceLogStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourceLogStatusRequest</p>
 */
public class ModifyResourceLogStatusRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceConfig")
    private TraceConfig traceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceStatus")
    private Boolean traceStatus;

    private ModifyResourceLogStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.status = builder.status;
        this.traceConfig = builder.traceConfig;
        this.traceStatus = builder.traceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceLogStatusRequest create() {
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
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return traceConfig
     */
    public TraceConfig getTraceConfig() {
        return this.traceConfig;
    }

    /**
     * @return traceStatus
     */
    public Boolean getTraceStatus() {
        return this.traceStatus;
    }

    public static final class Builder extends Request.Builder<ModifyResourceLogStatusRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String resource; 
        private String resourceManagerResourceGroupId; 
        private Boolean status; 
        private TraceConfig traceConfig; 
        private Boolean traceStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourceLogStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.status = request.status;
            this.traceConfig = request.traceConfig;
            this.traceStatus = request.traceStatus;
        } 

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-zz11zcl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou:</strong> the Chinese mainland.</li>
         * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
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
         * <p>The protected object on which you want to manage the log collection feature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-wewbb23dfsetetcic1242-0****</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
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
         * <p>Specifies whether to enable the log collection feature for the protected object. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> enables the log collection feature.</li>
         * <li><strong>false:</strong> disables the log collection feature.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TraceConfig.
         */
        public Builder traceConfig(TraceConfig traceConfig) {
            String traceConfigShrink = shrink(traceConfig, "TraceConfig", "json");
            this.putQueryParameter("TraceConfig", traceConfigShrink);
            this.traceConfig = traceConfig;
            return this;
        }

        /**
         * TraceStatus.
         */
        public Builder traceStatus(Boolean traceStatus) {
            this.putQueryParameter("TraceStatus", traceStatus);
            this.traceStatus = traceStatus;
            return this;
        }

        @Override
        public ModifyResourceLogStatusRequest build() {
            return new ModifyResourceLogStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyResourceLogStatusRequest} extends {@link TeaModel}
     *
     * <p>ModifyResourceLogStatusRequest</p>
     */
    public static class TraceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RatePerMille")
        @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
        private Integer ratePerMille;

        @com.aliyun.core.annotation.NameInMap("Workspace")
        private String workspace;

        private TraceConfig(Builder builder) {
            this.ratePerMille = builder.ratePerMille;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceConfig create() {
            return builder().build();
        }

        /**
         * @return ratePerMille
         */
        public Integer getRatePerMille() {
            return this.ratePerMille;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private Integer ratePerMille; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(TraceConfig model) {
                this.ratePerMille = model.ratePerMille;
                this.workspace = model.workspace;
            } 

            /**
             * RatePerMille.
             */
            public Builder ratePerMille(Integer ratePerMille) {
                this.ratePerMille = ratePerMille;
                return this;
            }

            /**
             * Workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public TraceConfig build() {
                return new TraceConfig(this);
            } 

        } 

    }
}
