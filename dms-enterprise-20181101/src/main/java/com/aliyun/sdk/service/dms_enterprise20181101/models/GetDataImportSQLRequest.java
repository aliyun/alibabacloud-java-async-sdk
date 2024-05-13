// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataImportSQLRequest} extends {@link RequestModel}
 *
 * <p>GetDataImportSQLRequest</p>
 */
public class GetDataImportSQLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sqlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetDataImportSQLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.orderId = builder.orderId;
        this.sqlId = builder.sqlId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataImportSQLRequest create() {
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
     * @return sqlId
     */
    public Long getSqlId() {
        return this.sqlId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetDataImportSQLRequest, Builder> {
        private String regionId; 
        private Long orderId; 
        private Long sqlId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetDataImportSQLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.orderId = request.orderId;
            this.sqlId = request.sqlId;
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
         * The ticket ID. You can call the [ListOrders](~~144643~~) operation to query the ticket ID.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * The SQL ID. You can call the ListDataImportSQLPreCheckDetail operation to query the SQL ID.
         */
        public Builder sqlId(Long sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        /**
         * The tenant ID. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetDataImportSQLRequest build() {
            return new GetDataImportSQLRequest(this);
        } 

    } 

}
