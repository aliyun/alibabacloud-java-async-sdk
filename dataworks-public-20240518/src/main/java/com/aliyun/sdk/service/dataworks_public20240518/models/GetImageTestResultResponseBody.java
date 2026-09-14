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
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The details of the image test result.</p>
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
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom_image_xxxx_xxxx</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The test result message.</p>
             * 
             * <strong>example:</strong>
             * <p>test finished</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The operation time, represented as a 64-bit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1727055811000</p>
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The image publish status. Valid values:</p>
             * <ul>
             * <li>Untest: Not tested.</li>
             * <li>Testing: Testing in progress.</li>
             * <li>TestFailed: Test failed.</li>
             * <li>Unpublished: Not published.</li>
             * <li>Publishing: Publishing in progress.</li>
             * <li>Published: Published.</li>
             * <li>PublishFailed: Publish failed.</li>
             * <li>Building: Building in progress.</li>
             * <li>BuildSuccess: Build succeeded.</li>
             * <li>BuildFailed: Build failed.</li>
             * <li>Accelerating: Acceleration in progress.</li>
             * <li>AccelerateSuccess: Acceleration succeeded.</li>
             * <li>AccelerateFailed: Acceleration failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unpublished</p>
             */
            public Builder publishStage(String publishStage) {
                this.publishStage = publishStage;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Serverless_res_group_****</p>
             */
            public Builder resourceGroupId(Long resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The test process status. Valid values:</p>
             * <ul>
             * <li>running: Running.</li>
             * <li>completed: Completed.</li>
             * <li>failed: Failed.</li>
             * <li>cancelled: Cancelled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>completed</p>
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
