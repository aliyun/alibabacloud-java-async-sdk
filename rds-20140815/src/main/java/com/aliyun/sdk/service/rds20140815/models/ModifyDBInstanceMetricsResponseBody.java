// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceMetricsResponseBody</p>
 */
public class ModifyDBInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scope")
    private String scope;

    private ModifyDBInstanceMetricsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.requestId = builder.requestId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String requestId; 
        private String scope; 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public ModifyDBInstanceMetricsResponseBody build() {
            return new ModifyDBInstanceMetricsResponseBody(this);
        } 

    } 

}
