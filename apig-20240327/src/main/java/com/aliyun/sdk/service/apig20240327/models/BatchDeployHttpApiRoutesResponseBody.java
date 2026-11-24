// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link BatchDeployHttpApiRoutesResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeployHttpApiRoutesResponseBody</p>
 */
public class BatchDeployHttpApiRoutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private BatchDeployHttpApiRoutesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeployHttpApiRoutesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchDeployHttpApiRoutesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code of the API call. For the acceptance or publishing results of each route, see data.results.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The per-route results of the batch publishing operation. Synchronous publishing also returns the numbers of successful and failed routes, whereas asynchronous publishing returns only the per-route acceptance results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message of the API call. If a route fails or is rejected, see the errorMessage of the corresponding route for the cause.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID of the API call. You can use the ID to locate the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F7B8A1C2-1234-5678-90AB-CDEF12345678</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchDeployHttpApiRoutesResponseBody build() {
            return new BatchDeployHttpApiRoutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchDeployHttpApiRoutesResponseBody} extends {@link TeaModel}
     *
     * <p>BatchDeployHttpApiRoutesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("results")
        private java.util.Map<String, DataResultsValue> results;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        private Data(Builder builder) {
            this.failedCount = builder.failedCount;
            this.results = builder.results;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return results
         */
        public java.util.Map<String, DataResultsValue> getResults() {
            return this.results;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private Integer failedCount; 
            private java.util.Map<String, DataResultsValue> results; 
            private Integer successCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedCount = model.failedCount;
                this.results = model.results;
                this.successCount = model.successCount;
            } 

            /**
             * <p>The number of routes that failed to be published in the batch. This parameter is returned only for synchronous publishing and can be 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>A result map with route IDs as keys. If some routes in the same batch fail, the routes that have been successfully published remain valid.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;hr-example001&quot;:{&quot;routeId&quot;:&quot;hr-example001&quot;,&quot;status&quot;:&quot;Succeeded&quot;},&quot;hr-example002&quot;:{&quot;routeId&quot;:&quot;hr-example002&quot;,&quot;status&quot;:&quot;Succeeded&quot;}}</p>
             */
            public Builder results(java.util.Map<String, DataResultsValue> results) {
                this.results = results;
                return this;
            }

            /**
             * <p>The number of routes successfully published in the batch. This parameter is returned only for synchronous publishing and can be 0.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
