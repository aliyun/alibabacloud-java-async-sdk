// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDDLResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableDDLResponseBody</p>
 */
public class GetTableDDLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQL")
    private String SQL;

    private GetTableDDLResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQL = builder.SQL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDDLResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The SQL statement.
         */
        public Builder SQL(String SQL) {
            this.SQL = SQL;
            return this;
        }

        public GetTableDDLResponseBody build() {
            return new GetTableDDLResponseBody(this);
        } 

    } 

}
