// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSafDeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSafDeOrderResponseBody</p>
 */
public class DescribeSafDeOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeSafDeOrderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafDeOrderResponseBody create() {
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

        public DescribeSafDeOrderResponseBody build() {
            return new DescribeSafDeOrderResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expirationDate")
        private Long expirationDate;

        @com.aliyun.core.annotation.NameInMap("openUserType")
        private Integer openUserType;

        private ResultObject(Builder builder) {
            this.expirationDate = builder.expirationDate;
            this.openUserType = builder.openUserType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return expirationDate
         */
        public Long getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return openUserType
         */
        public Integer getOpenUserType() {
            return this.openUserType;
        }

        public static final class Builder {
            private Long expirationDate; 
            private Integer openUserType; 

            /**
             * expirationDate.
             */
            public Builder expirationDate(Long expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * openUserType.
             */
            public Builder openUserType(Integer openUserType) {
                this.openUserType = openUserType;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
