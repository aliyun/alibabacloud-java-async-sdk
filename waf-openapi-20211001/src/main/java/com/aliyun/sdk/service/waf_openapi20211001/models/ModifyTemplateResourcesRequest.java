// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateResourcesRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateResourcesRequest</p>
 */
public class ModifyTemplateResourcesRequest extends Request {
    @Query
    @NameInMap("BindResourceGroups")
    private java.util.List < String > bindResourceGroups;

    @Query
    @NameInMap("BindResources")
    private java.util.List < String > bindResources;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    @Query
    @NameInMap("UnbindResourceGroups")
    private java.util.List < String > unbindResourceGroups;

    @Query
    @NameInMap("UnbindResources")
    private java.util.List < String > unbindResources;

    private ModifyTemplateResourcesRequest(Builder builder) {
        super(builder);
        this.bindResourceGroups = builder.bindResourceGroups;
        this.bindResources = builder.bindResources;
        this.instanceId = builder.instanceId;
        this.templateId = builder.templateId;
        this.unbindResourceGroups = builder.unbindResourceGroups;
        this.unbindResources = builder.unbindResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindResourceGroups
     */
    public java.util.List < String > getBindResourceGroups() {
        return this.bindResourceGroups;
    }

    /**
     * @return bindResources
     */
    public java.util.List < String > getBindResources() {
        return this.bindResources;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return unbindResourceGroups
     */
    public java.util.List < String > getUnbindResourceGroups() {
        return this.unbindResourceGroups;
    }

    /**
     * @return unbindResources
     */
    public java.util.List < String > getUnbindResources() {
        return this.unbindResources;
    }

    public static final class Builder extends Request.Builder<ModifyTemplateResourcesRequest, Builder> {
        private java.util.List < String > bindResourceGroups; 
        private java.util.List < String > bindResources; 
        private String instanceId; 
        private Long templateId; 
        private java.util.List < String > unbindResourceGroups; 
        private java.util.List < String > unbindResources; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateResourcesRequest request) {
            super(request);
            this.bindResourceGroups = request.bindResourceGroups;
            this.bindResources = request.bindResources;
            this.instanceId = request.instanceId;
            this.templateId = request.templateId;
            this.unbindResourceGroups = request.unbindResourceGroups;
            this.unbindResources = request.unbindResources;
        } 

        /**
         * BindResourceGroups.
         */
        public Builder bindResourceGroups(java.util.List < String > bindResourceGroups) {
            this.putQueryParameter("BindResourceGroups", bindResourceGroups);
            this.bindResourceGroups = bindResourceGroups;
            return this;
        }

        /**
         * BindResources.
         */
        public Builder bindResources(java.util.List < String > bindResources) {
            this.putQueryParameter("BindResources", bindResources);
            this.bindResources = bindResources;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * UnbindResourceGroups.
         */
        public Builder unbindResourceGroups(java.util.List < String > unbindResourceGroups) {
            this.putQueryParameter("UnbindResourceGroups", unbindResourceGroups);
            this.unbindResourceGroups = unbindResourceGroups;
            return this;
        }

        /**
         * UnbindResources.
         */
        public Builder unbindResources(java.util.List < String > unbindResources) {
            this.putQueryParameter("UnbindResources", unbindResources);
            this.unbindResources = unbindResources;
            return this;
        }

        @Override
        public ModifyTemplateResourcesRequest build() {
            return new ModifyTemplateResourcesRequest(this);
        } 

    } 

}
