// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySQLCollectorPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifySQLCollectorPolicyRequest</p>
 */
public class ModifySQLCollectorPolicyRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("SQLCollectorStatus")
    @Validation(required = true)
    private String SQLCollectorStatus;

    private ModifySQLCollectorPolicyRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.SQLCollectorStatus = builder.SQLCollectorStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySQLCollectorPolicyRequest create() {
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
     * @return SQLCollectorStatus
     */
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

    public static final class Builder extends Request.Builder<ModifySQLCollectorPolicyRequest, Builder> {
        private String DBInstanceId; 
        private String SQLCollectorStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifySQLCollectorPolicyRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.SQLCollectorStatus = response.SQLCollectorStatus;
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
         * SQLCollectorStatus.
         */
        public Builder SQLCollectorStatus(String SQLCollectorStatus) {
            this.putQueryParameter("SQLCollectorStatus", SQLCollectorStatus);
            this.SQLCollectorStatus = SQLCollectorStatus;
            return this;
        }

        @Override
        public ModifySQLCollectorPolicyRequest build() {
            return new ModifySQLCollectorPolicyRequest(this);
        } 

    } 

}
