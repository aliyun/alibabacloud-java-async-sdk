// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStatefulAsyncInvocationFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStatefulAsyncInvocationFunctionsResponseBody</p>
 */
public class ListStatefulAsyncInvocationFunctionsResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < AsyncConfigMeta > data;

    @NameInMap("nextToken")
    private String nextToken;

    private ListStatefulAsyncInvocationFunctionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStatefulAsyncInvocationFunctionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < AsyncConfigMeta > getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < AsyncConfigMeta > data; 
        private String nextToken; 

        /**
         * 返回的实际数据列表。
         */
        public Builder data(java.util.List < AsyncConfigMeta > data) {
            this.data = data;
            return this;
        }

        /**
         * 用来表示当前调用返回读取到的位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListStatefulAsyncInvocationFunctionsResponseBody build() {
            return new ListStatefulAsyncInvocationFunctionsResponseBody(this);
        } 

    } 

}
