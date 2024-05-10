// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>SetResourceTypeRequest</p>
 */
public class SetResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultVersionId")
    private String defaultVersionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private SetResourceTypeRequest(Builder builder) {
        super(builder);
        this.defaultVersionId = builder.defaultVersionId;
        this.description = builder.description;
        this.resourceType = builder.resourceType;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetResourceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultVersionId
     */
    public String getDefaultVersionId() {
        return this.defaultVersionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<SetResourceTypeRequest, Builder> {
        private String defaultVersionId; 
        private String description; 
        private String resourceType; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(SetResourceTypeRequest request) {
            super(request);
            this.defaultVersionId = request.defaultVersionId;
            this.description = request.description;
            this.resourceType = request.resourceType;
            this.versionId = request.versionId;
        } 

        /**
         * The ID of the default version. You can use this parameter to specify the default version of the resource type.
         * <p>
         * 
         * > You can specify only one of the VersionId and DefaultVersionId parameters.
         */
        public Builder defaultVersionId(String defaultVersionId) {
            this.putQueryParameter("DefaultVersionId", defaultVersionId);
            this.defaultVersionId = defaultVersionId;
            return this;
        }

        /**
         * The description of the resource type or resource type version. The description can be up to 512 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * The version ID. If you want to modify a version of the resource type, you must specify this parameter. If you do not specify this parameter, only the resource type is modified.
         * <p>
         * 
         * > You can specify only one of the VersionId and DefaultVersionId parameters.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public SetResourceTypeRequest build() {
            return new SetResourceTypeRequest(this);
        } 

    } 

}
