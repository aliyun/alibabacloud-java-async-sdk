// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CheckInstanceModuleStatusRequest} extends {@link RequestModel}
 *
 * <p>CheckInstanceModuleStatusRequest</p>
 */
public class CheckInstanceModuleStatusRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FeatureKey")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String featureKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleKey")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String moduleKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceLabelKey")
    private String resourceLabelKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceLabelValue")
    private String resourceLabelValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubFeatureKey")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String subFeatureKey;

    private CheckInstanceModuleStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.featureKey = builder.featureKey;
        this.instanceId = builder.instanceId;
        this.moduleKey = builder.moduleKey;
        this.resourceLabelKey = builder.resourceLabelKey;
        this.resourceLabelValue = builder.resourceLabelValue;
        this.subFeatureKey = builder.subFeatureKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckInstanceModuleStatusRequest create() {
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
     * @return featureKey
     */
    public String getFeatureKey() {
        return this.featureKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return moduleKey
     */
    public String getModuleKey() {
        return this.moduleKey;
    }

    /**
     * @return resourceLabelKey
     */
    public String getResourceLabelKey() {
        return this.resourceLabelKey;
    }

    /**
     * @return resourceLabelValue
     */
    public String getResourceLabelValue() {
        return this.resourceLabelValue;
    }

    /**
     * @return subFeatureKey
     */
    public String getSubFeatureKey() {
        return this.subFeatureKey;
    }

    public static final class Builder extends Request.Builder<CheckInstanceModuleStatusRequest, Builder> {
        private String regionId; 
        private String featureKey; 
        private String instanceId; 
        private String moduleKey; 
        private String resourceLabelKey; 
        private String resourceLabelValue; 
        private String subFeatureKey; 

        private Builder() {
            super();
        } 

        private Builder(CheckInstanceModuleStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.featureKey = request.featureKey;
            this.instanceId = request.instanceId;
            this.moduleKey = request.moduleKey;
            this.resourceLabelKey = request.resourceLabelKey;
            this.resourceLabelValue = request.resourceLabelValue;
            this.subFeatureKey = request.subFeatureKey;
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
         * <p>二级模块标识</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:license:module:ud:customField</p>
         */
        public Builder featureKey(String featureKey) {
            this.putQueryParameter("FeatureKey", featureKey);
            this.featureKey = featureKey;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>一级模块标识，必填</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:license:module:ud</p>
         */
        public Builder moduleKey(String moduleKey) {
            this.putQueryParameter("ModuleKey", moduleKey);
            this.moduleKey = moduleKey;
            return this;
        }

        /**
         * ResourceLabelKey.
         */
        public Builder resourceLabelKey(String resourceLabelKey) {
            this.putQueryParameter("ResourceLabelKey", resourceLabelKey);
            this.resourceLabelKey = resourceLabelKey;
            return this;
        }

        /**
         * ResourceLabelValue.
         */
        public Builder resourceLabelValue(String resourceLabelValue) {
            this.putQueryParameter("ResourceLabelValue", resourceLabelValue);
            this.resourceLabelValue = resourceLabelValue;
            return this;
        }

        /**
         * SubFeatureKey.
         */
        public Builder subFeatureKey(String subFeatureKey) {
            this.putQueryParameter("SubFeatureKey", subFeatureKey);
            this.subFeatureKey = subFeatureKey;
            return this;
        }

        @Override
        public CheckInstanceModuleStatusRequest build() {
            return new CheckInstanceModuleStatusRequest(this);
        } 

    } 

}
