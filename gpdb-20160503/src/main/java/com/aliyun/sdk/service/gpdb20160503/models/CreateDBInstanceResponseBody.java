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
 * {@link CreateDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBInstanceResponseBody</p>
 */
public class CreateDBInstanceResponseBody extends TeaModel {
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

    private CreateDBInstanceResponseBody(Builder builder) {
        this.connectionString = builder.connectionString;
        this.DBInstanceId = builder.DBInstanceId;
        this.orderId = builder.orderId;
        this.port = builder.port;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDBInstanceResponseBody model) {
            this.connectionString = model.connectionString;
            this.DBInstanceId = model.DBInstanceId;
            this.orderId = model.orderId;
            this.port = model.port;
            this.requestId = model.requestId;
        } 

        /**
         * <p>This parameter is deprecated and will not return a value.</p>
         * <p>You can use the <a href="https://help.aliyun.com/document_detail/86910.html">DescribeDBInstanceAttribute</a> interface to view the connection address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****.gpdb.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111111</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>This parameter is deprecated and will not return a value.</p>
         * <p>You can use the <a href="https://help.aliyun.com/document_detail/86910.html">DescribeDBInstanceAttribute</a> interface to view the port number of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3432</p>
         */
        public Builder port(String port) {
            this.port = port;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5414A4E5-4C36-4461-95FC-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDBInstanceResponseBody build() {
            return new CreateDBInstanceResponseBody(this);
        } 

    } 

}
