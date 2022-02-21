// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceBySQLRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceBySQLRequest</p>
 */
public class QueryDeviceBySQLRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("SQL")
    @Validation(required = true)
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

        private Builder(QueryDeviceBySQLRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.SQL = response.SQL;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * SQL.
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
