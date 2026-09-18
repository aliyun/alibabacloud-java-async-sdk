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
 * {@link UpdateGroupDirectoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateGroupDirectoryRequest</p>
 */
public class UpdateGroupDirectoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateGroupDirectoryRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.groupId = builder.groupId;
        this.name = builder.name;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupDirectoryRequest create() {
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
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateGroupDirectoryRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String groupId; 
        private String name; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGroupDirectoryRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.groupId = request.groupId;
            this.name = request.name;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The new description. If this parameter is set to an empty string, the description is cleared. If this parameter is omitted or set to null, the description remains unchanged. At least one of name or description must be non-null.</p>
         * 
         * <strong>example:</strong>
         * <p>Project description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the physical subfolder in the current space. The internal root folder and reference folders are not allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dir_example</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the collaborative share.</p>
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
         * <p>The new name. If this parameter is omitted or set to null, the name remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>Project Materials</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
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
        public UpdateGroupDirectoryRequest build() {
            return new UpdateGroupDirectoryRequest(this);
        } 

    } 

}
