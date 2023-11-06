// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleActiveSQLRecordRequest} extends {@link RequestModel}
 *
 * <p>HandleActiveSQLRecordRequest</p>
 */
public class HandleActiveSQLRecordRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OperateType")
    private Integer operateType;

    @Query
    @NameInMap("Pids")
    @Validation(required = true)
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
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(Integer operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * Pids.
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
