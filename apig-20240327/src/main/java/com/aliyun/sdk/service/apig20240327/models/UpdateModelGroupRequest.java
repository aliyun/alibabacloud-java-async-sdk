// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateModelGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelGroupRequest</p>
 */
public class UpdateModelGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("modelGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelCardIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> modelCardIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UpdateModelGroupRequest(Builder builder) {
        super(builder);
        this.modelGroupId = builder.modelGroupId;
        this.description = builder.description;
        this.expectedVersion = builder.expectedVersion;
        this.modelCardIds = builder.modelCardIds;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelGroupId
     */
    public String getModelGroupId() {
        return this.modelGroupId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * @return modelCardIds
     */
    public java.util.List<String> getModelCardIds() {
        return this.modelCardIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateModelGroupRequest, Builder> {
        private String modelGroupId; 
        private String description; 
        private Long expectedVersion; 
        private java.util.List<String> modelCardIds; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelGroupRequest request) {
            super(request);
            this.modelGroupId = request.modelGroupId;
            this.description = request.description;
            this.expectedVersion = request.expectedVersion;
            this.modelCardIds = request.modelCardIds;
            this.name = request.name;
        } 

        /**
         * <p>The model group ID. Use the modelGroupId returned by CreateModelGroup.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mg-d00000000000000000000</p>
         */
        public Builder modelGroupId(String modelGroupId) {
            this.putPathParameter("modelGroupId", modelGroupId);
            this.modelGroupId = modelGroupId;
            return this;
        }

        /**
         * <p>The nullable description. The maximum length is 1024 UTF-16 code units.</p>
         * 
         * <strong>example:</strong>
         * <p>Model group for service integration</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The group version obtained from the most recent Get operation. A stale version returns Conflict.ModelGroupChanged. Submitting the same expectedVersion, name, description, and modelCardIds retries the Failed or PartiallyFailed configuration for the same version, reuses the operationId, and does not increment the group version. Pending, Running, or Succeeded states are not forcibly reset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.putBodyParameter("expectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>The actual or logical model identities within the same instance. The list can be null and must not contain duplicates. Model groups are not accepted as members.</p>
         * <p>This parameter is required.</p>
         */
        public Builder modelCardIds(java.util.List<String> modelCardIds) {
            this.putBodyParameter("modelCardIds", modelCardIds);
            this.modelCardIds = modelCardIds;
            return this;
        }

        /**
         * <p>The unique name within the instance. The length is 1 to 128 UTF-8 bytes after trimming.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>beta-model-group</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateModelGroupRequest build() {
            return new UpdateModelGroupRequest(this);
        } 

    } 

}
