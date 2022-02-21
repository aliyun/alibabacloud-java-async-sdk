// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SychDbfsRecordRequest} extends {@link RequestModel}
 *
 * <p>SychDbfsRecordRequest</p>
 */
public class SychDbfsRecordRequest extends Request {
    @Query
    @NameInMap("BatchStrategyNo")
    private String batchStrategyNo;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 999999, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SychDbfsRecordRequest(Builder builder) {
        super(builder);
        this.batchStrategyNo = builder.batchStrategyNo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SychDbfsRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchStrategyNo
     */
    public String getBatchStrategyNo() {
        return this.batchStrategyNo;
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

    public static final class Builder extends Request.Builder<SychDbfsRecordRequest, Builder> {
        private String batchStrategyNo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SychDbfsRecordRequest response) {
            super(response);
            this.batchStrategyNo = response.batchStrategyNo;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * BatchStrategyNo.
         */
        public Builder batchStrategyNo(String batchStrategyNo) {
            this.putQueryParameter("BatchStrategyNo", batchStrategyNo);
            this.batchStrategyNo = batchStrategyNo;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SychDbfsRecordRequest build() {
            return new SychDbfsRecordRequest(this);
        } 

    } 

}
