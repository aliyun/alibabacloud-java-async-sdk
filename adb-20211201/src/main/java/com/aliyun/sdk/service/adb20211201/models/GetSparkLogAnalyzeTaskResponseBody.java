// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkLogAnalyzeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkLogAnalyzeTaskResponseBody</p>
 */
public class GetSparkLogAnalyzeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private SparkAnalyzeLogTask data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkLogAnalyzeTaskResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkLogAnalyzeTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public SparkAnalyzeLogTask getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private SparkAnalyzeLogTask data; 
        private String requestId; 

        /**
         * The information about the Spark log analysis task.
         */
        public Builder data(SparkAnalyzeLogTask data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkLogAnalyzeTaskResponseBody build() {
            return new GetSparkLogAnalyzeTaskResponseBody(this);
        } 

    } 

}
