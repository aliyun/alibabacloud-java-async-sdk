// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogsOnSliceRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLLogsOnSliceRequest</p>
 */
public class DescribeSQLLogsOnSliceRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("ExecuteState")
    private String executeState;

    @Query
    @NameInMap("MaxExecuteCost")
    private String maxExecuteCost;

    @Query
    @NameInMap("MinExecuteCost")
    private String minExecuteCost;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryId")
    @Validation(required = true)
    private String queryId;

    @Query
    @NameInMap("SliceId")
    @Validation(required = true)
    private String sliceId;

    private DescribeSQLLogsOnSliceRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.executeState = builder.executeState;
        this.maxExecuteCost = builder.maxExecuteCost;
        this.minExecuteCost = builder.minExecuteCost;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.queryId = builder.queryId;
        this.sliceId = builder.sliceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogsOnSliceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return executeState
     */
    public String getExecuteState() {
        return this.executeState;
    }

    /**
     * @return maxExecuteCost
     */
    public String getMaxExecuteCost() {
        return this.maxExecuteCost;
    }

    /**
     * @return minExecuteCost
     */
    public String getMinExecuteCost() {
        return this.minExecuteCost;
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
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return sliceId
     */
    public String getSliceId() {
        return this.sliceId;
    }

    public static final class Builder extends Request.Builder<DescribeSQLLogsOnSliceRequest, Builder> {
        private String DBInstanceId; 
        private String executeState; 
        private String maxExecuteCost; 
        private String minExecuteCost; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String queryId; 
        private String sliceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSQLLogsOnSliceRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.executeState = response.executeState;
            this.maxExecuteCost = response.maxExecuteCost;
            this.minExecuteCost = response.minExecuteCost;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.queryId = response.queryId;
            this.sliceId = response.sliceId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ExecuteState.
         */
        public Builder executeState(String executeState) {
            this.putQueryParameter("ExecuteState", executeState);
            this.executeState = executeState;
            return this;
        }

        /**
         * MaxExecuteCost.
         */
        public Builder maxExecuteCost(String maxExecuteCost) {
            this.putQueryParameter("MaxExecuteCost", maxExecuteCost);
            this.maxExecuteCost = maxExecuteCost;
            return this;
        }

        /**
         * MinExecuteCost.
         */
        public Builder minExecuteCost(String minExecuteCost) {
            this.putQueryParameter("MinExecuteCost", minExecuteCost);
            this.minExecuteCost = minExecuteCost;
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
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        /**
         * SliceId.
         */
        public Builder sliceId(String sliceId) {
            this.putQueryParameter("SliceId", sliceId);
            this.sliceId = sliceId;
            return this;
        }

        @Override
        public DescribeSQLLogsOnSliceRequest build() {
            return new DescribeSQLLogsOnSliceRequest(this);
        } 

    } 

}
