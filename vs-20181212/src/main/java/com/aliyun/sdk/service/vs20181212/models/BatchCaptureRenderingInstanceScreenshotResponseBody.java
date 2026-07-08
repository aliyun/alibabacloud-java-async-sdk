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
         * Datatest.
         */
        public Builder datatest(Datatest datatest) {
            this.datatest = datatest;
            return this;
        }

        /**
         * FailedCount.
         */
        public Builder failedCount(Long failedCount) {
            this.failedCount = failedCount;
            return this;
        }

        /**
         * FailedItems.
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
         * SuccessCount.
         */
        public Builder successCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * SuccessItems.
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
             * SuccessCount.
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
             * Result.
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
             * ErrCode.
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * RenderingInstanceId.
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
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * RenderingInstanceId.
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
