// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchCaptureRenderingInstanceScreenshotResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCaptureRenderingInstanceScreenshotResponseBody</p>
 */
public class BatchCaptureRenderingInstanceScreenshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Datatest")
    private Datatest datatest;

    @com.aliyun.core.annotation.NameInMap("FailedCount")
    private Long failedCount;

    @com.aliyun.core.annotation.NameInMap("FailedItems")
    private java.util.List<FailedItems> failedItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Long successCount;

    @com.aliyun.core.annotation.NameInMap("SuccessItems")
    private java.util.List<SuccessItems> successItems;

    private BatchCaptureRenderingInstanceScreenshotResponseBody(Builder builder) {
        this.datatest = builder.datatest;
        this.failedCount = builder.failedCount;
        this.failedItems = builder.failedItems;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.successItems = builder.successItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCaptureRenderingInstanceScreenshotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datatest
     */
    public Datatest getDatatest() {
        return this.datatest;
    }

    /**
     * @return failedCount
     */
    public Long getFailedCount() {
        return this.failedCount;
    }

    /**
     * @return failedItems
     */
    public java.util.List<FailedItems> getFailedItems() {
        return this.failedItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Long getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return successItems
     */
    public java.util.List<SuccessItems> getSuccessItems() {
        return this.successItems;
    }

    public static final class Builder {
        private Datatest datatest; 
        private Long failedCount; 
        private java.util.List<FailedItems> failedItems; 
        private String requestId; 
        private Long successCount; 
        private java.util.List<SuccessItems> successItems; 

        private Builder() {
        } 

        private Builder(BatchCaptureRenderingInstanceScreenshotResponseBody model) {
            this.datatest = model.datatest;
            this.failedCount = model.failedCount;
            this.failedItems = model.failedItems;
            this.requestId = model.requestId;
            this.successCount = model.successCount;
            this.successItems = model.successItems;
        } 

        /**
         * <p>The dry run result.</p>
         */
        public Builder datatest(Datatest datatest) {
            this.datatest = datatest;
            return this;
        }

        /**
         * <p>The number of failed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * <p>The list of instances for which screenshots failed.</p>
         */
        public Builder failedItems(java.util.List<FailedItems> failedItems) {
            this.failedItems = failedItems;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of successful instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder successCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * <p>The list of successful instances.</p>
         */
        public Builder successItems(java.util.List<SuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }

        public BatchCaptureRenderingInstanceScreenshotResponseBody build() {
            return new BatchCaptureRenderingInstanceScreenshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCaptureRenderingInstanceScreenshotResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCaptureRenderingInstanceScreenshotResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Long successCount;

        private Result(Builder builder) {
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private Long successCount; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.successCount = model.successCount;
            } 

            /**
             * <p>The number of successful instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCaptureRenderingInstanceScreenshotResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCaptureRenderingInstanceScreenshotResponseBody</p>
     */
    public static class Datatest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private Result result;

        private Datatest(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datatest create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        public static final class Builder {
            private Result result; 

            private Builder() {
            } 

            private Builder(Datatest model) {
                this.result = model.result;
            } 

            /**
             * <p>The dry run result.</p>
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            public Datatest build() {
                return new Datatest(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCaptureRenderingInstanceScreenshotResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCaptureRenderingInstanceScreenshotResponseBody</p>
     */
    public static class FailedItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private String errCode;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private FailedItems(Builder builder) {
            this.errCode = builder.errCode;
            this.errMessage = builder.errMessage;
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedItems create() {
            return builder().build();
        }

        /**
         * @return errCode
         */
        public String getErrCode() {
            return this.errCode;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private String errCode; 
            private String errMessage; 
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(FailedItems model) {
                this.errCode = model.errCode;
                this.errMessage = model.errMessage;
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * <p>The error code of the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * <p>The error message of the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Not Applied</p>
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * <p>The instance ID of the cloud application service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>render-072da95539d3402da90353b244191722</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            public FailedItems build() {
                return new FailedItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCaptureRenderingInstanceScreenshotResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCaptureRenderingInstanceScreenshotResponseBody</p>
     */
    public static class SuccessItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        private SuccessItems(Builder builder) {
            this.creationTime = builder.creationTime;
            this.downloadUrl = builder.downloadUrl;
            this.renderingInstanceId = builder.renderingInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessItems create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        public static final class Builder {
            private String creationTime; 
            private String downloadUrl; 
            private String renderingInstanceId; 

            private Builder() {
            } 

            private Builder(SuccessItems model) {
                this.creationTime = model.creationTime;
                this.downloadUrl = model.downloadUrl;
                this.renderingInstanceId = model.renderingInstanceId;
            } 

            /**
             * <p>The time when the screenshot was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-19T14:46:37+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The download URL of the screenshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://testts-1.oss-cn-beijing.aliyuncs.com/app/test-zip-file.zip">https://testts-1.oss-cn-beijing.aliyuncs.com/app/test-zip-file.zip</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The instance ID of the cloud application service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>render-1ada8cd82783407b99fa202826fc6447</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            public SuccessItems build() {
                return new SuccessItems(this);
            } 

        } 

    }
}
