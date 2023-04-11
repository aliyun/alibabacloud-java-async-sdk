// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataImportSQLPreCheckDetailRequest} extends {@link RequestModel}
 *
 * <p>ListDataImportSQLPreCheckDetailRequest</p>
 */
public class ListDataImportSQLPreCheckDetailRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Query
    @NameInMap("PageNumer")
    private Long pageNumer;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("SqlType")
    private String sqlType;

    @Query
    @NameInMap("StatusCode")
    private String statusCode;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private ListDataImportSQLPreCheckDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.orderId = builder.orderId;
        this.pageNumer = builder.pageNumer;
        this.pageSize = builder.pageSize;
        this.sqlType = builder.sqlType;
        this.statusCode = builder.statusCode;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataImportSQLPreCheckDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return pageNumer
     */
    public Long getPageNumer() {
        return this.pageNumer;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sqlType
     */
    public String getSqlType() {
        return this.sqlType;
    }

    /**
     * @return statusCode
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListDataImportSQLPreCheckDetailRequest, Builder> {
        private String regionId; 
        private Long orderId; 
        private Long pageNumer; 
        private Long pageSize; 
        private String sqlType; 
        private String statusCode; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListDataImportSQLPreCheckDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.orderId = request.orderId;
            this.pageNumer = request.pageNumer;
            this.pageSize = request.pageSize;
            this.sqlType = request.sqlType;
            this.statusCode = request.statusCode;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * PageNumer.
         */
        public Builder pageNumer(Long pageNumer) {
            this.putQueryParameter("PageNumer", pageNumer);
            this.pageNumer = pageNumer;
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

        /**
         * SqlType.
         */
        public Builder sqlType(String sqlType) {
            this.putQueryParameter("SqlType", sqlType);
            this.sqlType = sqlType;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(String statusCode) {
            this.putQueryParameter("StatusCode", statusCode);
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListDataImportSQLPreCheckDetailRequest build() {
            return new ListDataImportSQLPreCheckDetailRequest(this);
        } 

    } 

}
