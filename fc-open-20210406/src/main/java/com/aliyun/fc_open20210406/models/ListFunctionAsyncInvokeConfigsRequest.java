// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListFunctionAsyncInvokeConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionAsyncInvokeConfigsRequest</p>
 */
public class ListFunctionAsyncInvokeConfigsRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;


    private ListFunctionAsyncInvokeConfigsRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionAsyncInvokeConfigsRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private Integer limit; 
        private String nextToken; 

        /**
         * <p>服务名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>函数名称</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>最多返回个数</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>下次查询token</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        public ListFunctionAsyncInvokeConfigsRequest build() {
            return new ListFunctionAsyncInvokeConfigsRequest(this);
        } 

    } 

}
