// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link FetchImageTaskResponseBody} extends {@link TeaModel}
 *
 * <p>FetchImageTaskResponseBody</p>
 */
public class FetchImageTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FetchImageTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchImageTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public FetchImageTaskResponseBody build() {
            return new FetchImageTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FetchImageTaskResponseBody} extends {@link TeaModel}
     *
     * <p>FetchImageTaskResponseBody</p>
     */
    public static class ImageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ImageList(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageList create() {
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
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String url; 

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
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageList build() {
                return new ImageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FetchImageTaskResponseBody} extends {@link TeaModel}
     *
     * <p>FetchImageTaskResponseBody</p>
     */
    public static class TaskInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List < ImageList> imageList;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private TaskInfoList(Builder builder) {
            this.id = builder.id;
            this.imageList = builder.imageList;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfoList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return imageList
         */
        public java.util.List < ImageList> getImageList() {
            return this.imageList;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private Long id; 
            private java.util.List < ImageList> imageList; 
            private String taskId; 
            private String taskStatus; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ImageList.
             */
            public Builder imageList(java.util.List < ImageList> imageList) {
                this.imageList = imageList;
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
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public TaskInfoList build() {
                return new TaskInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link FetchImageTaskResponseBody} extends {@link TeaModel}
     *
     * <p>FetchImageTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskInfoList")
        private java.util.List < TaskInfoList> taskInfoList;

        private Data(Builder builder) {
            this.taskInfoList = builder.taskInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return taskInfoList
         */
        public java.util.List < TaskInfoList> getTaskInfoList() {
            return this.taskInfoList;
        }

        public static final class Builder {
            private java.util.List < TaskInfoList> taskInfoList; 

            /**
             * TaskInfoList.
             */
            public Builder taskInfoList(java.util.List < TaskInfoList> taskInfoList) {
                this.taskInfoList = taskInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
