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
 * {@link ListDeviceBelongIdentifiersRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceBelongIdentifiersRequest</p>
 */
public class ListDeviceBelongIdentifiersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifierIds")
    private java.util.List<String> identifierIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifierType")
    private String identifierType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifierValues")
    private java.util.List<String> identifierValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListDeviceBelongIdentifiersRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.identifierIds = builder.identifierIds;
        this.identifierType = builder.identifierType;
        this.identifierValues = builder.identifierValues;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceBelongIdentifiersRequest create() {
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
     * @return identifierIds
     */
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

    /**
     * @return identifierType
     */
    public String getIdentifierType() {
        return this.identifierType;
    }

    /**
     * @return identifierValues
     */
    public java.util.List<String> getIdentifierValues() {
        return this.identifierValues;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDeviceBelongIdentifiersRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<String> identifierIds; 
        private String identifierType; 
        private java.util.List<String> identifierValues; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceBelongIdentifiersRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.identifierIds = request.identifierIds;
            this.identifierType = request.identifierType;
            this.identifierValues = request.identifierValues;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The current page number. Valid values: 1 to 2147483647.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The list of record IDs to query. You can specify 1 to 100 positive integer decimal strings at a time. If this parameter is specified along with other filter parameters, the records that meet all the conditions are returned.</p>
         */
        public Builder identifierIds(java.util.List<String> identifierIds) {
            this.putBodyParameter("IdentifierIds", identifierIds);
            this.identifierIds = identifierIds;
            return this;
        }

        /**
         * <p>The identifier type. MAC indicates the MAC address of the network interface controller (NIC), SystemSN indicates the system serial number, and BIOSSN indicates the BIOS serial number. This parameter is required when IdentifierValues is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>MAC</p>
         */
        public Builder identifierType(String identifierType) {
            this.putBodyParameter("IdentifierType", identifierType);
            this.identifierType = identifierType;
            return this;
        }

        /**
         * <p>The list of identifier values for exact match. You can specify 1 to 100 items at a time, and each item can contain 1 to 128 characters. You must specify IdentifierType at the same time. Records that match any value in the array are returned. MAC addresses are uniformly converted to the lowercase colon-separated format. System serial numbers and BIOS serial numbers are case-sensitive and space-sensitive.</p>
         */
        public Builder identifierValues(java.util.List<String> identifierValues) {
            this.putBodyParameter("IdentifierValues", identifierValues);
            this.identifierValues = identifierValues;
            return this;
        }

        /**
         * <p>A reserved pagination parameter. This value is not used in the current version. Use PageSize to specify the number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A reserved pagination cursor. This value is not used in the current version. Use CurrentPage to specify the page number.</p>
         * 
         * <strong>example:</strong>
         * <p>d9fbd0d1ac24be90</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The maximum number of records to return per page. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDeviceBelongIdentifiersRequest build() {
            return new ListDeviceBelongIdentifiersRequest(this);
        } 

    } 

}
