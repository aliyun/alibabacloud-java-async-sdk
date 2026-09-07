// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListApprovalSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListApprovalSchemasRequest</p>
 */
public class ListApprovalSchemasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaIds")
    private java.util.List<String> schemaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemaName")
    private String schemaName;

    private ListApprovalSchemasRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.policyType = builder.policyType;
        this.schemaIds = builder.schemaIds;
        this.schemaName = builder.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApprovalSchemasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return schemaIds
     */
    public java.util.List<String> getSchemaIds() {
        return this.schemaIds;
    }

    /**
     * @return schemaName
     */
    public String getSchemaName() {
        return this.schemaName;
    }

    public static final class Builder extends Request.Builder<ListApprovalSchemasRequest, Builder> {
        private Long currentPage; 
        private Long pageSize; 
        private String policyType; 
        private java.util.List<String> schemaIds; 
        private String schemaName; 

        private Builder() {
            super();
        } 

        private Builder(ListApprovalSchemasRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.policyType = request.policyType;
            this.schemaIds = request.schemaIds;
            this.schemaName = request.schemaName;
        } 

        /**
         * <p>The current page number for paged queries. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page for paged queries. Valid values: 1 to 500.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><p><strong>DomainBlacklist</strong>: Domain blacklist.</p>
         * </li>
         * <li><p><strong>DomainWhitelist</strong>: Domain whitelist.</p>
         * </li>
         * <li><p><strong>SoftwareBlock</strong>: Software disable.</p>
         * </li>
         * <li><p><strong>AppUninstall</strong>: Terminal uninstall.</p>
         * </li>
         * <li><p><strong>DlpSend</strong>: File outbound.</p>
         * </li>
         * <li><p><strong>PeripheralBlock</strong>: Peripheral control.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>Collection of approval template IDs.</p>
         */
        public Builder schemaIds(java.util.List<String> schemaIds) {
            this.putQueryParameter("SchemaIds", schemaIds);
            this.schemaIds = schemaIds;
            return this;
        }

        /**
         * <p>The template name. It can be 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase English letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder schemaName(String schemaName) {
            this.putQueryParameter("SchemaName", schemaName);
            this.schemaName = schemaName;
            return this;
        }

        @Override
        public ListApprovalSchemasRequest build() {
            return new ListApprovalSchemasRequest(this);
        } 

    } 

}
