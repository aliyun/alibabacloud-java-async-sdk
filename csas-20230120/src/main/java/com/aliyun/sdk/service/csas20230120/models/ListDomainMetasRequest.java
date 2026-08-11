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
 * {@link ListDomainMetasRequest} extends {@link RequestModel}
 *
 * <p>ListDomainMetasRequest</p>
 */
public class ListDomainMetasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultTemplate")
    private Boolean defaultTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListDomainMetasRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.defaultTemplate = builder.defaultTemplate;
        this.listType = builder.listType;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainMetasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return defaultTemplate
     */
    public Boolean getDefaultTemplate() {
        return this.defaultTemplate;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDomainMetasRequest, Builder> {
        private Integer currentPage; 
        private Boolean defaultTemplate; 
        private String listType; 
        private String name; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDomainMetasRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.defaultTemplate = request.defaultTemplate;
            this.listType = request.listType;
            this.name = request.name;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DefaultTemplate.
         */
        public Builder defaultTemplate(Boolean defaultTemplate) {
            this.putQueryParameter("DefaultTemplate", defaultTemplate);
            this.defaultTemplate = defaultTemplate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>la_domain_white_list</p>
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDomainMetasRequest build() {
            return new ListDomainMetasRequest(this);
        } 

    } 

}
