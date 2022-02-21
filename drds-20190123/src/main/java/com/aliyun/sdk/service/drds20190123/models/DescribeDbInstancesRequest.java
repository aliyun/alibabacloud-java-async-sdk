// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDbInstancesRequest</p>
 */
public class DescribeDbInstancesRequest extends Request {
    @Query
    @NameInMap("DbInstType")
    private String dbInstType;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Search")
    private String search;

    private DescribeDbInstancesRequest(Builder builder) {
        super(builder);
        this.dbInstType = builder.dbInstType;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.search = builder.search;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstType
     */
    public String getDbInstType() {
        return this.dbInstType;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
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
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    public static final class Builder extends Request.Builder<DescribeDbInstancesRequest, Builder> {
        private String dbInstType; 
        private String drdsInstanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String search; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDbInstancesRequest response) {
            super(response);
            this.dbInstType = response.dbInstType;
            this.drdsInstanceId = response.drdsInstanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.search = response.search;
        } 

        /**
         * DbInstType.
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Search.
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
            return this;
        }

        @Override
        public DescribeDbInstancesRequest build() {
            return new DescribeDbInstancesRequest(this);
        } 

    } 

}
