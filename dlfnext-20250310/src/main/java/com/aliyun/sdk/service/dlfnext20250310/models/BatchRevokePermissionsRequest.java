// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link BatchRevokePermissionsRequest} extends {@link RequestModel}
 *
 * <p>BatchRevokePermissionsRequest</p>
 */
public class BatchRevokePermissionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permissions")
    private java.util.List<Permission> permissions;

    private BatchRevokePermissionsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.permissions = builder.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRevokePermissionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return permissions
     */
    public java.util.List<Permission> getPermissions() {
        return this.permissions;
    }

    public static final class Builder extends Request.Builder<BatchRevokePermissionsRequest, Builder> {
        private String catalogId; 
        private java.util.List<Permission> permissions; 

        private Builder() {
            super();
        } 

        private Builder(BatchRevokePermissionsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.permissions = request.permissions;
        } 

        /**
         * catalogId.
         */
        public Builder catalogId(String catalogId) {
            this.putPathParameter("catalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * permissions.
         */
        public Builder permissions(java.util.List<Permission> permissions) {
            this.putBodyParameter("permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        @Override
        public BatchRevokePermissionsRequest build() {
            return new BatchRevokePermissionsRequest(this);
        } 

    } 

}
