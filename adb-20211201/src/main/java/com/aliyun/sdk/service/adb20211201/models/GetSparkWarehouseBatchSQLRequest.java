// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetSparkWarehouseBatchSQLRequest} extends {@link RequestModel}
 *
 * <p>GetSparkWarehouseBatchSQLRequest</p>
 */
public class GetSparkWarehouseBatchSQLRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Agency")
    private String agency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queryId;

    private GetSparkWarehouseBatchSQLRequest(Builder builder) {
        super(builder);
        this.agency = builder.agency;
        this.DBClusterId = builder.DBClusterId;
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkWarehouseBatchSQLRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agency
     */
    public String getAgency() {
        return this.agency;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<GetSparkWarehouseBatchSQLRequest, Builder> {
        private String agency; 
        private String DBClusterId; 
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkWarehouseBatchSQLRequest request) {
            super(request);
            this.agency = request.agency;
            this.DBClusterId = request.DBClusterId;
            this.queryId = request.queryId;
        } 

        /**
         * <p>The name of the client, which can be up to 16 characters in length. Specify a descriptive name that makes it easy to identify.</p>
         * 
         * <strong>example:</strong>
         * <p>DMS</p>
         */
        public Builder agency(String agency) {
            this.putBodyParameter("Agency", agency);
            this.agency = agency;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sq2024123*****</p>
         */
        public Builder queryId(String queryId) {
            this.putBodyParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public GetSparkWarehouseBatchSQLRequest build() {
            return new GetSparkWarehouseBatchSQLRequest(this);
        } 

    } 

}
