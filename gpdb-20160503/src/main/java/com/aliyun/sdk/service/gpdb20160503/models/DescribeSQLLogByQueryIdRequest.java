// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogByQueryIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeSQLLogByQueryIdRequest</p>
 */
public class DescribeSQLLogByQueryIdRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("QueryId")
    @Validation(required = true)
    private String queryId;

    private DescribeSQLLogByQueryIdRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.queryId = builder.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogByQueryIdRequest create() {
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
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    public static final class Builder extends Request.Builder<DescribeSQLLogByQueryIdRequest, Builder> {
        private String DBInstanceId; 
        private String queryId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSQLLogByQueryIdRequest response) {
            super(response);
            this.DBInstanceId = response.DBInstanceId;
            this.queryId = response.queryId;
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
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        @Override
        public DescribeSQLLogByQueryIdRequest build() {
            return new DescribeSQLLogByQueryIdRequest(this);
        } 

    } 

}
