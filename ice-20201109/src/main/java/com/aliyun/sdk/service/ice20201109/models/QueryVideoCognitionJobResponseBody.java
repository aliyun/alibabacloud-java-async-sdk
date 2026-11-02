// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link QueryVideoCognitionJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVideoCognitionJobResponseBody</p>
 */
public class QueryVideoCognitionJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private QueryVideoCognitionJobResponseBody(Builder builder) {
        this.input = builder.input;
        this.jobStatus = builder.jobStatus;
        this.params = builder.params;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoCognitionJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private Input input; 
        private String jobStatus; 
        private String params; 
        private String requestId; 
        private Results results; 
        private String templateId; 
        private String userData; 

        private Builder() {
        } 

        private Builder(QueryVideoCognitionJobResponseBody model) {
            this.input = model.input;
            this.jobStatus = model.jobStatus;
            this.params = model.params;
            this.requestId = model.requestId;
            this.results = model.results;
            this.templateId = model.templateId;
            this.userData = model.userData;
        } 

        /**
         * <p>The input media asset information of the task.</p>
         */
        public Builder input(Input input) {
            this.input = input;
            return this;
        }

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p><strong>Success</strong>: The task is processed successfully.</p>
         * </li>
         * <li><p><strong>Fail</strong>: The task fails to be processed.</p>
         * </li>
         * <li><p><strong>Processing</strong>: The task is being processed.</p>
         * </li>
         * <li><p><strong>Submitted</strong>: The task is submitted and waiting to be processed.</p>
         * </li>
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
         * <p>The extended parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;directOssAccess&quot;:true}</p>
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The ID of the smart tagging template.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000101-100040</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The custom user information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;123432412831&quot;}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public QueryVideoCognitionJobResponseBody build() {
            return new QueryVideoCognitionJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVideoCognitionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoCognitionJobResponseBody</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The URL of the input file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/test/video.mp4">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/test/video.mp4</a></p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values: OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVideoCognitionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoCognitionJobResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.type = model.type;
            } 

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values: OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
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
     * {@link QueryVideoCognitionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoCognitionJobResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<Result> result;

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
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.result = model.result;
            } 

            /**
             * result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
