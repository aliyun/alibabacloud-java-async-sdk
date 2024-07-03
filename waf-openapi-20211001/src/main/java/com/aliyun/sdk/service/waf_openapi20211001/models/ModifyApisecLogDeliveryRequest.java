// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApisecLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>ModifyApisecLogDeliveryRequest</p>
 */
public class ModifyApisecLogDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssertKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assertKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyApisecLogDeliveryRequest(Builder builder) {
        super(builder);
        this.assertKey = builder.assertKey;
        this.instanceId = builder.instanceId;
        this.logRegionId = builder.logRegionId;
        this.logStoreName = builder.logStoreName;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApisecLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assertKey
     */
    public String getAssertKey() {
        return this.assertKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
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

    public static final class Builder extends Request.Builder<ModifyApisecLogDeliveryRequest, Builder> {
        private String assertKey; 
        private String instanceId; 
        private String logRegionId; 
        private String logStoreName; 
        private String projectName; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApisecLogDeliveryRequest request) {
            super(request);
            this.assertKey = request.assertKey;
            this.instanceId = request.instanceId;
            this.logRegionId = request.logRegionId;
            this.logStoreName = request.logStoreName;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * The type of the log subscription. Valid values:
         * <p>
         * 
         * *   **risk**: risk information.
         * *   **event**: attack event information.
         * *   **asset**: asset information.
         */
        public Builder assertKey(String assertKey) {
            this.putQueryParameter("AssertKey", assertKey);
            this.assertKey = assertKey;
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
         * The ID of the region where logs are stored.
         * <p>
         * 
         * >  You can call the [DescribeUserSlsLogRegions](~~2712598~~) operation to query available log storage regions.
         */
        public Builder logRegionId(String logRegionId) {
            this.putQueryParameter("LogRegionId", logRegionId);
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * The name of the Logstore in Simple Log Service.
         * <p>
         * 
         * >  API security logs can be delivered only to Logstores whose names start with apisec-.
         */
        public Builder logStoreName(String logStoreName) {
            this.putQueryParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * The name of the project in Simple Log Service.
         * <p>
         * 
         * >  API security logs can be delivered only to projects whose names start with apisec-.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The region where the WAF instance is deployed. Valid values:
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
         * The ID of the Alibaba Cloud resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public ModifyApisecLogDeliveryRequest build() {
            return new ModifyApisecLogDeliveryRequest(this);
        } 

    } 

}
