// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressionVariableDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpressionVariableDetailResponseBody</p>
 */
public class DescribeExpressionVariableDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.Map < String, ? > resultObject;

    private DescribeExpressionVariableDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressionVariableDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.Map < String, ? > getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.Map < String, ? > resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeExpressionVariableDetailResponseBody build() {
            return new DescribeExpressionVariableDetailResponseBody(this);
        } 

    } 

}
