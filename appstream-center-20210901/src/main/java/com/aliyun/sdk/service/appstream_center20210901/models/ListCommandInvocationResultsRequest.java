// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListCommandInvocationResultsRequest} extends {@link RequestModel}
 *
 * <p>ListCommandInvocationResultsRequest</p>
 */
public class ListCommandInvocationResultsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupIds")
    private java.util.List<String> appInstanceGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentIds")
    private java.util.List<String> appInstancePersistentIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InvocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    private ListCommandInvocationResultsRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceGroupIds = builder.appInstanceGroupIds;
        this.appInstancePersistentIds = builder.appInstancePersistentIds;
        this.invocationId = builder.invocationId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommandInvocationResultsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceGroupIds
     */
    public java.util.List<String> getAppInstanceGroupIds() {
        return this.appInstanceGroupIds;
    }

    /**
     * @return appInstancePersistentIds
     */
    public java.util.List<String> getAppInstancePersistentIds() {
        return this.appInstancePersistentIds;
    }

    /**
     * @return invocationId
     */
    public String getInvocationId() {
        return this.invocationId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<ListCommandInvocationResultsRequest, Builder> {
        private String appInstanceGroupId; 
        private java.util.List<String> appInstanceGroupIds; 
        private java.util.List<String> appInstancePersistentIds; 
        private String invocationId; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(ListCommandInvocationResultsRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceGroupIds = request.appInstanceGroupIds;
            this.appInstancePersistentIds = request.appInstancePersistentIds;
            this.invocationId = request.invocationId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
        } 

        /**
         * <p>The delivery group ID. Queries the command execution results under this delivery group. This parameter is required when AppInstanceGroupIds is not specified. If both are specified, AppInstanceGroupIds takes precedence and this parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0bxls9m9arax6****</p>
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * <p>The list of delivery group IDs. You can specify up to 200 IDs, and all delivery groups must be in the same region. When specified, this parameter takes precedence over AppInstanceGroupId and queries the command execution results of all persistent sessions under these delivery groups. The list cannot contain null values.</p>
         */
        public Builder appInstanceGroupIds(java.util.List<String> appInstanceGroupIds) {
            this.putBodyParameter("AppInstanceGroupIds", appInstanceGroupIds);
            this.appInstanceGroupIds = appInstanceGroupIds;
            return this;
        }

        /**
         * <p>The list of persistent session IDs. You can specify up to 100 IDs to query the command execution results of only the specified persistent sessions. When AppInstanceGroupIds is specified, only persistent sessions that belong to these delivery groups are retained. If no matching persistent sessions are found, an empty list is returned.</p>
         */
        public Builder appInstancePersistentIds(java.util.List<String> appInstancePersistentIds) {
            this.putBodyParameter("AppInstancePersistentIds", appInstancePersistentIds);
            this.appInstancePersistentIds = appInstancePersistentIds;
            return this;
        }

        /**
         * <p>The command execution ID, which is the InvocationId returned when RunAppInstanceCommand is called to deliver a command.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0bxls9m9ara****</p>
         */
        public Builder invocationId(String invocationId) {
            this.putBodyParameter("InvocationId", invocationId);
            this.invocationId = invocationId;
            return this;
        }

        /**
         * <p>This parameter does not take effect in the current version and does not affect the query results if passed. Use PageNumber and PageSize for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>This parameter does not take effect in the current version and does not affect the query results if passed. Use PageNumber and PageSize for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kDw2Ml****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number of the query results to return. This parameter is used together with PageSize for paging. If this parameter is not passed, the default value is 0, which indicates the first page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The product type. Currently, only WuyingServer is supported. If you pass other values, a parameter error is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public ListCommandInvocationResultsRequest build() {
            return new ListCommandInvocationResultsRequest(this);
        } 

    } 

}
