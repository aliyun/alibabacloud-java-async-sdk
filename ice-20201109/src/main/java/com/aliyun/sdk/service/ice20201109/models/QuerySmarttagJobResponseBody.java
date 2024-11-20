// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmarttagJobResponseBody</p>
 */
public class QuerySmarttagJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private QuerySmarttagJobResponseBody(Builder builder) {
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmarttagJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public Results getResults() {
        return this.results;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String jobStatus; 
        private String requestId; 
        private Results results; 
        private String userData; 

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The job was successful.</li>
         * <li><strong>Fail</strong>: The job failed.</li>
         * <li><strong>Processing</strong>: The job is in progress.</li>
         * <li><strong>Submitted</strong>: The job is submitted and waiting to be processed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The analysis results of the smart tagging job. The value is an array.</p>
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The content of callback messages that are sent to Simple Message Queue (SMQ) when the information of the smart tagging job changes. For more information about the parameters contained in the callback message, see the &quot;Callback parameters&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;123432412831&quot;}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public QuerySmarttagJobResponseBody build() {
            return new QuerySmarttagJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagJobResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private String type; 

            /**
             * <p>The details of the analysis result. The value is a JSON string. For more information about the parameters of different result types, see the &quot;Parameters of different result types&quot; section of this topic.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;title&quot;:&quot;example-title-****&quot;}</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The type of the analysis result.</p>
             * <ul>
             * <li>The type of the analysis result based on Smart tagging V1.0. Valid values:</li>
             * </ul>
             * <ol>
             * <li>TextLabel: the text tag.</li>
             * <li>VideoLabel: the video tag.</li>
             * <li>ASR: the original result of automatic speech recognition (ASR). By default, this type of result is not returned.</li>
             * <li>OCR: the original result of optical character recognition (OCR). By default, this type of result is not returned.</li>
             * <li>NLP: the natural language processing (NLP)-based result. By default, this type of result is not returned.</li>
             * </ol>
             * <ul>
             * <li>The type of the analysis result based on Smart tagging V2.0. Valid values:</li>
             * </ul>
             * <ol>
             * <li>CPVLabel</li>
             * <li>Meta: the information about the video file, such as the title of the video. By default, this type of information is not returned.</li>
             * </ol>
             * <ul>
             * <li>The type of the analysis result based on Smart tagging V2.0-custom. Valid values:</li>
             * </ul>
             * <ol>
             * <li>CPVLabel</li>
             * <li>Meta: the information about the video file, such as the title of the video. By default, this type of information is not returned.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Meta</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmarttagJobResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagJobResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List < Result> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < Result> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
