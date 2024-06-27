// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitResponseBody</p>
 */
public class DescribeRuleHitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.Map < String, ? > resultObject;

    private DescribeRuleHitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitResponseBody create() {
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

        public DescribeRuleHitResponseBody build() {
            return new DescribeRuleHitResponseBody(this);
        } 

    } 

}
