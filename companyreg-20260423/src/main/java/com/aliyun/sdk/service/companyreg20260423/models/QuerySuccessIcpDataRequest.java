// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20260423.models;

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
 * {@link QuerySuccessIcpDataRequest} extends {@link RequestModel}
 *
 * <p>QuerySuccessIcpDataRequest</p>
 */
public class QuerySuccessIcpDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    private QuerySuccessIcpDataRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySuccessIcpDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    public static final class Builder extends Request.Builder<QuerySuccessIcpDataRequest, Builder> {
        private String caller; 

        private Builder() {
            super();
        } 

        private Builder(QuerySuccessIcpDataRequest request) {
            super(request);
            this.caller = request.caller;
        } 

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        @Override
        public QuerySuccessIcpDataRequest build() {
            return new QuerySuccessIcpDataRequest(this);
        } 

    } 

}
