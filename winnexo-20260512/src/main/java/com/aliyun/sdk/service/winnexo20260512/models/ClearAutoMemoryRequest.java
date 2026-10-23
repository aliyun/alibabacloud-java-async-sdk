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
 * {@link ClearAutoMemoryRequest} extends {@link RequestModel}
 *
 * <p>ClearAutoMemoryRequest</p>
 */
public class ClearAutoMemoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerType")
    private String ownerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ClearAutoMemoryRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.ownerType = builder.ownerType;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearAutoMemoryRequest create() {
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
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ClearAutoMemoryRequest, Builder> {
        private String groupId; 
        private String ownerType; 
        private String tenantId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ClearAutoMemoryRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.ownerType = request.ownerType;
            this.tenantId = request.tenantId;
            this.type = request.type;
        } 

        /**
         * <p>The workspace ID. This parameter is required when ownerType is set to group.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_12345</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The owner type. Valid values:</p>
         * <ul>
         * <li>user: the personal memory of the authenticated user.</li>
         * <li>group: the memory of a specified workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        public Builder ownerType(String ownerType) {
            this.putBodyParameter("ownerType", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The memory type. Valid values: user, feedback, reference, project, and all. A value of all does not clear manual memory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ClearAutoMemoryRequest build() {
            return new ClearAutoMemoryRequest(this);
        } 

    } 

}
