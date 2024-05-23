// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceInfoByConnRequest} extends {@link RequestModel}
 *
 * <p>QueryInstanceInfoByConnRequest</p>
 */
public class QueryInstanceInfoByConnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userName;

    private QueryInstanceInfoByConnRequest(Builder builder) {
        super(builder);
        this.host = builder.host;
        this.port = builder.port;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceInfoByConnRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<QueryInstanceInfoByConnRequest, Builder> {
        private String host; 
        private Integer port; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(QueryInstanceInfoByConnRequest request) {
            super(request);
            this.host = request.host;
            this.port = request.port;
            this.userName = request.userName;
        } 

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public QueryInstanceInfoByConnRequest build() {
            return new QueryInstanceInfoByConnRequest(this);
        } 

    } 

}
