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
 * {@link GetCreateTableSQLResponseBody} extends {@link TeaModel}
 *
 * <p>GetCreateTableSQLResponseBody</p>
 */
public class GetCreateTableSQLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQL")
    private String SQL;

    private GetCreateTableSQLResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQL = builder.SQL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateTableSQLResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQL
     */
    public String getSQL() {
        return this.SQL;
    }

    public static final class Builder {
        private String requestId; 
        private String SQL; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>109462AF-B5FA-3D5A-9377-B27E5B******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>create table (
         *  id varchar(32)
         * );</p>
         */
        public Builder SQL(String SQL) {
            this.SQL = SQL;
            return this;
        }

        public GetCreateTableSQLResponseBody build() {
            return new GetCreateTableSQLResponseBody(this);
        } 

    } 

}
