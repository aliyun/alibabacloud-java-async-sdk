// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DissociateGroupRequest} extends {@link RequestModel}
 *
 * <p>DissociateGroupRequest</p>
 */
public class DissociateGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private DissociateGroupRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.groupId = builder.groupId;
        this.clientToken = builder.clientToken;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DissociateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
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

    public static final class Builder extends Request.Builder<DissociateGroupRequest, Builder> {
        private String projectId; 
        private String groupId; 
        private String clientToken; 
        private java.util.List < String > resourceIds; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DissociateGroupRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.groupId = request.groupId;
            this.clientToken = request.clientToken;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
        } 

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
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
        public DissociateGroupRequest build() {
            return new DissociateGroupRequest(this);
        } 

    } 

}
