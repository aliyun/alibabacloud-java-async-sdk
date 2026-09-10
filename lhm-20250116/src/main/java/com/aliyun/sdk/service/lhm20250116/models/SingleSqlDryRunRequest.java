// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link SingleSqlDryRunRequest} extends {@link RequestModel}
 *
 * <p>SingleSqlDryRunRequest</p>
 */
public class SingleSqlDryRunRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("datasourceName")
    private String datasourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sql")
    private String sql;

    private SingleSqlDryRunRequest(Builder builder) {
        super(builder);
        this.datasourceName = builder.datasourceName;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleSqlDryRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasourceName
     */
    public String getDatasourceName() {
        return this.datasourceName;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder extends Request.Builder<SingleSqlDryRunRequest, Builder> {
        private String datasourceName; 
        private String sql; 

        private Builder() {
            super();
        } 

        private Builder(SingleSqlDryRunRequest request) {
            super(request);
            this.datasourceName = request.datasourceName;
            this.sql = request.sql;
        } 

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_demo</p>
         */
        public Builder datasourceName(String datasourceName) {
            this.putBodyParameter("datasourceName", datasourceName);
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT id, name FROM src_table WHERE ds = \&quot;20260116\&quot;</p>
         */
        public Builder sql(String sql) {
            this.putBodyParameter("sql", sql);
            this.sql = sql;
            return this;
        }

        @Override
        public SingleSqlDryRunRequest build() {
            return new SingleSqlDryRunRequest(this);
        } 

    } 

}
