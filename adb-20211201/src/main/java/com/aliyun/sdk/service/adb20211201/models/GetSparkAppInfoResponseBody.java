// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppInfoResponseBody</p>
 */
public class GetSparkAppInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private SparkAppInfo data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkAppInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public SparkAppInfo getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private SparkAppInfo data; 
        private String requestId; 

        /**
         * The queried Spark application. Fields in the response parameter:
         * <p>
         * 
         * *   **Data**: the data of the Spark application template.
         * *   **EstimateExecutionCpuTimeInSeconds**: the amount of time that is required to consume CPU resources for running the Spark application. Unit: milliseconds.
         * *   **LogRootPath**: the storage path of log files.
         * *   **LastAttemptId**: the most recent attempt ID.
         * *   **WebUiAddress**: the web UI URL.
         * *   **SubmittedTimeInMillis**: the time when the Spark application was submitted. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * *   **StartedTimeInMillis**: the time when the Spark application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * *   **LastUpdatedTimeInMillis**: the time when the Spark application was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * *   **TerminatedTimeInMillis**: the time when the Spark application was terminated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * *   **DBClusterId**: the ID of the cluster on which the Spark application runs.
         * *   **ResourceGroupName**: the name of the job resource group.
         * *   **DurationInMillis**: the amount of time that is required to run the Spark application. Unit: milliseconds.
         */
        public Builder data(SparkAppInfo data) {
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

        public GetSparkAppInfoResponseBody build() {
            return new GetSparkAppInfoResponseBody(this);
        } 

    } 

}
