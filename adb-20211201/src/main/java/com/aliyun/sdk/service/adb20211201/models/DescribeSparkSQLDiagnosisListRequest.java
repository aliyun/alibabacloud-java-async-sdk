// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeSparkSQLDiagnosisListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSparkSQLDiagnosisListRequest</p>
 */
public class DescribeSparkSQLDiagnosisListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxStartTime")
    private String maxStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinStartTime")
    private String minStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatementId")
    private Long statementId;

    private DescribeSparkSQLDiagnosisListRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.maxStartTime = builder.maxStartTime;
        this.minStartTime = builder.minStartTime;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.statementId = builder.statementId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSparkSQLDiagnosisListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return maxStartTime
     */
    public String getMaxStartTime() {
        return this.maxStartTime;
    }

    /**
     * @return minStartTime
     */
    public String getMinStartTime() {
        return this.minStartTime;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return statementId
     */
    public Long getStatementId() {
        return this.statementId;
    }

    public static final class Builder extends Request.Builder<DescribeSparkSQLDiagnosisListRequest, Builder> {
        private String DBClusterId; 
        private String maxStartTime; 
        private String minStartTime; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long statementId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSparkSQLDiagnosisListRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.maxStartTime = request.maxStartTime;
            this.minStartTime = request.minStartTime;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.statementId = request.statementId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-2zez35ww415xjwk5</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * MaxStartTime.
         */
        public Builder maxStartTime(String maxStartTime) {
            this.putQueryParameter("MaxStartTime", maxStartTime);
            this.maxStartTime = maxStartTime;
            return this;
        }

        /**
         * MinStartTime.
         */
        public Builder minStartTime(String minStartTime) {
            this.putQueryParameter("MinStartTime", minStartTime);
            this.minStartTime = minStartTime;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StatementId.
         */
        public Builder statementId(Long statementId) {
            this.putQueryParameter("StatementId", statementId);
            this.statementId = statementId;
            return this;
        }

        @Override
        public DescribeSparkSQLDiagnosisListRequest build() {
            return new DescribeSparkSQLDiagnosisListRequest(this);
        } 

    } 

}
