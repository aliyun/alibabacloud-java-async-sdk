// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSafOrderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSafOrderResponseBody</p>
 */
public class DescribeSafOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeSafOrderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSafOrderResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeSafOrderResponseBody build() {
            return new DescribeSafOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSafOrderResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSafOrderResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expirationDate")
        private Long expirationDate;

        private ResultObject(Builder builder) {
            this.expirationDate = builder.expirationDate;
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

        public static final class Builder {
            private Long expirationDate; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.expirationDate = model.expirationDate;
            } 

            /**
             * <p>Expiration date (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1755076800000</p>
             */
            public Builder expirationDate(Long expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
