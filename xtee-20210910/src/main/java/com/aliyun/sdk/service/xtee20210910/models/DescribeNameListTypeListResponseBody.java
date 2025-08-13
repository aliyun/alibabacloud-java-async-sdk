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
 * {@link DescribeNameListTypeListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNameListTypeListResponseBody</p>
 */
public class DescribeNameListTypeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeNameListTypeListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNameListTypeListResponseBody create() {
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
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeNameListTypeListResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeNameListTypeListResponseBody build() {
            return new DescribeNameListTypeListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNameListTypeListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNameListTypeListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ResultObject(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Match Key.</p>
             * 
             * <strong>example:</strong>
             * <p>accountId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Variable value</p>
             * 
             * <strong>example:</strong>
             * <p>账号ID</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
