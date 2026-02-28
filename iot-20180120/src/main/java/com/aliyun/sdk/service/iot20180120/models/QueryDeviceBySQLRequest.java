// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceBySQLRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceBySQLRequest</p>
 */
public class QueryDeviceBySQLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SQL")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SQL;

    private QueryDeviceBySQLRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.SQL = builder.SQL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceBySQLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return SQL
     */
    public String getSQL() {
        return this.SQL;
    }

    public static final class Builder extends Request.Builder<QueryDeviceBySQLRequest, Builder> {
        private String iotInstanceId; 
        private String SQL; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceBySQLRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.SQL = request.SQL;
        } 

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
         * <p><strong>Important</strong></p>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The SQL-like statement that you want to execute to query devices. For more information about specific requirements and examples, see the following section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT * FROM device where product_key = &quot;a1*********&quot; limit 100, 20</p>
         */
        public Builder SQL(String SQL) {
            this.putQueryParameter("SQL", SQL);
            this.SQL = SQL;
            return this;
        }

        @Override
        public QueryDeviceBySQLRequest build() {
            return new QueryDeviceBySQLRequest(this);
        } 

    } 

}
