// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DescribeAckOperatorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAckOperatorResponseBody</p>
 */
public class DescribeAckOperatorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeAckOperatorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAckOperatorResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(DescribeAckOperatorResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6615EE8D-FD9D-4FD3-997E-6FEA5B8D82ED</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeAckOperatorResponseBody build() {
            return new DescribeAckOperatorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAckOperatorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAckOperatorResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Result(Builder builder) {
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * <p>The installation status of ES-operator. Valid values:</p>
             * <ul>
             * <li>deployed: ES-operator is installed.</li>
             * <li>not-deploy: ES-operator is not installed.</li>
             * <li>failed: ES-operator fails to be installed.</li>
             * <li>unknown: The installation status of ES-operator is unknown.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deployed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version of ES-operator.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
