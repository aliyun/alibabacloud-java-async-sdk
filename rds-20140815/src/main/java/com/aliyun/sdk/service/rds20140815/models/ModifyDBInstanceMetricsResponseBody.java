// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDBInstanceMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceMetricsResponseBody</p>
 */
public class ModifyDBInstanceMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scope")
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1s1j103lo6****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B55934BB-FFAA-5276-80A8-E0FDB12810B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The application scope of this modification. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: This modification is applied only to the current instance.</li>
         * <li><strong>region</strong>: This modification is applied to all ApsaraDB RDS for PostgreSQL instances that are equipped with the same type of storage media as the current instance in the region to which the current instance belongs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
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
