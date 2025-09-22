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
 * {@link DescribeOperationLogMonitoringResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOperationLogMonitoringResponseBody</p>
 */
public class DescribeOperationLogMonitoringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeOperationLogMonitoringResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperationLogMonitoringResponseBody create() {
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

        private Builder(DescribeOperationLogMonitoringResponseBody model) {
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
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeOperationLogMonitoringResponseBody build() {
            return new DescribeOperationLogMonitoringResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOperationLogMonitoringResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOperationLogMonitoringResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dateGrouped")
        private String dateGrouped;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private String totalCount;

        private ResultObject(Builder builder) {
            this.dateGrouped = builder.dateGrouped;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return dateGrouped
         */
        public String getDateGrouped() {
            return this.dateGrouped;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String dateGrouped; 
            private String totalCount; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.dateGrouped = model.dateGrouped;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Time axis slice.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-19</p>
             */
            public Builder dateGrouped(String dateGrouped) {
                this.dateGrouped = dateGrouped;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
