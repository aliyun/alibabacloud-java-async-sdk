// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeregisterResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>DeregisterResourceTypeRequest</p>
 */
public class DeregisterResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private DeregisterResourceTypeRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterResourceTypeRequest create() {
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

    public static final class Builder extends Request.Builder<DeregisterResourceTypeRequest, Builder> {
        private String resourceType; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeregisterResourceTypeRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The version ID. If you want to delete a version of the resource type, you must specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeregisterResourceTypeRequest build() {
            return new DeregisterResourceTypeRequest(this);
        } 

    } 

}
