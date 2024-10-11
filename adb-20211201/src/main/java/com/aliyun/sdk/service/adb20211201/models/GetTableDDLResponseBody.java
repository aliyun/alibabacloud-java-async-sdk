// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTableDDLResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableDDLResponseBody</p>
 */
public class GetTableDDLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQL")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>863D51B7-5321-41D8-A0B6-A088B0******</p>
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

        public GetTableDDLResponseBody build() {
            return new GetTableDDLResponseBody(this);
        } 

    } 

}
