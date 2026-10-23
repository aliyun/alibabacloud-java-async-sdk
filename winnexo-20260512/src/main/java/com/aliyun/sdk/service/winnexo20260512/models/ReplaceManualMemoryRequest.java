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
 * {@link ReplaceManualMemoryRequest} extends {@link RequestModel}
 *
 * <p>ReplaceManualMemoryRequest</p>
 */
public class ReplaceManualMemoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerType")
    private String ownerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ReplaceManualMemoryRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.groupId = builder.groupId;
        this.ownerType = builder.ownerType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReplaceManualMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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

    public static final class Builder extends Request.Builder<ReplaceManualMemoryRequest, Builder> {
        private String content; 
        private String groupId; 
        private String ownerType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ReplaceManualMemoryRequest request) {
            super(request);
            this.content = request.content;
            this.groupId = request.groupId;
            this.ownerType = request.ownerType;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The complete content of profile.md. An empty string indicates that the memory is cleared. This field is required, but an empty value is allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Prefers concise answers</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
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
         * <p>The owner type. A value of user indicates the personal memory of the authenticated user. A value of group indicates the memory of a specified workspace.</p>
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
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ReplaceManualMemoryRequest build() {
            return new ReplaceManualMemoryRequest(this);
        } 

    } 

}
