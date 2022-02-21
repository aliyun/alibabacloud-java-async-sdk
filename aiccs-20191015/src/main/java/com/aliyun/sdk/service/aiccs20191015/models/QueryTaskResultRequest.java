// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskResultRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskResultRequest</p>
 */
public class QueryTaskResultRequest extends Request {
    @Query
    @NameInMap("App")
    private String app;

    @Query
    @NameInMap("Operator")
    private String operator;

    @Query
    @NameInMap("Param1")
    private String param1;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("Token")
    private String token;

    private QueryTaskResultRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.operator = builder.operator;
        this.param1 = builder.param1;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return param1
     */
    public String getParam1() {
        return this.param1;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<QueryTaskResultRequest, Builder> {
        private String app; 
        private String operator; 
        private String param1; 
        private String requestId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskResultRequest response) {
            super(response);
            this.app = response.app;
            this.operator = response.operator;
            this.param1 = response.param1;
            this.requestId = response.requestId;
            this.token = response.token;
        } 

        /**
         * app
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * operator
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * param1
         */
        public Builder param1(String param1) {
            this.putQueryParameter("Param1", param1);
            this.param1 = param1;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * token
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public QueryTaskResultRequest build() {
            return new QueryTaskResultRequest(this);
        } 

    } 

}
