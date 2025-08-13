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
 * {@link DescribeInitDigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInitDigResponseBody</p>
 */
public class DescribeInitDigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeInitDigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInitDigResponseBody create() {
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

        private Builder(DescribeInitDigResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeInitDigResponseBody build() {
            return new DescribeInitDigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInitDigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInitDigResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TipInfo")
        private String tipInfo;

        private ResultObject(Builder builder) {
            this.tipInfo = builder.tipInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return tipInfo
         */
        public String getTipInfo() {
            return this.tipInfo;
        }

        public static final class Builder {
            private String tipInfo; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.tipInfo = model.tipInfo;
            } 

            /**
             * <p>Prompt information</p>
             * 
             * <strong>example:</strong>
             * <p>阿里云内部测试</p>
             */
            public Builder tipInfo(String tipInfo) {
                this.tipInfo = tipInfo;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
