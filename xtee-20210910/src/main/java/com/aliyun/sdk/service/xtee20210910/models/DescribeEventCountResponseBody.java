// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventCountResponseBody</p>
 */
public class DescribeEventCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DescribeEventCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

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
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEventCountResponseBody build() {
            return new DescribeEventCountResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("limit")
        private Boolean limit;

        @com.aliyun.core.annotation.NameInMap("maxTotalItem")
        private Integer maxTotalItem;

        @com.aliyun.core.annotation.NameInMap("totalItem")
        private Integer totalItem;

        private ResultObject(Builder builder) {
            this.limit = builder.limit;
            this.maxTotalItem = builder.maxTotalItem;
            this.totalItem = builder.totalItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return limit
         */
        public Boolean getLimit() {
            return this.limit;
        }

        /**
         * @return maxTotalItem
         */
        public Integer getMaxTotalItem() {
            return this.maxTotalItem;
        }

        /**
         * @return totalItem
         */
        public Integer getTotalItem() {
            return this.totalItem;
        }

        public static final class Builder {
            private Boolean limit; 
            private Integer maxTotalItem; 
            private Integer totalItem; 

            /**
             * limit.
             */
            public Builder limit(Boolean limit) {
                this.limit = limit;
                return this;
            }

            /**
             * maxTotalItem.
             */
            public Builder maxTotalItem(Integer maxTotalItem) {
                this.maxTotalItem = maxTotalItem;
                return this;
            }

            /**
             * totalItem.
             */
            public Builder totalItem(Integer totalItem) {
                this.totalItem = totalItem;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
