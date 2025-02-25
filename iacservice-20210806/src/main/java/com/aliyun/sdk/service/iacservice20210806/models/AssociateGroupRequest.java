// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateGroupRequest} extends {@link RequestModel}
 *
 * <p>AssociateGroupRequest</p>
 */
public class AssociateGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private AssociateGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.clientToken = builder.clientToken;
        this.projectId = builder.projectId;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<AssociateGroupRequest, Builder> {
        private String groupId; 
        private String clientToken; 
        private String projectId; 
        private java.util.List < String > resourceIds; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(AssociateGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.clientToken = request.clientToken;
            this.projectId = request.projectId;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
        } 

        /**
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * resourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putBodyParameter("resourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public AssociateGroupRequest build() {
            return new AssociateGroupRequest(this);
        } 

    } 

}
