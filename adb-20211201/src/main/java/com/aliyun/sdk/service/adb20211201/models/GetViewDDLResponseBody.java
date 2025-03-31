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
 * {@link GetViewDDLResponseBody} extends {@link TeaModel}
 *
 * <p>GetViewDDLResponseBody</p>
 */
public class GetViewDDLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQL")
    private String SQL;

    private GetViewDDLResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQL = builder.SQL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetViewDDLResponseBody create() {
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
     * @return SQL
     */
    public String getSQL() {
        return this.SQL;
    }

    public static final class Builder {
        private String requestId; 
        private String SQL; 

        private Builder() {
        } 

        private Builder(GetViewDDLResponseBody model) {
            this.requestId = model.requestId;
            this.SQL = model.SQL;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>421794A3-72A5-5D27-9E8B-A75A4C503E17</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE VIEW <code>test</code>.<code>test_view</code> AS SELECT
         *   <code>id</code>
         * , <code>name</code>
         * FROM
         *   <code>test_tbl_adb</code></p>
         */
        public Builder SQL(String SQL) {
            this.SQL = SQL;
            return this;
        }

        public GetViewDDLResponseBody build() {
            return new GetViewDDLResponseBody(this);
        } 

    } 

}
