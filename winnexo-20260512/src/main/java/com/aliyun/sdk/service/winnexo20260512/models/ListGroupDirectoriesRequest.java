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
 * {@link ListGroupDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListGroupDirectoriesRequest</p>
 */
public class ListGroupDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private ListGroupDirectoriesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.groupId = builder.groupId;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupDirectoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListGroupDirectoriesRequest, Builder> {
        private String directoryId; 
        private String groupId; 
        private String sortField; 
        private String sortOrder; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListGroupDirectoriesRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.groupId = request.groupId;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The ID of a visible directory in the current space. If this parameter is omitted or set to root, the space root is queried. The first query reuses the existing service-initialized internal root directory.</p>
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
         * <p>The sort field. Valid values: name, gmt_create, and gmt_modified.</p>
         * 
         * <strong>example:</strong>
         * <p>gmt_create</p>
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("sortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>The sort order. Valid values: asc and desc.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("sortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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
        public ListGroupDirectoriesRequest build() {
            return new ListGroupDirectoriesRequest(this);
        } 

    } 

}
