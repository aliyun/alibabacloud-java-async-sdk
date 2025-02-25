// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetText2ImageJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetText2ImageJobResponseBody</p>
 */
public class GetText2ImageJobResponseBody extends TeaModel {
    @NameInMap("Images")
    private java.util.List < Images> images;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("TaskMetrics")
    private TaskMetrics taskMetrics;

    @NameInMap("TaskStatus")
    private String taskStatus;

    @NameInMap("Usage")
    private java.util.List < Usage> usage;

    private GetText2ImageJobResponseBody(Builder builder) {
        this.images = builder.images;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskMetrics = builder.taskMetrics;
        this.taskStatus = builder.taskStatus;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetText2ImageJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return images
     */
    public java.util.List < Images> getImages() {
        return this.images;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskMetrics
     */
    public TaskMetrics getTaskMetrics() {
        return this.taskMetrics;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return usage
     */
    public java.util.List < Usage> getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private java.util.List < Images> images; 
        private String requestId; 
        private String taskId; 
        private TaskMetrics taskMetrics; 
        private String taskStatus; 
        private java.util.List < Usage> usage; 

        /**
         * Images.
         */
        public Builder images(java.util.List < Images> images) {
            this.images = images;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskMetrics.
         */
        public Builder taskMetrics(TaskMetrics taskMetrics) {
            this.taskMetrics = taskMetrics;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * Usage.
         */
        public Builder usage(java.util.List < Usage> usage) {
            this.usage = usage;
            return this;
        }

        public GetText2ImageJobResponseBody build() {
            return new GetText2ImageJobResponseBody(this);
        } 

    } 

    public static class Images extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("URL")
        private String URL;

        private Images(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.URL = builder.URL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Images create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return URL
         */
        public String getURL() {
            return this.URL;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String URL; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * URL.
             */
            public Builder URL(String URL) {
                this.URL = URL;
                return this;
            }

            public Images build() {
                return new Images(this);
            } 

        } 

    }
    public static class TaskMetrics extends TeaModel {
        @NameInMap("Failed")
        private Integer failed;

        @NameInMap("Succeeded")
        private Integer succeeded;

        @NameInMap("Total")
        private Integer total;

        private TaskMetrics(Builder builder) {
            this.failed = builder.failed;
            this.succeeded = builder.succeeded;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskMetrics create() {
            return builder().build();
        }

        /**
         * @return failed
         */
        public Integer getFailed() {
            return this.failed;
        }

        /**
         * @return succeeded
         */
        public Integer getSucceeded() {
            return this.succeeded;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer failed; 
            private Integer succeeded; 
            private Integer total; 

            /**
             * Failed.
             */
            public Builder failed(Integer failed) {
                this.failed = failed;
                return this;
            }

            /**
             * Succeeded.
             */
            public Builder succeeded(Integer succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public TaskMetrics build() {
                return new TaskMetrics(this);
            } 

        } 

    }
    public static class Usage extends TeaModel {
        @NameInMap("ImageCount")
        private Integer imageCount;

        private Usage(Builder builder) {
            this.imageCount = builder.imageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        public static final class Builder {
            private Integer imageCount; 

            /**
             * ImageCount.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
