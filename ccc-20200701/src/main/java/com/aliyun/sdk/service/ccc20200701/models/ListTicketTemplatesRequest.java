// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListTicketTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListTicketTemplatesRequest</p>
 */
public class ListTicketTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private ListTicketTemplatesRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchPattern = builder.searchPattern;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<ListTicketTemplatesRequest, Builder> {
        private String categoryId; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 
        private String state; 

        private Builder() {
            super();
        } 

        private Builder(ListTicketTemplatesRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
            this.state = request.state;
        } 

        /**
         * <p>The ID of the ticket category.</p>
         * 
         * <strong>example:</strong>
         * <p>43c2671b-********86d0-6bd187905cc8</p>
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number. The value must be between 1 and 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. The value must be between 1 and 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the template. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>模板1</p>
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        /**
         * <p>The status of the template.</p>
         * <ul>
         * <li><p>Enabled: The template is published.</p>
         * </li>
         * <li><p>Disabled: The template is unpublished.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public ListTicketTemplatesRequest build() {
            return new ListTicketTemplatesRequest(this);
        } 

    } 

}
