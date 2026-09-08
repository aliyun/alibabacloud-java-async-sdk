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
 * {@link ListContactFlowsRequest} extends {@link RequestModel}
 *
 * <p>ListContactFlowsRequest</p>
 */
public class ListContactFlowsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByField")
    private String orderByField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListContactFlowsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.orderByField = builder.orderByField;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchPattern = builder.searchPattern;
        this.sortOrder = builder.sortOrder;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactFlowsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderByField
     */
    public String getOrderByField() {
        return this.orderByField;
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
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListContactFlowsRequest, Builder> {
        private String instanceId; 
        private String orderByField; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 
        private String sortOrder; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListContactFlowsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.orderByField = request.orderByField;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
            this.sortOrder = request.sortOrder;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the instance.</p>
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
         * <p>The field by which to sort the results. Default value: updatedTime.</p>
         * 
         * <strong>example:</strong>
         * <p>updatedTime</p>
         */
        public Builder orderByField(String orderByField) {
            this.putQueryParameter("OrderByField", orderByField);
            this.orderByField = orderByField;
            return this;
        }

        /**
         * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
         * <p>This parameter is required.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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

        /**
         * <p>A keyword to search for in the names or descriptions of IVR flows.</p>
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><code>ASC</code>: The results are sorted in ascending order.</p>
         * </li>
         * <li><p><code>DESC</code>: The results are sorted in descending order. This is the default value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>Specifies the type of IVR flow to list. If you omit this parameter, IVR flows of all types are listed.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN_FLOW</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListContactFlowsRequest build() {
            return new ListContactFlowsRequest(this);
        } 

    } 

}
