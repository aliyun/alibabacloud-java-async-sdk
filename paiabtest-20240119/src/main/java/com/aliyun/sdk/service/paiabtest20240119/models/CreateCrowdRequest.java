// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCrowdRequest} extends {@link RequestModel}
 *
 * <p>CreateCrowdRequest</p>
 */
public class CreateCrowdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("Regionid")
    private String regionid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Users")
    @com.aliyun.core.annotation.Validation(required = true)
    private String users;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateCrowdRequest(Builder builder) {
        super(builder);
        this.regionid = builder.regionid;
        this.description = builder.description;
        this.label = builder.label;
        this.name = builder.name;
        this.users = builder.users;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCrowdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionid
     */
    public String getRegionid() {
        return this.regionid;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return users
     */
    public String getUsers() {
        return this.users;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateCrowdRequest, Builder> {
        private String regionid; 
        private String description; 
        private String label; 
        private String name; 
        private String users; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCrowdRequest request) {
            super(request);
            this.regionid = request.regionid;
            this.description = request.description;
            this.label = request.label;
            this.name = request.name;
            this.users = request.users;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Regionid.
         */
        public Builder regionid(String regionid) {
            this.putHostParameter("Regionid", regionid);
            this.regionid = regionid;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(String users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateCrowdRequest build() {
            return new CreateCrowdRequest(this);
        } 

    } 

}
