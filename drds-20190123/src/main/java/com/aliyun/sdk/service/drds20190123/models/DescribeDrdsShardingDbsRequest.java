// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsShardingDbsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsShardingDbsRequest</p>
 */
public class DescribeDrdsShardingDbsRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DbNamePattern")
    private String dbNamePattern;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    private DescribeDrdsShardingDbsRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.dbNamePattern = builder.dbNamePattern;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsShardingDbsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dbNamePattern
     */
    public String getDbNamePattern() {
        return this.dbNamePattern;
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
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsShardingDbsRequest, Builder> {
        private String dbName; 
        private String dbNamePattern; 
        private String drdsInstanceId; 
        private Long pageNumber; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsShardingDbsRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.dbNamePattern = response.dbNamePattern;
            this.drdsInstanceId = response.drdsInstanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DbNamePattern.
         */
        public Builder dbNamePattern(String dbNamePattern) {
            this.putQueryParameter("DbNamePattern", dbNamePattern);
            this.dbNamePattern = dbNamePattern;
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
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeDrdsShardingDbsRequest build() {
            return new DescribeDrdsShardingDbsRequest(this);
        } 

    } 

}
