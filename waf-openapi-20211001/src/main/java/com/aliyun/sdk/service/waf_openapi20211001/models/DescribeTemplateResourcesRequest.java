// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTemplateResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeTemplateResourcesRequest</p>
 */
public class DescribeTemplateResourcesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private Long templateId;

    private DescribeTemplateResourcesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceType = builder.resourceType;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTemplateResourcesRequest create() {
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DescribeTemplateResourcesRequest, Builder> {
        private String instanceId; 
        private String resourceType; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTemplateResourcesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceType = request.resourceType;
            this.templateId = request.templateId;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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

        @Override
        public DescribeTemplateResourcesRequest build() {
            return new DescribeTemplateResourcesRequest(this);
        } 

    } 

}
