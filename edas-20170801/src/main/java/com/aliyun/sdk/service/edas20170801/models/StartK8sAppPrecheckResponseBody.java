// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartK8sAppPrecheckResponseBody} extends {@link TeaModel}
 *
 * <p>StartK8sAppPrecheckResponseBody</p>
 */
public class StartK8sAppPrecheckResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private StartK8sAppPrecheckResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartK8sAppPrecheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartK8sAppPrecheckResponseBody build() {
            return new StartK8sAppPrecheckResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Jobs")
        private java.util.List < String > jobs;

        private Data(Builder builder) {
            this.jobs = builder.jobs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobs
         */
        public java.util.List < String > getJobs() {
            return this.jobs;
        }

        public static final class Builder {
            private java.util.List < String > jobs; 

            /**
             * The jobs and the details about the jobs.
             */
            public Builder jobs(java.util.List < String > jobs) {
                this.jobs = jobs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
