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
 * {@link GetMemoryDetailRequest} extends {@link RequestModel}
 *
 * <p>GetMemoryDetailRequest</p>
 */
public class GetMemoryDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerType")
    private String ownerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetMemoryDetailRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.ownerType = builder.ownerType;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetMemoryDetailRequest, Builder> {
        private String groupId; 
        private String ownerType; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetMemoryDetailRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.ownerType = request.ownerType;
            this.tenantId = request.tenantId;
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
        public GetMemoryDetailRequest build() {
            return new GetMemoryDetailRequest(this);
        } 

    } 

}
