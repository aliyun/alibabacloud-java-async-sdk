// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetStackExecutionResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackExecutionResultResponseBody</p>
 */
public class GetStackExecutionResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stackResults")
    private java.util.List<StackResults> stackResults;

    @com.aliyun.core.annotation.NameInMap("triggerId")
    private String triggerId;

    @com.aliyun.core.annotation.NameInMap("triggeredStatus")
    private String triggeredStatus;

    private GetStackExecutionResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackResults = builder.stackResults;
        this.triggerId = builder.triggerId;
        this.triggeredStatus = builder.triggeredStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackExecutionResultResponseBody create() {
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
     * @return stackResults
     */
    public java.util.List<StackResults> getStackResults() {
        return this.stackResults;
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    /**
     * @return triggeredStatus
     */
    public String getTriggeredStatus() {
        return this.triggeredStatus;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StackResults> stackResults; 
        private String triggerId; 
        private String triggeredStatus; 

        private Builder() {
        } 

        private Builder(GetStackExecutionResultResponseBody model) {
            this.requestId = model.requestId;
            this.stackResults = model.stackResults;
            this.triggerId = model.triggerId;
            this.triggeredStatus = model.triggeredStatus;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F2D40488-3F74-568B-87EC-1C04D098DF8B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * stackResults.
         */
        public Builder stackResults(java.util.List<StackResults> stackResults) {
            this.stackResults = stackResults;
            return this;
        }

        /**
         * triggerId.
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        /**
         * triggeredStatus.
         */
        public Builder triggeredStatus(String triggeredStatus) {
            this.triggeredStatus = triggeredStatus;
            return this;
        }

        public GetStackExecutionResultResponseBody build() {
            return new GetStackExecutionResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackExecutionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackExecutionResultResponseBody</p>
     */
    public static class Deployments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploymentName")
        private String deploymentName;

        @com.aliyun.core.annotation.NameInMap("jobResult")
        private String jobResult;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Deployments(Builder builder) {
            this.deploymentName = builder.deploymentName;
            this.jobResult = builder.jobResult;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deployments create() {
            return builder().build();
        }

        /**
         * @return deploymentName
         */
        public String getDeploymentName() {
            return this.deploymentName;
        }

        /**
         * @return jobResult
         */
        public String getJobResult() {
            return this.jobResult;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String deploymentName; 
            private String jobResult; 
            private String status; 
            private String url; 

            private Builder() {
            } 

            private Builder(Deployments model) {
                this.deploymentName = model.deploymentName;
                this.jobResult = model.jobResult;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * deploymentName.
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * jobResult.
             */
            public Builder jobResult(String jobResult) {
                this.jobResult = jobResult;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Deployments build() {
                return new Deployments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackExecutionResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackExecutionResultResponseBody</p>
     */
    public static class StackResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deployments")
        private java.util.List<Deployments> deployments;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("stackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("stackName")
        private String stackName;

        @com.aliyun.core.annotation.NameInMap("stackStatus")
        private String stackStatus;

        private StackResults(Builder builder) {
            this.deployments = builder.deployments;
            this.message = builder.message;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.stackStatus = builder.stackStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackResults create() {
            return builder().build();
        }

        /**
         * @return deployments
         */
        public java.util.List<Deployments> getDeployments() {
            return this.deployments;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return stackStatus
         */
        public String getStackStatus() {
            return this.stackStatus;
        }

        public static final class Builder {
            private java.util.List<Deployments> deployments; 
            private String message; 
            private String stackId; 
            private String stackName; 
            private String stackStatus; 

            private Builder() {
            } 

            private Builder(StackResults model) {
                this.deployments = model.deployments;
                this.message = model.message;
                this.stackId = model.stackId;
                this.stackName = model.stackName;
                this.stackStatus = model.stackStatus;
            } 

            /**
             * deployments.
             */
            public Builder deployments(java.util.List<Deployments> deployments) {
                this.deployments = deployments;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * stackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * stackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * stackStatus.
             */
            public Builder stackStatus(String stackStatus) {
                this.stackStatus = stackStatus;
                return this;
            }

            public StackResults build() {
                return new StackResults(this);
            } 

        } 

    }
}
