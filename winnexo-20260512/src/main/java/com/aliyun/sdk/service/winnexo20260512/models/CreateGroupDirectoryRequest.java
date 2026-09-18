// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateGroupDirectoryRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupDirectoryRequest</p>
 */
public class CreateGroupDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentDirectoryId")
    private String parentDirectoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreateGroupDirectoryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.parentDirectoryId = builder.parentDirectoryId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupDirectoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentDirectoryId
     */
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateGroupDirectoryRequest, Builder> {
        private String description; 
        private String groupId; 
        private String name; 
        private String parentDirectoryId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupDirectoryRequest request) {
            super(request);
            this.description = request.description;
            this.groupId = request.groupId;
            this.name = request.name;
            this.parentDirectoryId = request.parentDirectoryId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The workspace description.</p>
         * 
         * <strong>example:</strong>
         * <p>ProjectDescription</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The project group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The updated name of the filter view.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ProjectFiles</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The folder ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_parent</p>
         */
        public Builder parentDirectoryId(String parentDirectoryId) {
            this.putBodyParameter("parentDirectoryId", parentDirectoryId);
            this.parentDirectoryId = parentDirectoryId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateGroupDirectoryRequest build() {
            return new CreateGroupDirectoryRequest(this);
        } 

    } 

}
