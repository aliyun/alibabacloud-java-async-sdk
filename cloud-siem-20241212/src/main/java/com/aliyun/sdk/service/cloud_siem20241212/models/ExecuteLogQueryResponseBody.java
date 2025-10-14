// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ExecuteLogQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteLogQueryResponseBody</p>
 */
public class ExecuteLogQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryResult")
    private java.util.List<?> queryResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExecuteLogQueryResponseBody(Builder builder) {
        this.queryResult = builder.queryResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteLogQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryResult
     */
    public java.util.List<?> getQueryResult() {
        return this.queryResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<?> queryResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExecuteLogQueryResponseBody model) {
            this.queryResult = model.queryResult;
            this.requestId = model.requestId;
        } 

        /**
         * QueryResult.
         */
        public Builder queryResult(java.util.List<?> queryResult) {
            this.queryResult = queryResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteLogQueryResponseBody build() {
            return new ExecuteLogQueryResponseBody(this);
        } 

    } 

}
