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
 * {@link QueryCustomTimelineTableStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomTimelineTableStatusRequest</p>
 */
public class QueryCustomTimelineTableStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    private QueryCustomTimelineTableStatusRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomTimelineTableStatusRequest create() {
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<QueryCustomTimelineTableStatusRequest, Builder> {
        private String iotInstanceId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomTimelineTableStatusRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.tableName = request.tableName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public QueryCustomTimelineTableStatusRequest build() {
            return new QueryCustomTimelineTableStatusRequest(this);
        } 

    } 

}
