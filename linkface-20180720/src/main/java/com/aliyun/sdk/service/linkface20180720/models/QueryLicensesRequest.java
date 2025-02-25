// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link QueryLicensesRequest} extends {@link RequestModel}
 *
 * <p>QueryLicensesRequest</p>
 */
public class QueryLicensesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer currentPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LicenseType")
    private Integer licenseType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    private QueryLicensesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.licenseType = builder.licenseType;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLicensesRequest create() {
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
     * @return licenseType
     */
    public Integer getLicenseType() {
        return this.licenseType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryLicensesRequest, Builder> {
        private Integer currentPage; 
        private Integer licenseType; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryLicensesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.licenseType = request.licenseType;
            this.pageSize = request.pageSize;
        } 

        /**
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
         * LicenseType.
         */
        public Builder licenseType(Integer licenseType) {
            this.putBodyParameter("LicenseType", licenseType);
            this.licenseType = licenseType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryLicensesRequest build() {
            return new QueryLicensesRequest(this);
        } 

    } 

}
