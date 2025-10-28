// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link StartK8sAppPrecheckResponseBody} extends {@link TeaModel}
 *
 * <p>StartK8sAppPrecheckResponseBody</p>
 */
public class StartK8sAppPrecheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(StartK8sAppPrecheckResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7638276F-<strong><strong>-</strong></strong>-884F-54CC0BC84A8D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartK8sAppPrecheckResponseBody build() {
            return new StartK8sAppPrecheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link StartK8sAppPrecheckResponseBody} extends {@link TeaModel}
     *
     * <p>StartK8sAppPrecheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Jobs")
        private java.util.List<String> jobs;

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
        public java.util.List<String> getJobs() {
            return this.jobs;
        }

        public static final class Builder {
            private java.util.List<String> jobs; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobs = model.jobs;
            } 

            /**
             * <p>The jobs and the details about the jobs.</p>
             */
            public Builder jobs(java.util.List<String> jobs) {
                this.jobs = jobs;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
