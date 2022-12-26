// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniRecoverableListRequest} extends {@link RequestModel}
 *
 * <p>DescribeUniRecoverableListRequest</p>
 */
public class DescribeUniRecoverableListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Database")
    private String database;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private Long policyId;

    private DescribeUniRecoverableListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.database = builder.database;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUniRecoverableListRequest create() {
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
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DescribeUniRecoverableListRequest, Builder> {
        private Integer currentPage; 
        private String database; 
        private Integer pageSize; 
        private Long policyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUniRecoverableListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.database = request.database;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DescribeUniRecoverableListRequest build() {
            return new DescribeUniRecoverableListRequest(this);
        } 

    } 

}
