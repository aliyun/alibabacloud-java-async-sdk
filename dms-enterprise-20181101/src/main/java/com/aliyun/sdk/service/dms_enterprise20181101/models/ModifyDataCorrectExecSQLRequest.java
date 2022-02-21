// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataCorrectExecSQLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataCorrectExecSQLRequest</p>
 */
public class ModifyDataCorrectExecSQLRequest extends Request {
    @Query
    @NameInMap("ExecSQL")
    @Validation(required = true)
    private String execSQL;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private ModifyDataCorrectExecSQLRequest(Builder builder) {
        super(builder);
        this.execSQL = builder.execSQL;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataCorrectExecSQLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return execSQL
     */
    public String getExecSQL() {
        return this.execSQL;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ModifyDataCorrectExecSQLRequest, Builder> {
        private String execSQL; 
        private Long orderId; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataCorrectExecSQLRequest response) {
            super(response);
            this.execSQL = response.execSQL;
            this.orderId = response.orderId;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * ExecSQL.
         */
        public Builder execSQL(String execSQL) {
            this.putQueryParameter("ExecSQL", execSQL);
            this.execSQL = execSQL;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public ModifyDataCorrectExecSQLRequest build() {
            return new ModifyDataCorrectExecSQLRequest(this);
        } 

    } 

}
