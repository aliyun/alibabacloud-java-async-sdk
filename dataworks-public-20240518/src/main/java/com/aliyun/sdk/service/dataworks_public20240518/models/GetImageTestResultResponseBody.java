// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetImageTestResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageTestResultResponseBody</p>
 */
public class GetImageTestResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TestResult")
    private TestResult testResult;

    private GetImageTestResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.testResult = builder.testResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageTestResultResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return testResult
     */
    public TestResult getTestResult() {
        return this.testResult;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private TestResult testResult; 

        private Builder() {
        } 

        private Builder(GetImageTestResultResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.testResult = model.testResult;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TestResult.
         */
        public Builder testResult(TestResult testResult) {
            this.testResult = testResult;
            return this;
        }

        public GetImageTestResultResponseBody build() {
            return new GetImageTestResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageTestResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageTestResultResponseBody</p>
     */
    public static class TestResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private Long operateTime;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("PublishStage")
        private String publishStage;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private Long resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private TestResult(Builder builder) {
            this.imageId = builder.imageId;
            this.message = builder.message;
            this.operateTime = builder.operateTime;
            this.processId = builder.processId;
            this.publishStage = builder.publishStage;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestResult create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return publishStage
         */
        public String getPublishStage() {
            return this.publishStage;
        }

        /**
         * @return resourceGroupId
         */
        public Long getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String imageId; 
            private String message; 
            private Long operateTime; 
            private String processId; 
            private String publishStage; 
            private Long resourceGroupId; 
            private String status; 

            private Builder() {
            } 

            private Builder(TestResult model) {
                this.imageId = model.imageId;
                this.message = model.message;
                this.operateTime = model.operateTime;
                this.processId = model.processId;
                this.publishStage = model.publishStage;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
            } 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * PublishStage.
             */
            public Builder publishStage(String publishStage) {
                this.publishStage = publishStage;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TestResult build() {
                return new TestResult(this);
            } 

        } 

    }
}
