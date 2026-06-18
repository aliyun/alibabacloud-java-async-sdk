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
 * {@link GetBranchSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>GetBranchSchemaResponseBody</p>
 */
public class GetBranchSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sql")
    private String sql;

    private GetBranchSchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sql = builder.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBranchSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    public static final class Builder {
        private String requestId; 
        private String sql; 

        private Builder() {
        } 

        private Builder(GetBranchSchemaResponseBody model) {
            this.requestId = model.requestId;
            this.sql = model.sql;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Sql.
         */
        public Builder sql(String sql) {
            this.sql = sql;
            return this;
        }

        public GetBranchSchemaResponseBody build() {
            return new GetBranchSchemaResponseBody(this);
        } 

    } 

}
