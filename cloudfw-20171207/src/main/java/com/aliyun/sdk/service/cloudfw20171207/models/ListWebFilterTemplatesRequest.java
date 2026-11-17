// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ListWebFilterTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListWebFilterTemplatesRequest</p>
 */
public class ListWebFilterTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebFilterTemplateIds")
    private java.util.List<String> webFilterTemplateIds;

    private ListWebFilterTemplatesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.webFilterTemplateIds = builder.webFilterTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebFilterTemplatesRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return webFilterTemplateIds
     */
    public java.util.List<String> getWebFilterTemplateIds() {
        return this.webFilterTemplateIds;
    }

    public static final class Builder extends Request.Builder<ListWebFilterTemplatesRequest, Builder> {
        private String description; 
        private String name; 
        private Long pageNo; 
        private Long pageSize; 
        private String status; 
        private java.util.List<String> webFilterTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(ListWebFilterTemplatesRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.webFilterTemplateIds = request.webFilterTemplateIds;
        } 

        /**
         * <p>The description of the web filtering template. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>URL access control</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the web filtering template. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Web filtering template</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>The status of the web filtering template. Exact match is supported. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The IDs of the web filtering templates for batch exact matching. You can specify up to 100 template IDs.</p>
         */
        public Builder webFilterTemplateIds(java.util.List<String> webFilterTemplateIds) {
            this.putQueryParameter("WebFilterTemplateIds", webFilterTemplateIds);
            this.webFilterTemplateIds = webFilterTemplateIds;
            return this;
        }

        @Override
        public ListWebFilterTemplatesRequest build() {
            return new ListWebFilterTemplatesRequest(this);
        } 

    } 

}
