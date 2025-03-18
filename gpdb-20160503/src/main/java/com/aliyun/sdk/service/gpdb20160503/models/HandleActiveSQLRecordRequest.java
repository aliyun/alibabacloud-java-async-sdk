// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link HandleActiveSQLRecordRequest} extends {@link RequestModel}
 *
 * <p>HandleActiveSQLRecordRequest</p>
 */
public class HandleActiveSQLRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private Integer operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pids;

    private HandleActiveSQLRecordRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.operateType = builder.operateType;
        this.pids = builder.pids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleActiveSQLRecordRequest create() {
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
     * @return operateType
     */
    public Integer getOperateType() {
        return this.operateType;
    }

    /**
     * @return pids
     */
    public String getPids() {
        return this.pids;
    }

    public static final class Builder extends Request.Builder<HandleActiveSQLRecordRequest, Builder> {
        private String DBInstanceId; 
        private Integer operateType; 
        private String pids; 

        private Builder() {
            super();
        } 

        private Builder(HandleActiveSQLRecordRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.operateType = request.operateType;
            this.pids = request.pids;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The type of the operation on the process ID. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: cancel.</li>
         * <li><strong>1</strong>: terminate.</li>
         * <li><strong>2</strong>: forcefully terminate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder operateType(Integer operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>The process IDs. A process ID is a unique identifier of a query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;3003925,3003928&quot;</p>
         */
        public Builder pids(String pids) {
            this.putQueryParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        @Override
        public HandleActiveSQLRecordRequest build() {
            return new HandleActiveSQLRecordRequest(this);
        } 

    } 

}
