// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTypeTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeTemplateRequest</p>
 */
public class GetResourceTypeTemplateRequest extends Request {
    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("VersionId")
    private String versionId;

    private GetResourceTypeTemplateRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<GetResourceTypeTemplateRequest, Builder> {
        private String resourceType; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTypeTemplateRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.versionId = request.versionId;
        } 

        /**
         * The resource type.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The version ID. If you want to query a specific version of the resource type, you must specify this parameter. If you do not specify this parameter, only the resource type is queried.
         * <p>
         * 
         * > This parameter is supported only for modules.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public GetResourceTypeTemplateRequest build() {
            return new GetResourceTypeTemplateRequest(this);
        } 

    } 

}
