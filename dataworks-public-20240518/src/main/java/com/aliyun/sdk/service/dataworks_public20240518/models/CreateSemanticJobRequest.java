// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateSemanticJobRequest} extends {@link RequestModel}
 *
 * <p>CreateSemanticJobRequest</p>
 */
public class CreateSemanticJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceFileIds")
    private java.util.List<String> referenceFileIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceFileUris")
    private java.util.List<String> referenceFileUris;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> source;

    private CreateSemanticJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.referenceFileIds = builder.referenceFileIds;
        this.referenceFileUris = builder.referenceFileUris;
        this.resourceGroupId = builder.resourceGroupId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSemanticJobRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return referenceFileIds
     */
    public java.util.List<String> getReferenceFileIds() {
        return this.referenceFileIds;
    }

    /**
     * @return referenceFileUris
     */
    public java.util.List<String> getReferenceFileUris() {
        return this.referenceFileUris;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return source
     */
    public java.util.Map<String, ?> getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateSemanticJobRequest, Builder> {
        private String regionId; 
        private String name; 
        private Long projectId; 
        private java.util.List<String> referenceFileIds; 
        private java.util.List<String> referenceFileUris; 
        private String resourceGroupId; 
        private java.util.Map<String, ?> source; 

        private Builder() {
            super();
        } 

        private Builder(CreateSemanticJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.projectId = request.projectId;
            this.referenceFileIds = request.referenceFileIds;
            this.referenceFileUris = request.referenceFileUris;
            this.resourceGroupId = request.resourceGroupId;
            this.source = request.source;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>semantic-job-demo</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ReferenceFileIds.
         */
        public Builder referenceFileIds(java.util.List<String> referenceFileIds) {
            String referenceFileIdsShrink = shrink(referenceFileIds, "ReferenceFileIds", "json");
            this.putBodyParameter("ReferenceFileIds", referenceFileIdsShrink);
            this.referenceFileIds = referenceFileIds;
            return this;
        }

        /**
         * ReferenceFileUris.
         */
        public Builder referenceFileUris(java.util.List<String> referenceFileUris) {
            String referenceFileUrisShrink = shrink(referenceFileUris, "ReferenceFileUris", "json");
            this.putBodyParameter("ReferenceFileUris", referenceFileUrisShrink);
            this.referenceFileUris = referenceFileUris;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-demo</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;maxcompute&quot;,&quot;domain&quot;:&quot;sales&quot;,&quot;pinnedScopeInfo&quot;:[{&quot;type&quot;:&quot;project&quot;,&quot;name&quot;:&quot;mc_project&quot;}]}</p>
         */
        public Builder source(java.util.Map<String, ?> source) {
            String sourceShrink = shrink(source, "Source", "json");
            this.putBodyParameter("Source", sourceShrink);
            this.source = source;
            return this;
        }

        @Override
        public CreateSemanticJobRequest build() {
            return new CreateSemanticJobRequest(this);
        } 

    } 

}
