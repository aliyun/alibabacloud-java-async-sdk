// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateDdrInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDdrInstanceResponseBody</p>
 */
public class CreateDdrInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDdrInstanceResponseBody(Builder builder) {
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.orderId = builder.orderId;
        this.port = builder.port;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDdrInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String connectionString; 
        private String DBInstanceId; 
        private String orderId; 
        private String port; 
        private String requestId; 

        /**
         * <p>The endpoint that is used to connect to the destination instance.</p>
         * <blockquote>
         * <p> The <strong>DBInstanceNetType</strong> parameter indicates whether the endpoint is internal or public.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rm-xxxxx.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The destination instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-xxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2038691xxxxx</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The port number that is used to connect to the destination instance.</p>
         * <blockquote>
         * <p><strong>DBInstanceNetType</strong> indicates whether the port is internal or public.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E52666CC-330E-418A-8E5B-A19E3FB42D13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDdrInstanceResponseBody build() {
            return new CreateDdrInstanceResponseBody(this);
        } 

    } 

}
