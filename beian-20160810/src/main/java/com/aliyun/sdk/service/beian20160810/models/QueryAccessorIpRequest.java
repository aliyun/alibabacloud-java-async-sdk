// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.beian20160810.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAccessorIpRequest} extends {@link RequestModel}
 *
 * <p>QueryAccessorIpRequest</p>
 */
public class QueryAccessorIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    @com.aliyun.core.annotation.Validation(required = true)
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    private QueryAccessorIpRequest(Builder builder) {
        super(builder);
        this.caller = builder.caller;
        this.ip = builder.ip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccessorIpRequest create() {
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

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    public static final class Builder extends Request.Builder<QueryAccessorIpRequest, Builder> {
        private String caller; 
        private String ip; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccessorIpRequest request) {
            super(request);
            this.caller = request.caller;
            this.ip = request.ip;
        } 

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        @Override
        public QueryAccessorIpRequest build() {
            return new QueryAccessorIpRequest(this);
        } 

    } 

}
