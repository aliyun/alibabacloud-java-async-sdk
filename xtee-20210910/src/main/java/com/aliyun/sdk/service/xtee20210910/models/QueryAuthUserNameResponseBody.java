// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuthUserNameResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAuthUserNameResponseBody</p>
 */
public class QueryAuthUserNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private QueryAuthUserNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuthUserNameResponseBody create() {
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
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

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

        public QueryAuthUserNameResponseBody build() {
            return new QueryAuthUserNameResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("company")
        private String company;

        @com.aliyun.core.annotation.NameInMap("userId")
        private Long userId;

        private ResultObject(Builder builder) {
            this.company = builder.company;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return company
         */
        public String getCompany() {
            return this.company;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String company; 
            private Long userId; 

            /**
             * company.
             */
            public Builder company(String company) {
                this.company = company;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
