// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTypeRequest</p>
 */
public class GetResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private GetResourceTypeRequest(Builder builder) {
        super(builder);
        this.resourceType = builder.resourceType;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTypeRequest create() {
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

    public static final class Builder extends Request.Builder<GetResourceTypeRequest, Builder> {
        private String resourceType; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTypeRequest request) {
            super(request);
            this.resourceType = request.resourceType;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ROS::WaitConditionHandle</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The version ID. If you want to query a specific version of the resource type, you must specify this parameter. If you do not specify this parameter, only the resource type is queried.</p>
         * <blockquote>
         * <p>This parameter is supported only for modules.</p>
         * </blockquote>
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
        public GetResourceTypeRequest build() {
            return new GetResourceTypeRequest(this);
        } 

    } 

}
