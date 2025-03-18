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
 * {@link ModifySQLCollectorPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifySQLCollectorPolicyRequest</p>
 */
public class ModifySQLCollectorPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SQLCollectorStatus")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ModifySQLCollectorPolicyRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.SQLCollectorStatus = request.SQLCollectorStatus;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable or disable SQL collection.</p>
         * <ul>
         * <li>Enable: enables SQL collection.</li>
         * <li>Disabled: disables SQL collection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
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
