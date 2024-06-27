// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiNameListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiNameListResponseBody</p>
 */
public class DescribeApiNameListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    private DescribeApiNameListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiNameListResponseBody create() {
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
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

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
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeApiNameListResponseBody build() {
            return new DescribeApiNameListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        private ResultObject(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        public static final class Builder {
            private String apiId; 
            private String apiName; 

            /**
             * apiId.
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
