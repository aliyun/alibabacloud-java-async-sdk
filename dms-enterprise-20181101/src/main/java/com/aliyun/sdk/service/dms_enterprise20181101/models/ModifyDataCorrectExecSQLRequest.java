// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ModifyDataCorrectExecSQLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataCorrectExecSQLRequest</p>
 */
public class ModifyDataCorrectExecSQLRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecSQL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String execSQL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ModifyDataCorrectExecSQLRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.execSQL = builder.execSQL;
        this.orderId = builder.orderId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ModifyDataCorrectExecSQLRequest, Builder> {
        private String regionId; 
        private String execSQL; 
        private Long orderId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataCorrectExecSQLRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.execSQL = request.execSQL;
            this.orderId = request.orderId;
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
         * <p>The new SQL script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>update tb set id = 1 where id = 1;</p>
         */
        public Builder execSQL(String execSQL) {
            this.putQueryParameter("ExecSQL", execSQL);
            this.execSQL = execSQL;
            return this;
        }

        /**
         * <p>The ID of the data change ticket.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4328****</p>
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4****</p>
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
