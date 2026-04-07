// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link ListVariableRequest} extends {@link RequestModel}
 *
 * <p>ListVariableRequest</p>
 */
public class ListVariableRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    private ListVariableRequest(Builder builder) {
        super(builder);
        this.businessUnitId = builder.businessUnitId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchPattern = builder.searchPattern;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVariableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
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

    public static final class Builder extends Request.Builder<ListVariableRequest, Builder> {
        private String businessUnitId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 

        private Builder() {
            super();
        } 

        private Builder(ListVariableRequest request) {
            super(request);
            this.businessUnitId = request.businessUnitId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
        } 

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchPattern.
         */
        public Builder searchPattern(String searchPattern) {
            this.putBodyParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        @Override
        public ListVariableRequest build() {
            return new ListVariableRequest(this);
        } 

    } 

}
