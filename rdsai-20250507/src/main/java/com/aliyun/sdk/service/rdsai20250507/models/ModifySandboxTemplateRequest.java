// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ModifySandboxTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifySandboxTemplateRequest</p>
 */
public class ModifySandboxTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultCpu")
    private String defaultCpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultMemory")
    private String defaultMemory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Replicas")
    private Long replicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private ModifySandboxTemplateRequest(Builder builder) {
        super(builder);
        this.defaultCpu = builder.defaultCpu;
        this.defaultMemory = builder.defaultMemory;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
        this.replicas = builder.replicas;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySandboxTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultCpu
     */
    public String getDefaultCpu() {
        return this.defaultCpu;
    }

    /**
     * @return defaultMemory
     */
    public String getDefaultMemory() {
        return this.defaultMemory;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicas
     */
    public Long getReplicas() {
        return this.replicas;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ModifySandboxTemplateRequest, Builder> {
        private String defaultCpu; 
        private String defaultMemory; 
        private String instanceName; 
        private String regionId; 
        private Long replicas; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySandboxTemplateRequest request) {
            super(request);
            this.defaultCpu = request.defaultCpu;
            this.defaultMemory = request.defaultMemory;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
            this.replicas = request.replicas;
            this.templateId = request.templateId;
        } 

        /**
         * DefaultCpu.
         */
        public Builder defaultCpu(String defaultCpu) {
            this.putQueryParameter("DefaultCpu", defaultCpu);
            this.defaultCpu = defaultCpu;
            return this;
        }

        /**
         * DefaultMemory.
         */
        public Builder defaultMemory(String defaultMemory) {
            this.putQueryParameter("DefaultMemory", defaultMemory);
            this.defaultMemory = defaultMemory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Replicas.
         */
        public Builder replicas(Long replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop-xxx</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ModifySandboxTemplateRequest build() {
            return new ModifySandboxTemplateRequest(this);
        } 

    } 

}
