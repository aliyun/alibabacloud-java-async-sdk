// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsUrlConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsUrlConfigResponseBody</p>
 */
public class DescribeSlsUrlConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private String resultObject;

    private DescribeSlsUrlConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsUrlConfigResponseBody create() {
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
    public String getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private String resultObject; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(String resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSlsUrlConfigResponseBody build() {
            return new DescribeSlsUrlConfigResponseBody(this);
        } 

    } 

}
